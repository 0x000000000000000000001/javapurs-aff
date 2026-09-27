public final class __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O copy(__Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) return ((__Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("addRecord");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) return ((__Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("mulRecord");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) return ((__Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("oneRecord");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) return ((__Record$61_64_64_52_65_63_6f_72_64_O$6d_75_6c_52_65_63_6f_72_64_O$6f_6e_65_52_65_63_6f_72_64_O$7a_65_72_6f_52_65_63_6f_72_64_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("zeroRecord");
    }
    @Override public Object get(Object key) {
        if ("addRecord".equals(key)) return field0;
        if ("mulRecord".equals(key)) return field1;
        if ("oneRecord".equals(key)) return field2;
        if ("zeroRecord".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "addRecord".equals(key) || "mulRecord".equals(key) || "oneRecord".equals(key) || "zeroRecord".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
