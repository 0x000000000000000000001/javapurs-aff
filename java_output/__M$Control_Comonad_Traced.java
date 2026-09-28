public class __M$Control_Comonad_Traced {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Comonad.Traced"); }
    };


public static final Object traced = __init$traced();
    private static Object __init$traced() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.composeFlipped)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Identity.Identity))).apply(__M$Control_Comonad_Traced_Trans.TracedT); }
public static final Object runTraced = __init$runTraced();
    private static Object __init$runTraced() { return (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Safe_Coerce.coerce)).apply(null /* TODO: PrimUndefined */))).apply(v_0_i0); }; }
}
