public class __M$Control_Semigroupoid {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Semigroupoid"); }
    };


public static final Object semigroupoidFn = __init$semigroupoidFn();
    private static Object __init$semigroupoidFn() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (g_1_i1) -> { return (java.util.function.Function<Object, Object>) (x_2_i2) -> { return ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(((java.util.function.Function<Object, Object>) (g_1_i1)).apply(x_2_i2)); }; }; }; return new __Record$63_6f_6d_70_6f_73_65_O(new String[]{"compose"}, __field0); } }).get(); }
public static final Object compose = __init$compose();
    private static Object __init$compose() { return (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("compose"); }; }
public static final Object composeFlipped = __init$composeFlipped();
    private static Object __init$composeFlipped() { return (java.util.function.Function<Object, Object>) (dictSemigroupoid_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return (java.util.function.Function<Object, Object>) (g_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(dictSemigroupoid_0_i0))).apply(g_2_i2))).apply(f_1_i1); }; }; }; }
}
