public class __M$Effect_Console {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Console"); }
    };
    // FFI provided by ../javapurs-console/src/Effect/Console.java
    public static Object log = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object warn = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.err.println((String) s); return null; };

    public static Object error = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.err.println((String) s); return null; };

    public static Object info = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object debug = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    // Named timers, like the Node console keeps.
    private static final java.util.Map<String, Long> __consoleTimers = new java.util.HashMap<>();

    private static void __consoleTimeLog(String label, boolean end) {
        Long started = __consoleTimers.get(label);
        double elapsed = started == null ? 0.0 : (System.nanoTime() - started) / 1000000.0;
        System.out.println(label + ": " + elapsed + " ms");
        if (end) __consoleTimers.remove(label);
    }

    public static Object time = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimers.put((String) label, System.nanoTime()); return null; };

    public static Object timeLog = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimeLog((String) label, false); return null; };

    public static Object timeEnd = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimeLog((String) label, true); return null; };

    public static Object clear = (java.util.function.Supplier<Object>) () ->
        { System.out.print("\033[H\033[2J"); System.out.flush(); return null; };

    public static Object group = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object groupCollapsed = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object groupEnd = (java.util.function.Supplier<Object>) () -> null;


public static final Object warnShow = __init$warnShow();
    private static Object __init$warnShow() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.warn)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(a_1$r1)); }; }; }
public static final Object logShow = __init$logShow();
    private static Object __init$logShow() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(a_1$r1)); }; }; }
public static final Object infoShow = __init$infoShow();
    private static Object __init$infoShow() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.info)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(a_1$r1)); }; }; }
public static final Object grouped = __init$grouped();
    private static Object __init$grouped() { return (java.util.function.Function<Object, Object>) (name_0$r0) -> { return (java.util.function.Function<Object, Object>) (inner_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Effect_Console.group)).apply(name_0$r0); Object _dollar___unused_3$r3 = ((java.util.function.Supplier) (Object)(__local_var_2$r2)).get(); Object result_4$r4 = ((java.util.function.Supplier) (Object)(inner_1$r1)).get(); Object _dollar___unused_5$r5 = ((java.util.function.Supplier) (Object)(__M$Effect_Console.groupEnd)).get(); return result_4$r4; } }); }; }; }
public static final Object errorShow = __init$errorShow();
    private static Object __init$errorShow() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.error)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(a_1$r1)); }; }; }
public static final Object debugShow = __init$debugShow();
    private static Object __init$debugShow() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (a_1$r1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.debug)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0$r0).get("show"))).apply(a_1$r1)); }; }; }
}
