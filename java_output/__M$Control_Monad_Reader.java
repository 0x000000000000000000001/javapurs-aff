public class __M$Control_Monad_Reader {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.Reader"); }
    };


public static final Object withReader = __init$withReader();
    private static Object __init$withReader() { return __M$Control_Monad_Reader_Trans.withReaderT; }
public static final Object runReader = __init$runReader();
    private static Object __init$runReader() { return (java.util.function.Function<Object, Object>) (v_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))).apply(v_0$r0); }; }
public static final Object mapReader = __init$mapReader();
    private static Object __init$mapReader() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_Reader_Trans.mapReaderT)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Identity.Identity))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(f_0$r0))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))); }; }
}
