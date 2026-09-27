public final class __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(String[] order, Object field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O copy(__Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O original, Object field0, Object field1) {
        return new __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O) return ((__Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Unfoldable10");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O) return ((__Record$55_6e_66_6f_6c_64_61_62_6c_65_31_30_O$75_6e_66_6f_6c_64_72_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("unfoldr");
    }
    @Override public Object get(Object key) {
        if ("Unfoldable10".equals(key)) return field0;
        if ("unfoldr".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Unfoldable10".equals(key) || "unfoldr".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
