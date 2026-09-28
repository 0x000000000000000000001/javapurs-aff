public class __M$Data_Profunctor_Closed {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Profunctor.Closed"); }
    };


public static final Object closedFunction = __init$closedFunction();
    private static Object __init$closedFunction() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Profunctor.profunctorFn; }; return new __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$63_6c_6f_73_65_64_O(new String[]{"closed", "Profunctor0"}, __field1, __field0); } }).get(); }
public static final Object closed = __init$closed();
    private static Object __init$closed() { return (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("closed"); }; }
}
