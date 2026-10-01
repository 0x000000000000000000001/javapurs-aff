public class __M$Data_Comparison {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Comparison"); }
    };


public static final Object Comparison = __init$Comparison();
    private static Object __init$Comparison() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object semigroupComparison = __init$semigroupComparison();
    private static Object __init$semigroupComparison() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.semigroupFn)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.semigroupFn)).apply(__M$Data_Ordering.semigroupOrdering))).get("append"))).apply(v_0$r0))).apply(v1_1$r1); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object newtypeComparison = __init$newtypeComparison();
    private static Object __init$newtypeComparison() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidComparison = __init$monoidComparison();
    private static Object __init$monoidComparison() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return __M$Data_Ordering.__singleton$EQ.value; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Comparison.semigroupComparison; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }
public static final Object defaultComparison = __init$defaultComparison();
    private static Object __init$defaultComparison() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0); }; }
public static final Object contravariantComparison = __init$contravariantComparison();
    private static Object __init$contravariantComparison() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return (java.util.function.Function<Object, Object>) (y_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (v_1$r1)).apply(((java.util.function.Function<Object, Object>) (f_0$r0)).apply(x_2$r2)))).apply(((java.util.function.Function<Object, Object>) (f_0$r0)).apply(y_3$r3)); }; }; }; }; return new __Record$63_6d_61_70_O(new String[]{"cmap"}, __field0); } }).get(); }
}
