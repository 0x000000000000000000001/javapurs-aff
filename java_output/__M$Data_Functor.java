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


public static final Object map = __init$map();
    private static Object __init$map() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("map"); }; }
public static final Object mapFlipped = __init$mapFlipped();
    private static Object __init$mapFlipped() { return (java.util.function.Function<Object, Object>) (dictFunctor_0$r0) -> { return (java.util.function.Function<Object, Object>) (fa_1$r1) -> { return (java.util.function.Function<Object, Object>) (f_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0$r0).get("map"))).apply(f_2$r2))).apply(fa_1$r1); }; }; }; }
public static final Object $void = __init$$void();
    private static Object __init$$void() { return (java.util.function.Function<Object, Object>) (dictFunctor_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0$r0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_1$r1) -> { return __M$Data_Unit.unit; }); }; }
public static final Object voidLeft = __init$voidLeft();
    private static Object __init$voidLeft() { return (java.util.function.Function<Object, Object>) (dictFunctor_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0$r0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_3$r3) -> { return x_2$r2; }))).apply(f_1$r1); }; }; }; }
public static final Object voidRight = __init$voidRight();
    private static Object __init$voidRight() { return (java.util.function.Function<Object, Object>) (dictFunctor_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0$r0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_2$r2) -> { return x_1$r1; }); }; }; }
public static final Object functorProxy = __init$functorProxy();
    private static Object __init$functorProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return __M$Type_Proxy.__singleton$Proxy.value; }; }; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object functorFn = __init$functorFn();
    private static Object __init$functorFn() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.Map<String, Object>) __M$Control_Semigroupoid.semigroupoidFn).get("compose"); return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object functorArray = __init$functorArray();
    private static Object __init$functorArray() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Functor.arrayMap; return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); }
public static final Object flap = __init$flap();
    private static Object __init$flap() { return (java.util.function.Function<Object, Object>) (dictFunctor_0$r0) -> { return (java.util.function.Function<Object, Object>) (ff_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_0$r0).get("map"))).apply((java.util.function.Function<Object, Object>) (f_3$r3) -> { return ((java.util.function.Function<Object, Object>) (f_3$r3)).apply(x_2$r2); }))).apply(ff_1$r1); }; }; }; }
}
