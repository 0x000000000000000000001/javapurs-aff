public class __M$Data_Functor {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Functor"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Functor.java
    public static Object arrayMap = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (arr) -> {
            Object[] source = (Object[]) arr;
            Object[] result = new Object[source.length];
            for (int i = 0; i < source.length; i++) {
                result[i] = ((java.util.function.Function<Object, Object>) f).apply(source[i]);
            }
            return result;
        };


public static final Object map = (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("map"); };
public static final Object mapFlipped = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> { return (java.util.function.Function<Object, Object>) (fa_1_i1) -> { return (java.util.function.Function<Object, Object>) (f_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0_i0).get("map"))).apply(f_2_i2))).apply(fa_1_i1); }; }; };
public static final Object $void = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_1_i1) -> { return __M$Data_Unit.unit; }); };
public static final Object voidLeft = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return (java.util.function.Function<Object, Object>) (x_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_3_i3) -> { return x_2_i2; }))).apply(f_1_i1); }; }; };
public static final Object voidRight = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> { return (java.util.function.Function<Object, Object>) (x_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_2_i2) -> { return x_1_i1; }); }; };
public static final Object functorProxy = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return __M$Type_Proxy.__singleton$Proxy.value; }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object functorFn = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn); return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object functorArray = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Functor.arrayMap; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get();
public static final Object flap = (java.util.function.Function<Object, Object>) (dictFunctor_0_i0) -> { return (java.util.function.Function<Object, Object>) (ff_1_i1) -> { return (java.util.function.Function<Object, Object>) (x_2_i2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0_i0).get("map"))).apply((java.util.function.Function<Object, Object>) (f_3_i3) -> { return ((java.util.function.Function<Object, Object>) (f_3_i3)).apply(x_2_i2); }))).apply(ff_1_i1); }; }; };
}
