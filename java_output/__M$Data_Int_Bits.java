public class __M$Data_Int_Bits {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Int.Bits"); }
    };
    // FFI provided by ../javapurs-integers/src/Data/Int/Bits.java
    public static Object and = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) & ((Integer) n2);

    public static Object or = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) | ((Integer) n2);

    public static Object xor = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) ^ ((Integer) n2);

    public static Object shl = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) << ((Integer) n2);

    public static Object shr = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) >> ((Integer) n2);

    public static Object zshr = (java.util.function.Function<Object, Object>) (n1) ->
        (java.util.function.Function<Object, Object>) (n2) -> ((Integer) n1) >>> ((Integer) n2);

    public static Object complement = (java.util.function.Function<Object, Object>) (n) -> ~((Integer) n);



}
