public final class __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O copy(__Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) return ((__Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("CommutativeRing0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) return ((__Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("degree");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) return ((__Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("div");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) return ((__Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("mod");
    }
    @Override public Object get(Object key) {
        if ("CommutativeRing0".equals(key)) return field0;
        if ("degree".equals(key)) return field1;
        if ("div".equals(key)) return field2;
        if ("mod".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "CommutativeRing0".equals(key) || "degree".equals(key) || "div".equals(key) || "mod".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
