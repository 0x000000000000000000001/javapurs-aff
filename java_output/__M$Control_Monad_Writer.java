public class __M$Control_Monad_Writer {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.Writer"); }
    };


public static final Object writer = __init$writer();
    private static Object __init$writer() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Control_Monad_Writer_Trans.WriterT))).apply(((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Data_Identity.applicativeIdentity)); }
public static final Object runWriter = __init$runWriter();
    private static Object __init$runWriter() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))).apply(__M$Control_Monad_Writer_Trans.runWriterT); }
public static final Object mapWriter = __init$mapWriter();
    private static Object __init$mapWriter() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Identity.Identity))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(f_0_i0))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */))); return (java.util.function.Function<Object, Object>) (v_2_i2) -> { return ((java.util.function.Function<Object, Object>) (__local_var_1_i1)).apply(v_2_i2); }; }; }
public static final Object execWriter = __init$execWriter();
    private static Object __init$execWriter() { return (java.util.function.Function<Object, Object>) (m_0_i0) -> { return ((__M$Data_Tuple.Tuple) (Object)(((java.util.function.Function<Object, Object>) (__M$Control_Monad_Writer.runWriter)).apply(m_0_i0))).value1; }; }
}
