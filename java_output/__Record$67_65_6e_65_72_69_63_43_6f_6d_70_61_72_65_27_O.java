public final class __Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    __Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O(String[] order, Object field0) {
        this.__order = order;
        this.field0 = field0;
    }
    public static __Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O copy(__Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O original, Object field0) {
        return new __Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O(original.__order, field0);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O) return ((__Record$67_65_6e_65_72_69_63_43_6f_6d_70_61_72_65_27_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("genericCompare'");
    }
    @Override public Object get(Object key) {
        if ("genericCompare'".equals(key)) return field0;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "genericCompare'".equals(key); }
    @Override public int size() { return 1; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
