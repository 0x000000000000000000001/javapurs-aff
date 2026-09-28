public class __M$Data_Number_Format {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Number.Format"); }
    };
    // FFI provided by ../javapurs-numbers/src/Data/Number/Format.java
    // Port of Data/Number/Format.js: the ECMAScript methods toPrecision,
    // toFixed, toExponential and Number::toString, which PureScript exposes
    // through Data.Number.Format.

    // Shortest decimal that round-trips, closest to the exact value, ties to
    // even (the ECMAScript digit selection).
    private static java.math.BigDecimal __shortest(double value) {
        java.math.BigDecimal exact = new java.math.BigDecimal(value);
        for (int precision = 1; precision <= 17; precision++) {
            java.math.BigDecimal best = null;
            for (java.math.RoundingMode mode : new java.math.RoundingMode[]{
                java.math.RoundingMode.HALF_EVEN, java.math.RoundingMode.HALF_UP,
                java.math.RoundingMode.FLOOR, java.math.RoundingMode.CEILING}) {
                java.math.BigDecimal candidate = exact.round(new java.math.MathContext(precision, mode));
                if (Double.parseDouble(candidate.toString()) != value) continue;
                if (best == null) { best = candidate; continue; }
                int cmp = candidate.subtract(exact).abs().compareTo(best.subtract(exact).abs());
                if (cmp < 0
                    || (cmp == 0
                        && candidate.stripTrailingZeros().unscaledValue().testBit(0) == false
                        && best.stripTrailingZeros().unscaledValue().testBit(0))) {
                    best = candidate;
                }
            }
            if (best != null) return best;
        }
        return exact.round(new java.math.MathContext(17, java.math.RoundingMode.HALF_EVEN));
    }

    // Number::toString: plain notation for exponents in [-6, 20], exponential
    // otherwise, shortest digits, e+/- without zero padding.
    private static String __ecmaNumber(double value) {
        if (Double.isNaN(value)) return "NaN";
        if (Double.isInfinite(value)) return value > 0 ? "Infinity" : "-Infinity";
        if (value == 0.0) return "0";
        boolean negative = value < 0;
        java.math.BigDecimal decimal = __shortest(value).abs().stripTrailingZeros();
        double magnitude = Math.abs(value);
        String body;
        if (magnitude >= 1e-6 && magnitude < 1e21) {
            body = decimal.toPlainString();
        } else {
            int digits = decimal.precision();
            int exponent = digits - decimal.scale() - 1;
            String mantissa = decimal.unscaledValue().toString();
            body = (digits == 1 ? mantissa : mantissa.charAt(0) + "." + mantissa.substring(1))
                + "e" + (exponent >= 0 ? "+" : "") + exponent;
        }
        return negative ? "-" + body : body;
    }

    private static String __exponential(int digits, double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) return __ecmaNumber(value);
        if (value == 0.0) {
            String zeros = digits == 0 ? "" : "." + "0".repeat(digits);
            return "0" + zeros + "e+0";
        }
        boolean negative = value < 0;
        java.math.BigDecimal rounded = new java.math.BigDecimal(value).abs()
            .round(new java.math.MathContext(digits + 1, java.math.RoundingMode.HALF_UP))
            .stripTrailingZeros();
        int exponent = rounded.precision() - rounded.scale() - 1;
        String mantissa = rounded.unscaledValue().toString();
        StringBuilder builder = new StringBuilder();
        if (negative) builder.append('-');
        builder.append(mantissa.charAt(0));
        if (digits > 0) {
            builder.append('.');
            for (int index = 1; index <= digits; index++) {
                builder.append(index < mantissa.length() ? mantissa.charAt(index) : '0');
            }
        }
        builder.append('e').append(exponent >= 0 ? "+" : "").append(exponent);
        return builder.toString();
    }

    private static String __fixed(int digits, double value) {
        if (Math.abs(value) >= 1e21) return __ecmaNumber(value);
        return new java.math.BigDecimal(value).setScale(digits, java.math.RoundingMode.HALF_UP).toPlainString();
    }

    private static String __precision(int digits, double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) return __ecmaNumber(value);
        if (value == 0.0) return digits <= 1 ? "0" : "0." + "0".repeat(digits - 1);
        boolean negative = value < 0;
        java.math.BigDecimal rounded = new java.math.BigDecimal(value).abs()
            .round(new java.math.MathContext(digits, java.math.RoundingMode.HALF_UP))
            .stripTrailingZeros();
        int exponent = rounded.precision() - rounded.scale() - 1;
        String digitsText = rounded.unscaledValue().toString();
        String body;
        if (exponent < -6 || exponent >= digits) {
            StringBuilder builder = new StringBuilder();
            builder.append(digitsText.charAt(0));
            if (digits > 1) {
                builder.append('.');
                for (int index = 1; index < digits; index++) {
                    builder.append(index < digitsText.length() ? digitsText.charAt(index) : '0');
                }
            }
            builder.append('e').append(exponent >= 0 ? "+" : "").append(exponent);
            body = builder.toString();
        } else if (exponent >= 0) {
            StringBuilder builder = new StringBuilder();
            int point = exponent + 1;
            for (int index = 0; index < digits; index++) {
                if (index == point) builder.append('.');
                builder.append(index < digitsText.length() ? digitsText.charAt(index) : '0');
            }
            body = builder.toString();
        } else {
            body = "0." + "0".repeat(-exponent - 1) + digitsText;
        }
        return negative ? "-" + body : body;
    }

    public static Object toPrecisionNative = (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (num) ->
            __precision(((Number) d).intValue(), ((Number) num).doubleValue());

    public static Object toFixedNative = (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (num) ->
            __fixed(((Number) d).intValue(), ((Number) num).doubleValue());

    public static Object toExponentialNative = (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (num) ->
            __exponential(((Number) d).intValue(), ((Number) num).doubleValue());

    public static Object toString = (java.util.function.Function<Object, Object>) (num) ->
        __ecmaNumber(((Number) num).doubleValue());


public static final class Precision {
            public final int value0;
            public Precision(int value0){
                this.value0 = ((int) (value0));
            }
            public Precision(Object... values) {
                this.value0 = ((Integer) (values[0])).intValue();
            }
        }
public static final class Fixed {
            public final int value0;
            public Fixed(int value0){
                this.value0 = ((int) (value0));
            }
            public Fixed(Object... values) {
                this.value0 = ((Integer) (values[0])).intValue();
            }
        }
public static final class Exponential {
            public final int value0;
            public Exponential(int value0){
                this.value0 = ((int) (value0));
            }
            public Exponential(Object... values) {
                this.value0 = ((Integer) (values[0])).intValue();
            }
        }
public static final Object Precision = __init$Precision();
    private static Object __init$Precision() { return (java.util.function.Function<Object, Object>) (value0_i0) -> { return new __M$Data_Number_Format.Precision(value0_i0); }; }
public static final Object Fixed = __init$Fixed();
    private static Object __init$Fixed() { return (java.util.function.Function<Object, Object>) (value0_i0) -> { return new __M$Data_Number_Format.Fixed(value0_i0); }; }
public static final Object Exponential = __init$Exponential();
    private static Object __init$Exponential() { return (java.util.function.Function<Object, Object>) (value0_i0) -> { return new __M$Data_Number_Format.Exponential(value0_i0); }; }
public static final Object toStringWith = __init$toStringWith();
    private static Object __init$toStringWith() { return (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Number_Format.Precision))) ? ((java.util.function.Function<Object, Object>) (__M$Data_Number_Format.toPrecisionNative)).apply(((__M$Data_Number_Format.Precision) (Object)(v_0_i0)).value0) : ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Number_Format.Fixed))) ? ((java.util.function.Function<Object, Object>) (__M$Data_Number_Format.toFixedNative)).apply(((__M$Data_Number_Format.Fixed) (Object)(v_0_i0)).value0) : ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Number_Format.Exponential))) ? ((java.util.function.Function<Object, Object>) (__M$Data_Number_Format.toExponentialNative)).apply(((__M$Data_Number_Format.Exponential) (Object)(v_0_i0)).value0) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }; }
