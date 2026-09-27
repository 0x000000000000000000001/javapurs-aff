public final class __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O copy(__Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) return ((__Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("MonadTell1");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) return ((__Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("Monoid0");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) return ((__Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("listen");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) return ((__Record$4d_6f_6e_61_64_54_65_6c_6c_31_O$4d_6f_6e_6f_69_64_30_O$6c_69_73_74_65_6e_O$70_61_73_73_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("pass");
    }
    @Override public Object get(Object key) {
        if ("MonadTell1".equals(key)) return field0;
        if ("Monoid0".equals(key)) return field1;
        if ("listen".equals(key)) return field2;
        if ("pass".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "MonadTell1".equals(key) || "Monoid0".equals(key) || "listen".equals(key) || "pass".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
