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

    public static Object error = (java.util.function.Function<Object, Object>) (msg) -> new RuntimeException((String) msg);

    public static Object errorWithCause = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (cause) -> {
            RuntimeException err = new RuntimeException((String) msg);
            if (cause instanceof Throwable) err.initCause((Throwable) cause);
            return err;
        };

    public static Object errorWithName = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (name) -> {
            RuntimeException err = new RuntimeException((String) msg) {
                @Override public String toString() { return ((String) name) + ": " + getMessage(); }
            };
            return err;
        };

    public static Object message = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getMessage();

    public static Object name = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getClass().getSimpleName();

    public static Object stackImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    public static Object throwException = (java.util.function.Function<Object, Object>) (err) ->
        (java.util.function.Supplier<Object>) () -> { throw (Throwable) ((Throwable) err); };

    public static Object catchException = (java.util.function.Function<Object, Object>) (handler) ->
        (java.util.function.Function<Object, Object>) (action) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                return ((java.util.function.Supplier<Object>) action).get();
            } catch (Throwable thrown) {
                return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) handler).apply(thrown)).get();
            }
        };


public static final Object $try = (java.util.function.Function<Object, Object>) (action_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Exception.catchException)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Effect.applicativeEffect)))).apply(__M$Data_Either.Left)))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.applicativeEffect))).apply(__M$Data_Either.Right))).apply(action_0_i0)); };
public static final Object $throw = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Exception.throwException))).apply(__M$Effect_Exception.error);
public static final Object stack = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Exception.stackImpl)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object showError = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Effect_Exception.showErrorImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
}
