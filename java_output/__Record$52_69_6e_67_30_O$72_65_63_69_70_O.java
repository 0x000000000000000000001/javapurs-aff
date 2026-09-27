public final class __Record$52_69_6e_67_30_O$72_65_63_69_70_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    __Record$52_69_6e_67_30_O$72_65_63_69_70_O(String[] order, Object field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$52_69_6e_67_30_O$72_65_63_69_70_O copy(__Record$52_69_6e_67_30_O$72_65_63_69_70_O original, Object field0, Object field1) {
        return new __Record$52_69_6e_67_30_O$72_65_63_69_70_O(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$52_69_6e_67_30_O$72_65_63_69_70_O) return ((__Record$52_69_6e_67_30_O$72_65_63_69_70_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Ring0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$52_69_6e_67_30_O$72_65_63_69_70_O) return ((__Record$52_69_6e_67_30_O$72_65_63_69_70_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("recip");
    }
    @Override public Object get(Object key) {
        if ("Ring0".equals(key)) return field0;
        if ("recip".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Ring0".equals(key) || "recip".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
