public final class __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    public final Object field4;
    __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O(String[] order, Object field0, Object field1, Object field2, Object field3, Object field4) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }
    public static __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O copy(__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O original, Object field0, Object field1, Object field2, Object field3, Object field4) {
        return new __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O(original.__order, field0, field1, field2, field3, field4);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) return ((__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("isSuspended");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) return ((__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("join");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) return ((__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("kill");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) return ((__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("onComplete");
    }
    public static Object read4(Object value) {
        if (value instanceof __Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) return ((__Record$69_73_53_75_73_70_65_6e_64_65_64_O$6a_6f_69_6e_O$6b_69_6c_6c_O$6f_6e_43_6f_6d_70_6c_65_74_65_O$72_75_6e_O) value).field4;
        return ((java.util.Map<?, ?>) value).get("run");
    }
    @Override public Object get(Object key) {
        if ("isSuspended".equals(key)) return field0;
        if ("join".equals(key)) return field1;
        if ("kill".equals(key)) return field2;
        if ("onComplete".equals(key)) return field3;
        if ("run".equals(key)) return field4;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "isSuspended".equals(key) || "join".equals(key) || "kill".equals(key) || "onComplete".equals(key) || "run".equals(key); }
    @Override public int size() { return 5; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
