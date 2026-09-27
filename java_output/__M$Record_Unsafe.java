public class __M$Record_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Record.Unsafe"); }
    };
    // FFI provided by ../javapurs-prelude/src/Record/Unsafe.java
    // Generated record classes extend java.util.AbstractMap and plain records are
    // LinkedHashMaps, so both representations answer map queries.
    public static Object unsafeHas = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Function<Object, Object>) (record) ->
        ((java.util.Map<?, ?>) record).containsKey((String) label);

    public static Object unsafeGet = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Function<Object, Object>) (record) ->
        ((java.util.Map<?, ?>) record).get((String) label);

    public static Object unsafeSet = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Function<Object, Object>) (value) ->
        (java.util.function.Function<Object, Object>) (record) -> {
            java.util.LinkedHashMap<String, Object> copy = new java.util.LinkedHashMap<>();
            for (java.util.Map.Entry<?, ?> entry : ((java.util.Map<?, ?>) record).entrySet()) {
                copy.put((String) entry.getKey(), entry.getValue());
            }
            copy.put((String) label, value);
            return copy;
        };

    public static Object unsafeDelete = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Function<Object, Object>) (record) -> {
            java.util.LinkedHashMap<String, Object> copy = new java.util.LinkedHashMap<>();
            for (java.util.Map.Entry<?, ?> entry : ((java.util.Map<?, ?>) record).entrySet()) {
                if (!((String) label).equals(entry.getKey())) {
                    copy.put((String) entry.getKey(), entry.getValue());
                }
            }
            return copy;
        };



}
