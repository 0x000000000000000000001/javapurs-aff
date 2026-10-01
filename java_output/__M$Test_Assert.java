public class __M$Test_Assert {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Test.Assert"); }
    };
    // FFI provided by ../javapurs-assert/src/Test/Assert.java
    public static Object assertImpl = (java.util.function.Function<Object, Object>) (message) ->
        (java.util.function.Function<Object, Object>) (success) ->
        (java.util.function.Supplier<Object>) () -> {
            if (!((Boolean) success)) throw new RuntimeException((String) message);
            return null;
        };

    public static Object checkThrows = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                Object result = ((java.util.function.Function<Object, Object>) fn).apply(null);
                if (result instanceof java.util.function.Supplier) ((java.util.function.Supplier<Object>) result).get();
                return false;
            } catch (Throwable thrown) {
                // JavaScript treats a stack overflow as an Error, which is what
                // the assertThrows contract checks.
                if (thrown instanceof RuntimeException || thrown instanceof Error) return true;
                RuntimeException error = new RuntimeException("Threw something other than an Error");
                error.initCause(thrown);
                throw error;
            }
        };


public static final Object assertprime = __init$assertprime();
    private static Object __init$assertprime() { return (java.util.function.Function<Object, Object>) (msg) -> (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Supplier<Object>) () -> { if (!((Boolean) b)) { throw new RuntimeException((String) msg); } return null; }; }
public static final Object assertEqualprime = __init$assertEqualprime();
    private static Object __init$assertEqualprime() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictShow_1$r1) -> { return (java.util.function.Function<Object, Object>) (userMessage_2$r2) -> { return (java.util.function.Function<Object, Object>) (v_3$r3) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object result_4$r4 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictEq_0$r0).get("eq"))).apply(__Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O.read0(v_3$r3)))).apply(__Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O.read1(v_3$r3)); Object message_5$r5 = (((String) ((((String) ((((String) (( ((Boolean) (java.util.Objects.equals(userMessage_2$r2, ""))) ? (((String) ("")) + ((String) ("Expected: "))) : (((String) (userMessage_2$r2)) + ((String) ("\nExpected: ")))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_1$r1).get("show"))).apply(__Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O.read1(v_3$r3))))))) + ((String) ("\nActual:   "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_1$r1).get("show"))).apply(__Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O.read0(v_3$r3))))); Object __local_var_6$r6 = ((java.util.function.Function<Object, Object>) (__M$Effect_Console.error)).apply(message_5$r5); Object __local_var_7$r7 = ( ((Boolean) ((!(((Boolean) (result_4$r4)))))) ? __local_var_6$r6 : ( ((Boolean) (result_4$r4)) ? (new java.util.function.Supplier<Object>() { public Object get() { return __M$Data_Unit.unit; } }) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); Object _dollar___unused_8$r8 = ((java.util.function.Supplier) (Object)(__local_var_7$r7)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (msg) -> (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Supplier<Object>) () -> { if (!((Boolean) b)) { throw new RuntimeException((String) msg); } return null; })).apply(message_5$r5))).apply(result_4$r4))).get(); } }); }; }; }; }; }
public static final Object assertEqual = __init$assertEqual();
    private static Object __init$assertEqual() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictShow_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertEqualprime)).apply(dictEq_0$r0))).apply(dictShow_1$r1))).apply(""); }; }; }
public static final Object assertFalse = __init$assertFalse();
    private static Object __init$assertFalse() { return (java.util.function.Function<Object, Object>) (actual_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertEqualprime)).apply(__M$Data_Eq.eqBoolean))).apply(__M$Data_Show.showBoolean))).apply(""))).apply((new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("actual", actual_0$r0); __map.put("expected", false);  return __map; } }).get()); }; }
public static final Object assertTrue = __init$assertTrue();
    private static Object __init$assertTrue() { return (java.util.function.Function<Object, Object>) (actual_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertEqualprime)).apply(__M$Data_Eq.eqBoolean))).apply(__M$Data_Show.showBoolean))).apply(""))).apply((new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("actual", actual_0$r0); __map.put("expected", true);  return __map; } }).get()); }; }
public static final Object assertFalseprime = __init$assertFalseprime();
    private static Object __init$assertFalseprime() { return (java.util.function.Function<Object, Object>) (message_0$r0) -> { return (java.util.function.Function<Object, Object>) (actual_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertEqualprime)).apply(__M$Data_Eq.eqBoolean))).apply(__M$Data_Show.showBoolean))).apply(message_0$r0))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = actual_1$r1; final Object __field1 = false; return new __Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O(new String[]{"actual", "expected"}, __field0, __field1); } }).get()); }; }; }
public static final Object assertTrueprime = __init$assertTrueprime();
    private static Object __init$assertTrueprime() { return (java.util.function.Function<Object, Object>) (message_0$r0) -> { return (java.util.function.Function<Object, Object>) (actual_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertEqualprime)).apply(__M$Data_Eq.eqBoolean))).apply(__M$Data_Show.showBoolean))).apply(message_0$r0))).apply((new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = actual_1$r1; final Object __field1 = true; return new __Record$61_63_74_75_61_6c_O$65_78_70_65_63_74_65_64_O(new String[]{"actual", "expected"}, __field0, __field1); } }).get()); }; }; }
public static final Object assertThrowsprime = __init$assertThrowsprime();
    private static Object __init$assertThrowsprime() { return (java.util.function.Function<Object, Object>) (msg_0$r0) -> { return (java.util.function.Function<Object, Object>) (fn_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2$r2 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (msg) -> (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Supplier<Object>) () -> { if (!((Boolean) b)) { throw new RuntimeException((String) msg); } return null; })).apply(msg_0$r0); Object __local_var_3$r3 = ((java.util.function.Function<Object, Object>) (__M$Test_Assert.checkThrows)).apply(fn_1$r1); Object __local_var_4$r4 = ((java.util.function.Supplier) (Object)(__local_var_3$r3)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (__local_var_2$r2)).apply(__local_var_4$r4))).get(); } }); }; }; }
public static final Object assertThrows = __init$assertThrows();
    private static Object __init$assertThrows() { return ((java.util.function.Function<Object, Object>) (__M$Test_Assert.assertThrowsprime)).apply("Assertion failed: An error should have been thrown"); }
public static final Object $assert = __init$$assert();
    private static Object __init$$assert() { return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (msg) -> (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Supplier<Object>) () -> { if (!((Boolean) b)) { throw new RuntimeException((String) msg); } return null; })).apply("Assertion failed"); }
}
