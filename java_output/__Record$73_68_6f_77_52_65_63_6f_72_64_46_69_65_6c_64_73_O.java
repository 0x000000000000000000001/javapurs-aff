public final class __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(String[] order, Object field0) {
        this.__order = order;
        this.field0 = field0;
    }
    public static __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O copy(__Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O original, Object field0) {
        return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(original.__order, field0);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O) return ((__Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("showRecordFields");
    }
    @Override public Object get(Object key) {
        if ("showRecordFields".equals(key)) return field0;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "showRecordFields".equals(key); }
    @Override public int size() { return 1; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
