public class __M$Control_Monad_State {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.State"); }
    };


public static final Object withState = __M$Control_Monad_State_Trans.withStateT;
public static final Object runState = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))).apply(v_0_i0); };
public static final Object mapState = (java.util.function.Function<Object, Object>) (f_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_State_Trans.mapStateT)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Identity.Identity))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(f_0_i0))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Newtype.unwrap)).apply(null /* TODO: PrimUndefined */)))); };
public static final Object execState = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((__M$Data_Tuple.Tuple) (Object)(((java.util.function.Function<Object, Object>) (v_0_i0)).apply(s_1_i1))).value1; }; };
public static final Object evalState = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((__M$Data_Tuple.Tuple) (Object)(((java.util.function.Function<Object, Object>) (v_0_i0)).apply(s_1_i1))).value0; }; };
}
