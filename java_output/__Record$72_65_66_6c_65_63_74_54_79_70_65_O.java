public final class __Record$72_65_66_6c_65_63_74_54_79_70_65_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    __Record$72_65_66_6c_65_63_74_54_79_70_65_O(String[] order, Object field0) {
        this.__order = order;
        this.field0 = field0;
    }
    public static __Record$72_65_66_6c_65_63_74_54_79_70_65_O copy(__Record$72_65_66_6c_65_63_74_54_79_70_65_O original, Object field0) {
        return new __Record$72_65_66_6c_65_63_74_54_79_70_65_O(original.__order, field0);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$72_65_66_6c_65_63_74_54_79_70_65_O) return ((__Record$72_65_66_6c_65_63_74_54_79_70_65_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("reflectType");
    }
    @Override public Object get(Object key) {
        if ("reflectType".equals(key)) return field0;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "reflectType".equals(key); }
    @Override public int size() { return 1; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
