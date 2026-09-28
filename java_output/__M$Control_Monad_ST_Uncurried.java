public class __M$Control_Monad_ST_Uncurried {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Control.Monad.ST.Uncurried"); }
    };
    // FFI provided by ../javapurs-st/src/Control/Monad/ST/Uncurried.java
    // STFnN shares the backend's curried representation, like
    // Data.Function.Uncurried and Effect.Uncurried.
    @SuppressWarnings("unchecked")
    private static Object __stFnApply(Object fn, Object... args) {
        Object result = fn;
        for (Object arg : args) result = ((java.util.function.Function<Object, Object>) result).apply(arg);
        return result;
    }

    public static Object mkSTFn1 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn2 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn3 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn4 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn5 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn6 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn7 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn8 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn9 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkSTFn10 = (java.util.function.Function<Object, Object>) (fn) -> fn;

    public static Object runSTFn1 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) -> __stFnApply(fn, a);
    public static Object runSTFn2 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) -> __stFnApply(fn, a, b);
    public static Object runSTFn3 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) -> __stFnApply(fn, a, b, c);
    public static Object runSTFn4 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) -> __stFnApply(fn, a, b, c, d);
    public static Object runSTFn5 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) -> __stFnApply(fn, a, b, c, d, e);
    public static Object runSTFn6 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) -> __stFnApply(fn, a, b, c, d, e, g);
    public static Object runSTFn7 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) -> __stFnApply(fn, a, b, c, d, e, g, h);
    public static Object runSTFn8 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) -> __stFnApply(fn, a, b, c, d, e, g, h, i);
    public static Object runSTFn9 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) -> __stFnApply(fn, a, b, c, d, e, g, h, i, j);
    public static Object runSTFn10 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) ->
        (java.util.function.Function<Object, Object>) (k) -> __stFnApply(fn, a, b, c, d, e, g, h, i, j, k);



}
