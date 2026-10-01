public class __M$Data_Identity {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Identity"); }
    };


public static final Object Identity = __init$Identity();
    private static Object __init$Identity() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showIdentity = __init$showIdentity();
    private static Object __init$showIdentity() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (((String) ((((String) ("(Identity ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(v_1$r1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semiringIdentity = __init$semiringIdentity();
    private static Object __init$semiringIdentity() { return (java.util.function.Function<Object, Object>) (dictSemiring_0$r0) -> { return dictSemiring_0$r0; }; }
public static final Object semigroupIdentity = __init$semigroupIdentity();
    private static Object __init$semigroupIdentity() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0$r0) -> { return dictSemigroup_0$r0; }; }
public static final Object ringIdentity = __init$ringIdentity();
    private static Object __init$ringIdentity() { return (java.util.function.Function<Object, Object>) (dictRing_0$r0) -> { return dictRing_0$r0; }; }
public static final Object ordIdentity = __init$ordIdentity();
    private static Object __init$ordIdentity() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return dictOrd_0$r0; }; }
public static final Object newtypeIdentity = __init$newtypeIdentity();
    private static Object __init$newtypeIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidIdentity = __init$monoidIdentity();
    private static Object __init$monoidIdentity() { return (java.util.function.Function<Object, Object>) (dictMonoid_0$r0) -> { return dictMonoid_0$r0; }; }
public static final Object lazyIdentity = __init$lazyIdentity();
    private static Object __init$lazyIdentity() { return (java.util.function.Function<Object, Object>) (dictLazy_0$r0) -> { return dictLazy_0$r0; }; }
public static final Object heytingAlgebraIdentity = __init$heytingAlgebraIdentity();
    private static Object __init$heytingAlgebraIdentity() { return (java.util.function.Function<Object, Object>) (dictHeytingAlgebra_0$r0) -> { return dictHeytingAlgebra_0$r0; }; }
public static final Object functorIdentity = __init$functorIdentity();
    private static Object __init$functorIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (m_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(m_1$r1); }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object invariantIdentity = __init$invariantIdentity();
    private static Object __init$invariantIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Functor_Invariant.imapF)).apply(__M$Data_Identity.functorIdentity); return new __Record$69_6d_61_70_O(new String[]{"imap"}, __field0); } }).get(); }
public static final Object extendIdentity = __init$extendIdentity();
    private static Object __init$extendIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (m_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(m_1$r1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Identity.functorIdentity; }; return new __Record$46_75_6e_63_74_6f_72_30_O$65_78_74_65_6e_64_O(new String[]{"extend", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object euclideanRingIdentity = __init$euclideanRingIdentity();
    private static Object __init$euclideanRingIdentity() { return (java.util.function.Function<Object, Object>) (dictEuclideanRing_0$r0) -> { return dictEuclideanRing_0$r0; }; }
public static final Object eqIdentity = __init$eqIdentity();
    private static Object __init$eqIdentity() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return dictEq_0$r0; }; }
public static final Object eq1Identity = __init$eq1Identity();
    private static Object __init$eq1Identity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0$r0); }; return new __Record$65_71_31_O(new String[]{"eq1"}, __field0); } }).get(); }
public static final Object ord1Identity = __init$ord1Identity();
    private static Object __init$ord1Identity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Identity.eq1Identity; }; return new __Record$45_71_31_30_O$63_6f_6d_70_61_72_65_31_O(new String[]{"compare1", "Eq10"}, __field1, __field0); } }).get(); }
public static final Object comonadIdentity = __init$comonadIdentity();
    private static Object __init$comonadIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return v_0$r0; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Identity.extendIdentity; }; return new __Record$45_78_74_65_6e_64_30_O$65_78_74_72_61_63_74_O(new String[]{"extract", "Extend0"}, __field1, __field0); } }).get(); }
public static final Object commutativeRingIdentity = __init$commutativeRingIdentity();
    private static Object __init$commutativeRingIdentity() { return (java.util.function.Function<Object, Object>) (dictCommutativeRing_0$r0) -> { return dictCommutativeRing_0$r0; }; }
public static final Object boundedIdentity = __init$boundedIdentity();
    private static Object __init$boundedIdentity() { return (java.util.function.Function<Object, Object>) (dictBounded_0$r0) -> { return dictBounded_0$r0; }; }
public static final Object booleanAlgebraIdentity = __init$booleanAlgebraIdentity();
    private static Object __init$booleanAlgebraIdentity() { return (java.util.function.Function<Object, Object>) (dictBooleanAlgebra_0$r0) -> { return dictBooleanAlgebra_0$r0; }; }
public static final Object applyIdentity = __init$applyIdentity();
    private static Object __init$applyIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ((java.util.function.Function<Object, Object>) (v_0$r0)).apply(v1_1$r1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Identity.functorIdentity; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object bindIdentity = __init$bindIdentity();
    private static Object __init$bindIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(v_0$r0); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Identity.applyIdentity; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object applicativeIdentity = __init$applicativeIdentity();
    private static Object __init$applicativeIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Identity.Identity; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Identity.applyIdentity; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object monadIdentity = __init$monadIdentity();
    private static Object __init$monadIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Identity.applicativeIdentity; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Identity.bindIdentity; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$42_69_6e_64_31_O(new String[]{"Applicative0", "Bind1"}, __field0, __field1); } }).get(); }
public static final Object altIdentity = __init$altIdentity();
    private static Object __init$altIdentity() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return x_0$r0; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Identity.functorIdentity; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get(); }
}
