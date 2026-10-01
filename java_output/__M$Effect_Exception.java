public class __M$Effect_Exception {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Exception"); }
    };
    // FFI provided by ../javapurs-exceptions/src/Effect/Exception.java
    public static Object showErrorImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    // JavaScript errors carry the name "Error"; the Java port keeps that name
    // so `name`/`show` see the same value as the reference implementation.
    public static class Error extends RuntimeException {
        public Error(String message) { super(message); }
    }

    public static Object error = (java.util.function.Function<Object, Object>) (msg) -> new Error((String) msg);

    public static Object errorWithCause = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (cause) -> {
            RuntimeException err = new RuntimeException((String) msg);
            if (cause instanceof Throwable) err.initCause((Throwable) cause);
            return err;
        };

    public static Object errorWithName = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (name) ->
            new NamedError((String) msg, (String) name);

    public static class NamedError extends RuntimeException {
        private final String errorName;
        public NamedError(String message, String name) { super(message); errorName = name; }
        public String errorName() { return errorName; }
    }

    public static Object message = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getMessage();

    public static Object name = (java.util.function.Function<Object, Object>) (err) ->
        err instanceof NamedError
            ? ((NamedError) err).errorName()
            : ((Throwable) err).getClass().getSimpleName();

    // stackImpl(just)(nothing)(err): JavaScript exposes a .stack string when
    // present; a Java Throwable always has one.
    public static Object stackImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (err) -> {
            java.io.StringWriter writer = new java.io.StringWriter();
            ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
            return ((java.util.function.Function<Object, Object>) just).apply(writer.toString());
        };

    // JavaScript throws the value itself. Java only allows unchecked
    // exceptions in a lambda body, so a checked Throwable is wrapped and a
    // RuntimeException keeps its identity for catchException.
    private static RuntimeException __asRuntime(Throwable err) {
        return err instanceof RuntimeException ? (RuntimeException) err : new RuntimeException(err);
    }

    public static Object throwException = (java.util.function.Function<Object, Object>) (err) ->
        (java.util.function.Supplier<Object>) () -> { throw __asRuntime((Throwable) err); };

    public static Object catchException = (java.util.function.Function<Object, Object>) (handler) ->
        (java.util.function.Function<Object, Object>) (action) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                return ((java.util.function.Supplier<Object>) action).get();
            } catch (Throwable thrown) {
                return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) handler).apply(thrown)).get();
            }
        };


public static final Object $try = __init$$try();
    private static Object __init$$try() { return (java.util.function.Function<Object, Object>) (action_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Exception.catchException)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply((java.util.function.Function<Object, Object>) (a) -> (java.util.function.Supplier<Object>) () -> a))).apply(__M$Data_Either.Left)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.applicativeEffect))).apply(__M$Data_Either.Right))).apply(action_0$r0)); }; }
public static final Object $throw = __init$$throw();
    private static Object __init$$throw() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Exception.throwException))).apply(__M$Effect_Exception.error); }
public static final Object stack = __init$stack();
    private static Object __init$stack() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Exception.stackImpl)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object showError = __init$showError();
    private static Object __init$showError() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Exception.showErrorImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
}
