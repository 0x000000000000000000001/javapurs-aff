public class __M$Data_Function_Uncurried {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Function.Uncurried"); }
    };
    // FFI provided by ../javapurs-functions/src/Data/Function/Uncurried.java
    // FnN values share the backend's curried representation: mkFnN is the
    // identity and runFnN applies the chain in order. The optimizer rewrites
    // most mkFnN/runFnN calls into uncurried forms; these definitions cover
    // the arities it leaves alone and act as the fallback for unoptimized
    // call sites.
    @SuppressWarnings("unchecked")
    private static Object __uncurriedApply(Object fn, Object... args) {
        Object result = fn;
        for (Object arg : args) result = ((java.util.function.Function<Object, Object>) result).apply(arg);
        return result;
    }

    public static Object mkFn0 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn2 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn3 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn4 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn5 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn6 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn7 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn8 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn9 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkFn10 = (java.util.function.Function<Object, Object>) (fn) -> fn;

    public static Object runFn0 = (java.util.function.Function<Object, Object>) (fn) ->
        ((java.util.function.Function<Object, Object>) fn).apply(null);

    public static Object runFn2 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) -> __uncurriedApply(fn, a, b);
    public static Object runFn3 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) -> __uncurriedApply(fn, a, b, c);
    public static Object runFn4 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) -> __uncurriedApply(fn, a, b, c, d);
    public static Object runFn5 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) -> __uncurriedApply(fn, a, b, c, d, e);
    public static Object runFn6 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) -> __uncurriedApply(fn, a, b, c, d, e, g);
    public static Object runFn7 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) -> __uncurriedApply(fn, a, b, c, d, e, g, h);
    public static Object runFn8 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) -> __uncurriedApply(fn, a, b, c, d, e, g, h, i);
    public static Object runFn9 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) -> __uncurriedApply(fn, a, b, c, d, e, g, h, i, j);
    public static Object runFn10 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) ->
        (java.util.function.Function<Object, Object>) (k) -> __uncurriedApply(fn, a, b, c, d, e, g, h, i, j, k);


public static final Object runFn1 = __init$runFn1();
    private static Object __init$runFn1() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { return f_0_i0; }; }
public static final Object mkFn1 = __init$mkFn1();
    private static Object __init$mkFn1() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { return f_0_i0; }; }
}
