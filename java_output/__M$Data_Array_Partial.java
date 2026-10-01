public class __M$Data_Array_Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.Partial"); }
    };


public static final Object tail = __init$tail();
    private static Object __init$tail() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (xs_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array.sliceImpl)).apply(1))).apply(((Object[]) (Object)(xs_1$r1)).length))).apply(xs_1$r1); }; }; }
public static final Object last = __init$last();
    private static Object __init$last() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (xs_1$r1) -> { return ((Object[]) (xs_1$r1))[((int) ((((int) (((Object[]) (Object)(xs_1$r1)).length)) - ((int) (1)))))]; }; }; }
public static final Object init = __init$init();
    private static Object __init$init() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (xs_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array.sliceImpl)).apply(0))).apply((((int) (((Object[]) (Object)(xs_1$r1)).length)) - ((int) (1)))))).apply(xs_1$r1); }; }; }
public static final Object head = __init$head();
    private static Object __init$head() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (xs_1$r1) -> { return ((Object[]) (xs_1$r1))[((int) (0))]; }; }; }
}
