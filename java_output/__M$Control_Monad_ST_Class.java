public class __M$Control_Monad_ST_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.ST.Class"); }
    };


public static final Object monadSTST = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Control_Monad_ST_Internal.monadST; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_53_54_O(new String[]{"liftST", "Monad0"}, __field1, __field0); } }).get();
public static final Object monadSTEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Control_Monad_ST_Global.toEffect; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect.monadEffect; }; return new __Record$4d_6f_6e_61_64_30_O$6c_69_66_74_53_54_O(new String[]{"liftST", "Monad0"}, __field1, __field0); } }).get();
public static final Object liftST = (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("liftST"); };
}
