public class __M$Effect_Aff {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Aff"); }
    };
    // FFI provided by src/Effect/Aff.java
    // A small Aff runtime for the JVM, modelled on the gopurs port: Aff values
    // are trampolined continuations, fibers are threads with join/kill, and
    // delay/makeAff wait with cancellation checks. This is enough for the
    // sequential and simple concurrent uses of the test suites.

    public static final class AffError extends RuntimeException {
        public final Object error;
        public AffError(Object error) { super(String.valueOf(error)); this.error = error; }
    }

    public static final class AffCancelled extends RuntimeException {
        public final Object error;
        public AffCancelled(Object error) { super(String.valueOf(error)); this.error = error; }
    }

    public interface AffRun { Object run(RunContext ctx); }

    public static final class BindNode {
        public final AffRun aff;
        public final java.util.function.Function<Object, AffRun> k;
        public BindNode(AffRun aff, java.util.function.Function<Object, AffRun> k) { this.aff = aff; this.k = k; }
    }

    public static final class Supervisor {
        public final java.util.List<NativeFiber> children = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public static final class RunContext {
        volatile boolean cancelled;
        volatile Object cause;
        public final Supervisor supervisor;
        public final java.util.List<java.util.function.Function<Object, Object>> cancelers = new java.util.concurrent.CopyOnWriteArrayList<>();
        public RunContext(Supervisor supervisor) { this.supervisor = supervisor; }
        public void check() { if (cancelled) throw new AffCancelled(cause); }
        public void cancel(Object err) {
            if (cancelled) return;
            cancelled = true;
            cause = err;
            for (java.util.function.Function<Object, Object> canceler : cancelers) {
                try { runAffSync((AffRun) canceler.apply(err), new RunContext(null)); }
                catch (Throwable ignored) { }
            }
        }
        public void registerCanceler(Object canceler) {
            if (cancelled) {
                try { runAffSync((AffRun) canceler, new RunContext(null)); } catch (Throwable ignored) { }
            } else {
                cancelers.add((java.util.function.Function<Object, Object>) canceler);
            }
        }
    }

    private static AffRun asAff(Object value) {
        if (value instanceof AffRun) return (AffRun) value;
        Object inner = value;
        return ctx -> inner;
    }

    private static Object runAffSync(AffRun aff, RunContext ctx) {
        Object current = aff;
        java.util.ArrayDeque<java.util.function.Function<Object, AffRun>> stack = new java.util.ArrayDeque<>();
        while (true) {
            if (ctx != null) ctx.check();
            Object result = ((AffRun) current).run(ctx);
            if (result instanceof BindNode) {
                BindNode node = (BindNode) result;
                stack.push(node.k);
                current = node.aff;
            } else if (!stack.isEmpty()) {
                java.util.function.Function<Object, AffRun> k = stack.pop();
                current = k.apply(result);
            } else {
                return result;
            }
        }
    }

    private static Object __eitherLeft(Object error) { return new __M$Data_Either.Left(error); }
    private static Object __eitherRight(Object value) { return new __M$Data_Either.Right(value); }
    private static boolean __eitherIsLeft(Object either) { return either instanceof __M$Data_Either.Left; }
    private static Object __eitherFromLeft(Object either) { return ((__M$Data_Either.Left) either).value0; }
    private static Object __eitherFromRight(Object either) { return ((__M$Data_Either.Right) either).value0; }
    private static Object __unit() { return null; }

    public static final class NativeFiber {
        final AffRun aff;
        final RunContext ctx = new RunContext(new Supervisor());
        volatile boolean started;
        volatile boolean done;
        volatile boolean failed;
        volatile Object value;
        volatile Object error;
        volatile Thread thread;
        final java.util.List<java.util.function.Function<Object, Object>> completion = new java.util.concurrent.CopyOnWriteArrayList<>();

        NativeFiber(AffRun aff) { this.aff = aff; }

        synchronized void start() {
            if (started) return;
            started = true;
            Thread worker = new Thread(() -> {
                try {
                    value = runAffSync(aff, ctx);
                } catch (AffCancelled cancelled) {
                    failed = true;
                    error = cancelled.error;
                } catch (AffError failure) {
                    failed = true;
                    error = failure.error;
                } catch (Throwable thrown) {
                    failed = true;
                    error = thrown;
                } finally {
                    done = true;
                    for (java.util.function.Function<Object, Object> callback : completion) {
                        try {
                            Object effect = callback.apply(failed ? __eitherLeft(error) : __eitherRight(value));
                            if (effect instanceof java.util.function.Supplier) ((java.util.function.Supplier<Object>) effect).get();
                        } catch (Throwable ignored) { }
                    }
                }
            });
            worker.setDaemon(true);
            thread = worker;
            worker.start();
        }

        void await() {
            Thread worker = thread;
            if (worker == null) return;
            try { worker.join(); } catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); }
        }

        void kill(Object err, Object callback) {
            ctx.cancel(err);
            start();
            Thread worker = thread;
            if (worker != null) worker.interrupt();
            if (callback != null) {
                completion.add((java.util.function.Function<Object, Object>) (either) ->
                    ((java.util.function.Function<Object, Object>) callback).apply(__eitherRight(__unit())));
            }
        }
    }

    private static java.util.function.Supplier<Object> __fiberRun(NativeFiber fiber) {
        return () -> { fiber.start(); return null; };
    }

    private static java.util.function.Function<Object, Object> __fiberKill(NativeFiber fiber) {
        return err -> (java.util.function.Function<Object, Object>) callback -> (java.util.function.Supplier<Object>) () -> {
            fiber.kill(err, callback);
            return (java.util.function.Supplier<Object>) () -> { fiber.await(); return null; };
        };
    }

    private static java.util.function.Function<Object, Object> __fiberJoin(NativeFiber fiber) {
        return callback -> (java.util.function.Supplier<Object>) () -> {
            fiber.start();
            fiber.completion.add((java.util.function.Function<Object, Object>) (either) -> {
                Object effect = ((java.util.function.Function<Object, Object>) callback).apply(either);
                return ((java.util.function.Supplier<Object>) effect).get();
            });
            return (java.util.function.Supplier<Object>) () -> { fiber.await(); return null; };
        };
    }

    private static java.util.function.Function<Object, Object> __fiberOnComplete(NativeFiber fiber) {
        return options -> (java.util.function.Supplier<Object>) () -> {
            java.util.Map<String, Object> record = (java.util.Map<String, Object>) options;
            boolean rethrow = Boolean.TRUE.equals(record.get("rethrow"));
            Object handler = record.get("handler");
            fiber.start();
            fiber.completion.add((java.util.function.Function<Object, Object>) (either) -> {
                Object effect = ((java.util.function.Function<Object, Object>) handler).apply(either);
                ((java.util.function.Supplier<Object>) effect).get();
                return null;
            });
            return (java.util.function.Supplier<Object>) () -> { fiber.await(); return null; };
        };
    }

    private static java.util.Map<String, Object> __fiberRecord(NativeFiber fiber) {
        java.util.Map<String, Object> record = new java.util.LinkedHashMap<>();
        record.put("run", __fiberRun(fiber));
        record.put("kill", __fiberKill(fiber));
        record.put("join", __fiberJoin(fiber));
        record.put("onComplete", __fiberOnComplete(fiber));
        record.put("isSuspended", (java.util.function.Supplier<Object>) () -> !fiber.done);
        record.put("__fiber", fiber);
        return record;
    }

    public static Object _pure = (java.util.function.Function<Object, Object>) (value) ->
        (AffRun) ctx -> value;

    public static Object _throwError = (java.util.function.Function<Object, Object>) (error) ->
        (AffRun) ctx -> { throw new AffError(error); };

    public static Object _catchError = (java.util.function.Function<Object, Object>) (aff) ->
        (java.util.function.Function<Object, Object>) (handler) -> (AffRun) ctx -> {
            try {
                return runAffSync(asAff(aff), ctx);
            } catch (AffCancelled cancelled) {
                throw cancelled;
            } catch (AffError failure) {
                return runAffSync(asAff(((java.util.function.Function<Object, Object>) handler).apply(failure.error)), ctx);
            }
        };

    public static Object _map = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (aff) -> (AffRun) ctx ->
            ((java.util.function.Function<Object, Object>) f).apply(runAffSync(asAff(aff), ctx));

    public static Object _bind = (java.util.function.Function<Object, Object>) (aff) ->
        (java.util.function.Function<Object, Object>) (k) -> (AffRun) ctx -> {
            AffRun run = asAff(aff);
            return new BindNode(run, value -> asAff(((java.util.function.Function<Object, Object>) k).apply(value)));
        };

    public static Object _liftEffect = (java.util.function.Function<Object, Object>) (effect) ->
        (AffRun) ctx -> ((java.util.function.Supplier<Object>) effect).get();

    public static Object _delay = (java.util.function.Function<Object, Object>) (right) ->
        (java.util.function.Function<Object, Object>) (ms) -> (AffRun) ctx -> {
            long duration = (long) ((Number) ms).doubleValue();
            if (duration > 0) {
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException interrupted) {
                    Thread.currentThread().interrupt();
                    throw new AffCancelled(null);
                }
            }
            return __unit();
        };

    public static Object generalBracket = (java.util.function.Function<Object, Object>) (acquire) ->
        (java.util.function.Function<Object, Object>) (conditions) ->
        (java.util.function.Function<Object, Object>) (use) -> (AffRun) ctx -> {
            java.util.Map<String, Object> record = (java.util.Map<String, Object>) conditions;
            Object resource = runAffSync(asAff(acquire), ctx);
            try {
                Object result = runAffSync(asAff(((java.util.function.Function<Object, Object>) use).apply(resource)), ctx);
                Object completed = record.get("completed");
                runAffSync(asAff(((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) completed).apply(result)).apply(resource)), new RunContext(null));
                return result;
            } catch (AffCancelled cancelled) {
                Object killed = record.get("killed");
                runAffSync(asAff(((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) killed).apply(cancelled.error)).apply(resource)), new RunContext(null));
                throw cancelled;
            } catch (AffError failure) {
                Object failed = record.get("failed");
                runAffSync(asAff(((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) failed).apply(failure.error)).apply(resource)), new RunContext(null));
                throw failure;
            }
        };

    public static Object makeAff = (java.util.function.Function<Object, Object>) (builder) ->        (AffRun) ctx -> {
            java.util.concurrent.ArrayBlockingQueue<Object> queue = new java.util.concurrent.ArrayBlockingQueue<>(1);
            java.util.function.Function<Object, Object> callback = either ->
                (java.util.function.Supplier<Object>) () -> { queue.offer(either); return null; };
            Object cancelerEffect = ((java.util.function.Function<Object, Object>) builder).apply(callback);
            Object canceler = ((java.util.function.Supplier<Object>) cancelerEffect).get();
            if (ctx != null) ctx.registerCanceler(canceler);
            while (true) {
                if (ctx != null) ctx.check();
                Object either;
                try {
                    either = queue.poll(20, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (InterruptedException interrupted) {
                    Thread.currentThread().interrupt();
                    throw new AffCancelled(null);
                }
                if (either != null) {
                    if (__eitherIsLeft(either)) throw new AffError(__eitherFromLeft(either));
                    return __eitherFromRight(either);
                }
            }
        };

    public static Object _fork = (java.util.function.Function<Object, Object>) (immediate) ->
        (java.util.function.Function<Object, Object>) (aff) -> (AffRun) ctx -> {
            NativeFiber fiber = new NativeFiber(asAff(aff));
            if (ctx != null && ctx.supervisor != null) ctx.supervisor.children.add(fiber);
            if (Boolean.TRUE.equals(immediate)) fiber.start();
            return __fiberRecord(fiber);
        };

    public static Object _makeFiber = (java.util.function.Function<Object, Object>) (util) ->
        (java.util.function.Function<Object, Object>) (aff) ->
            (java.util.function.Supplier<Object>) () -> __fiberRecord(new NativeFiber(asAff(aff)));

    public static Object _makeSupervisedFiber = (java.util.function.Function<Object, Object>) (util) ->
        (java.util.function.Function<Object, Object>) (aff) ->
            (java.util.function.Supplier<Object>) () -> {
                NativeFiber fiber = new NativeFiber(asAff(aff));
                Supervisor supervisor = new Supervisor();
                supervisor.children.add(fiber);
                java.util.Map<String, Object> record = new java.util.LinkedHashMap<>();
                record.put("fiber", __fiberRecord(fiber));
                record.put("supervisor", supervisor);
                return record;
            };

    public static Object _killAll = (java.util.function.Function<Object, Object>) (error) ->
        (java.util.function.Function<Object, Object>) (supervisor) ->
        (java.util.function.Function<Object, Object>) (effect) ->
            (java.util.function.Supplier<Object>) () -> {
                for (NativeFiber child : ((Supervisor) supervisor).children) {
                    child.kill(error, null);
                    child.await();
                }
                ((java.util.function.Supplier<Object>) effect).get();
                return (java.util.function.Function<Object, Object>) err -> (AffRun) ctx -> __unit();
            };

    public static Object _sequential = (java.util.function.Function<Object, Object>) (par) -> par;

    public static Object _parAffMap = _map;

    public static Object _parAffApply = (java.util.function.Function<Object, Object>) (aff1) ->
        (java.util.function.Function<Object, Object>) (aff2) -> (AffRun) ctx -> {
            final Object[] results = new Object[2];
            final Object[] errors = new Object[2];
            java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(2);
            RunContext child1 = new RunContext(null);
            RunContext child2 = new RunContext(null);
            Thread first = new Thread(() -> {
                try { results[0] = runAffSync(asAff(aff1), child1); }
                catch (Throwable thrown) { errors[0] = thrown; child2.cancel(thrown instanceof AffError ? ((AffError) thrown).error : thrown); }
                finally { latch.countDown(); }
            });
            Thread second = new Thread(() -> {
                try { results[1] = runAffSync(asAff(aff2), child2); }
                catch (Throwable thrown) { errors[1] = thrown; child1.cancel(thrown instanceof AffError ? ((AffError) thrown).error : thrown); }
                finally { latch.countDown(); }
            });
            first.setDaemon(true);
            second.setDaemon(true);
            first.start();
            second.start();
            try { latch.await(); } catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); }
            if (errors[0] != null) throw (errors[0] instanceof RuntimeException) ? (RuntimeException) errors[0] : new AffError(errors[0]);
            if (errors[1] != null) throw (errors[1] instanceof RuntimeException) ? (RuntimeException) errors[1] : new AffError(errors[1]);
            return ((java.util.function.Function<Object, Object>) results[0]).apply(results[1]);
        };

    public static Object _parAffAlt = (java.util.function.Function<Object, Object>) (aff1) ->
        (java.util.function.Function<Object, Object>) (aff2) -> (AffRun) ctx -> {
            final Object[] results = new Object[2];
            final Throwable[] errors = new Throwable[2];
            final java.util.concurrent.atomic.AtomicBoolean decided = new java.util.concurrent.atomic.AtomicBoolean(false);
            final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(2);
            final Object[] winner = new Object[1];
            RunContext child1 = new RunContext(null);
            RunContext child2 = new RunContext(null);
            Runnable first = () -> {
                try {
                    Object value = runAffSync(asAff(aff1), child1);
                    if (decided.compareAndSet(false, true)) { winner[0] = value; child2.cancel(null); }
                } catch (Throwable thrown) {
                    errors[0] = thrown;
                } finally { latch.countDown(); }
            };
            Runnable second = () -> {
                try {
                    Object value = runAffSync(asAff(aff2), child2);
                    if (decided.compareAndSet(false, true)) { winner[0] = value; child1.cancel(null); }
                } catch (Throwable thrown) {
                    errors[1] = thrown;
                } finally { latch.countDown(); }
            };
            Thread left = new Thread(first); Thread right = new Thread(second);
            left.setDaemon(true); right.setDaemon(true);
            left.start(); right.start();
            try { latch.await(); } catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); }
            if (winner[0] != null) return winner[0];
            Throwable failure = errors[0] != null ? errors[0] : errors[1];
            if (failure instanceof RuntimeException) throw (RuntimeException) failure;
            throw new AffError(failure);
        };


