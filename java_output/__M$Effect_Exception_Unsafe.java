public class __M$Effect_Exception_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Exception.Unsafe"); }
    };


public static final Object unsafeThrowException = __init$unsafeThrowException();
    private static Object __init$unsafeThrowException() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Unsafe.unsafePerformEffect))).apply(__M$Effect_Exception.throwException); }
public static final Object unsafeThrow = __init$unsafeThrow();
    private static Object __init$unsafeThrow() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Effect_Exception_Unsafe.unsafeThrowException))).apply(__M$Effect_Exception.error); }
}
