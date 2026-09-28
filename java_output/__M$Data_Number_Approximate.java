public class __M$Data_Number_Approximate {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Number.Approximate"); }
    };


public static final Object Tolerance = __init$Tolerance();
    private static Object __init$Tolerance() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object Fraction = __init$Fraction();
    private static Object __init$Fraction() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object eqRelative = __init$eqRelative();
    private static Object __init$eqRelative() { return (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return (java.util.function.Function<Object, Object>) (v2_2_i2) -> { return __M$Data_Number_Approximate.__direct$2(v_0_i0, v1_1_i1, v2_2_i2); }; }; }; }
private static Object __direct$2(Object v_0_i0, Object v1_1_i1, Object v2_2_i2) { return ( ((Boolean) ((((double) (v1_1_i1)) == ((double) (0.0))))) ? (((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Number.abs)).apply(v2_2_i2))) <= ((Double) (v_0_i0))) : ( ((Boolean) ((((double) (v2_2_i2)) == ((double) (0.0))))) ? (((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Number.abs)).apply(v1_1_i1))) <= ((Double) (v_0_i0))) : (((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Number.abs)).apply((((Double) (v1_1_i1)) - ((Double) (v2_2_i2)))))) <= ((Double) ((((Double) ((((Double) (v_0_i0)) * ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Number.abs)).apply((((Double) (v1_1_i1)) + ((Double) (v2_2_i2))))))))) / ((Double) (2.0)))))))); }
public static final Object eqApproximate = __init$eqApproximate();
    private static Object __init$eqApproximate() { return ((java.util.function.Function<Object, Object>) (__M$Data_Number_Approximate.eqRelative)).apply(0.000001); }
public static final Object neqApproximate = __init$neqApproximate();
    private static Object __init$neqApproximate() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return (!(((Boolean) (( ((Boolean) ((__M$Data_Number_Approximate.eqRelative == null))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Number_Approximate.eqRelative)).apply(0.000001))).apply(x_0_i0))).apply(y_1_i1) : __M$Data_Number_Approximate.__direct$2(0.000001, x_0_i0, y_1_i1)))))); }; }; }
public static final Object eqAbsolute = __init$eqAbsolute();
    private static Object __init$eqAbsolute() { return (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (x_1_i1) -> { return (java.util.function.Function<Object, Object>) (y_2_i2) -> { return (((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Number.abs)).apply((((Double) (x_1_i1)) - ((Double) (y_2_i2)))))) <= ((Double) (v_0_i0))); }; }; }; }
}
