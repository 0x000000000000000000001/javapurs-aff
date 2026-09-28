public class __M$Effect_Ref {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Ref"); }
    };
    // FFI provided by ../javapurs-refs/src/Effect/Ref.java
    // A mutable cell is a one-element array.
    public static Object _new = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Supplier<Object>) () -> new Object[]{ val };

    public static Object newWithSelf = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            Object[] cell = new Object[]{ null };
            cell[0] = ((java.util.function.Function<Object, Object>) f).apply(cell);
            return cell;
        };

    public static Object read = (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> ((Object[]) ref)[0];

    public static Object write = (java.util.function.Function<Object, Object>) (val) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> { ((Object[]) ref)[0] = val; return null; };

    // The { state, value } record of modifyImpl is a Map for untyped records and a
    // generated record class whose accessors are read0/read1 in label order.
    private static Object __recordField(Object record, int index, String label) {
        if (record instanceof java.util.Map) return ((java.util.Map<?, ?>) record).get(label);
        try {
            return record.getClass().getMethod("read" + index, Object.class).invoke(null, record);
        } catch (ReflectiveOperationException error) {
            throw new RuntimeException(error);
        }
    }

    public static Object modifyImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (ref) ->
        (java.util.function.Supplier<Object>) () -> {
            Object[] cell = (Object[]) ref;
            Object updated = ((java.util.function.Function<Object, Object>) f).apply(cell[0]);
            cell[0] = __recordField(updated, 0, "state");
            return __recordField(updated, 1, "value");
        };


public static final Object $new = __init$$new();
    private static Object __init$$new() { return __M$Effect_Ref._new; }
public static final Object modifyprime = __init$modifyprime();
    private static Object __init$modifyprime() { return __M$Effect_Ref.modifyImpl; }
public static final Object modify = __init$modify();
    private static Object __init$modify() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_1_i1) -> { Object s_prime__2_i2 = ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(s_1_i1); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = s_prime__2_i2; final Object __field1 = s_prime__2_i2; return new __Record$73_74_61_74_65_O$76_61_6c_75_65_O(new String[]{"state", "value"}, __field0, __field1); } }).get(); }); }; }
public static final Object modify_ = __init$modify_();
    private static Object __init$modify_() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Functor.$void)).apply(__M$Effect.functorEffect))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Ref.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_2_i2) -> { Object s_prime__3_i3 = ((java.util.function.Function<Object, Object>) (f_0_i0)).apply(s_2_i2); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = s_prime__3_i3; final Object __field1 = s_prime__3_i3; return new __Record$73_74_61_74_65_O$76_61_6c_75_65_O(new String[]{"state", "value"}, __field0, __field1); } }).get(); }))).apply(s_1_i1)); }; }; }
}
