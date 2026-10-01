public class __M$Data_Semigroup {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Semigroup"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Semigroup.java
    public static Object concatString = (java.util.function.Function<Object, Object>) (s1) ->
        (java.util.function.Function<Object, Object>) (s2) -> ((String) s1) + ((String) s2);

    public static Object concatArray = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Function<Object, Object>) (ys) -> {
            Object[] left = (Object[]) xs;
            Object[] right = (Object[]) ys;
            if (left.length == 0) return ys;
            if (right.length == 0) return xs;
            Object[] combined = new Object[left.length + right.length];
            System.arraycopy(left, 0, combined, 0, left.length);
            System.arraycopy(right, 0, combined, left.length, right.length);
            return combined;
        };


public static final Object semigroupVoid = __init$semigroupVoid();
    private static Object __init$semigroupVoid() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return __M$Data_Void.absurd; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object semigroupUnit = __init$semigroupUnit();
    private static Object __init$semigroupUnit() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return __M$Data_Unit.unit; }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object semigroupString = __init$semigroupString();
    private static Object __init$semigroupString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> a.toString() + b.toString(); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object semigroupRecordNil = __init$semigroupRecordNil();
    private static Object __init$semigroupRecordNil() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return (java.util.function.Function<Object, Object>) (v2_2$r2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get(); }; }; }; return new __Record$61_70_70_65_6e_64_52_65_63_6f_72_64_O(new String[]{"appendRecord"}, __field0); } }).get(); }
public static final Object semigroupProxy = __init$semigroupProxy();
    private static Object __init$semigroupProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return __M$Type_Proxy.__singleton$Proxy.value; }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object semigroupArray = __init$semigroupArray();
    private static Object __init$semigroupArray() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Semigroup.concatArray; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object appendRecord = __init$appendRecord();
    private static Object __init$appendRecord() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("appendRecord"); }; }
public static final Object semigroupRecord = __init$semigroupRecord();
    private static Object __init$semigroupRecord() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictSemigroupRecord_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictSemigroupRecord_1$r1).get("appendRecord"))).apply(__M$Type_Proxy.__singleton$Proxy.value); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }; }; }
public static final Object append = __init$append();
    private static Object __init$append() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("append"); }; }
public static final Object semigroupFn = __init$semigroupFn();
    private static Object __init$semigroupFn() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (f_1$r1) -> { return (java.util.function.Function<Object, Object>) (g_2$r2) -> { return (java.util.function.Function<Object, Object>) (x_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictSemigroup_0$r0).get("append"))).apply(((java.util.function.Function<Object, Object>) (f_1$r1)).apply(x_3$r3)))).apply(((java.util.function.Function<Object, Object>) (g_2$r2)).apply(x_3$r3)); }; }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }; }
public static final Object semigroupRecordCons = __init$semigroupRecordCons();
    private static Object __init$semigroupRecordCons() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictSemigroupRecord_2$r2) -> { return (java.util.function.Function<Object, Object>) (dictSemigroup_3$r3) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_4$r4) -> { return (java.util.function.Function<Object, Object>) (ra_5$r5) -> { return (java.util.function.Function<Object, Object>) (rb_6$r6) -> { Object key_7$r7 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0$r0).get("reflectSymbol"))).apply(__M$Type_Proxy.__singleton$Proxy.value); Object get_8$r8 = ((java.util.function.Function<Object, Object>) (__M$Record_Unsafe.unsafeGet)).apply(key_7$r7); return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe.unsafeSet)).apply(key_7$r7))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictSemigroup_3$r3).get("append"))).apply(((java.util.function.Function<Object, Object>) (get_8$r8)).apply(ra_5$r5)))).apply(((java.util.function.Function<Object, Object>) (get_8$r8)).apply(rb_6$r6))))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictSemigroupRecord_2$r2).get("appendRecord"))).apply(__M$Type_Proxy.__singleton$Proxy.value))).apply(ra_5$r5))).apply(rb_6$r6)); }; }; }; return new __Record$61_70_70_65_6e_64_52_65_63_6f_72_64_O(new String[]{"appendRecord"}, __field0); } }).get(); }; }; }; }; }
}
