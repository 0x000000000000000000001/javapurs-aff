public class __M$Data_Monoid_Endo {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Monoid.Endo"); }
    };


public static final Object Endo = __init$Endo();
    private static Object __init$Endo() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object showEndo = __init$showEndo();
    private static Object __init$showEndo() { return (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1_i1) -> { return (((String) ((((String) ("(Endo ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(v_1_i1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupEndo = __init$semigroupEndo();
    private static Object __init$semigroupEndo() { return (java.util.function.Function<Object, Object>) (dictSemigroupoid_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1_i1) -> { return (java.util.function.Function<Object, Object>) (v1_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(dictSemigroupoid_0_i0))).apply(v_1_i1))).apply(v1_2_i2); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }; }
public static final Object ordEndo = __init$ordEndo();
    private static Object __init$ordEndo() { return (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { return dictOrd_0_i0; }; }
public static final Object monoidEndo = __init$monoidEndo();
    private static Object __init$monoidEndo() { return (java.util.function.Function<Object, Object>) (dictCategory_0_i0) -> { Object semigroupEndo1_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_Monoid_Endo.semigroupEndo)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictCategory_0_i0).get("Semigroupoid0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(dictCategory_0_i0); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2_i2) -> { return semigroupEndo1_1_i1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }; }
public static final Object eqEndo = __init$eqEndo();
    private static Object __init$eqEndo() { return (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> { return dictEq_0_i0; }; }
public static final Object boundedEndo = __init$boundedEndo();
    private static Object __init$boundedEndo() { return (java.util.function.Function<Object, Object>) (dictBounded_0_i0) -> { return dictBounded_0_i0; }; }
}
