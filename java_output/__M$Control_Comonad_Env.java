public class __M$Control_Comonad_Env {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Comonad.Env"); }
    };


public static final Object withEnv = __init$withEnv();
    private static Object __init$withEnv() { return __M$Control_Comonad_Env_Trans.withEnvT; }
public static final Object runEnv = __init$runEnv();
    private static Object __init$runEnv() { return (java.util.function.Function<Object, Object>) (v_0$r0) -> { return new __M$Data_Tuple.Tuple(((__M$Data_Tuple.Tuple) (Object)(v_0$r0)).value0, ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */))).apply(((__M$Data_Tuple.Tuple) (Object)(v_0$r0)).value1)); }; }
public static final Object mapEnv = __init$mapEnv();
    private static Object __init$mapEnv() { return ((java.util.function.Function<Object, Object>) (__M$Data_Functor.map)).apply(((java.util.function.Function<Object, Object>) (__M$Control_Comonad_Env_Trans.functorEnvT)).apply(__M$Data_Identity.functorIdentity)); }
public static final Object env = __init$env();
    private static Object __init$env() { return (java.util.function.Function<Object, Object>) (e_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return new __M$Data_Tuple.Tuple(e_0$r0, a_1$r1); }; }; }
}
