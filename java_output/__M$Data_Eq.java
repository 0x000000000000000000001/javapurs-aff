public class __M$Data_Eq {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Eq"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Eq.java
    public static Object eqBooleanImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Boolean) a).equals((Boolean) b);
    public static Object eqIntImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Integer) a).equals((Integer) b);
    public static Object eqStringImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((String) a).equals((String) b);
    public static Object eqCharImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((String) a).equals((String) b);
    public static Object eqNumberImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Number) a).doubleValue() == ((Number) b).doubleValue();
    public static Object eqArrayImpl = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (xs) -> (java.util.function.Function<Object, Object>) (ys) -> {
        Object[] arr1 = (Object[]) xs;
        Object[] arr2 = (Object[]) ys;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            Boolean res = (Boolean) ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(arr1[i])).apply(arr2[i]);
            if (!res) return false;
        }
        return true;
    };


public static final Object eqVoid = __init$eqVoid();
    private static Object __init$eqVoid() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return true; }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqUnit = __init$eqUnit();
    private static Object __init$eqUnit() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return true; }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqString = __init$eqString();
    private static Object __init$eqString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Eq.eqStringImpl; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqRowNil = __init$eqRowNil();
    private static Object __init$eqRowNil() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return (java.util.function.Function<Object, Object>) (v2_2$r2) -> { return true; }; }; }; return new __Record$65_71_52_65_63_6f_72_64_O(new String[]{"eqRecord"}, __field0); } }).get(); }
public static final Object eqRecord = __init$eqRecord();
    private static Object __init$eqRecord() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("eqRecord"); }; }
public static final Object eqRec = __init$eqRec();
    private static Object __init$eqRec() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictEqRecord_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEqRecord_1$r1).get("eqRecord"))).apply(__M$Type_Proxy.__singleton$Proxy.value); return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }; }; }
public static final Object eqProxy = __init$eqProxy();
    private static Object __init$eqProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return true; }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqNumber = __init$eqNumber();
    private static Object __init$eqNumber() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Eq.eqNumberImpl; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqInt = __init$eqInt();
    private static Object __init$eqInt() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Eq.eqIntImpl; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqChar = __init$eqChar();
    private static Object __init$eqChar() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Eq.eqCharImpl; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eqBoolean = __init$eqBoolean();
    private static Object __init$eqBoolean() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Eq.eqBooleanImpl; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object eq1 = __init$eq1();
    private static Object __init$eq1() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("eq1"); }; }
public static final Object eq = __init$eq();
    private static Object __init$eq() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("eq"); }; }
public static final Object eqArray = __init$eqArray();
    private static Object __init$eqArray() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eqArrayImpl)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(dictEq_0$r0)); return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }; }
public static final Object eq1Array = __init$eq1Array();
    private static Object __init$eq1Array() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eq)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Eq.eqArray)).apply(dictEq_0$r0)); }; return new __Record$65_71_31_O(new String[]{"eq1"}, __field0); } }).get(); }
public static final Object eqRowCons = __init$eqRowCons();
    private static Object __init$eqRowCons() { return (java.util.function.Function<Object, Object>) (dictEqRecord_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictIsSymbol_2$r2) -> { return (java.util.function.Function<Object, Object>) (dictEq_3$r3) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_4$r4) -> { return (java.util.function.Function<Object, Object>) (ra_5$r5) -> { return (java.util.function.Function<Object, Object>) (rb_6$r6) -> { Object get_7$r7 = ((java.util.function.Function<Object, Object>) (__M$Record_Unsafe.unsafeGet)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_2$r2).get("reflectSymbol"))).apply(__M$Type_Proxy.__singleton$Proxy.value)); return (((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEq_3$r3).get("eq"))).apply(((java.util.function.Function<Object, Object>) (get_7$r7)).apply(ra_5$r5)))).apply(((java.util.function.Function<Object, Object>) (get_7$r7)).apply(rb_6$r6)))) && ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEqRecord_0$r0).get("eqRecord"))).apply(__M$Type_Proxy.__singleton$Proxy.value))).apply(ra_5$r5))).apply(rb_6$r6)))); }; }; }; return new __Record$65_71_52_65_63_6f_72_64_O(new String[]{"eqRecord"}, __field0); } }).get(); }; }; }; }; }
public static final Object notEq = __init$notEq();
    private static Object __init$notEq() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return (java.util.function.Function<Object, Object>) (y_2$r2) -> { return (!(((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEq_0$r0).get("eq"))).apply(x_1$r1))).apply(y_2$r2))))); }; }; }; }
public static final Object notEq1 = __init$notEq1();
    private static Object __init$notEq1() { return (java.util.function.Function<Object, Object>) (dictEq1_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictEq_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return (java.util.function.Function<Object, Object>) (y_3$r3) -> { return (!(((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEq1_0$r0).get("eq1"))).apply(dictEq_1$r1))).apply(x_2$r2))).apply(y_3$r3))))); }; }; }; }; }
}
