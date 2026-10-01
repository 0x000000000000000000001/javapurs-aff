public class __M$Control_Comonad_Store {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Comonad.Store"); }
    };


public static final Object store = __init$store();
    private static Object __init$store() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return new __M$Data_Tuple.Tuple(f_0$r0, x_1$r1); }; }; }
public static final Object runStore = __init$runStore();
    private static Object __init$runStore() { return (java.util.function.Function<Object, Object>) (v_0$r0) -> { Object __local_var_1$r1 = new __M$Data_Tuple.Tuple(((__M$Data_Tuple.Tuple) (Object)(v_0$r0)).value1, ((__M$Data_Tuple.Tuple) (Object)(v_0$r0)).value0); Object __local_var_2$r2 = new __M$Data_Tuple.Tuple(((__M$Data_Tuple.Tuple) (Object)(__local_var_1$r1)).value0, ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */))).apply(((__M$Data_Tuple.Tuple) (Object)(__local_var_1$r1)).value1)); return new __M$Data_Tuple.Tuple(((__M$Data_Tuple.Tuple) (Object)(__local_var_2$r2)).value1, ((__M$Data_Tuple.Tuple) (Object)(__local_var_2$r2)).value0); }; }
}