public static final Object Canceler = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; };
public static final Object suspendAff = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._fork)).apply(false);
public static final Object newtypeCanceler = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get();
public static final Object functorParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._parAffMap; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object functorAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._map; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object forkAff = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._fork)).apply(true);
public static final Object ffiUtil = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Either.Left))) ? true : ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Either.Right))) ? false : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_0_i1) -> { return ( ((Boolean) ((((Object) (v_0_i1)) instanceof __M$Data_Either.Left))) ? ((__M$Data_Either.Left) (Object)(v_0_i1)).value0 : ( ((Boolean) ((((Object) (v_0_i1)) instanceof __M$Data_Either.Right))) ? ((java.util.function.Function<Object, Object>) (__M$Partial._crashWith)).apply("unsafeFromLeft: Right") : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_0_i2) -> { return ( ((Boolean) ((((Object) (v_0_i2)) instanceof __M$Data_Either.Right))) ? ((__M$Data_Either.Right) (Object)(v_0_i2)).value0 : ( ((Boolean) ((((Object) (v_0_i2)) instanceof __M$Data_Either.Left))) ? ((java.util.function.Function<Object, Object>) (__M$Partial._crashWith)).apply("unsafeFromRight: Left") : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; final Object __field3 = __M$Data_Either.Left; final Object __field4 = __M$Data_Either.Right; return new __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O(new String[]{"isLeft", "fromLeft", "fromRight", "left", "right"}, __field1, __field2, __field0, __field3, __field4); } }).get();
public static final Object makeFiber = (java.util.function.Function<Object, Object>) (aff_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(aff_0_i0); };
public static final Object launchAff = (java.util.function.Function<Object, Object>) (aff_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(aff_0_i0); Object fiber_2_i2 = ((java.util.function.Supplier) (Object)(__local_var_1_i1)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect.bindEffect))).apply(((java.util.Map<String, Object>) fiber_2_i2).get("run")))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_3_i3) -> { return (new java.util.function.Supplier<Object>() { public Object get() { return fiber_2_i2; } }); }))).get(); } }); };
public static final Object launchAff_ = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Functor.$void)).apply(__M$Effect.functorEffect)))).apply(__M$Effect_Aff.launchAff);
public static final Object launchSuspendedAff = __M$Effect_Aff.makeFiber;
public static final Object delay = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._delay)).apply(__M$Data_Either.Right))).apply(v_0_i0); };
public static final Object bracket = (java.util.function.Function<Object, Object>) (acquire_0_i0) -> { return (java.util.function.Function<Object, Object>) (completed_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.generalBracket)).apply(acquire_0_i0))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return completed_1_i1; }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_2_i3) -> { return completed_1_i1; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_2_i4) -> { return completed_1_i1; }; return new __Record$63_6f_6d_70_6c_65_74_65_64_O$66_61_69_6c_65_64_O$6b_69_6c_6c_65_64_O(new String[]{"killed", "failed", "completed"}, __field2, __field1, __field0); } }).get()); }; };
public static final Object applyParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._parAffApply; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.functorParAff; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get();
public static final Object semigroupParAff = (java.util.function.Function<Object, Object>) (dictSemigroup_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.append)).apply(dictSemigroup_0_i0); return (java.util.function.Function<Object, Object>) (a_2_i2) -> { return (java.util.function.Function<Object, Object>) (b_3_i3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._parAffApply)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._parAffMap)).apply(__local_var_1_i1))).apply(a_2_i2)))).apply(b_3_i3); }; }; } }).get(); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); };
private static Object __lazy_value_monadAff;
private static int __lazy_state_monadAff;
private static Object __lazy_get_monadAff() { if (__lazy_state_monadAff == 2) return __lazy_value_monadAff; if (__lazy_state_monadAff == 1) throw new IllegalStateException("Recursive initialization of monadAff"); __lazy_state_monadAff = 1; __lazy_value_monadAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.__lazy_get_applicativeAff(); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Effect_Aff.__lazy_get_bindAff(); }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$42_69_6e_64_31_O(new String[]{"Applicative0", "Bind1"}, __field0, __field1); } }).get(); __lazy_state_monadAff = 2; return __lazy_value_monadAff; }
public static final Object monadAff = __lazy_get_monadAff();
private static Object __lazy_value_bindAff;
private static int __lazy_state_bindAff;
private static Object __lazy_get_bindAff() { if (__lazy_state_bindAff == 2) return __lazy_value_bindAff; if (__lazy_state_bindAff == 1) throw new IllegalStateException("Recursive initialization of bindAff"); __lazy_state_bindAff = 1; __lazy_value_bindAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._bind; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.__lazy_get_applyAff(); }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_bindAff = 2; return __lazy_value_bindAff; }
public static final Object bindAff = __lazy_get_bindAff();
private static Object __lazy_value_applyAff;
private static int __lazy_state_applyAff;
private static Object __lazy_get_applyAff() { if (__lazy_state_applyAff == 2) return __lazy_value_applyAff; if (__lazy_state_applyAff == 1) throw new IllegalStateException("Recursive initialization of applyAff"); __lazy_state_applyAff = 1; __lazy_value_applyAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Monad.ap)).apply(__M$Effect_Aff.__lazy_get_monadAff()); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.functorAff; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); __lazy_state_applyAff = 2; return __lazy_value_applyAff; }
public static final Object applyAff = __lazy_get_applyAff();
private static Object __lazy_value_applicativeAff;
private static int __lazy_state_applicativeAff;
private static Object __lazy_get_applicativeAff() { if (__lazy_state_applicativeAff == 2) return __lazy_value_applicativeAff; if (__lazy_state_applicativeAff == 1) throw new IllegalStateException("Recursive initialization of applicativeAff"); __lazy_state_applicativeAff = 1; __lazy_value_applicativeAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._pure; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.__lazy_get_applyAff(); }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_applicativeAff = 2; return __lazy_value_applicativeAff; }
public static final Object applicativeAff = __lazy_get_applicativeAff();
public static final Object cancelWith = (java.util.function.Function<Object, Object>) (aff_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.generalBracket)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit)))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (e_2_i2) -> { return (java.util.function.Function<Object, Object>) (v1_3_i3) -> { return ((java.util.function.Function<Object, Object>) (v_1_i1)).apply(e_2_i2); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_2_i4) -> { return __M$Effect_Aff._pure; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_2_i5) -> { return __M$Effect_Aff._pure; }; return new __Record$63_6f_6d_70_6c_65_74_65_64_O$66_61_69_6c_65_64_O$6b_69_6c_6c_65_64_O(new String[]{"killed", "failed", "completed"}, __field2, __field1, __field0); } }).get()))).apply((java.util.function.Function<Object, Object>) (v_2_i6) -> { return aff_0_i0; }); }; };
public static final Object $finally = (java.util.function.Function<Object, Object>) (fin_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.generalBracket)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit)))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (java.util.function.Function<Object, Object>) (v_3_i3) -> { return fin_0_i0; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_2_i4) -> { return (java.util.function.Function<Object, Object>) (v_3_i5) -> { return fin_0_i0; }; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_2_i6) -> { return (java.util.function.Function<Object, Object>) (v_3_i7) -> { return fin_0_i0; }; }; return new __Record$63_6f_6d_70_6c_65_74_65_64_O$66_61_69_6c_65_64_O$6b_69_6c_6c_65_64_O(new String[]{"killed", "failed", "completed"}, __field2, __field1, __field0); } }).get()))).apply((java.util.function.Function<Object, Object>) (v_2_i8) -> { return a_1_i1; }); }; };
public static final Object invincible = (java.util.function.Function<Object, Object>) (a_0_i0) -> { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit); return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.generalBracket)).apply(a_0_i0))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (java.util.function.Function<Object, Object>) (v_3_i3) -> { return __local_var_1_i1; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_2_i4) -> { return (java.util.function.Function<Object, Object>) (v_3_i5) -> { return __local_var_1_i1; }; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_2_i6) -> { return (java.util.function.Function<Object, Object>) (v_3_i7) -> { return __local_var_1_i1; }; }; return new __Record$63_6f_6d_70_6c_65_74_65_64_O$66_61_69_6c_65_64_O$6b_69_6c_6c_65_64_O(new String[]{"killed", "failed", "completed"}, __field2, __field1, __field0); } }).get()))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Effect_Aff.applicativeAff)); };
public static final Object lazyAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._bind)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit)))).apply(f_0_i0); }; return new __Record$64_65_66_65_72_O(new String[]{"defer"}, __field0); } }).get();
public static final Object parallelAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Unsafe_Coerce.unsafeCoerce; final Object __field1 = __M$Effect_Aff._sequential; final Object __field2 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.applyAff; }; final Object __field3 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Effect_Aff.applyParAff; }; return new __Record$41_70_70_6c_79_30_O$41_70_70_6c_79_31_O$70_61_72_61_6c_6c_65_6c_O$73_65_71_75_65_6e_74_69_61_6c_O(new String[]{"parallel", "sequential", "Apply0", "Apply1"}, __field2, __field3, __field0, __field1); } }).get();
public static final Object applicativeParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Parallel_Class.parallel)).apply(__M$Effect_Aff.parallelAff)))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Effect_Aff.applicativeAff)); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.applyParAff; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get();
public static final Object monoidParAff = (java.util.function.Function<Object, Object>) (dictMonoid_0_i0) -> { Object semigroupParAff1_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.semigroupParAff)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonoid_0_i0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Parallel_Class.parallel)).apply(__M$Effect_Aff.parallelAff)))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Effect_Aff.applicativeAff)))).apply(((java.util.Map<String, Object>) dictMonoid_0_i0).get("mempty")); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2_i2) -> { return semigroupParAff1_1_i1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); };
public static final Object semigroupCanceler = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return (java.util.function.Function<Object, Object>) (err_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Parallel.parTraverse_)).apply(__M$Effect_Aff.parallelAff))).apply(__M$Effect_Aff.applicativeParAff))).apply(__M$Data_Foldable.foldableArray))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn)))).apply(new Object[]{((java.util.function.Function<Object, Object>) (v_0_i0)).apply(err_2_i2), ((java.util.function.Function<Object, Object>) (v1_1_i1)).apply(err_2_i2)}); }; }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get();
public static final Object semigroupAff = (java.util.function.Function<Object, Object>) (dictSemigroup_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.append)).apply(dictSemigroup_0_i0); return (java.util.function.Function<Object, Object>) (a_2_i2) -> { return (java.util.function.Function<Object, Object>) (b_3_i3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad.ap)).apply(__M$Effect_Aff.monadAff))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._map)).apply(__local_var_1_i1))).apply(a_2_i2)))).apply(b_3_i3); }; }; } }).get(); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); };
public static final Object monadEffectAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._liftEffect; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.monadAff; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_45_66_66_65_63_74_O(new String[]{"liftEffect", "Monad0"}, __field1, __field0); } }).get();
public static final Object effectCanceler = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply((java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Function.$const))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Class.liftEffect)).apply(__M$Effect_Aff.monadEffectAff)));
public static final Object joinFiber = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply(__M$Effect_Aff.effectCanceler))).apply(((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read1(v_0_i0))).apply(k_1_i1)); }); };
public static final Object functorFiber = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (t_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Unsafe.unsafePerformEffect)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._map)).apply(f_0_i0))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply(__M$Effect_Aff.effectCanceler))).apply(((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read1(t_1_i1))).apply(k_2_i2)); })))); }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object applyFiber = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (t1_0_i0) -> { return (java.util.function.Function<Object, Object>) (t2_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Unsafe.unsafePerformEffect)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad.ap)).apply(__M$Effect_Aff.monadAff))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply(__M$Effect_Aff.effectCanceler))).apply(((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read1(t1_0_i0))).apply(k_2_i2)); })))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_2_i3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply(__M$Effect_Aff.effectCanceler))).apply(((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read1(t2_1_i1))).apply(k_2_i3)); })))); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i4) -> { return __M$Effect_Aff.functorFiber; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get();
public static final Object applicativeFiber = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Unsafe.unsafePerformEffect)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(a_0_i0))); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Effect_Aff.applyFiber; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get();
public static final Object killFiber = (java.util.function.Function<Object, Object>) (e_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return __M$Effect_Aff.__direct$34(e_0_i0, v_1_i1); }; };
private static Object __direct$34(Object e_0_i0, Object v_1_i1) { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._bind)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._liftEffect)).apply(__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read0(v_1_i1))))).apply((java.util.function.Function<Object, Object>) (suspended_2_i2) -> { return ( ((Boolean) (suspended_2_i2)) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Class.liftEffect)).apply(__M$Effect_Aff.monadEffectAff))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Functor.$void)).apply(__M$Effect.functorEffect))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read2(v_1_i1))).apply(e_0_i0))).apply((java.util.function.Function<Object, Object>) (v_3_i3) -> { return (new java.util.function.Supplier<Object>() { public Object get() { return __M$Data_Unit.unit; } }); }))) : ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_3_i4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply(__M$Effect_Aff.effectCanceler))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O.read2(v_1_i1))).apply(e_0_i0))).apply(k_3_i4)); })); }); }
public static final Object fiberCanceler = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply((java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }))).apply((java.util.function.Function<Object, Object>) (b_0_i1) -> { return (java.util.function.Function<Object, Object>) (a_1_i2) -> { return ( ((Boolean) ((__M$Effect_Aff.killFiber == null))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.killFiber)).apply(a_1_i2))).apply(b_0_i1) : __M$Effect_Aff.__direct$34(a_1_i2, b_0_i1)); }; });
public static final Object supervise = (java.util.function.Function<Object, Object>) (aff_0_i0) -> { Object killError_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect_Exception.error)).apply("[Aff] Child fiber outlived parent"); return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.generalBracket)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._liftEffect)).apply((new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._makeSupervisedFiber)).apply(__M$Effect_Aff.ffiUtil))).apply(aff_0_i0); Object sup_3_i3 = ((java.util.function.Supplier) (Object)(__local_var_2_i2)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect.bindEffect))).apply(((java.util.Map<String, Object>) ((java.util.Map<String, Object>) sup_3_i3).get("fiber")).get("run")))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_4_i4) -> { return (new java.util.function.Supplier<Object>() { public Object get() { return sup_3_i3; } }); }))).get(); } }))))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (err_2_i5) -> { return (java.util.function.Function<Object, Object>) (sup_3_i6) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Parallel.parTraverse_)).apply(__M$Effect_Aff.parallelAff))).apply(__M$Effect_Aff.applicativeParAff))).apply(__M$Data_Foldable.foldableArray))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn)))).apply(new Object[]{( ((Boolean) ((__M$Effect_Aff.killFiber == null))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.killFiber)).apply(err_2_i5))).apply(__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read0(sup_3_i6)) : __M$Effect_Aff.__direct$34(err_2_i5, __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read0(sup_3_i6))), ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_4_i7) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._killAll)).apply(err_2_i5))).apply(__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read1(sup_3_i6)))).apply(((java.util.function.Function<Object, Object>) (k_4_i7)).apply(new __M$Data_Either.Right(__M$Data_Unit.unit))); })}); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (v_2_i8) -> { return (java.util.function.Function<Object, Object>) (sup_3_i9) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_4_i10) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._killAll)).apply(killError_1_i1))).apply(__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read1(sup_3_i9)))).apply(((java.util.function.Function<Object, Object>) (k_4_i10)).apply(new __M$Data_Either.Right(__M$Data_Unit.unit))); }); }; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_2_i11) -> { return (java.util.function.Function<Object, Object>) (sup_3_i12) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (k_4_i13) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._killAll)).apply(killError_1_i1))).apply(__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read1(sup_3_i12)))).apply(((java.util.function.Function<Object, Object>) (k_4_i13)).apply(new __M$Data_Either.Right(__M$Data_Unit.unit))); }); }; }; return new __Record$63_6f_6d_70_6c_65_74_65_64_O$66_61_69_6c_65_64_O$6b_69_6c_6c_65_64_O(new String[]{"killed", "failed", "completed"}, __field2, __field1, __field0); } }).get()))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Aff.joinFiber))).apply((java.util.function.Function<Object, Object>) (v_2_i14) -> { return __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O.read0(v_2_i14); })); };
public static final Object monadSTAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.composeFlipped)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Class.liftST)).apply(__M$Control_Monad_ST_Class.monadSTEffect)))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Class.liftEffect)).apply(__M$Effect_Aff.monadEffectAff)); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.monadAff; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_53_54_O(new String[]{"liftST", "Monad0"}, __field1, __field0); } }).get();
public static final Object monadThrowAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._throwError; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.monadAff; }; return new __Record$4d_6f_6e_61_64_30_O$74_68_72_6f_77_45_72_72_6f_72_O(new String[]{"throwError", "Monad0"}, __field1, __field0); } }).get();
public static final Object monadErrorAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._catchError; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.monadThrowAff; }; return new __Record$4d_6f_6e_61_64_54_68_72_6f_77_30_O$63_61_74_63_68_45_72_72_6f_72_O(new String[]{"catchError", "MonadThrow0"}, __field1, __field0); } }).get();
public static final Object attempt = ((java.util.function.Function<Object, Object>) (__M$Control_Monad_Error_Class.$try)).apply(__M$Effect_Aff.monadErrorAff);
public static final Object runAff = (java.util.function.Function<Object, Object>) (k_0_i0) -> { return (java.util.function.Function<Object, Object>) (aff_1_i1) -> { return __M$Effect_Aff.__direct$41(k_0_i0, aff_1_i1); }; };
private static Object __direct$41(Object k_0_i0, Object aff_1_i1) { return ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.launchAff)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect_Aff.bindAff))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_Error_Class.$try)).apply(__M$Effect_Aff.monadErrorAff))).apply(aff_1_i1)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Class.liftEffect)).apply(__M$Effect_Aff.monadEffectAff)))).apply(k_0_i0))); }
public static final Object runAff_ = (java.util.function.Function<Object, Object>) (k_0_i0) -> { return (java.util.function.Function<Object, Object>) (aff_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Functor.$void)).apply(__M$Effect.functorEffect))).apply(( ((Boolean) ((__M$Effect_Aff.runAff == null))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff.runAff)).apply(k_0_i0))).apply(aff_1_i1) : __M$Effect_Aff.__direct$41(k_0_i0, aff_1_i1))); }; };
public static final Object runSuspendedAff = (java.util.function.Function<Object, Object>) (k_0_i0) -> { return (java.util.function.Function<Object, Object>) (aff_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.launchSuspendedAff)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect_Aff.bindAff))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_Error_Class.$try)).apply(__M$Effect_Aff.monadErrorAff))).apply(aff_1_i1)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Class.liftEffect)).apply(__M$Effect_Aff.monadEffectAff)))).apply(k_0_i0))); }; };
public static final Object monadRecAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (k_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { class LetRecScope_go__go_1_i1 { Object go__go_1_i1; LetRecScope_go__go_1_i1() { go__go_1_i1 = (java.util.function.Function<Object, Object>) (a_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._bind)).apply(((java.util.function.Function<Object, Object>) (k_0_i0)).apply(a_2_i2)))).apply((java.util.function.Function<Object, Object>) (res_3_i3) -> { return ( ((Boolean) ((((Object) (res_3_i3)) instanceof __M$Control_Monad_Rec_Class.Done))) ? ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(((__M$Control_Monad_Rec_Class.Done) (Object)(res_3_i3)).value0) : ( ((Boolean) ((((Object) (res_3_i3)) instanceof __M$Control_Monad_Rec_Class.Loop))) ? ((java.util.function.Function<Object, Object>) (go__go_1_i1)).apply(((__M$Control_Monad_Rec_Class.Loop) (Object)(res_3_i3)).value0) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }); }; } } LetRecScope_go__go_1_i1 __letrec_go__go_1_i1 = new LetRecScope_go__go_1_i1(); Object go__go_1_i1 = __letrec_go__go_1_i1.go__go_1_i1; return go__go_1_i1; } }).get(); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i4) -> { return __M$Effect_Aff.monadAff; }; return new __Record$4d_6f_6e_61_64_30_O$74_61_69_6c_52_65_63_4d_O(new String[]{"tailRecM", "Monad0"}, __field1, __field0); } }).get();
public static final Object monoidAff = (java.util.function.Function<Object, Object>) (dictMonoid_0_i0) -> { Object semigroupAff1_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.semigroupAff)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonoid_0_i0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(((java.util.Map<String, Object>) dictMonoid_0_i0).get("mempty")); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2_i2) -> { return semigroupAff1_1_i1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); };
public static final Object nonCanceler = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_0_i0 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit); return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return __local_var_0_i0; }; } }).get();
public static final Object monoidCanceler = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_0_i0 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit); return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return __local_var_0_i0; }; } }).get(); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Effect_Aff.semigroupCanceler; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get();
public static final Object never = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff.makeAff)).apply((java.util.function.Function<Object, Object>) (v_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._pure)).apply(__M$Data_Unit.unit); return (java.util.function.Function<Object, Object>) (v_2_i2) -> { return __local_var_1_i1; }; } }); });
public static final Object apathize = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.composeFlipped)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Aff.attempt))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Aff._map)).apply((java.util.function.Function<Object, Object>) (v_0_i0) -> { return __M$Data_Unit.unit; }));
public static final Object altParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Aff._parAffAlt; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.functorParAff; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get();
public static final Object altAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a1_0_i0) -> { return (java.util.function.Function<Object, Object>) (a2_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Aff._catchError)).apply(a1_0_i0))).apply((java.util.function.Function<Object, Object>) (v_2_i2) -> { return a2_1_i1; }); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i3) -> { return __M$Effect_Aff.functorAff; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get();
public static final Object plusAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Effect_Aff._throwError)).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Exception.error)).apply("Always fails")); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.altAff; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get();
public static final Object plusParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Plus.empty)).apply(__M$Effect_Aff.plusAff); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.altParAff; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get();
public static final Object alternativeParAff = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect_Aff.applicativeParAff; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Effect_Aff.plusParAff; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get();
}
