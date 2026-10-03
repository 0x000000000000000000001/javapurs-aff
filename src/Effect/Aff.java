    // Runtime values, cancellation, fibers, and parallel coordination live here.
    // The final section adapts these typed operations to the curried Java FFI.
    // Fibers use daemon platform threads; cancellation is cooperative.
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
        final AffRun aff;
        final java.util.function.Function<Object, AffRun> next;
        BindNode(AffRun aff, java.util.function.Function<Object, AffRun> next) { this.aff = aff; this.next = next; }
    }

    private static Object apply(Object fn, Object value) { return ((java.util.function.Function<Object, Object>) fn).apply(value); }
    private static Object force(Object effect) { return ((java.util.function.Supplier<?>) effect).get(); }
    private static AffRun asAff(Object value) { return value instanceof AffRun ? (AffRun) value : ctx -> value; }
    private static Object errorValue(Throwable error) {
        if (error instanceof AffError) return ((AffError) error).error;
        if (error instanceof AffCancelled) return ((AffCancelled) error).error;
        return error;
    }
    private static Object either(boolean failed, Object value) {
        return failed ? new __M$Data_Either.Left(value) : new __M$Data_Either.Right(value);
    }
    private static Object runAffSync(AffRun aff, RunContext ctx) {
        java.util.ArrayDeque<java.util.function.Function<Object, AffRun>> stack = new java.util.ArrayDeque<>();
        AffRun current = aff;
        while (true) {
            if (ctx != null) ctx.check();
            Object result;
            try { result = current.run(ctx); }
            catch (AffCancelled | AffError known) { throw known; }
            catch (Throwable thrown) { throw new AffError(thrown); }
            if (ctx != null) ctx.check();
            if (result instanceof BindNode) {
                BindNode node = (BindNode) result;
                stack.push(node.next);
                current = node.aff;
            } else if (!stack.isEmpty()) {
                try { current = stack.pop().apply(result); }
                catch (AffCancelled | AffError known) { throw known; }
                catch (Throwable thrown) { throw new AffError(thrown); }
            } else return result;
        }
    }

    // Registration is removable and claimed at most once. Calling user code
    // never holds a context, fiber, or supervisor monitor.
    private static final class Registration implements AutoCloseable {
        final RunContext context;
        final java.util.function.Consumer<Object> action;
        final java.util.concurrent.atomic.AtomicBoolean active = new java.util.concurrent.atomic.AtomicBoolean(true);
        Registration(RunContext context, java.util.function.Consumer<Object> action) { this.context = context; this.action = action; }
        void fire(Object cause) {
            if (!active.compareAndSet(true, false)) return;
            try { action.accept(cause); }
            catch (Throwable error) { System.err.println("Aff canceler error: " + errorValue(error)); }
        }
        public void close() { active.set(false); synchronized (context) { context.cancelers.remove(this); } }
    }
    private static final class Cancellation {
        final Object cause;
        final java.util.List<Registration> pending;
        final Thread owner = Thread.currentThread();
        final java.util.concurrent.CountDownLatch completed = new java.util.concurrent.CountDownLatch(1);
        Cancellation(Object cause, java.util.List<Registration> pending) { this.cause = cause; this.pending = pending; }
        void await() { if (owner != Thread.currentThread()) awaitUninterruptibly(completed); }
    }
    private static void awaitUninterruptibly(java.util.concurrent.CountDownLatch latch) {
        boolean interrupted = false;
        while (true) {
            try { latch.await(); break; }
            catch (InterruptedException ignored) { interrupted = true; }
        }
        if (interrupted) Thread.currentThread().interrupt();
    }
    public static final class RunContext {
        public final Supervisor supervisor;
        private volatile Cancellation cancellation;
        private final java.util.Set<Registration> cancelers = new java.util.LinkedHashSet<>();
        public RunContext(Supervisor supervisor) { this.supervisor = supervisor; }
        public void check() {
            Cancellation current = cancellation;
            if (current != null) {
                // A fiber cannot publish completion before its pending canceler
                // has finished. The cancellation owner must not wait on itself.
                current.await();
                throw new AffCancelled(current.cause);
            }
        }
        // Reserving the first cause is separate from invoking user code. A fiber
        // reserves under its lifecycle lock, then runs cancelers outside locks.
        private synchronized Cancellation requestCancel(Object cause) {
            if (cancellation != null) return null;
            cancellation = new Cancellation(cause, new java.util.ArrayList<>(cancelers));
            cancelers.clear();
            return cancellation;
        }
        private void completeCancel(Cancellation request) {
            if (request == null) return;
            try {
                for (Registration registration : request.pending) registration.fire(request.cause);
            } finally { request.pending.clear(); request.completed.countDown(); }
        }
        public void cancel(Object cause) { completeCancel(requestCancel(cause)); }
        private Registration register(java.util.function.Consumer<Object> action) {
            Registration registration = new Registration(this, action);
            Cancellation current;
            synchronized (this) {
                current = cancellation;
                if (current == null) { cancelers.add(registration); return registration; }
            }
            registration.fire(current.cause);
            return registration;
        }
        public void registerCanceler(Object canceler) {
            register(cause -> runAffSync(asAff(apply(canceler, cause)), masked(this)));
        }
    }
    private static RunContext masked(RunContext context) { return new RunContext(context == null ? null : context.supervisor); }

    // A supervisor covers a whole fork subtree. Closing and registration share
    // a lock, so a child forked during shutdown cannot escape that shutdown.
    public static final class Supervisor {
        private final java.util.Set<NativeFiber> children = new java.util.LinkedHashSet<>();
        private boolean closing;
        private Object cause;
        void add(NativeFiber child) {
            Object error;
            synchronized (this) { if (!closing) { children.add(child); return; } error = cause; }
            child.kill(error, null);
        }
        synchronized void remove(NativeFiber child) { children.remove(child); }
        void killAll(Object error) {
            java.util.List<NativeFiber> pending;
            synchronized (this) {
                if (!closing) { closing = true; cause = error; }
                pending = new java.util.ArrayList<>(children);
            }
            for (NativeFiber child : pending) child.kill(cause, null);
            for (NativeFiber child : pending) child.await();
        }
    }

    private static final class FiberResult {
        final boolean failed;
        final Object value;
        FiberResult(boolean failed, Object value) { this.failed = failed; this.value = value; }
        Object toEither() { return either(failed, value); }
    }
    private static final class Observer {
        final boolean rethrow;
        final java.util.function.Consumer<FiberResult> callback;
        final java.util.concurrent.atomic.AtomicBoolean active = new java.util.concurrent.atomic.AtomicBoolean(true);
        Observer(boolean rethrow, java.util.function.Consumer<FiberResult> callback) { this.rethrow = rethrow; this.callback = callback; }
        boolean deliver(FiberResult result) {
            if (!active.compareAndSet(true, false)) return false;
            try { callback.accept(result); }
            catch (Throwable error) { System.err.println("Aff completion handler error: " + errorValue(error)); }
            return !rethrow;
        }
    }
    public static final class NativeFiber {
        final AffRun aff;
        final RunContext ctx;
        private boolean started;
        private boolean completing;
        private FiberResult result;
        private Thread thread;
        private final java.util.List<Observer> observers = new java.util.ArrayList<>();
        private final java.util.concurrent.CountDownLatch exited = new java.util.concurrent.CountDownLatch(1);
        NativeFiber(AffRun aff) { this(aff, null); }
        NativeFiber(AffRun aff, Supervisor supervisor) {
            this.aff = aff; ctx = new RunContext(supervisor);
            if (supervisor != null) supervisor.add(this);
        }
        synchronized boolean isSuspended() { return !started && !completing; }
        synchronized void start() {
            if (started || completing) return;
            started = true;
            thread = new Thread(() -> {
                FiberResult outcome;
                try { outcome = new FiberResult(false, runAffSync(aff, ctx)); }
                catch (Throwable error) { outcome = new FiberResult(true, errorValue(error)); }
                finish(outcome);
            }, "javapurs-aff");
            thread.setDaemon(true);
            thread.start();
        }
        private void finish(FiberResult outcome) {
            Cancellation requested;
            synchronized (this) {
                if (completing) return;
                completing = true;
                requested = ctx.cancellation;
            }
            if (requested != null) {
                requested.await();
                if (!outcome.failed) outcome = new FiberResult(true, requested.cause);
            }
            java.util.List<Observer> pending;
            synchronized (this) {
                result = outcome;
                pending = new java.util.ArrayList<>(observers);
                observers.clear();
            }
            boolean handled = false;
            try {
                if (ctx.supervisor != null) ctx.supervisor.remove(this);
                for (Observer observer : pending) handled |= observer.deliver(outcome);
                if (outcome.failed && !handled) System.err.println("Uncaught Aff error: " + outcome.value);
            } finally { exited.countDown(); }
        }
        private java.util.function.Supplier<Object> observe(boolean rethrow, java.util.function.Consumer<FiberResult> callback) {
            Observer observer = new Observer(rethrow, callback);
            FiberResult outcome;
            synchronized (this) {
                outcome = result;
                if (outcome == null) observers.add(observer);
            }
            if (outcome != null) observer.deliver(outcome);
            return () -> {
                observer.active.set(false);
                synchronized (this) { observers.remove(observer); }
                return null;
            };
        }
        void await() {
            synchronized (this) { if (isSuspended() || Thread.currentThread() == thread) return; }
            awaitUninterruptibly(exited);
        }
        java.util.function.Supplier<Object> kill(Object error, Object callback) {
            var detach = observe(false, outcome -> { if (callback != null) force(apply(callback, either(false, null))); });
            boolean suspended;
            Cancellation request;
            synchronized (this) {
                if (completing) return detach;
                suspended = !started;
                if (suspended) started = true; // Reserve completion without running the body.
                request = ctx.requestCancel(error);
            }
            ctx.completeCancel(request);
            if (suspended) finish(new FiberResult(true, ctx.cancellation.cause));
            return detach;
        }
    }

    // One async registration has one terminal result. A synchronous callback can
    // finish before its builder returns; that completed action has no canceler.
    private static AffRun async(Object builder) {
        return context -> {
            var completed = new java.util.concurrent.atomic.AtomicBoolean();
            var result = new java.util.concurrent.CompletableFuture<Object>();
            java.util.function.Function<Object, Object> callback = value -> (java.util.function.Supplier<Object>) () -> {
                if (completed.compareAndSet(false, true)) result.complete(value);
                return null;
            };
            Object canceler = force(apply(builder, callback));
            Registration registration = context == null ? null : context.register(cause -> {
                if (completed.compareAndSet(false, true)) runAffSync(asAff(apply(canceler, cause)), masked(context));
            });
            try {
                while (true) {
                    if (context != null) context.check();
                    try {
                        Object value = result.get(20, java.util.concurrent.TimeUnit.MILLISECONDS);
                        if (value instanceof __M$Data_Either.Left) throw new AffError(((__M$Data_Either.Left) value).value0);
                        return ((__M$Data_Either.Right) value).value0;
                    } catch (java.util.concurrent.TimeoutException pending) {
                        // Cooperative checkpoint; cancellation owns its original cause.
                    } catch (InterruptedException interrupted) {
                        Thread.currentThread().interrupt();
                        if (context != null) context.check();
                        throw new AffError(interrupted);
                    } catch (java.util.concurrent.ExecutionException error) { throw new AffError(error.getCause()); }
                }
            } finally { if (registration != null) registration.close(); }
        };
    }

    private static AffRun bracketRun(Object acquire, Object conditions, Object use) {
        return context -> {
            var handlers = (java.util.Map<String, Object>) conditions;
            Object resource = runAffSync(asAff(acquire), masked(context));
            Object value = null;
            RuntimeException failure = null;
            String condition;
            try {
                if (context != null) context.check();
                value = runAffSync(asAff(apply(use, resource)), context);
                condition = "completed";
            } catch (AffCancelled cancelled) { failure = cancelled; condition = "killed"; }
            catch (AffError error) { failure = error; condition = "failed"; }
            catch (Throwable error) { failure = new AffError(error); condition = "failed"; }
            // Cleanup is outside the try that classifies the use: if it fails,
            // a second cleanup must not run. Acquisition/disposal are masked.
            Object argument = failure == null ? value : errorValue(failure);
            runAffSync(asAff(apply(apply(handlers.get(condition), argument), resource)), masked(context));
            if (failure != null) throw failure;
            return value;
        };
    }

    // Both combinators share publication and cleanup. Race selects a successful
    // outcome (null is valid); Apply selects the first failure, not its sibling's
    // resulting cancellation. Parent cancellation reaches both child contexts.
    private static final class ParallelPair {
        final NativeFiber[] fibers;
        final FiberResult[] results = new FiberResult[2];
        final boolean race;
        FiberResult decision;
        FiberResult firstFailure;
        ParallelPair(AffRun left, AffRun right, RunContext context, boolean race) {
            this.race = race;
            Supervisor supervisor = context == null ? null : context.supervisor;
            fibers = new NativeFiber[]{new NativeFiber(left, supervisor), new NativeFiber(right, supervisor)};
        }
        void accept(int index, FiberResult result) {
            boolean cancelOther = false;
            synchronized (this) {
                results[index] = result;
                if (result.failed && firstFailure == null) firstFailure = result;
                if (decision == null) {
                    if (race && !result.failed || !race && result.failed) { decision = result; cancelOther = true; }
                    else if (results[0] != null && results[1] != null) decision = race ? firstFailure : new FiberResult(false, null);
                }
                notifyAll();
            }
            if (cancelOther) fibers[1 - index].kill(result.failed ? result.value : new RuntimeException("[Aff] Lost parallel race"), null);
        }
        void cancel(Object cause) {
            for (NativeFiber fiber : fibers) fiber.kill(cause, null);
            for (NativeFiber fiber : fibers) fiber.await();
        }
        Object run(RunContext context) {
            fibers[0].observe(false, outcome -> accept(0, outcome));
            fibers[1].observe(false, outcome -> accept(1, outcome));
            Registration registration = context == null ? null : context.register(this::cancel);
            try {
                fibers[0].start(); fibers[1].start();
                while (true) {
                    if (context != null) context.check();
                    synchronized (this) {
                        if (decision != null) break;
                        try { wait(20); }
                        catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); throw new AffError(interrupted); }
                    }
                }
                for (NativeFiber fiber : fibers) fiber.await();
                if (context != null) context.check();
                if (decision.failed) throw new AffError(decision.value);
                return race ? decision.value : apply(results[0].value, results[1].value);
            } finally { if (registration != null) registration.close(); }
        }
    }

    // FFI records contain Effect thunks and curried Functions, not raw AffRun
    // values. join starts a suspended fiber; onComplete only observes it. Their
    // returned Effect unregisters that observer and never waits for the fiber.
    private static java.util.Map<String, Object> fiberRecord(NativeFiber fiber) {
        java.util.Map<String, Object> record = new java.util.LinkedHashMap<>();
        record.put("run", (java.util.function.Supplier<Object>) () -> { fiber.start(); return null; });
        record.put("kill", (java.util.function.Function<Object, Object>) error ->
            (java.util.function.Function<Object, Object>) callback -> (java.util.function.Supplier<Object>) () -> fiber.kill(error, callback));
        record.put("join", (java.util.function.Function<Object, Object>) callback -> (java.util.function.Supplier<Object>) () -> {
            var detach = fiber.observe(false, outcome -> force(apply(callback, outcome.toEither())));
            fiber.start();
            return detach;
        });
        record.put("onComplete", (java.util.function.Function<Object, Object>) options -> (java.util.function.Supplier<Object>) () -> {
            var fields = (java.util.Map<String, Object>) options;
            return fiber.observe(Boolean.TRUE.equals(fields.get("rethrow")), outcome -> force(apply(fields.get("handler"), outcome.toEither())));
        });
        record.put("isSuspended", (java.util.function.Supplier<Object>) fiber::isSuspended);
        record.put("__fiber", fiber);
        return record;
    }

    public static Object _pure = (java.util.function.Function<Object, Object>) value -> (AffRun) ctx -> value;
    public static Object _throwError = (java.util.function.Function<Object, Object>) error -> (AffRun) ctx -> { throw new AffError(error); };
    public static Object _catchError = (java.util.function.Function<Object, Object>) aff ->
        (java.util.function.Function<Object, Object>) handler -> (AffRun) ctx -> {
            try { return runAffSync(asAff(aff), ctx); }
            catch (AffError error) { return runAffSync(asAff(apply(handler, error.error)), ctx); }
        };
    public static Object _map = (java.util.function.Function<Object, Object>) fn ->
        (java.util.function.Function<Object, Object>) aff -> (AffRun) ctx ->
            new BindNode(asAff(aff), value -> next -> apply(fn, value));
    public static Object _bind = (java.util.function.Function<Object, Object>) aff ->
        (java.util.function.Function<Object, Object>) next -> (AffRun) ctx -> new BindNode(asAff(aff), value -> asAff(apply(next, value)));
    public static Object _liftEffect = (java.util.function.Function<Object, Object>) effect -> (AffRun) ctx -> force(effect);
    public static Object _delay = (java.util.function.Function<Object, Object>) right ->
        (java.util.function.Function<Object, Object>) ms -> (AffRun) ctx -> {
            long remaining = (long) ((Number) ms).doubleValue();
            while (remaining > 0) {
                if (ctx != null) ctx.check();
                long slice = Math.min(remaining, 25L);
                try { Thread.sleep(slice); }
                catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); if (ctx != null) ctx.check(); throw new AffError(interrupted); }
                remaining -= slice;
            }
            return null;
        };
    public static Object generalBracket = (java.util.function.Function<Object, Object>) acquire ->
        (java.util.function.Function<Object, Object>) conditions -> (java.util.function.Function<Object, Object>) use -> bracketRun(acquire, conditions, use);
    public static Object makeAff = (java.util.function.Function<Object, Object>) __M$Effect_Aff::async;
    public static Object _fork = (java.util.function.Function<Object, Object>) immediate ->
        (java.util.function.Function<Object, Object>) aff -> (AffRun) ctx -> {
            NativeFiber fiber = new NativeFiber(asAff(aff), ctx == null ? null : ctx.supervisor);
            if (Boolean.TRUE.equals(immediate)) fiber.start();
            return fiberRecord(fiber);
        };
    public static Object _makeFiber = (java.util.function.Function<Object, Object>) util ->
        (java.util.function.Function<Object, Object>) aff -> (java.util.function.Supplier<Object>) () -> fiberRecord(new NativeFiber(asAff(aff)));
    public static Object _makeSupervisedFiber = (java.util.function.Function<Object, Object>) util ->
        (java.util.function.Function<Object, Object>) aff -> (java.util.function.Supplier<Object>) () -> {
            Supervisor supervisor = new Supervisor();
            java.util.Map<String, Object> result = new java.util.LinkedHashMap<>();
            result.put("fiber", fiberRecord(new NativeFiber(asAff(aff), supervisor)));
            result.put("supervisor", supervisor);
            return result;
        };
    public static Object _killAll = (java.util.function.Function<Object, Object>) error ->
        (java.util.function.Function<Object, Object>) supervisor -> (java.util.function.Function<Object, Object>) callback ->
            (java.util.function.Supplier<Object>) () -> {
                ((Supervisor) supervisor).killAll(error); force(callback);
                return (java.util.function.Function<Object, Object>) ignored -> (AffRun) ctx -> null;
            };
    public static Object _sequential = (java.util.function.Function<Object, Object>) value -> value;
    public static Object _parAffMap = _map;
    public static Object _parAffApply = (java.util.function.Function<Object, Object>) left ->
        (java.util.function.Function<Object, Object>) right -> (AffRun) ctx -> new ParallelPair(asAff(left), asAff(right), ctx, false).run(ctx);
    public static Object _parAffAlt = (java.util.function.Function<Object, Object>) left ->
        (java.util.function.Function<Object, Object>) right -> (AffRun) ctx -> new ParallelPair(asAff(left), asAff(right), ctx, true).run(ctx);
