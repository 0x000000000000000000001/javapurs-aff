public class __M$Data_Symbol {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Symbol"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Symbol.java
    public static Object unsafeCoerce = (java.util.function.Function<Object, Object>) (arg) -> arg;


public static final Object reifySymbol = __init$reifySymbol();
    private static Object __init$reifySymbol() { return (java.util.function.Function<Object, Object>) (s_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Symbol.unsafeCoerce)).apply((java.util.function.Function<Object, Object>) (dictIsSymbol_2$r2) -> { return ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(dictIsSymbol_2$r2); }))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r3) -> { return s_0$r0; }; return new __Record$72_65_66_6c_65_63_74_53_79_6d_62_6f_6c_O(new String[]{"reflectSymbol"}, __field0); } }).get()))).apply(__M$Type_Proxy.__singleton$Proxy.value); }; }; }
public static final Object reflectSymbol = __init$reflectSymbol();
    private static Object __init$reflectSymbol() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("reflectSymbol"); }; }
}
