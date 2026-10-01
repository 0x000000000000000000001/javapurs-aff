public class __M$Data_Predicate {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Predicate"); }
    };


public static final Object Predicate = __init$Predicate();
    private static Object __init$Predicate() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object newtypePredicate = __init$newtypePredicate();
    private static Object __init$newtypePredicate() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object heytingAlgebraPredicate = __init$heytingAlgebraPredicate();
    private static Object __init$heytingAlgebraPredicate() { return ((java.util.function.Function<Object, Object>) (__M$Data_HeytingAlgebra.heytingAlgebraFunction)).apply(__M$Data_HeytingAlgebra.heytingAlgebraBoolean); }
public static final Object contravariantPredicate = __init$contravariantPredicate();
    private static Object __init$contravariantPredicate() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(v_1$r1))).apply(f_0$r0); }; }; return new __Record$63_6d_61_70_O(new String[]{"cmap"}, __field0); } }).get(); }
public static final Object booleanAlgebraPredicate = __init$booleanAlgebraPredicate();
    private static Object __init$booleanAlgebraPredicate() { return ((java.util.function.Function<Object, Object>) (__M$Data_BooleanAlgebra.booleanAlgebraFn)).apply(__M$Data_BooleanAlgebra.booleanAlgebraBoolean); }
}
