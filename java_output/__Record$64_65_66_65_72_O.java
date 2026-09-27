public final class __Record$64_65_66_65_72_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    __Record$64_65_66_65_72_O(String[] order, Object field0) {
        this.__order = order;
        this.field0 = field0;
    }
    public static __Record$64_65_66_65_72_O copy(__Record$64_65_66_65_72_O original, Object field0) {
        return new __Record$64_65_66_65_72_O(original.__order, field0);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$64_65_66_65_72_O) return ((__Record$64_65_66_65_72_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("defer");
    }
    @Override public Object get(Object key) {
        if ("defer".equals(key)) return field0;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "defer".equals(key); }
    @Override public int size() { return 1; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
