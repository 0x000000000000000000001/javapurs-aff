public class __M$Data_Function {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Function"); }
    };


public static final Object on = __init$on();
    private static Object __init$on() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (g_1$r1) -> { return (java.util.function.Function<Object, Object>) (x_2$r2) -> { return (java.util.function.Function<Object, Object>) (y_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0$r0)).apply(((java.util.function.Function<Object, Object>) (g_1$r1)).apply(x_2$r2)))).apply(((java.util.function.Function<Object, Object>) (g_1$r1)).apply(y_3$r3)); }; }; }; }; }
public static final Object flip = __init$flip();
    private static Object __init$flip() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (b_1$r1) -> { return (java.util.function.Function<Object, Object>) (a_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0$r0)).apply(a_2$r2))).apply(b_1$r1); }; }; }; }
public static final Object $const = __init$$const();
    private static Object __init$$const() { return (java.util.function.Function<Object, Object>) (a_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return a_0$r0; }; }; }
public static final Object applyN = __init$applyN();
    private static Object __init$applyN() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { Object go__go_1$r1 = (java.util.function.Function<Object, Object>) (n_2$r2) -> (java.util.function.Function<Object, Object>) (acc_3$r3) -> { int __tco_n_2$r2 = ((int) (n_2$r2)); Object __tco_acc_3$r3 = acc_3$r3; while(true) { final int __final_n_2$r2 = __tco_n_2$r2; final Object __final_acc_3$r3 = __tco_acc_3$r3; try { if ((Boolean) ((((int) (__final_n_2$r2)) <= ((int) (0))))) { return __final_acc_3$r3; } else { { final int __next_n_2$r2 = ((int) ((((int) (__final_n_2$r2)) - ((int) (1))))); final Object __next_acc_3$r3 = ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(__final_acc_3$r3); __tco_n_2$r2 = __next_n_2$r2; __tco_acc_3$r3 = __next_acc_3$r3; continue; } } } catch (TcoLoop __tco_ex) { if (!"go__go_1$r1".equals(__tco_ex.loopId)) throw __tco_ex; __tco_n_2$r2 = ((int) (__tco_ex.args[0])); __tco_acc_3$r3 = __tco_ex.args[1]; } } }; return go__go_1$r1; }; }
public static final Object applyFlipped = __init$applyFlipped();
    private static Object __init$applyFlipped() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_1$r1)).apply(x_0$r0); }; }; }
public static final Object apply = __init$apply();
    private static Object __init$apply() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return ((java.util.function.Function<Object, Object>) (f_0$r0)).apply(x_1$r1); }; }; }
}
