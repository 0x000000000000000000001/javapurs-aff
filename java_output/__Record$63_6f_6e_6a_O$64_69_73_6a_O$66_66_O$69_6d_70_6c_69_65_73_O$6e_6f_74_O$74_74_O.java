public final class __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    public final Object field4;
    public final Object field5;
    __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O(String[] order, Object field0, Object field1, Object field2, Object field3, Object field4, Object field5) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
    }
    public static __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O copy(__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O original, Object field0, Object field1, Object field2, Object field3, Object field4, Object field5) {
        return new __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O(original.__order, field0, field1, field2, field3, field4, field5);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("conj");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("disj");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("ff");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("implies");
    }
    public static Object read4(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field4;
        return ((java.util.Map<?, ?>) value).get("not");
    }
    public static Object read5(Object value) {
        if (value instanceof __Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) return ((__Record$63_6f_6e_6a_O$64_69_73_6a_O$66_66_O$69_6d_70_6c_69_65_73_O$6e_6f_74_O$74_74_O) value).field5;
        return ((java.util.Map<?, ?>) value).get("tt");
    }
    @Override public Object get(Object key) {
        if ("conj".equals(key)) return field0;
        if ("disj".equals(key)) return field1;
        if ("ff".equals(key)) return field2;
        if ("implies".equals(key)) return field3;
        if ("not".equals(key)) return field4;
        if ("tt".equals(key)) return field5;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "conj".equals(key) || "disj".equals(key) || "ff".equals(key) || "implies".equals(key) || "not".equals(key) || "tt".equals(key); }
    @Override public int size() { return 6; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
