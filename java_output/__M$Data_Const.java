public class __M$Data_Const {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Const"); }
    };


public static final Object Const = __init$Const();
    private static Object __init$Const() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showConst = __init$showConst();
    private static Object __init$showConst() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (((String) ((((String) ("(Const ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(v_1$r1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semiringConst = __init$semiringConst();
    private static Object __init$semiringConst() { return (java.util.function.Function<Object, Object>) (dictSemiring_0$r0) -> { return dictSemiring_0$r0; }; }
public static final Object semigroupoidConst = __init$semigroupoidConst();
    private static Object __init$semigroupoidConst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return v1_1$r1; }; }; return new __Record$63_6f_6d_70_6f_73_65_O(new String[]{"compose"}, __field0); } }).get(); }
public static final Object semigroupConst = __init$semigroupConst();
    private static Object __init$semigroupConst() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0$r0) -> { return dictSemigroup_0$r0; }; }
public static final Object ringConst = __init$ringConst();
    private static Object __init$ringConst() { return (java.util.function.Function<Object, Object>) (dictRing_0$r0) -> { return dictRing_0$r0; }; }
public static final Object ordConst = __init$ordConst();
    private static Object __init$ordConst() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return dictOrd_0$r0; }; }
public static final Object newtypeConst = __init$newtypeConst();
    private static Object __init$newtypeConst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidConst = __init$monoidConst();
    private static Object __init$monoidConst() { return (java.util.function.Function<Object, Object>) (dictMonoid_0$r0) -> { return dictMonoid_0$r0; }; }
public static final Object heytingAlgebraConst = __init$heytingAlgebraConst();
    private static Object __init$heytingAlgebraConst() { return (java.util.function.Function<Object, Object>) (dictHeytingAlgebra_0$r0) -> { return dictHeytingAlgebra_0$r0; }; }
public static final Object functorConst = __init$functorConst();
    private static Object __init$functorConst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (m_1$r1) -> { return m_1$r1; }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object invariantConst = __init$invariantConst();
    private static Object __init$invariantConst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Functor_Invariant.imapF)).apply(__M$Data_Const.functorConst); return new __Record$69_6d_61_70_O(new String[]{"imap"}, __field0); } }).get(); }
public static final Object euclideanRingConst = __init$euclideanRingConst();
    private static Object __init$euclideanRingConst() { return (java.util.function.Function<Object, Object>) (dictEuclideanRing_0$r0) -> { return dictEuclideanRing_0$r0; }; }
public static final Object eqConst = __init$eqConst();
    private static Object __init$eqConst() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return dictEq_0$r0; }; }
public static final Object eq1Const = __init$eq1Const();
    private static Object __init$eq1Const() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { Object eq_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0$r0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictEq1_2$r2) -> { return eq_1$r1; }; return new __Record$65_71_31_O(new String[]{"eq1"}, __field0); } }).get(); }; }
public static final Object ord1Const = __init$ord1Const();
    private static Object __init$ord1Const() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { Object compare_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0); Object eq1Const1_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Data_Const.eq1Const)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictOrd_0$r0).get("Eq0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictOrd1_3$r3) -> { return compare_1$r1; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_3$r4) -> { return eq1Const1_2$r2; }; return new __Record$45_71_31_30_O$63_6f_6d_70_61_72_65_31_O(new String[]{"compare1", "Eq10"}, __field1, __field0); } }).get(); }; }
public static final Object commutativeRingConst = __init$commutativeRingConst();
    private static Object __init$commutativeRingConst() { return (java.util.function.Function<Object, Object>) (dictCommutativeRing_0$r0) -> { return dictCommutativeRing_0$r0; }; }
public static final Object boundedConst = __init$boundedConst();
    private static Object __init$boundedConst() { return (java.util.function.Function<Object, Object>) (dictBounded_0$r0) -> { return dictBounded_0$r0; }; }
public static final Object booleanAlgebraConst = __init$booleanAlgebraConst();
    private static Object __init$booleanAlgebraConst() { return (java.util.function.Function<Object, Object>) (dictBooleanAlgebra_0$r0) -> { return dictBooleanAlgebra_0$r0; }; }
public static final Object applyConst = __init$applyConst();
    private static Object __init$applyConst() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (java.util.function.Function<Object, Object>) (v1_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictSemigroup_0$r0).get("append"))).apply(v_1$r1))).apply(v1_2$r2); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_1$r3) -> { return __M$Data_Const.functorConst; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); }; }
public static final Object applicativeConst = __init$applicativeConst();
    private static Object __init$applicativeConst() { return (java.util.function.Function<Object, Object>) (dictMonoid_0$r0) -> { Object applyConst1_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Const.applyConst)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonoid_0$r0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r2) -> { return ((java.util.Map<String, Object>) dictMonoid_0$r0).get("mempty"); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2$r3) -> { return applyConst1_1$r1; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); }; }
}
