public class __M$Data_Semigroup_Last {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Semigroup.Last"); }
    };


public static final Object Last = __init$Last();
    private static Object __init$Last() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showLast = __init$showLast();
    private static Object __init$showLast() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (((String) ((((String) ("(Last ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(v_1$r1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupLast = __init$semigroupLast();
    private static Object __init$semigroupLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return x_1$r1; }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object ordLast = __init$ordLast();
    private static Object __init$ordLast() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return dictOrd_0$r0; }; }
public static final Object functorLast = __init$functorLast();
    private static Object __init$functorLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (m_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(m_1$r1); }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object eqLast = __init$eqLast();
    private static Object __init$eqLast() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return dictEq_0$r0; }; }
public static final Object eq1Last = __init$eq1Last();
    private static Object __init$eq1Last() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0$r0); }; return new __Record$65_71_31_O(new String[]{"eq1"}, __field0); } }).get(); }
public static final Object ord1Last = __init$ord1Last();
    private static Object __init$ord1Last() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Semigroup_Last.eq1Last; }; return new __Record$45_71_31_30_O$63_6f_6d_70_61_72_65_31_O(new String[]{"compare1", "Eq10"}, __field1, __field0); } }).get(); }
public static final Object boundedLast = __init$boundedLast();
    private static Object __init$boundedLast() { return (java.util.function.Function<Object, Object>) (dictBounded_0$r0) -> { return dictBounded_0$r0; }; }
public static final Object applyLast = __init$applyLast();
    private static Object __init$applyLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ((java.util.function.Function<Object, Object>) (v_0$r0)).apply(v1_1$r1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Semigroup_Last.functorLast; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object bindLast = __init$bindLast();
    private static Object __init$bindLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(v_0$r0); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Semigroup_Last.applyLast; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object applicativeLast = __init$applicativeLast();
    private static Object __init$applicativeLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Semigroup_Last.Last; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Semigroup_Last.applyLast; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object monadLast = __init$monadLast();
    private static Object __init$monadLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Semigroup_Last.applicativeLast; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Semigroup_Last.bindLast; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$42_69_6e_64_31_O(new String[]{"Applicative0", "Bind1"}, __field0, __field1); } }).get(); }
}
