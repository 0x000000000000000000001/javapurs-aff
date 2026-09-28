public class __M$Data_List_Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.List.Partial"); }
    };


public static final Object tail = __init$tail();
    private static Object __init$tail() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_List_Types.Cons))) ? ((__M$Data_List_Types.Cons) (Object)(v_1_i1)).value1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }; }; }
private static Object __lazy_value_last;
private static int __lazy_state_last;
private static Object __lazy_get_last() { if (__lazy_state_last == 2) return __lazy_value_last; if (__lazy_state_last == 1) throw new IllegalStateException("Recursive initialization of last"); __lazy_state_last = 1; __lazy_value_last = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> { Object __tco__dollar___unused_0_i0 = _dollar___unused_0_i0; Object __tco_v_1_i1 = v_1_i1; while(true) { final Object __final__dollar___unused_0_i0 = __tco__dollar___unused_0_i0; final Object __final_v_1_i1 = __tco_v_1_i1; try { if ((Boolean) ((((Object) (__final_v_1_i1)) instanceof __M$Data_List_Types.Cons))) { if ((Boolean) ((((Object) (((__M$Data_List_Types.Cons) (Object)(__final_v_1_i1)).value1)) instanceof __M$Data_List_Types.Nil))) { return ((__M$Data_List_Types.Cons) (Object)(__final_v_1_i1)).value0; } else { { final Object __next__dollar___unused_0_i0 = null /* TODO: PrimUndefined */; final Object __next_v_1_i1 = ((__M$Data_List_Types.Cons) (Object)(__final_v_1_i1)).value1; __tco__dollar___unused_0_i0 = __next__dollar___unused_0_i0; __tco_v_1_i1 = __next_v_1_i1; continue; } } } else { return (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get(); } } catch (TcoLoop __tco_ex) { if (!"last".equals(__tco_ex.loopId)) throw __tco_ex; __tco__dollar___unused_0_i0 = __tco_ex.args[0]; __tco_v_1_i1 = __tco_ex.args[1]; } } }; __lazy_state_last = 2; return __lazy_value_last; }
public static final Object last = __init$last();
    private static Object __init$last() { return __lazy_get_last(); }
private static Object __lazy_value_init;
private static int __lazy_state_init;
private static Object __lazy_get_init() { if (__lazy_state_init == 2) return __lazy_value_init; if (__lazy_state_init == 1) throw new IllegalStateException("Recursive initialization of init"); __lazy_state_init = 1; __lazy_value_init = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> (java.util.function.Function<Object, Object>) (v_1_i1) -> { return __M$Data_List_Partial.__direct$2(_dollar___unused_0_i0, v_1_i1); }; __lazy_state_init = 2; return __lazy_value_init; }
public static final Object init = __init$init();
    private static Object __init$init() { return __lazy_get_init(); }
private static Object __direct$2(Object _dollar___unused_0_i0, Object v_1_i1) { return ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_List_Types.Cons))) ? ( ((Boolean) ((((Object) (((__M$Data_List_Types.Cons) (Object)(v_1_i1)).value1)) instanceof __M$Data_List_Types.Nil))) ? __M$Data_List_Types.__singleton$Nil.value : new __M$Data_List_Types.Cons(((__M$Data_List_Types.Cons) (Object)(v_1_i1)).value0, __M$Data_List_Partial.__direct$2(null /* TODO: PrimUndefined */, ((__M$Data_List_Types.Cons) (Object)(v_1_i1)).value1))) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }
public static final Object head = __init$head();
    private static Object __init$head() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_List_Types.Cons))) ? ((__M$Data_List_Types.Cons) (Object)(v_1_i1)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()); }; }; }
}
