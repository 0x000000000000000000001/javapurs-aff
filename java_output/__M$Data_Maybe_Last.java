public class __M$Data_Maybe_Last {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Maybe.Last"); }
    };


public static final Object Last = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; };
public static final Object showLast = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { Object showMaybe_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.showMaybe)).apply(dictShow_0_i0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (((String) ((((String) ("(Last ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showMaybe_1_i1).get("show"))).apply(v_2_i2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); };
public static final Object semigroupLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ( ((Boolean) ((v1_1_i1 instanceof __M$Data_Maybe.Just))) ? v1_1_i1 : ( ((Boolean) ((v1_1_i1 instanceof __M$Data_Maybe.Nothing))) ? v_0_i0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get();
public static final Object ordLast = (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.ordMaybe)).apply(dictOrd_0_i0); };
public static final Object ord1Last = __M$Data_Maybe.ord1Maybe;
public static final Object newtypeLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get();
public static final Object monoidLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Maybe.__singleton$Nothing.value; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Maybe_Last.semigroupLast; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get();
public static final Object monadLast = __M$Data_Maybe.monadMaybe;
public static final Object invariantLast = __M$Data_Maybe.invariantMaybe;
public static final Object functorLast = __M$Data_Maybe.functorMaybe;
public static final Object extendLast = __M$Data_Maybe.extendMaybe;
public static final Object eqLast = (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.eqMaybe)).apply(dictEq_0_i0); };
public static final Object eq1Last = __M$Data_Maybe.eq1Maybe;
public static final Object boundedLast = (java.util.function.Function<Object, Object>) (dictBounded_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Maybe.boundedMaybe)).apply(dictBounded_0_i0); };
public static final Object bindLast = __M$Data_Maybe.bindMaybe;
public static final Object applyLast = __M$Data_Maybe.applyMaybe;
public static final Object applicativeLast = __M$Data_Maybe.applicativeMaybe;
public static final Object altLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.append)).apply(__M$Data_Maybe_Last.semigroupLast); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Maybe.functorMaybe; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get();
public static final Object plusLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Monoid.mempty)).apply(__M$Data_Maybe_Last.monoidLast); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Maybe_Last.altLast; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get();
public static final Object alternativeLast = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Maybe.applicativeMaybe; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Data_Maybe_Last.plusLast; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get();
}
