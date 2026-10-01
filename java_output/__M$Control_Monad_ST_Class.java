public class __M$Control_Monad_ST_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.ST.Class"); }
    };


public static final Object monadSTST = __init$monadSTST();
    private static Object __init$monadSTST() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Control_Monad_ST_Internal.monadST; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_53_54_O(new String[]{"liftST", "Monad0"}, __field1, __field0); } }).get(); }
public static final Object monadSTEffect = __init$monadSTEffect();
    private static Object __init$monadSTEffect() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Control_Monad_ST_Global.toEffect; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Effect.monadEffect; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_53_54_O(new String[]{"liftST", "Monad0"}, __field1, __field0); } }).get(); }
public static final Object liftST = __init$liftST();
    private static Object __init$liftST() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("liftST"); }; }
}
