public class __M$Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Partial"); }
    };
    // FFI provided by ../javapurs-partial/src/Partial.java
    public static Object _crashWith = (java.util.function.Function<Object, Object>) (msg) -> {
        throw new RuntimeException((String) msg);
    };


public static final Object crashWith = __init$crashWith();
    private static Object __init$crashWith() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Partial._crashWith; }; }
public static final Object crash = __init$crash();
    private static Object __init$crash() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Partial._crashWith)).apply("Partial.crash: partial function"); }; }
}
