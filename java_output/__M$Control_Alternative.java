public class __M$Control_Alternative {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Alternative"); }
    };


public static final Object guard = __init$guard();
    private static Object __init$guard() { return (java.util.function.Function<Object, Object>) (dictAlternative_0$r0) -> { Object Applicative0_1$r1 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictAlternative_0$r0).get("Applicative0"))).apply(null /* TODO: PrimUndefined */); Object empty_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Control_Plus.empty)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictAlternative_0$r0).get("Plus1"))).apply(null /* TODO: PrimUndefined */)); return (java.util.function.Function<Object, Object>) (v_3$r3) -> { return ( ((Boolean) (v_3$r3)) ? ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) Applicative0_1$r1).get("pure"))).apply(__M$Data_Unit.unit) : empty_2$r2); }; }; }
public static final Object alternativeArray = __init$alternativeArray();
    private static Object __init$alternativeArray() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Control_Applicative.applicativeArray; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r1) -> { return __M$Control_Plus.plusArray; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get(); }
}
