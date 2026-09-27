public final class __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    public final Object field4;
    __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O(String[] order, Object field0, Object field1, Object field2, Object field3, Object field4) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }
    public static __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O copy(__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O original, Object field0, Object field1, Object field2, Object field3, Object field4) {
        return new __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O(original.__order, field0, field1, field2, field3, field4);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) return ((__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Bounded0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) return ((__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("Enum1");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) return ((__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("cardinality");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) return ((__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("fromEnum");
    }
    public static Object read4(Object value) {
        if (value instanceof __Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) return ((__Record$42_6f_75_6e_64_65_64_30_O$45_6e_75_6d_31_O$63_61_72_64_69_6e_61_6c_69_74_79_O$66_72_6f_6d_45_6e_75_6d_O$74_6f_45_6e_75_6d_O) value).field4;
        return ((java.util.Map<?, ?>) value).get("toEnum");
    }
    @Override public Object get(Object key) {
        if ("Bounded0".equals(key)) return field0;
        if ("Enum1".equals(key)) return field1;
        if ("cardinality".equals(key)) return field2;
        if ("fromEnum".equals(key)) return field3;
        if ("toEnum".equals(key)) return field4;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Bounded0".equals(key) || "Enum1".equals(key) || "cardinality".equals(key) || "fromEnum".equals(key) || "toEnum".equals(key); }
    @Override public int size() { return 5; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
