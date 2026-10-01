public class __M$Data_Array_ST_Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.ST.Partial"); }
    };
    // FFI provided by ../javapurs-arrays/src/Data/Array/ST/Partial.java
    // Port of Data/Array/ST/Partial.js: unchecked STArray access.
    public static Object peekImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () ->
                ((java.util.List<Object>) xs).get(((Number) i).intValue());

    public static Object pokeImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                ((java.util.List<Object>) xs).set(((Number) i).intValue(), a);
                return null;
            };


public static final Object poke = __init$poke();
    private static Object __init$poke() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn3)).apply(__M$Data_Array_ST_Partial.pokeImpl); }; }
public static final Object peek = __init$peek();
    private static Object __init$peek() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn2)).apply(__M$Data_Array_ST_Partial.peekImpl); }; }
}
