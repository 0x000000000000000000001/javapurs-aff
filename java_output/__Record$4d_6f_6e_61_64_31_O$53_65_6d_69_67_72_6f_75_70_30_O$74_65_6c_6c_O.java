public final class __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O copy(__Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O original, Object field0, Object field1, Object field2) {
        return new __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) return ((__Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Monad1");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) return ((__Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("Semigroup0");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) return ((__Record$4d_6f_6e_61_64_31_O$53_65_6d_69_67_72_6f_75_70_30_O$74_65_6c_6c_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("tell");
    }
    @Override public Object get(Object key) {
        if ("Monad1".equals(key)) return field0;
        if ("Semigroup0".equals(key)) return field1;
        if ("tell".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Monad1".equals(key) || "Semigroup0".equals(key) || "tell".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
