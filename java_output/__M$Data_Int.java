public class __M$Data_Int {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Int"); }
    };
    // FFI provided by ../javapurs-integers/src/Data/Int.java
    public static Object fromNumberImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (n) -> {
        Double d = (Double) n;
        if (d.intValue() == d) {
            return ((java.util.function.Function<Object, Object>) just).apply(d.intValue());
        }
        return nothing;
    };

    public static Object toNumber = (java.util.function.Function<Object, Object>) (n) -> {
        return ((Integer) n).doubleValue();
    };

    public static Object fromStringAsImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (radixObj) -> {
        int radix = (Integer) radixObj;
        return (java.util.function.Function<Object, Object>) (s) -> {
            try {
                int i = Integer.parseInt((String) s, radix);
                return ((java.util.function.Function<Object, Object>) just).apply(i);
            } catch (NumberFormatException e) {
                return nothing;
            }
        };
    };

    public static Object toStringAs = (java.util.function.Function<Object, Object>) (radixObj) -> (java.util.function.Function<Object, Object>) (i) -> {
        int radix = (Integer) radixObj;
        return Integer.toString((Integer) i, radix);
    };

    public static Object quot = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (Integer) x / (Integer) y;
    };

    public static Object rem = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (Integer) x % (Integer) y;
    };

    public static Object pow = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> {
        return (int) Math.pow((Integer) x, (Integer) y);
    };


public static final class Even {
            
            public Even(){
                
            }
        }
public static final class __singleton$Even {
    public static final Even value = new Even();
}
public static final class Odd {
            
            public Odd(){
                
            }
        }
