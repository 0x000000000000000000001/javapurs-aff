public class __M$Data_Array_NonEmpty_Internal {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.NonEmpty.Internal"); }
    };
    // FFI provided by ../javapurs-arrays/src/Data/Array/NonEmpty/Internal.java
    // Port of Data/Array/NonEmpty/Internal.js. The JavaScript trampoline only
    // avoids deep recursion; the folds below keep the same order.
    public static Object foldr1Impl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] array = (Object[]) xs;
            Object acc = array[array.length - 1];
            for (int index = array.length - 2; index >= 0; index--) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(array[index])).apply(acc);
            }
            return acc;
        };

    public static Object foldl1Impl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (xs) -> {
            Object[] array = (Object[]) xs;
            Object acc = array[0];
            for (int index = 1; index < array.length; index++) {
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(acc)).apply(array[index]);
            }
            return acc;
        };

    public static Object traverse1Impl = (java.util.function.Function<Object, Object>) (apply) ->
        (java.util.function.Function<Object, Object>) (map) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (arrayObj) -> {
            Object[] array = (Object[]) arrayObj;
            java.util.function.Function<Object, Object> finalCell = head -> {
                java.util.List<Object> single = new java.util.ArrayList<>();
                single.add(head);
                return single;
            };
            java.util.function.Function<Object, Object> consList = x ->
                (java.util.function.Function<Object, Object>) xs -> {
                    java.util.List<Object> out = new java.util.ArrayList<>();
                    out.add(x);
                    out.addAll((java.util.List<Object>) xs);
                    return out;
                };
            java.util.function.Function<Object, Object> listToArray = list ->
                ((java.util.List<Object>) list).toArray(new Object[0]);
            Object acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(finalCell))
                .apply(((java.util.function.Function<Object, Object>) f).apply(array[array.length - 1]));
            for (int index = array.length - 2; index >= 0; index--) {
                Object mapped = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(consList))
                    .apply(((java.util.function.Function<Object, Object>) f).apply(array[index]));
                acc = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) apply).apply(mapped)).apply(acc);
            }
            return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) map).apply(listToArray)).apply(acc);
        };


public static final Object NonEmptyArray = __init$NonEmptyArray();
    private static Object __init$NonEmptyArray() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object unfoldable1NonEmptyArray = __init$unfoldable1NonEmptyArray();
    private static Object __init$unfoldable1NonEmptyArray() { return __M$Data_Unfoldable1.unfoldable1Array; }
public static final Object traversableWithIndexNonEmptyArray = __init$traversableWithIndexNonEmptyArray();
    private static Object __init$traversableWithIndexNonEmptyArray() { return __M$Data_TraversableWithIndex.traversableWithIndexArray; }
public static final Object traversableNonEmptyArray = __init$traversableNonEmptyArray();
    private static Object __init$traversableNonEmptyArray() { return __M$Data_Traversable.traversableArray; }
public static final Object showNonEmptyArray = __init$showNonEmptyArray();
    private static Object __init$showNonEmptyArray() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { Object showArray_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Show.showArray)).apply(dictShow_0$r0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2$r2) -> { return (((String) ((((String) ("(NonEmptyArray ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showArray_1$r1).get("show"))).apply(v_2$r2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupNonEmptyArray = __init$semigroupNonEmptyArray();
    private static Object __init$semigroupNonEmptyArray() { return __M$Data_Semigroup.semigroupArray; }
public static final Object ordNonEmptyArray = __init$ordNonEmptyArray();
    private static Object __init$ordNonEmptyArray() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Ord.ordArray)).apply(dictOrd_0$r0); }; }
public static final Object ord1NonEmptyArray = __init$ord1NonEmptyArray();
    private static Object __init$ord1NonEmptyArray() { return __M$Data_Ord.ord1Array; }
public static final Object monadNonEmptyArray = __init$monadNonEmptyArray();
    private static Object __init$monadNonEmptyArray() { return __M$Control_Monad.monadArray; }
public static final Object functorWithIndexNonEmptyArray = __init$functorWithIndexNonEmptyArray();
    private static Object __init$functorWithIndexNonEmptyArray() { return __M$Data_FunctorWithIndex.functorWithIndexArray; }
public static final Object functorNonEmptyArray = __init$functorNonEmptyArray();
    private static Object __init$functorNonEmptyArray() { return __M$Data_Functor.functorArray; }
public static final Object foldableWithIndexNonEmptyArray = __init$foldableWithIndexNonEmptyArray();
    private static Object __init$foldableWithIndexNonEmptyArray() { return __M$Data_FoldableWithIndex.foldableWithIndexArray; }
public static final Object foldableNonEmptyArray = __init$foldableNonEmptyArray();
    private static Object __init$foldableNonEmptyArray() { return __M$Data_Foldable.foldableArray; }
private static Object __lazy_value_foldable1NonEmptyArray;
private static int __lazy_state_foldable1NonEmptyArray;
private static Object __lazy_get_foldable1NonEmptyArray() { if (__lazy_state_foldable1NonEmptyArray == 2) return __lazy_value_foldable1NonEmptyArray; if (__lazy_state_foldable1NonEmptyArray == 1) throw new IllegalStateException("Recursive initialization of foldable1NonEmptyArray"); __lazy_state_foldable1NonEmptyArray = 1; __lazy_value_foldable1NonEmptyArray = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictSemigroup_0$r0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Semigroup_Foldable.foldMap1DefaultL)).apply(__M$Data_Array_NonEmpty_Internal.__lazy_get_foldable1NonEmptyArray()))).apply(__M$Data_Functor.functorArray))).apply(dictSemigroup_0$r0); }; final Object __field1 = (java.util.function.Function<Object, Object>) (__local_var_0$r1) -> { return (java.util.function.Function<Object, Object>) (__local_var_1$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array_NonEmpty_Internal.foldr1Impl)).apply(__local_var_0$r1))).apply(__local_var_1$r2); }; }; final Object __field2 = (java.util.function.Function<Object, Object>) (__local_var_0$r3) -> { return (java.util.function.Function<Object, Object>) (__local_var_1$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array_NonEmpty_Internal.foldl1Impl)).apply(__local_var_0$r3))).apply(__local_var_1$r4); }; }; final Object __field3 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r5) -> { return __M$Data_Foldable.foldableArray; }; return new __Record$46_6f_6c_64_61_62_6c_65_30_O$66_6f_6c_64_4d_61_70_31_O$66_6f_6c_64_6c_31_O$66_6f_6c_64_72_31_O(new String[]{"foldMap1", "foldr1", "foldl1", "Foldable0"}, __field3, __field0, __field2, __field1); } }).get(); __lazy_state_foldable1NonEmptyArray = 2; return __lazy_value_foldable1NonEmptyArray; }
public static final Object foldable1NonEmptyArray = __init$foldable1NonEmptyArray();
    private static Object __init$foldable1NonEmptyArray() { return __lazy_get_foldable1NonEmptyArray(); }
