public class __M$Control_Monad_Reader_Class {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.Reader.Class"); }
    };


public static final Object monadAskFun = __init$monadAskFun();
    private static Object __init$monadAskFun() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Control_Monad.monadFn; }; return new __Record$4d_6f_6e_61_64_30_O$61_73_6b_O(new String[]{"ask", "Monad0"}, __field1, __field0); } }).get(); }
public static final Object monadReaderFun = __init$monadReaderFun();
    private static Object __init$monadReaderFun() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.composeFlipped)).apply(__M$Control_Semigroupoid.semigroupoidFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Control_Monad_Reader_Class.monadAskFun; }; return new __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O(new String[]{"local", "MonadAsk0"}, __field1, __field0); } }).get(); }
public static final Object local = __init$local();
    private static Object __init$local() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("local"); }; }
public static final Object ask = __init$ask();
    private static Object __init$ask() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("ask"); }; }
public static final Object asks = __init$asks();
    private static Object __init$asks() { return (java.util.function.Function<Object, Object>) (dictMonadAsk_0$r0) -> { Object Functor0_1$r1 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonadAsk_0$r0).get("Monad0"))).apply(null /* TODO: PrimUndefined */)).get("Bind1"))).apply(null /* TODO: PrimUndefined */)).get("Apply0"))).apply(null /* TODO: PrimUndefined */)).get("Functor0"))).apply(null /* TODO: PrimUndefined */); Object ask1_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Control_Monad_Reader_Class.ask)).apply(dictMonadAsk_0$r0); return (java.util.function.Function<Object, Object>) (f_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Functor0_1$r1).get("map"))).apply(f_3$r3))).apply(ask1_2$r2); }; }; }
}
