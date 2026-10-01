public class __M$Data_Unfoldable {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Unfoldable"); }
    };
    // FFI provided by ../javapurs-unfoldable/src/Data/Unfoldable.java
    // Mirrors the JavaScript unfoldrArrayImpl: collect f's results until the
    // Maybe is Nothing. Arrays are Object[] in this backend.
    public static Object unfoldrArrayImpl = (java.util.function.Function<Object, Object>) (isNothing) ->
        (java.util.function.Function<Object, Object>) (fromJust) ->
        (java.util.function.Function<Object, Object>) (fst) ->
        (java.util.function.Function<Object, Object>) (snd) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (b) -> {
            java.util.List<Object> result = new java.util.ArrayList<>();
            Object value = b;
            while (true) {
                Object maybe = ((java.util.function.Function<Object, Object>) f).apply(value);
                if ((Boolean) ((java.util.function.Function<Object, Object>) isNothing).apply(maybe)) {
                    return result.toArray(new Object[0]);
                }
                Object tuple = ((java.util.function.Function<Object, Object>) fromJust).apply(maybe);
                result.add(((java.util.function.Function<Object, Object>) fst).apply(tuple));
                value = ((java.util.function.Function<Object, Object>) snd).apply(tuple);
            }
        };


public static final Object unfoldr = __init$unfoldr();
    private static Object __init$unfoldr() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("unfoldr"); }; }
public static final Object unfoldableMaybe = __init$unfoldableMaybe();
    private static Object __init$unfoldableMaybe() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (b_1$r1) -> { Object __local_var_2$r2 = ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(b_1$r1); return ( ((Boolean) ((((Object) (__local_var_2$r2)) instanceof __M$Data_Maybe.Just))) ? new __M$Data_Maybe.Just(((java.util.function.Function<Object, Object>) (__M$Data_Tuple.fst)).apply(((__M$Data_Maybe.Just) (Object)(__local_var_2$r2)).value0)) : __M$Data_Maybe.__singleton$Nothing.value); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r3) -> { return __M$Data_Unfoldable1.unfoldable1Maybe; }; return new __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(new String[]{"unfoldr", "Unfoldable10"}, __field1, __field0); } }).get(); }
public static final Object unfoldableArray = __init$unfoldableArray();
    private static Object __init$unfoldableArray() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Unfoldable.unfoldrArrayImpl)).apply(__M$Data_Maybe.isNothing))).apply((java.util.function.Function<Object, Object>) (v_0$r0) -> { return ( ((Boolean) ((((Object) (v_0$r0)) instanceof __M$Data_Maybe.Just))) ? ((__M$Data_Maybe.Just) (Object)(v_0$r0)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }))).apply(__M$Data_Tuple.fst))).apply(__M$Data_Tuple.snd); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Data_Unfoldable1.unfoldable1Array; }; return new __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(new String[]{"unfoldr", "Unfoldable10"}, __field1, __field0); } }).get(); }
public static final Object replicate = __init$replicate();
    private static Object __init$replicate() { return (java.util.function.Function<Object, Object>) (dictUnfoldable_0$r0) -> { return (java.util.function.Function<Object, Object>) (n_1$r1) -> { return (java.util.function.Function<Object, Object>) (v_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0$r0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (i_3$r3) -> { return ( ((Boolean) ((((int) (i_3$r3)) <= ((int) (0))))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(v_2$r2, (((int) (i_3$r3)) - ((int) (1)))))); }))).apply(n_1$r1); }; }; }; }
public static final Object replicateA = __init$replicateA();
    private static Object __init$replicateA() { return (java.util.function.Function<Object, Object>) (dictApplicative_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictUnfoldable_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictTraversable_2$r2) -> { return (java.util.function.Function<Object, Object>) (n_3$r3) -> { return (java.util.function.Function<Object, Object>) (m_4$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictTraversable_2$r2).get("sequence"))).apply(dictApplicative_0$r0))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_1$r1).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (i_5$r5) -> { return ( ((Boolean) ((((int) (i_5$r5)) <= ((int) (0))))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(m_4$r4, (((int) (i_5$r5)) - ((int) (1)))))); }))).apply(n_3$r3)); }; }; }; }; }; }
public static final Object none = __init$none();
    private static Object __init$none() { return (java.util.function.Function<Object, Object>) (dictUnfoldable_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0$r0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (v_1$r1) -> { return __M$Data_Maybe.__singleton$Nothing.value; }))).apply(__M$Data_Unit.unit); }; }
public static final Object fromMaybe = __init$fromMaybe();
    private static Object __init$fromMaybe() { return (java.util.function.Function<Object, Object>) (dictUnfoldable_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0$r0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (b_1$r1) -> { return ( ((Boolean) ((((Object) (b_1$r1)) instanceof __M$Data_Maybe.Just))) ? new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(((__M$Data_Maybe.Just) (Object)(b_1$r1)).value0, __M$Data_Maybe.__singleton$Nothing.value)) : __M$Data_Maybe.__singleton$Nothing.value); }); }; }
}
