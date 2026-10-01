public class __M$Data_Profunctor_Join {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Profunctor.Join"); }
    };


public static final Object Join = __init$Join();
    private static Object __init$Join() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showJoin = __init$showJoin();
    private static Object __init$showJoin() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (((String) ((((String) ("(Join ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(v_1$r1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupJoin = __init$semigroupJoin();
    private static Object __init$semigroupJoin() { return (java.util.function.Function<Object, Object>) (dictSemigroupoid_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (java.util.function.Function<Object, Object>) (v1_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(dictSemigroupoid_0$r0))).apply(v_1$r1))).apply(v1_2$r2); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }; }
public static final Object ordJoin = __init$ordJoin();
    private static Object __init$ordJoin() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return dictOrd_0$r0; }; }
public static final Object newtypeJoin = __init$newtypeJoin();
    private static Object __init$newtypeJoin() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidJoin = __init$monoidJoin();
    private static Object __init$monoidJoin() { return (java.util.function.Function<Object, Object>) (dictCategory_0$r0) -> { Object semigroupJoin1_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Profunctor_Join.semigroupJoin)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictCategory_0$r0).get("Semigroupoid0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(dictCategory_0$r0); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2$r2) -> { return semigroupJoin1_1$r1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }; }
public static final Object invariantJoin = __init$invariantJoin();
    private static Object __init$invariantJoin() { return (java.util.function.Function<Object, Object>) (dictProfunctor_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (g_2$r2) -> { return (java.util.function.Function<Object, Object>) (v_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictProfunctor_0$r0).get("dimap"))).apply(g_2$r2))).apply(f_1$r1))).apply(v_3$r3); }; }; }; return new __Record$69_6d_61_70_O(new String[]{"imap"}, __field0); } }).get(); }; }
public static final Object eqJoin = __init$eqJoin();
    private static Object __init$eqJoin() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return dictEq_0$r0; }; }
}
