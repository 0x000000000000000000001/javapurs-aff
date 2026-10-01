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
                    // launchAff_ discards the fiber; report the error instead
                    // of leaving the process parked on keepMainAlive.
                    if (failed && completion.isEmpty()) {
                        System.err.println("Uncaught Aff error: " + error);
                        if (error instanceof Throwable) ((Throwable) error).printStackTrace();
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
            long remaining = duration;
            // Sleep in slices so a cancelled branch (e.g. the loser of a race
            // against a test timeout) stops promptly instead of running the
            // whole duration.
            while (remaining > 0) {
                if (ctx != null) ctx.check();
                long slice = Math.min(remaining, 25L);
                try {
                    Thread.sleep(slice);
                } catch (InterruptedException interrupted) {
                    Thread.currentThread().interrupt();
                    throw new AffCancelled(null);
                }
                remaining -= slice;
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
            final java.util.concurrent.CountDownLatch firstDone = new java.util.concurrent.CountDownLatch(1);
            final java.util.concurrent.CountDownLatch all = new java.util.concurrent.CountDownLatch(2);
            final Object[] winner = new Object[1];
            RunContext child1 = new RunContext(null);
            RunContext child2 = new RunContext(null);
            Runnable first = () -> {
                try {
                    Object value = runAffSync(asAff(aff1), child1);
                    results[0] = value;
                    if (decided.compareAndSet(false, true)) { winner[0] = value; child2.cancel(null); }
                } catch (Throwable thrown) {
                    errors[0] = thrown;
                } finally {
                    firstDone.countDown();
                    all.countDown();
                }
            };
            Runnable second = () -> {
                try {
                    Object value = runAffSync(asAff(aff2), child2);
                    results[1] = value;
                    if (decided.compareAndSet(false, true)) { winner[0] = value; child1.cancel(null); }
                } catch (Throwable thrown) {
                    errors[1] = thrown;
                } finally {
                    firstDone.countDown();
                    all.countDown();
                }
            };
            Thread left = new Thread(first); Thread right = new Thread(second);
            left.setDaemon(true); right.setDaemon(true);
            left.start(); right.start();
            try {
                firstDone.await();
                if (winner[0] != null) {
                    // A winner already cancelled the loser; wait only briefly so
                    // a race against a test-timeout delay returns immediately
                    // instead of blocking for the whole timeout.
                    try { all.await(1, java.util.concurrent.TimeUnit.SECONDS); } catch (InterruptedException ignored) { }
                    return winner[0];
                }
                all.await();
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
            }
            if (winner[0] != null) return winner[0];
            Throwable failure = errors[0] != null ? errors[0] : errors[1];
            if (failure instanceof RuntimeException) throw (RuntimeException) failure;
            throw new AffError(failure);
        };
