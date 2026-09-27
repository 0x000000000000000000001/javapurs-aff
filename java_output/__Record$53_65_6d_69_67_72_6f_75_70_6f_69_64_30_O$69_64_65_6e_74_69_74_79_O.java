public final class __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O(String[] order, Object field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O copy(__Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O original, Object field0, Object field1) {
        return new __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O) return ((__Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Semigroupoid0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O) return ((__Record$53_65_6d_69_67_72_6f_75_70_6f_69_64_30_O$69_64_65_6e_74_69_74_79_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("identity");
    }
    @Override public Object get(Object key) {
        if ("Semigroupoid0".equals(key)) return field0;
        if ("identity".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Semigroupoid0".equals(key) || "identity".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
