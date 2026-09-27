public final class __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O copy(__Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O original, Object field0, Object field1, Object field2) {
        return new __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) return ((__Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("genericCardinality'");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) return ((__Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("genericFromEnum'");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) return ((__Record$67_65_6e_65_72_69_63_43_61_72_64_69_6e_61_6c_69_74_79_27_O$67_65_6e_65_72_69_63_46_72_6f_6d_45_6e_75_6d_27_O$67_65_6e_65_72_69_63_54_6f_45_6e_75_6d_27_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("genericToEnum'");
    }
    @Override public Object get(Object key) {
        if ("genericCardinality'".equals(key)) return field0;
        if ("genericFromEnum'".equals(key)) return field1;
        if ("genericToEnum'".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "genericCardinality'".equals(key) || "genericFromEnum'".equals(key) || "genericToEnum'".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
