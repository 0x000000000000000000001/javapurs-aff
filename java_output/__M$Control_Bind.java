public class __M$Control_Bind {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Bind"); }
    };
    // FFI provided by ../javapurs-prelude/src/Control/Bind.java
    public static Object arrayBind = (java.util.function.Function<Object, Object>) (arrObj) -> (java.util.function.Function<Object, Object>) (f) -> {
        Object[] arr = (Object[]) arrObj;
        java.util.List<Object> result = new java.util.ArrayList<>();
        for (Object item : arr) {
            Object[] mapped = (Object[]) ((java.util.function.Function<Object, Object>) f).apply(item);
            for (Object mappedItem : mapped) {
                result.add(mappedItem);
            }
        }
        return result.toArray(new Object[0]);
    };


public static final Object discard = __init$discard();
    private static Object __init$discard() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("discard"); }; }
public static final Object bindProxy = __init$bindProxy();
    private static Object __init$bindProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return __M$Type_Proxy.__singleton$Proxy.value; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Control_Apply.applyProxy; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object bindFn = __init$bindFn();
    private static Object __init$bindFn() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (m_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_1$r1)).apply(((java.util.function.Function<Object, Object>) (m_0$r0)).apply(x_2$r2)))).apply(x_2$r2); }; }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r3) -> { return __M$Control_Apply.applyFn; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object bindArray = __init$bindArray();
    private static Object __init$bindArray() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Control_Bind.arrayBind; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Control_Apply.applyArray; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object bind = __init$bind();
    private static Object __init$bind() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("bind"); }; }
public static final Object bindFlipped = __init$bindFlipped();
    private static Object __init$bindFlipped() { return (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { Object __local_var_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(dictBind_0$r0); return (java.util.function.Function<Object, Object>) (b_2$r2) -> { return (java.util.function.Function<Object, Object>) (a_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__local_var_1$r1)).apply(a_3$r3))).apply(b_2$r2); }; }; }; }
public static final Object composeKleisliFlipped = __init$composeKleisliFlipped();
    private static Object __init$composeKleisliFlipped() { return (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (g_2$r2) -> { return (java.util.function.Function<Object, Object>) (a_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(dictBind_0$r0))).apply(((java.util.function.Function<Object, Object>) (g_2$r2)).apply(a_3$r3)))).apply(f_1$r1); }; }; }; }; }
public static final Object composeKleisli = __init$composeKleisli();
    private static Object __init$composeKleisli() { return (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (g_2$r2) -> { return (java.util.function.Function<Object, Object>) (a_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictBind_0$r0).get("bind"))).apply(((java.util.function.Function<Object, Object>) (f_1$r1)).apply(a_3$r3)))).apply(g_2$r2); }; }; }; }; }
public static final Object discardProxy = __init$discardProxy();
    private static Object __init$discardProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(dictBind_0$r0); }; return new __Record$64_69_73_63_61_72_64_O(new String[]{"discard"}, __field0); } }).get(); }
public static final Object discardUnit = __init$discardUnit();
    private static Object __init$discardUnit() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(dictBind_0$r0); }; return new __Record$64_69_73_63_61_72_64_O(new String[]{"discard"}, __field0); } }).get(); }
public static final Object ifM = __init$ifM();
    private static Object __init$ifM() { return (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return (java.util.function.Function<Object, Object>) (cond_1$r1) -> { return (java.util.function.Function<Object, Object>) (t_2$r2) -> { return (java.util.function.Function<Object, Object>) (f_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictBind_0$r0).get("bind"))).apply(cond_1$r1))).apply((java.util.function.Function<Object, Object>) (cond_prime__4$r4) -> { return ( ((Boolean) (cond_prime__4$r4)) ? t_2$r2 : f_3$r3); }); }; }; }; }; }
public static final Object join = __init$join();
    private static Object __init$join() { return (java.util.function.Function<Object, Object>) (dictBind_0$r0) -> { return (java.util.function.Function<Object, Object>) (m_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictBind_0$r0).get("bind"))).apply(m_1$r1))).apply((java.util.function.Function<Object, Object>) (x_2$r2) -> { return x_2$r2; }); }; }; }
}
