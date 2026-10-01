public class __M$Data_Maybe_Last {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Maybe.Last"); }
    };


public static final Object Last = __init$Last();
    private static Object __init$Last() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object showLast = __init$showLast();
    private static Object __init$showLast() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { Object showMaybe_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.showMaybe)).apply(dictShow_0$r0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r2) -> { return (((String) ((((String) ("(Last ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showMaybe_1$r1).get("show"))).apply(v_2$r2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupLast = __init$semigroupLast();
    private static Object __init$semigroupLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ( ((Boolean) ((((Object) (v1_1$r1)) instanceof __M$Data_Maybe.Just))) ? v1_1$r1 : ( ((Boolean) ((((Object) (v1_1$r1)) instanceof __M$Data_Maybe.Nothing))) ? v_0$r0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object ordLast = __init$ordLast();
    private static Object __init$ordLast() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.ordMaybe)).apply(dictOrd_0$r0); }; }
public static final Object ord1Last = __init$ord1Last();
    private static Object __init$ord1Last() { return __M$Data_Maybe.ord1Maybe; }
public static final Object newtypeLast = __init$newtypeLast();
    private static Object __init$newtypeLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidLast = __init$monoidLast();
    private static Object __init$monoidLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe_Last.semigroupLast; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }
public static final Object monadLast = __init$monadLast();
    private static Object __init$monadLast() { return __M$Data_Maybe.monadMaybe; }
public static final Object invariantLast = __init$invariantLast();
    private static Object __init$invariantLast() { return __M$Data_Maybe.invariantMaybe; }
public static final Object functorLast = __init$functorLast();
    private static Object __init$functorLast() { return __M$Data_Maybe.functorMaybe; }
public static final Object extendLast = __init$extendLast();
    private static Object __init$extendLast() { return __M$Data_Maybe.extendMaybe; }
public static final Object eqLast = __init$eqLast();
    private static Object __init$eqLast() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.eqMaybe)).apply(dictEq_0$r0); }; }
public static final Object eq1Last = __init$eq1Last();
    private static Object __init$eq1Last() { return __M$Data_Maybe.eq1Maybe; }
public static final Object boundedLast = __init$boundedLast();
    private static Object __init$boundedLast() { return (java.util.function.Function<Object, Object>) (dictBounded_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.boundedMaybe)).apply(dictBounded_0$r0); }; }
public static final Object bindLast = __init$bindLast();
    private static Object __init$bindLast() { return __M$Data_Maybe.bindMaybe; }
public static final Object applyLast = __init$applyLast();
    private static Object __init$applyLast() { return __M$Data_Maybe.applyMaybe; }
public static final Object applicativeLast = __init$applicativeLast();
    private static Object __init$applicativeLast() { return __M$Data_Maybe.applicativeMaybe; }
public static final Object altLast = __init$altLast();
    private static Object __init$altLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ( ((Boolean) ((((Object) (v1_1$r1)) instanceof __M$Data_Maybe.Just))) ? v1_1$r1 : ( ((Boolean) ((((Object) (v1_1$r1)) instanceof __M$Data_Maybe.Nothing))) ? v_0$r0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Data_Maybe.functorMaybe; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object plusLast = __init$plusLast();
    private static Object __init$plusLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe_Last.altLast; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get(); }
public static final Object alternativeLast = __init$alternativeLast();
    private static Object __init$alternativeLast() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Data_Maybe.applicativeMaybe; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Maybe_Last.plusLast; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get(); }
}
