public class __M$Control_Lazy {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Lazy"); }
    };


public static final Object lazyUnit = __init$lazyUnit();
    private static Object __init$lazyUnit() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return __M$Data_Unit.unit; }; return new __Record$64_65_66_65_72_O(new String[]{"defer"}, __field0); } }).get(); }
public static final Object lazyFn = __init$lazyFn();
    private static Object __init$lazyFn() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0$r0)).apply(__M$Data_Unit.unit))).apply(x_1$r1); }; }; return new __Record$64_65_66_65_72_O(new String[]{"defer"}, __field0); } }).get(); }
public static final Object defer = __init$defer();
    private static Object __init$defer() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("defer"); }; }
public static final Object fix = __init$fix();
    private static Object __init$fix() { return (java.util.function.Function<Object, Object>) (dictLazy_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { class LetRecScope_go__go_2$r2 { Object go__go_2$r2; LetRecScope_go__go_2$r2() { go__go_2$r2 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictLazy_0$r0).get("defer"))).apply((java.util.function.Function<Object, Object>) (v_3$r3) -> { return ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(go__go_2$r2); }); } } LetRecScope_go__go_2$r2 __letrec_go__go_2$r2 = new LetRecScope_go__go_2$r2(); Object go__go_2$r2 = __letrec_go__go_2$r2.go__go_2$r2; return go__go_2$r2; } }).get(); }; }; }
}
