public class __M$Data_Reflectable {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Reflectable"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Reflectable.java
    public static Object unsafeCoerce = (java.util.function.Function<Object, Object>) (arg) -> arg;


public static final Object reifiableString = __init$reifiableString();
    private static Object __init$reifiableString() { return (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get(); }
public static final Object reifiableOrdering = __init$reifiableOrdering();
    private static Object __init$reifiableOrdering() { return (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get(); }
public static final Object reifiableInt = __init$reifiableInt();
    private static Object __init$reifiableInt() { return (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get(); }
public static final Object reifiableBoolean = __init$reifiableBoolean();
    private static Object __init$reifiableBoolean() { return (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get(); }
public static final Object reifyType = __init$reifyType();
    private static Object __init$reifyType() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (s_1$r1) -> { return (java.util.function.Function<Object, Object>) (f_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Reflectable.unsafeCoerce)).apply((java.util.function.Function<Object, Object>) (dictReflectable_3$r3) -> { return ((java.util.function.Function<Object, Object>) (f_2$r2)).apply(dictReflectable_3$r3); }))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_3$r4) -> { return s_1$r1; }; return new __Record$72_65_66_6c_65_63_74_54_79_70_65_O(new String[]{"reflectType"}, __field0); } }).get()))).apply(__M$Type_Proxy.__singleton$Proxy.value); }; }; }; }
public static final Object reflectType = __init$reflectType();
    private static Object __init$reflectType() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("reflectType"); }; }
}
