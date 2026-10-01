public class __M$Data_Show {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Show"); }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Show.java
    public static final Object showIntImpl = (java.util.function.Function<Object, Object>) (value) -> ((Integer) value).toString();

    public static final Object showNumberImpl = (java.util.function.Function<Object, Object>) (value) -> {
        double number = ((Number) value).doubleValue();
        if (!Double.isFinite(number)) return Double.toString(number);
        if (number == 0.0) return "0.0";
        java.math.BigDecimal decimal = shortestDecimal(number).stripTrailingZeros();
        double magnitude = Math.abs(number);
        if (magnitude >= 1e-6 && magnitude < 1e21) {
            String result = decimal.toPlainString();
            return decimal.scale() <= 0 ? result + ".0" : result;
        }
        return decimal.toString().replace('E', 'e');
    };

    // ECMAScript Number::toString: the decimal with the fewest significant
    // digits that round-trips, closest to the exact value, ties to even.
    private static java.math.BigDecimal shortestDecimal(double value) {
        java.math.BigDecimal exact = new java.math.BigDecimal(value);
        for (int precision = 1; precision <= 17; precision++) {
            java.math.BigDecimal best = null;
            for (java.math.RoundingMode mode : new java.math.RoundingMode[]{
                java.math.RoundingMode.HALF_EVEN, java.math.RoundingMode.HALF_UP,
                java.math.RoundingMode.FLOOR, java.math.RoundingMode.CEILING}) {
                java.math.BigDecimal candidate = exact.round(new java.math.MathContext(precision, mode));
                if (Double.parseDouble(candidate.toString()) != value) continue;
                if (best == null) {
                    best = candidate;
                    continue;
                }
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

    public static final Object showCharImpl = (java.util.function.Function<Object, Object>) (value) -> {
        char code = value instanceof Character ? (Character) value : ((String) value).charAt(0);
        return "'" + (code == '\'' ? "\\'" : showEscape(code, false)) + "'";
    };

    public static final Object showStringImpl = (java.util.function.Function<Object, Object>) (value) -> {
        String string = (String) value;
        StringBuilder result = new StringBuilder("\"");
        for (int i = 0; i < string.length(); i++) {
            char code = string.charAt(i);
            String escaped = showEscape(code, true);
            result.append(escaped);
            if (escaped.length() > 1 && Character.isDigit(escaped.charAt(1)) && i + 1 < string.length()) {
                char next = string.charAt(i + 1);
                if (next >= '0' && next <= '9') result.append("\\&");
            }
        }
        return result.append('"').toString();
    };

    private static String showEscape(char code, boolean string) {
        switch (code) {
            case '\\': return "\\\\";
            case '"': return string ? "\\\"" : "\"";
            case 7: return "\\a";
            case '\b': return "\\b";
            case '\f': return "\\f";
            case '\n': return "\\n";
            case '\r': return "\\r";
            case '\t': return "\\t";
            case 11: return "\\v";
            default: return code < 0x20 || code == 0x7f ? "\\" + (int) code : String.valueOf(code);
        }
    }

    public static final Object showArrayImpl = (java.util.function.Function<Object, Object>) (show) -> (java.util.function.Function<Object, Object>) (value) -> {
        Object[] array = (Object[]) value;
        java.util.function.Function<Object, Object> showElement = (java.util.function.Function<Object, Object>) show;
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) result.append(',');
            result.append((String) showElement.apply(array[i]));
        }
        return result.append(']').toString();
    };


public static final Object showVoid = __init$showVoid();
    private static Object __init$showVoid() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Void.absurd; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showUnit = __init$showUnit();
    private static Object __init$showUnit() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return "unit"; }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showString = __init$showString();
    private static Object __init$showString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Show.showStringImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showRecordFieldsNil = __init$showRecordFieldsNil();
    private static Object __init$showRecordFieldsNil() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return ""; }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get(); }
public static final Object showRecordFields = __init$showRecordFields();
    private static Object __init$showRecordFields() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("showRecordFields"); }; }
public static final Object showRecord = __init$showRecord();
    private static Object __init$showRecord() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictShowRecordFields_2$r2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (record_3$r3) -> { return (((String) ((((String) ("{")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShowRecordFields_2$r2).get("showRecordFields"))).apply(__M$Type_Proxy.__singleton$Proxy.value))).apply(record_3$r3)))))) + ((String) ("}"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }; }; }
public static final Object showProxy = __init$showProxy();
    private static Object __init$showProxy() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return "Proxy"; }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showNumber = __init$showNumber();
    private static Object __init$showNumber() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Show.showNumberImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showInt = __init$showInt();
    private static Object __init$showInt() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Show.showIntImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showChar = __init$showChar();
    private static Object __init$showChar() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Show.showCharImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showBoolean = __init$showBoolean();
    private static Object __init$showBoolean() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return ( ((Boolean) (v_0$r0)) ? "true" : "false"); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object show = __init$show();
    private static Object __init$show() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("show"); }; }
public static final Object showArray = __init$showArray();
    private static Object __init$showArray() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Show.showArrayImpl)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Show.show)).apply(dictShow_0$r0)); return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object showRecordFieldsCons = __init$showRecordFieldsCons();
    private static Object __init$showRecordFieldsCons() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictShowRecordFields_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictShow_2$r2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_3$r3) -> { return (java.util.function.Function<Object, Object>) (record_4$r4) -> { Object key_5$r5 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0$r0).get("reflectSymbol"))).apply(__M$Type_Proxy.__singleton$Proxy.value); return (((String) ((((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_5$r5))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_2$r2).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe.unsafeGet)).apply(key_5$r5))).apply(record_4$r4))))))) + ((String) (","))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShowRecordFields_1$r1).get("showRecordFields"))).apply(__M$Type_Proxy.__singleton$Proxy.value))).apply(record_4$r4)))); }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get(); }; }; }; }
public static final Object showRecordFieldsConsNil = __init$showRecordFieldsConsNil();
    private static Object __init$showRecordFieldsConsNil() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictShow_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r2) -> { return (java.util.function.Function<Object, Object>) (record_3$r3) -> { Object key_4$r4 = ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0$r0).get("reflectSymbol"))).apply(__M$Type_Proxy.__singleton$Proxy.value); return (((String) ((((String) ((((String) ((((String) (" ")) + ((String) (key_4$r4))))) + ((String) (": "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_1$r1).get("show"))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe.unsafeGet)).apply(key_4$r4))).apply(record_3$r3))))))) + ((String) (" "))); }; }; return new __Record$73_68_6f_77_52_65_63_6f_72_64_46_69_65_6c_64_73_O(new String[]{"showRecordFields"}, __field0); } }).get(); }; }; }
}
