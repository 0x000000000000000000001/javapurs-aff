public final class __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O copy(__Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O original, Object field0, Object field1, Object field2) {
        return new __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) return ((__Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Functor0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) return ((__Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("collect");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) return ((__Record$46_75_6e_63_74_6f_72_30_O$63_6f_6c_6c_65_63_74_O$64_69_73_74_72_69_62_75_74_65_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("distribute");
    }
    @Override public Object get(Object key) {
        if ("Functor0".equals(key)) return field0;
        if ("collect".equals(key)) return field1;
        if ("distribute".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Functor0".equals(key) || "collect".equals(key) || "distribute".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
