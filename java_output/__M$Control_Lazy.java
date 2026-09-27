public class __M$Control_Lazy {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Lazy"); }
    };


public static final Object lazyUnit = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return __M$Data_Unit.unit; }; return new __Record$64_65_66_65_72_O(new String[]{"defer"}, __field0); } }).get();
public static final Object lazyFn = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (x_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0_i0)).apply(__M$Data_Unit.unit))).apply(x_1_i1); }; }; return new __Record$64_65_66_65_72_O(new String[]{"defer"}, __field0); } }).get();
public static final Object defer = (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("defer"); };
public static final Object fix = (java.util.function.Function<Object, Object>) (dictLazy_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { class LetRecScope_go__go_2_i2 { Object go__go_2_i2; LetRecScope_go__go_2_i2() { go__go_2_i2 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictLazy_0_i0).get("defer"))).apply((java.util.function.Function<Object, Object>) (v_3_i3) -> { return ((java.util.function.Function<Object, Object>) (f_1_i1)).apply(go__go_2_i2); }); } } LetRecScope_go__go_2_i2 __letrec_go__go_2_i2 = new LetRecScope_go__go_2_i2(); Object go__go_2_i2 = __letrec_go__go_2_i2.go__go_2_i2; return go__go_2_i2; } }).get(); }; };
}