private static Object __lazy_value_traversable1NonEmptyArray;
private static int __lazy_state_traversable1NonEmptyArray;
private static Object __lazy_get_traversable1NonEmptyArray() { if (__lazy_state_traversable1NonEmptyArray == 2) return __lazy_value_traversable1NonEmptyArray; if (__lazy_state_traversable1NonEmptyArray == 1) throw new IllegalStateException("Recursive initialization of traversable1NonEmptyArray"); __lazy_state_traversable1NonEmptyArray = 1; __lazy_value_traversable1NonEmptyArray = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (dictApply_0$r0) -> { Object apply_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Control_Apply.apply)).apply(dictApply_0$r0); Object go__map_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Data_Functor.map)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictApply_0$r0).get("Functor0"))).apply(null /* TODO: PrimUndefined */)); return (java.util.function.Function<Object, Object>) (f_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array_NonEmpty_Internal.traverse1Impl)).apply(apply_1$r1))).apply(go__map_2$r2))).apply(f_3$r3); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (dictApply_0$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Semigroup_Traversable.sequence1Default)).apply(__M$Data_Array_NonEmpty_Internal.__lazy_get_traversable1NonEmptyArray()))).apply(dictApply_0$r4); }; final Object __field2 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r5) -> { return __M$Data_Array_NonEmpty_Internal.foldable1NonEmptyArray; }; final Object __field3 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r6) -> { return __M$Data_Traversable.traversableArray; }; return new __Record$46_6f_6c_64_61_62_6c_65_31_30_O$54_72_61_76_65_72_73_61_62_6c_65_31_O$73_65_71_75_65_6e_63_65_31_O$74_72_61_76_65_72_73_65_31_O(new String[]{"traverse1", "sequence1", "Foldable10", "Traversable1"}, __field2, __field3, __field1, __field0); } }).get(); __lazy_state_traversable1NonEmptyArray = 2; return __lazy_value_traversable1NonEmptyArray; }
public static final Object traversable1NonEmptyArray = __init$traversable1NonEmptyArray();
    private static Object __init$traversable1NonEmptyArray() { return __lazy_get_traversable1NonEmptyArray(); }
public static final Object eqNonEmptyArray = __init$eqNonEmptyArray();
    private static Object __init$eqNonEmptyArray() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Eq.eqArray)).apply(dictEq_0$r0); }; }
public static final Object eq1NonEmptyArray = __init$eq1NonEmptyArray();
    private static Object __init$eq1NonEmptyArray() { return __M$Data_Eq.eq1Array; }
public static final Object bindNonEmptyArray = __init$bindNonEmptyArray();
    private static Object __init$bindNonEmptyArray() { return __M$Control_Bind.bindArray; }
public static final Object applyNonEmptyArray = __init$applyNonEmptyArray();
    private static Object __init$applyNonEmptyArray() { return __M$Control_Apply.applyArray; }
public static final Object applicativeNonEmptyArray = __init$applicativeNonEmptyArray();
    private static Object __init$applicativeNonEmptyArray() { return __M$Control_Applicative.applicativeArray; }
public static final Object altNonEmptyArray = __init$altNonEmptyArray();
    private static Object __init$altNonEmptyArray() { return __M$Control_Alt.altArray; }
}
