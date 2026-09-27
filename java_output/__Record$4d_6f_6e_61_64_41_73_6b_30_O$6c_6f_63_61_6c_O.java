public final class __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O(String[] order, Object field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O copy(__Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O original, Object field0, Object field1) {
        return new __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O) return ((__Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("MonadAsk0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O) return ((__Record$4d_6f_6e_61_64_41_73_6b_30_O$6c_6f_63_61_6c_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("local");
    }
    @Override public Object get(Object key) {
        if ("MonadAsk0".equals(key)) return field0;
        if ("local".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "MonadAsk0".equals(key) || "local".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
