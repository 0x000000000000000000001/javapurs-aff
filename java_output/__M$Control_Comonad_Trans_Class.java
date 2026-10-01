public class __M$Control_Comonad_Trans_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Comonad.Trans.Class"); }
    };


public static final Object lower = __init$lower();
    private static Object __init$lower() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("lower"); }; }
public static final Object comonadTransIdentityT = __init$comonadTransIdentityT();
    private static Object __init$comonadTransIdentityT() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictComonad_0$r0) -> { return __M$Control_Monad_Identity_Trans.runIdentityT; }; return new __Record$6c_6f_77_65_72_O(new String[]{"lower"}, __field0); } }).get(); }
}
