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


public static final Object unfoldr = (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("unfoldr"); };
public static final Object unfoldableMaybe = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (b_1_i1) -> { Object __local_var_2_i2 = ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(b_1_i1); return ( ((Boolean) ((((Object) (__local_var_2_i2)) instanceof __M$Data_Maybe.Just))) ? new __M$Data_Maybe.Just(((java.util.function.Function<Object, Object>) (__M$Data_Tuple.fst)).apply(((__M$Data_Maybe.Just) (Object)(__local_var_2_i2)).value0)) : __M$Data_Maybe.__singleton$Nothing.value); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i3) -> { return __M$Data_Unfoldable1.unfoldable1Maybe; }; return new __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(new String[]{"unfoldr", "Unfoldable10"}, __field1, __field0); } }).get();
public static final Object unfoldableArray = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Unfoldable.unfoldrArrayImpl)).apply(__M$Data_Maybe.isNothing))).apply((java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Maybe.Just))) ? ((__M$Data_Maybe.Just) (Object)(v_0_i0)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }))).apply(__M$Data_Tuple.fst))).apply(__M$Data_Tuple.snd); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Data_Unfoldable1.unfoldable1Array; }; return new __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(new String[]{"unfoldr", "Unfoldable10"}, __field1, __field0); } }).get();
public static final Object replicate = (java.util.function.Function<Object, Object>) (dictUnfoldable_0_i0) -> { return (java.util.function.Function<Object, Object>) (n_1_i1) -> { return (java.util.function.Function<Object, Object>) (v_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0_i0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (i_3_i3) -> { return ( ((Boolean) ((((int) (i_3_i3)) <= ((int) (0))))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(v_2_i2, (((int) (i_3_i3)) - ((int) (1)))))); }))).apply(n_1_i1); }; }; };
public static final Object replicateA = (java.util.function.Function<Object, Object>) (dictApplicative_0_i0) -> { return (java.util.function.Function<Object, Object>) (dictUnfoldable_1_i1) -> { return (java.util.function.Function<Object, Object>) (dictTraversable_2_i2) -> { return (java.util.function.Function<Object, Object>) (n_3_i3) -> { return (java.util.function.Function<Object, Object>) (m_4_i4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictTraversable_2_i2).get("sequence"))).apply(dictApplicative_0_i0))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_1_i1).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (i_5_i5) -> { return ( ((Boolean) ((((int) (i_5_i5)) <= ((int) (0))))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(m_4_i4, (((int) (i_5_i5)) - ((int) (1)))))); }))).apply(n_3_i3)); }; }; }; }; };
public static final Object none = (java.util.function.Function<Object, Object>) (dictUnfoldable_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0_i0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (v_1_i1) -> { return __M$Data_Maybe.__singleton$Nothing.value; }))).apply(__M$Data_Unit.unit); };
public static final Object fromMaybe = (java.util.function.Function<Object, Object>) (dictUnfoldable_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictUnfoldable_0_i0).get("unfoldr"))).apply((java.util.function.Function<Object, Object>) (b_1_i1) -> { return ( ((Boolean) ((((Object) (b_1_i1)) instanceof __M$Data_Maybe.Just))) ? new __M$Data_Maybe.Just(new __M$Data_Tuple.Tuple(((__M$Data_Maybe.Just) (Object)(b_1_i1)).value0, __M$Data_Maybe.__singleton$Nothing.value)) : __M$Data_Maybe.__singleton$Nothing.value); }); };
}
