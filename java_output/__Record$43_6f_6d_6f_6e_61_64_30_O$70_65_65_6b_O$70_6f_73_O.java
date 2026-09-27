public final class __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O(String[] order, Object field0, Object field1, Object field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O copy(__Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O original, Object field0, Object field1, Object field2) {
        return new __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) return ((__Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("Comonad0");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) return ((__Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("peek");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) return ((__Record$43_6f_6d_6f_6e_61_64_30_O$70_65_65_6b_O$70_6f_73_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("pos");
    }
    @Override public Object get(Object key) {
        if ("Comonad0".equals(key)) return field0;
        if ("peek".equals(key)) return field1;
        if ("pos".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Comonad0".equals(key) || "peek".equals(key) || "pos".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
