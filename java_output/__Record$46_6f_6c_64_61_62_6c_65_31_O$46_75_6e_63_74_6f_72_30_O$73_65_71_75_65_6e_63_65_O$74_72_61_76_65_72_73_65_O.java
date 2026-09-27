public final class __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O copy(__Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) return ((__Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Foldable1");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) return ((__Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("Functor0");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) return ((__Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("sequence");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) return ((__Record$46_6f_6c_64_61_62_6c_65_31_O$46_75_6e_63_74_6f_72_30_O$73_65_71_75_65_6e_63_65_O$74_72_61_76_65_72_73_65_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("traverse");
    }
    @Override public Object get(Object key) {
        if ("Foldable1".equals(key)) return field0;
        if ("Functor0".equals(key)) return field1;
        if ("sequence".equals(key)) return field2;
        if ("traverse".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Foldable1".equals(key) || "Functor0".equals(key) || "sequence".equals(key) || "traverse".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
