public final class __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final int field1;
    public final int field2;
    __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I(String[] order, Object field0, int field1, int field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I copy(__Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I original, Object field0, int field1, int field2) {
        return new __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) return ((__Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) value).field0;
        return ((java.util.Map<?, ?>) value).get("Ord0");
    }
    public static int read1(Object value) {
        if (value instanceof __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) return ((__Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) value).field1;
        return ((Integer) (((java.util.Map<?, ?>) value).get("bottom"))).intValue();
    }
    public static int read2(Object value) {
        if (value instanceof __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) return ((__Record$4f_72_64_30_O$62_6f_74_74_6f_6d_I$74_6f_70_I) value).field2;
        return ((Integer) (((java.util.Map<?, ?>) value).get("top"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("Ord0".equals(key)) return field0;
        if ("bottom".equals(key)) return field1;
        if ("top".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "Ord0".equals(key) || "bottom".equals(key) || "top".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
