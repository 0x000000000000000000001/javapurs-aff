public final class __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O copy(__Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O original, Object field0, Object field1, Object field2) {
        return new __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Profunctor0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("left");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$50_72_6f_66_75_6e_63_74_6f_72_30_O$6c_65_66_74_O$72_69_67_68_74_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("right");
    }
    @Override public Object get(Object key) {
        if ("Profunctor0".equals(key)) return field0;
        if ("left".equals(key)) return field1;
        if ("right".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Profunctor0".equals(key) || "left".equals(key) || "right".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
