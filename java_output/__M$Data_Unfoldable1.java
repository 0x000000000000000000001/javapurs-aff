public class __M$Data_Unfoldable1 {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Unfoldable1"); }
    };
    // FFI provided by ../javapurs-unfoldable/src/Data/Unfoldable1.java
    // Mirrors the JavaScript unfoldr1ArrayImpl: the first element always comes
    // from f, and the loop stops once the trailing Maybe is Nothing. Arrays are
    // Object[] in this backend.
    public static Object unfoldr1ArrayImpl = (java.util.function.Function<Object, Object>) (isNothing) ->
        (java.util.function.Function<Object, Object>) (fromJust) ->
        (java.util.function.Function<Object, Object>) (fst) ->
        (java.util.function.Function<Object, Object>) (snd) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (b) -> {
            java.util.List<Object> result = new java.util.ArrayList<>();
            Object value = b;
            while (true) {
                Object tuple = ((java.util.function.Function<Object, Object>) f).apply(value);
                result.add(((java.util.function.Function<Object, Object>) fst).apply(tuple));
                Object maybe = ((java.util.function.Function<Object, Object>) snd).apply(tuple);
                if ((Boolean) ((java.util.function.Function<Object, Object>) isNothing).apply(maybe)) {
                    return result.toArray(new Object[0]);
                }
                value = ((java.util.function.Function<Object, Object>) fromJust).apply(maybe);
            }
        };


public static final Object unfoldr1 = __init$unfoldr1();
    private static Object __init$unfoldr1() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("unfoldr1"); }; }
public static final Object unfoldable1Maybe = __init$unfoldable1Maybe();
    private static Object __init$unfoldable1Maybe() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (b_1$r1) -> { return new __M$Data_Maybe.Just(((__M$Data_Tuple.Tuple) (Object)(((java.util.function.Function<Object, Object>) (f_0$r0)).apply(b_1$r1))).value0); }; }; return new __Record$75_6e_66_6f_6c_64_72_31_O(new String[]{"unfoldr1"}, __field0); } }).get(); }
public static final Object unfoldable1Array = __init$unfoldable1Array();
    private static Object __init$unfoldable1Array() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Unfoldable1.unfoldr1ArrayImpl)).apply(__M$Data_Maybe.isNothing))).apply((java.util.function.Function<Object, Object>) (v_0$r0) -> { return ( ((Boolean) ((((Object) (v_0$r0)) instanceof __M$Data_Maybe.Just))) ? ((__M$Data_Maybe.Just) (Object)(v_0$r0)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }))).apply(__M$Data_Tuple.fst))).apply(__M$Data_Tuple.snd); return new __Record$75_6e_66_6f_6c_64_72_31_O(new String[]{"unfoldr1"}, __field0); } }).get(); }
public static final Object replicate1 = __init$replicate1();
    private static Object __init$replicate1() { return (java.util.function.Function<Object, Object>) (dictUnfoldable1_0$r0) -> { return (java.util.function.Function<Object, Object>) (n_1$r1) -> { return (java.util.function.Function<Object, Object>) (v_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable1_0$r0).get("unfoldr1"))).apply((java.util.function.Function<Object, Object>) (i_3$r3) -> { return ( ((Boolean) ((((int) (i_3$r3)) <= ((int) (0))))) ? new __M$Data_Tuple.Tuple(v_2$r2, __M$Data_Maybe.__singleton$Nothing.value) : new __M$Data_Tuple.Tuple(v_2$r2, new __M$Data_Maybe.Just((((int) (i_3$r3)) - ((int) (1)))))); }))).apply((((int) (n_1$r1)) - ((int) (1)))); }; }; }; }
public static final Object replicate1A = __init$replicate1A();
    private static Object __init$replicate1A() { return (java.util.function.Function<Object, Object>) (dictApply_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictUnfoldable1_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictTraversable1_2$r2) -> { return (java.util.function.Function<Object, Object>) (n_3$r3) -> { return (java.util.function.Function<Object, Object>) (m_4$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictTraversable1_2$r2).get("sequence1"))).apply(dictApply_0$r0))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable1_1$r1).get("unfoldr1"))).apply((java.util.function.Function<Object, Object>) (i_5$r5) -> { return ( ((Boolean) ((((int) (i_5$r5)) <= ((int) (0))))) ? new __M$Data_Tuple.Tuple(m_4$r4, __M$Data_Maybe.__singleton$Nothing.value) : new __M$Data_Tuple.Tuple(m_4$r4, new __M$Data_Maybe.Just((((int) (i_5$r5)) - ((int) (1)))))); }))).apply((((int) (n_3$r3)) - ((int) (1))))); }; }; }; }; }; }
public static final Object singleton = __init$singleton();
    private static Object __init$singleton() { return (java.util.function.Function<Object, Object>) (dictUnfoldable1_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable1_0$r0).get("unfoldr1"))).apply((java.util.function.Function<Object, Object>) (i_2$r2) -> { return ( ((Boolean) ((((int) (i_2$r2)) <= ((int) (0))))) ? new __M$Data_Tuple.Tuple(v_1$r1, __M$Data_Maybe.__singleton$Nothing.value) : new __M$Data_Tuple.Tuple(v_1$r1, new __M$Data_Maybe.Just((((int) (i_2$r2)) - ((int) (1)))))); }))).apply(0); }; }; }
public static final Object range = __init$range();
    private static Object __init$range() { return (java.util.function.Function<Object, Object>) (dictUnfoldable1_0$r0) -> { return (java.util.function.Function<Object, Object>) (start_1$r1) -> { return (java.util.function.Function<Object, Object>) (end_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable1_0$r0).get("unfoldr1"))).apply((new java.util.function.Supplier<Object>() { public Object get() { int __local_var_3$r3 = ((int) (( ((Boolean) ((((int) (end_2$r2)) >= ((int) (start_1$r1))))) ? 1 : -1))); return (java.util.function.Function<Object, Object>) (i_4$r4) -> { int i_prime__5$r5 = ((int) ((((int) (i_4$r4)) + ((int) (__local_var_3$r3))))); return new __M$Data_Tuple.Tuple(i_4$r4, ( ((Boolean) ((((int) (i_4$r4)) == ((int) (end_2$r2))))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just(i_prime__5$r5))); }; } }).get()))).apply(start_1$r1); }; }; }; }
public static final Object iterateN = __init$iterateN();
    private static Object __init$iterateN() { return (java.util.function.Function<Object, Object>) (dictUnfoldable1_0$r0) -> { return (java.util.function.Function<Object, Object>) (n_1$r1) -> { return (java.util.function.Function<Object, Object>) (f_2$r2) -> { return (java.util.function.Function<Object, Object>) (s_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable1_0$r0).get("unfoldr1"))).apply((java.util.function.Function<Object, Object>) (v_4$r4) -> { return new __M$Data_Tuple.Tuple(((__M$Data_Tuple.Tuple) (Object)(v_4$r4)).value0, ( ((Boolean) ((((int) (((__M$Data_Tuple.Tuple) (Object)(v_4$r4)).value1)) > ((int) (0))))) ? new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(((java.util.function.Function<Object, Object>) (f_2$r2)).apply(((__M$Data_Tuple.Tuple) (Object)(v_4$r4)).value0), (((int) (((__M$Data_Tuple.Tuple) (Object)(v_4$r4)).value1)) - ((int) (1))))) : __M$Data_Maybe.__singleton$Nothing.value)); }))).apply(new __M$Data_Tuple.Tuple(s_3$r3, (((int) (n_1$r1)) - ((int) (1))))); }; }; }; }; }
}
