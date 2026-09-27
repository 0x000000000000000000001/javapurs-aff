public final class __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O(String[] order, Object field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O copy(__Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O original, Object field0, Object field1) {
        return new __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O(original.__order, field0, field1);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O) return ((__Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("DivisionRing1");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O) return ((__Record$44_69_76_69_73_69_6f_6e_52_69_6e_67_31_O$45_75_63_6c_69_64_65_61_6e_52_69_6e_67_30_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("EuclideanRing0");
    }
    @Override public Object get(Object key) {
        if ("DivisionRing1".equals(key)) return field0;
        if ("EuclideanRing0".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "DivisionRing1".equals(key) || "EuclideanRing0".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
