public final class __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O copy(__Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O original, Object field0, Object field1, Object field2) {
        return new __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) return ((__Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Decide0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) return ((__Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("Divisible1");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) return ((__Record$44_65_63_69_64_65_30_O$44_69_76_69_73_69_62_6c_65_31_O$6c_6f_73_65_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("lose");
    }
    @Override public Object get(Object key) {
        if ("Decide0".equals(key)) return field0;
        if ("Divisible1".equals(key)) return field1;
        if ("lose".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Decide0".equals(key) || "Divisible1".equals(key) || "lose".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
