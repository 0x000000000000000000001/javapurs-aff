public class __M$Control_Monad_State_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.State.Class"); }
    };


public static final Object state = __init$state();
    private static Object __init$state() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("state"); }; }
public static final Object put = __init$put();
    private static Object __init$put() { return (java.util.function.Function<Object, Object>) (dictMonadState_0$r0) -> { return (java.util.function.Function<Object, Object>) (s_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadState_0$r0).get("state"))).apply((java.util.function.Function<Object, Object>) (v_2$r2) -> { return new __M$Data_Tuple.Tuple(__M$Data_Unit.unit, s_1$r1); }); }; }; }
public static final Object modify_ = __init$modify_();
    private static Object __init$modify_() { return (java.util.function.Function<Object, Object>) (dictMonadState_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadState_0$r0).get("state"))).apply((java.util.function.Function<Object, Object>) (s_2$r2) -> { return new __M$Data_Tuple.Tuple(__M$Data_Unit.unit, ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(s_2$r2)); }); }; }; }
public static final Object modify = __init$modify();
    private static Object __init$modify() { return (java.util.function.Function<Object, Object>) (dictMonadState_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadState_0$r0).get("state"))).apply((java.util.function.Function<Object, Object>) (s_2$r2) -> { Object s_prime__3$r3 = ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(s_2$r2); return new __M$Data_Tuple.Tuple(s_prime__3$r3, s_prime__3$r3); }); }; }; }
public static final Object gets = __init$gets();
    private static Object __init$gets() { return (java.util.function.Function<Object, Object>) (dictMonadState_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadState_0$r0).get("state"))).apply((java.util.function.Function<Object, Object>) (s_2$r2) -> { return new __M$Data_Tuple.Tuple(((java.util.function.Function<Object, Object>) (f_1$r1)).apply(s_2$r2), s_2$r2); }); }; }; }
public static final Object get = __init$get();
    private static Object __init$get() { return (java.util.function.Function<Object, Object>) (dictMonadState_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadState_0$r0).get("state"))).apply((java.util.function.Function<Object, Object>) (s_1$r1) -> { return new __M$Data_Tuple.Tuple(s_1$r1, s_1$r1); }); }; }
}