public static final class __singleton$Odd {
    public static final Odd value = new Odd();
}
public static final Object Even = __M$Data_Int.__singleton$Even.value;
public static final Object Odd = __M$Data_Int.__singleton$Odd.value;
public static final Object showParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Int.Even))) ? "Even" : ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Int.Odd))) ? "Odd" : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object radix = (java.util.function.Function<Object, Object>) (n_0_i0) -> { return ( ((Boolean) ((((Boolean) ((((int) (n_0_i0)) >= ((int) (2))))) && ((Boolean) ((((int) (n_0_i0)) <= ((int) (36)))))))) ? new __M$Data_Maybe.Just(n_0_i0) : __M$Data_Maybe.__singleton$Nothing.value); };
public static final Object odd = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (!(((Boolean) ((((int) ((((int) (x_0_i0)) & ((int) (1))))) == ((int) (0))))))); };
public static final Object octal = 8;
public static final Object hexadecimal = 16;
public static final Object fromStringAs = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Int.fromStringAsImpl)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object fromString = ((java.util.function.Function<Object, Object>) (__M$Data_Int.fromStringAs)).apply(10);
public static final Object fromNumber = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Int.fromNumberImpl)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object unsafeClamp = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return ( ((Boolean) ((!(((Boolean) (((java.util.function.Function<Object, Object>) (__M$Data_Number.isFinite)).apply(x_0_i0))))))) ? 0 : ( ((Boolean) ((((Double) (x_0_i0)) >= ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Bounded.top)).apply(__M$Data_Bounded.boundedInt))))))) ? ((java.util.function.Function<Object, Object>) (__M$Data_Bounded.top)).apply(__M$Data_Bounded.boundedInt) : ( ((Boolean) ((((Double) (x_0_i0)) <= ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Bounded.bottom)).apply(__M$Data_Bounded.boundedInt))))))) ? ((java.util.function.Function<Object, Object>) (__M$Data_Bounded.bottom)).apply(__M$Data_Bounded.boundedInt) : ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Maybe.fromMaybe)).apply(0))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Int.fromNumber)).apply(x_0_i0))))); };
public static final Object round = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Int.unsafeClamp))).apply(__M$Data_Number.round);
public static final Object trunc = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Int.unsafeClamp))).apply(__M$Data_Number.trunc);
public static final Object floor = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Int.unsafeClamp))).apply(__M$Data_Number.floor);
public static final Object even = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (((int) ((((int) (x_0_i0)) & ((int) (1))))) == ((int) (0))); };
public static final Object parity = (java.util.function.Function<Object, Object>) (n_0_i0) -> { return ( ((Boolean) ((((int) ((((int) (n_0_i0)) & ((int) (1))))) == ((int) (0))))) ? __M$Data_Int.__singleton$Even.value : __M$Data_Int.__singleton$Odd.value); };
public static final Object eqParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ( ((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Even))) ? (((Object) (y_1_i1)) instanceof __M$Data_Int.Even) : (((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Odd))) && ((Boolean) ((((Object) (y_1_i1)) instanceof __M$Data_Int.Odd))))); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get();
public static final Object ordParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ( ((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Even))) ? ( ((Boolean) ((((Object) (y_1_i1)) instanceof __M$Data_Int.Even))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((((Object) (y_1_i1)) instanceof __M$Data_Int.Even))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Odd))) && ((Boolean) ((((Object) (y_1_i1)) instanceof __M$Data_Int.Odd)))))) ? __M$Data_Ordering.__singleton$EQ.value : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_Int.eqParity; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get();
public static final Object semiringParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Int.__singleton$Even.value; final Object __field1 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ( ((Boolean) (( ((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Even))) ? (((Object) (y_1_i1)) instanceof __M$Data_Int.Even) : (((Boolean) ((((Object) (x_0_i0)) instanceof __M$Data_Int.Odd))) && ((Boolean) ((((Object) (y_1_i1)) instanceof __M$Data_Int.Odd))))))) ? __M$Data_Int.__singleton$Even.value : __M$Data_Int.__singleton$Odd.value); }; }; final Object __field2 = __M$Data_Int.__singleton$Odd.value; final Object __field3 = (java.util.function.Function<Object, Object>) (v_0_i2) -> { return (java.util.function.Function<Object, Object>) (v1_1_i3) -> { return ( ((Boolean) ((((Boolean) ((((Object) (v_0_i2)) instanceof __M$Data_Int.Odd))) && ((Boolean) ((((Object) (v1_1_i3)) instanceof __M$Data_Int.Odd)))))) ? __M$Data_Int.__singleton$Odd.value : __M$Data_Int.__singleton$Even.value); }; }; return new __Record$61_64_64_O$6d_75_6c_O$6f_6e_65_O$7a_65_72_6f_O(new String[]{"zero", "add", "one", "mul"}, __field1, __field3, __field2, __field0); } }).get();
public static final Object ringParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Semiring.add)).apply(__M$Data_Int.semiringParity); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Int.semiringParity; }; return new __Record$53_65_6d_69_72_69_6e_67_30_O$73_75_62_O(new String[]{"sub", "Semiring0"}, __field1, __field0); } }).get();
public static final Object divisionRingParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Int.ringParity; }; return new __Record$52_69_6e_67_30_O$72_65_63_69_70_O(new String[]{"recip", "Ring0"}, __field1, __field0); } }).get();
public static final Object decimal = 10;
public static final Object commutativeRingParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Int.ringParity; }; return new __Record$52_69_6e_67_30_O(new String[]{"Ring0"}, __field0); } }).get();
public static final Object euclideanRingParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Int.Even))) ? 0 : ( ((Boolean) ((((Object) (v_0_i0)) instanceof __M$Data_Int.Odd))) ? 1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; final Object __field1 = (java.util.function.Function<Object, Object>) (x_0_i1) -> { return (java.util.function.Function<Object, Object>) (v_1_i2) -> { return x_0_i1; }; }; final Object __field2 = (java.util.function.Function<Object, Object>) (v_0_i3) -> { return (java.util.function.Function<Object, Object>) (v1_1_i4) -> { return __M$Data_Int.__singleton$Even.value; }; }; final Object __field3 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i5) -> { return __M$Data_Int.commutativeRingParity; }; return new __Record$43_6f_6d_6d_75_74_61_74_69_76_65_52_69_6e_67_30_O$64_65_67_72_65_65_O$64_69_76_O$6d_6f_64_O(new String[]{"degree", "div", "mod", "CommutativeRing0"}, __field3, __field0, __field1, __field2); } }).get();
public static final Object ceil = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Int.unsafeClamp))).apply(__M$Data_Number.ceil);
public static final Object boundedParity = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Int.__singleton$Even.value; final Object __field1 = __M$Data_Int.__singleton$Odd.value; final Object __field2 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Int.ordParity; }; return new __Record$4f_72_64_30_O$62_6f_74_74_6f_6d_O$74_6f_70_O(new String[]{"bottom", "top", "Ord0"}, __field2, __field0, __field1); } }).get();
public static final Object binary = 2;
public static final Object base36 = 36;
}