public static final Object precision = __init$precision();
    private static Object __init$precision() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Number_Format.Precision))).apply((__IntFn) (x_0_i0) -> { int __local_var_1_i1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(1))).apply(x_0_i0); return ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.LT))) ? x_0_i0 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.EQ))) ? 1 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.GT))) ? 1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(21))).apply(__local_var_1_i1); return ((int) (( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.LT))) ? 21 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.EQ))) ? 21 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.GT))) ? __local_var_1_i1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); }); }
public static final Object fixed = __init$fixed();
    private static Object __init$fixed() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Number_Format.Fixed))).apply((__IntFn) (x_0_i0) -> { int __local_var_1_i1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(0))).apply(x_0_i0); return ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.LT))) ? x_0_i0 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.GT))) ? 0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(20))).apply(__local_var_1_i1); return ((int) (( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.LT))) ? 20 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.EQ))) ? 20 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.GT))) ? __local_var_1_i1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); }); }
public static final Object exponential = __init$exponential();
    private static Object __init$exponential() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Number_Format.Exponential))).apply((__IntFn) (x_0_i0) -> { int __local_var_1_i1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object v_1_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(0))).apply(x_0_i0); return ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.LT))) ? x_0_i0 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((((Object) (v_1_i2)) instanceof __M$Data_Ordering.GT))) ? 0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); } }).get())); Object v_2_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordInt).get("compare"))).apply(20))).apply(__local_var_1_i1); return ((int) (( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.LT))) ? 20 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.EQ))) ? 20 : ( ((Boolean) ((((Object) (v_2_i3)) instanceof __M$Data_Ordering.GT))) ? __local_var_1_i1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))); }); }
}
