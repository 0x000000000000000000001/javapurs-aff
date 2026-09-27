public final class __Record$73_74_61_74_65_I$76_61_6c_75_65_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final int field0;
    public final int field1;
    __Record$73_74_61_74_65_I$76_61_6c_75_65_I(String[] order, int field0, int field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$73_74_61_74_65_I$76_61_6c_75_65_I copy(__Record$73_74_61_74_65_I$76_61_6c_75_65_I original, int field0, int field1) {
        return new __Record$73_74_61_74_65_I$76_61_6c_75_65_I(original.__order, field0, field1);
    }
    public static int read0(Object value) {
        if (value instanceof __Record$73_74_61_74_65_I$76_61_6c_75_65_I) return ((__Record$73_74_61_74_65_I$76_61_6c_75_65_I) value).field0;
        return ((Integer) (((java.util.Map<?, ?>) value).get("state"))).intValue();
    }
    public static int read1(Object value) {
        if (value instanceof __Record$73_74_61_74_65_I$76_61_6c_75_65_I) return ((__Record$73_74_61_74_65_I$76_61_6c_75_65_I) value).field1;
        return ((Integer) (((java.util.Map<?, ?>) value).get("value"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("state".equals(key)) return field0;
        if ("value".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "state".equals(key) || "value".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
