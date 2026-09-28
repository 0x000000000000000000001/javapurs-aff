public class __M$Data_Op {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Op"); }
    };


public static final Object Op = __init$Op();
    private static Object __init$Op() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object semigroupoidOp = __init$semigroupoidOp();
    private static Object __init$semigroupoidOp() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(v1_1_i1))).apply(v_0_i0); }; }; return new __Record$63_6f_6d_70_6f_73_65_O(new String[]{"compose"}, __field0); } }).get(); }
public static final Object semigroupOp = __init$semigroupOp();
    private static Object __init$semigroupOp() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.semigroupFn)).apply(dictSemigroup_0_i0); }; }
public static final Object newtypeOp = __init$newtypeOp();
    private static Object __init$newtypeOp() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidOp = __init$monoidOp();
    private static Object __init$monoidOp() { return (java.util.function.Function<Object, Object>) (dictMonoid_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Monoid.monoidFn)).apply(dictMonoid_0_i0); }; }
public static final Object contravariantOp = __init$contravariantOp();
    private static Object __init$contravariantOp() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(v_1_i1))).apply(f_0_i0); }; }; return new __Record$63_6d_61_70_O(new String[]{"cmap"}, __field0); } }).get(); }
public static final Object categoryOp = __init$categoryOp();
    private static Object __init$categoryOp() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Op.semigroupoidOp; }; return new __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O(new String[]{"identity", "Semigroupoid0"}, __field1, __field0); } }).get(); }
}
