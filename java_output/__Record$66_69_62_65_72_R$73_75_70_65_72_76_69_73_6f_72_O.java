public final class __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final java.util.Map<String, Object> field0;
    public final Object field1;
    __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O(String[] order, java.util.Map<String, Object> field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O copy(__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O original, java.util.Map<String, Object> field0, Object field1) {
        return new __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O(original.__order, field0, field1);
    }
    public static java.util.Map<String, Object> read0(Object value) {
        if (value instanceof __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O) return ((__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O) value).field0;
        return ((java.util.Map<String, Object>) (((java.util.Map<?, ?>) value).get("fiber")));
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O) return ((__Record$66_69_62_65_72_R$73_75_70_65_72_76_69_73_6f_72_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("supervisor");
    }
    @Override public Object get(Object key) {
        if ("fiber".equals(key)) return field0;
        if ("supervisor".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "fiber".equals(key) || "supervisor".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
