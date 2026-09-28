public class __M$Partial_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Partial.Unsafe"); }
    };
    // FFI provided by ../javapurs-partial/src/Partial/Unsafe.java
    public static Object _unsafePartial = (java.util.function.Function<Object, Object>) (f) -> {
        return ((java.util.function.Function<Object, Object>) f).apply(null /* TODO: PrimUndefined */);
    };


public static final Object unsafePartial = __init$unsafePartial();
    private static Object __init$unsafePartial() { return __M$Partial_Unsafe._unsafePartial; }
public static final Object unsafeCrashWith = __init$unsafeCrashWith();
    private static Object __init$unsafeCrashWith() { return (java.util.function.Function<Object, Object>) (msg_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Partial._crashWith)).apply(msg_0_i0); }; }
}
