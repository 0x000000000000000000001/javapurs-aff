public class __M$Data_Maybe_First {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Maybe.First"); }
    };


public static final Object First = __init$First();
    private static Object __init$First() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showFirst = __init$showFirst();
    private static Object __init$showFirst() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { Object showMaybe_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.showMaybe)).apply(dictShow_0$r0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r2) -> { return (((String) ((((String) ("First (")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showMaybe_1$r1).get("show"))).apply(v_2$r2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupFirst = __init$semigroupFirst();
    private static Object __init$semigroupFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ( ((Boolean) ((((Object) (v_0$r0)) instanceof __M$Data_Maybe.Just))) ? v_0$r0 : v1_1$r1); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object ordFirst = __init$ordFirst();
    private static Object __init$ordFirst() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.ordMaybe)).apply(dictOrd_0$r0); }; }
public static final Object ord1First = __init$ord1First();
    private static Object __init$ord1First() { return __M$Data_Maybe.ord1Maybe; }
public static final Object newtypeFirst = __init$newtypeFirst();
    private static Object __init$newtypeFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidFirst = __init$monoidFirst();
    private static Object __init$monoidFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe_First.semigroupFirst; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }
public static final Object monadFirst = __init$monadFirst();
    private static Object __init$monadFirst() { return __M$Data_Maybe.monadMaybe; }
public static final Object invariantFirst = __init$invariantFirst();
    private static Object __init$invariantFirst() { return __M$Data_Maybe.invariantMaybe; }
public static final Object functorFirst = __init$functorFirst();
    private static Object __init$functorFirst() { return __M$Data_Maybe.functorMaybe; }
public static final Object extendFirst = __init$extendFirst();
    private static Object __init$extendFirst() { return __M$Data_Maybe.extendMaybe; }
public static final Object eqFirst = __init$eqFirst();
    private static Object __init$eqFirst() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.eqMaybe)).apply(dictEq_0$r0); }; }
public static final Object eq1First = __init$eq1First();
    private static Object __init$eq1First() { return __M$Data_Maybe.eq1Maybe; }
public static final Object boundedFirst = __init$boundedFirst();
    private static Object __init$boundedFirst() { return (java.util.function.Function<Object, Object>) (dictBounded_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.boundedMaybe)).apply(dictBounded_0$r0); }; }
public static final Object bindFirst = __init$bindFirst();
    private static Object __init$bindFirst() { return __M$Data_Maybe.bindMaybe; }
public static final Object applyFirst = __init$applyFirst();
    private static Object __init$applyFirst() { return __M$Data_Maybe.applyMaybe; }
public static final Object applicativeFirst = __init$applicativeFirst();
    private static Object __init$applicativeFirst() { return __M$Data_Maybe.applicativeMaybe; }
public static final Object altFirst = __init$altFirst();
    private static Object __init$altFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ( ((Boolean) ((((Object) (v_0$r0)) instanceof __M$Data_Maybe.Just))) ? v_0$r0 : v1_1$r1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Maybe.functorMaybe; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object plusFirst = __init$plusFirst();
    private static Object __init$plusFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe_First.altFirst; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get(); }
public static final Object alternativeFirst = __init$alternativeFirst();
    private static Object __init$alternativeFirst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe.applicativeMaybe; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Maybe_First.plusFirst; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get(); }
}
