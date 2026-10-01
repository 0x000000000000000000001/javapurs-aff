public class __M$Control_Monad_Except {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.Except"); }
    };


public static final Object withExcept = __init$withExcept();
    private static Object __init$withExcept() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_Except_Trans.withExceptT)).apply(__M$Data_Identity.functorIdentity); }
public static final Object runExcept = __init$runExcept();
    private static Object __init$runExcept() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))).apply(__M$Control_Monad_Except_Trans.runExceptT); }
public static final Object mapExcept = __init$mapExcept();
    private static Object __init$mapExcept() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { Object __local_var_1$r1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Identity.Identity))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(f_0$r0))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */))); return (java.util.function.Function<Object, Object>) (v_2$r2) -> { return ((java.util.function.Function<Object, Object>) (__local_var_1$r1)).apply(v_2$r2); }; }; }
}
