public class __M$Effect {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect"); }
    };
    // FFI provided by ../javapurs-effect/src/Effect.java
    public static Object pureE = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> a;

    public static Object bindE = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () ->
            ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(((java.util.function.Supplier<Object>) a).get())).get();

    public static Object untilE = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            while (!((Boolean) ((java.util.function.Supplier<Object>) f).get())) { }
            return null;
        };

    public static Object whileE = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> {
            while ((Boolean) ((java.util.function.Supplier<Object>) f).get()) {
                ((java.util.function.Supplier<Object>) a).get();
            }
            return null;
        };

    public static Object forE = (java.util.function.Function<Object, Object>) (lo) ->
        (java.util.function.Function<Object, Object>) (hi) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (int i = (Integer) lo; i < (Integer) hi; i++) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(i)).get();
            }
            return null;
        };

    public static Object foreachE = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (Object item : (Object[]) as) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(item)).get();
            }
            return null;
        };


private static Object __lazy_value_monadEffect;
private static int __lazy_state_monadEffect;
private static Object __lazy_get_monadEffect() { if (__lazy_state_monadEffect == 2) return __lazy_value_monadEffect; if (__lazy_state_monadEffect == 1) throw new IllegalStateException("Recursive initialization of monadEffect"); __lazy_state_monadEffect = 1; __lazy_value_monadEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect.__lazy_get_applicativeEffect(); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Effect.__lazy_get_bindEffect(); }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$42_69_6e_64_31_O(new String[]{"Applicative0", "Bind1"}, __field0, __field1); } }).get(); __lazy_state_monadEffect = 2; return __lazy_value_monadEffect; }
public static final Object monadEffect = __init$monadEffect();
    private static Object __init$monadEffect() { return __lazy_get_monadEffect(); }
private static Object __lazy_value_bindEffect;
private static int __lazy_state_bindEffect;
private static Object __lazy_get_bindEffect() { if (__lazy_state_bindEffect == 2) return __lazy_value_bindEffect; if (__lazy_state_bindEffect == 1) throw new IllegalStateException("Recursive initialization of bindEffect"); __lazy_state_bindEffect = 1; __lazy_value_bindEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Supplier<Object>) () -> { return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(((java.util.function.Supplier<Object>) a).get())).get(); }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect.__lazy_get_applyEffect(); }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_bindEffect = 2; return __lazy_value_bindEffect; }
public static final Object bindEffect = __init$bindEffect();
    private static Object __init$bindEffect() { return __lazy_get_bindEffect(); }
private static Object __lazy_value_applyEffect;
private static int __lazy_state_applyEffect;
private static Object __lazy_get_applyEffect() { if (__lazy_state_applyEffect == 2) return __lazy_value_applyEffect; if (__lazy_state_applyEffect == 1) throw new IllegalStateException("Recursive initialization of applyEffect"); __lazy_state_applyEffect = 1; __lazy_value_applyEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Monad.ap)).apply(__M$Effect.__lazy_get_monadEffect()); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect.__lazy_get_functorEffect(); }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); __lazy_state_applyEffect = 2; return __lazy_value_applyEffect; }
public static final Object applyEffect = __init$applyEffect();
    private static Object __init$applyEffect() { return __lazy_get_applyEffect(); }
private static Object __lazy_value_applicativeEffect;
private static int __lazy_state_applicativeEffect;
private static Object __lazy_get_applicativeEffect() { if (__lazy_state_applicativeEffect == 2) return __lazy_value_applicativeEffect; if (__lazy_state_applicativeEffect == 1) throw new IllegalStateException("Recursive initialization of applicativeEffect"); __lazy_state_applicativeEffect = 1; __lazy_value_applicativeEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Supplier<Object>) () -> a; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Effect.__lazy_get_applyEffect(); }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); __lazy_state_applicativeEffect = 2; return __lazy_value_applicativeEffect; }
public static final Object applicativeEffect = __init$applicativeEffect();
    private static Object __init$applicativeEffect() { return __lazy_get_applicativeEffect(); }
private static Object __lazy_value_functorEffect;
private static int __lazy_state_functorEffect;
private static Object __lazy_get_functorEffect() { if (__lazy_state_functorEffect == 2) return __lazy_value_functorEffect; if (__lazy_state_functorEffect == 1) throw new IllegalStateException("Recursive initialization of functorEffect"); __lazy_state_functorEffect = 1; __lazy_value_functorEffect = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.__lazy_get_applicativeEffect()); return new __Record$6d_61_70_O(new String[]{"map"}, __field0); } }).get(); __lazy_state_functorEffect = 2; return __lazy_value_functorEffect; }
public static final Object functorEffect = __init$functorEffect();
    private static Object __init$functorEffect() { return __lazy_get_functorEffect(); }
public static final Object semigroupEffect = __init$semigroupEffect();
    private static Object __init$semigroupEffect() { return (java.util.function.Function<Object, Object>) (dictSemigroup_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.append)).apply(dictSemigroup_0_i0); return (java.util.function.Function<Object, Object>) (a_2_i2) -> { return (java.util.function.Function<Object, Object>) (b_3_i3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad.ap)).apply(__M$Effect.monadEffect))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.applicativeEffect))).apply(__local_var_1_i1))).apply(a_2_i2)))).apply(b_3_i3); }; }; } }).get(); return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }; }
public static final Object monoidEffect = __init$monoidEffect();
    private static Object __init$monoidEffect() { return (java.util.function.Function<Object, Object>) (dictMonoid_0_i0) -> { Object semigroupEffect1_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Effect.semigroupEffect)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictMonoid_0_i0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */)); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2_i2 = ((java.util.Map<String, Object>) dictMonoid_0_i0).get("mempty"); return __local_var_2_i2; } }); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_2_i3) -> { return semigroupEffect1_1_i1; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }; }
}
