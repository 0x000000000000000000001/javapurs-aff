public final class __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    public final Object field4;
    __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O(String[] order, Object field0, Object field1, Object field2, Object field3, Object field4) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }
    public static __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O copy(__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O original, Object field0, Object field1, Object field2, Object field3, Object field4) {
        return new __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O(original.__order, field0, field1, field2, field3, field4);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("fromLeft");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("fromRight");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("isLeft");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("left");
    }
    public static Object read4(Object value) {
        if (value instanceof __Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) return ((__Record$66_72_6f_6d_4c_65_66_74_O$66_72_6f_6d_52_69_67_68_74_O$69_73_4c_65_66_74_O$6c_65_66_74_O$72_69_67_68_74_O) value).field4;
        return ((java.util.Map<?, ?>) value).get("right");
    }
    @Override public Object get(Object key) {
        if ("fromLeft".equals(key)) return field0;
        if ("fromRight".equals(key)) return field1;
        if ("isLeft".equals(key)) return field2;
        if ("left".equals(key)) return field3;
        if ("right".equals(key)) return field4;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "fromLeft".equals(key) || "fromRight".equals(key) || "isLeft".equals(key) || "left".equals(key) || "right".equals(key); }
    @Override public int size() { return 5; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
