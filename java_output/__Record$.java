public final class __Record$ extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    __Record$(String[] order) {
        this.__order = order;
    }
    public static __Record$ copy(__Record$ original) {
        return new __Record$(original.__order);
    }
    @Override public Object get(Object key) {
        return null;
    }
    @Override public boolean containsKey(Object key) { return false; }
    @Override public int size() { return 0; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
