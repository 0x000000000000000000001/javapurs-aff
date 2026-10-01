public class __M$Data_Map {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Map"); }
    };


public static final Object SemigroupMap = __init$SemigroupMap();
    private static Object __init$SemigroupMap() { return (java.util.function.Function<Object, Object>) (x_0$r0) -> { return x_0$r0; }; }
public static final Object traversableWithIndexSemigroupMap = __init$traversableWithIndexSemigroupMap();
    private static Object __init$traversableWithIndexSemigroupMap() { return __M$Data_Map_Internal.traversableWithIndexMap; }
public static final Object traversableSemigroupMap = __init$traversableSemigroupMap();
    private static Object __init$traversableSemigroupMap() { return __M$Data_Map_Internal.traversableMap; }
public static final Object showSemigroupMap = __init$showSemigroupMap();
    private static Object __init$showSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictShow_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictShow1_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.showMap)).apply(dictShow_0$r0))).apply(dictShow1_1$r1); }; }; }
public static final Object semigroupSemigroupMap = __init$semigroupSemigroupMap();
    private static Object __init$semigroupSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictSemigroup_1$r1) -> { return __M$Data_Map.__direct$4(dictOrd_0$r0, dictSemigroup_1$r1); }; }; }
private static Object __direct$4(Object dictOrd_0$r0, Object dictSemigroup_1$r1) { Object append_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Data_Semigroup.append)).apply(dictSemigroup_1$r1); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_3$r3) -> { return (java.util.function.Function<Object, Object>) (v1_4$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.unsafeUnionWith)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0$r0)))).apply(append_2$r2))).apply(v_3$r3))).apply(v1_4$r4); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get(); }
public static final Object plusSemigroupMap = __init$plusSemigroupMap();
    private static Object __init$plusSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.plusMap)).apply(dictOrd_0$r0); }; }
public static final Object ordSemigroupMap = __init$ordSemigroupMap();
    private static Object __init$ordSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { Object ordMap_1$r1 = ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.ordMap)).apply(dictOrd_0$r0); return (java.util.function.Function<Object, Object>) (dictOrd1_2$r2) -> { return ((java.util.function.Function<Object, Object>) (ordMap_1$r1)).apply(dictOrd1_2$r2); }; }; }
public static final Object ord1SemigroupMap = __init$ord1SemigroupMap();
    private static Object __init$ord1SemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.ord1Map)).apply(dictOrd_0$r0); }; }
public static final Object newtypeSemigroupMap = __init$newtypeSemigroupMap();
    private static Object __init$newtypeSemigroupMap() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidSemigroupMap = __init$monoidSemigroupMap();
    private static Object __init$monoidSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictSemigroup_1$r1) -> { Object semigroupSemigroupMap2_2$r2 = __M$Data_Map.__direct$4(dictOrd_0$r0, dictSemigroup_1$r1); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Map_Internal.empty; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_3$r3) -> { return semigroupSemigroupMap2_2$r2; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get(); }; }; }
public static final Object keys = __init$keys();
    private static Object __init$keys() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Set.fromMap))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Functor.$void)).apply(__M$Data_Map_Internal.functorMap)); }
public static final Object functorWithIndexSemigroupMap = __init$functorWithIndexSemigroupMap();
    private static Object __init$functorWithIndexSemigroupMap() { return __M$Data_Map_Internal.functorWithIndexMap; }
public static final Object functorSemigroupMap = __init$functorSemigroupMap();
    private static Object __init$functorSemigroupMap() { return __M$Data_Map_Internal.functorMap; }
public static final Object foldableWithIndexSemigroupMap = __init$foldableWithIndexSemigroupMap();
    private static Object __init$foldableWithIndexSemigroupMap() { return __M$Data_Map_Internal.foldableWithIndexMap; }
public static final Object foldableSemigroupMap = __init$foldableSemigroupMap();
    private static Object __init$foldableSemigroupMap() { return __M$Data_Map_Internal.foldableMap; }
public static final Object eqSemigroupMap = __init$eqSemigroupMap();
    private static Object __init$eqSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictEq1_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.eqMap)).apply(dictEq_0$r0))).apply(dictEq1_1$r1); }; }; }
public static final Object eq1SemigroupMap = __init$eq1SemigroupMap();
    private static Object __init$eq1SemigroupMap() { return (java.util.function.Function<Object, Object>) (dictEq_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.eq1Map)).apply(dictEq_0$r0); }; }
public static final Object bindSemigroupMap = __init$bindSemigroupMap();
    private static Object __init$bindSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.bindMap)).apply(dictOrd_0$r0); }; }
public static final Object applySemigroupMap = __init$applySemigroupMap();
    private static Object __init$applySemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.applyMap)).apply(dictOrd_0$r0); }; }
public static final Object altSemigroupMap = __init$altSemigroupMap();
    private static Object __init$altSemigroupMap() { return (java.util.function.Function<Object, Object>) (dictOrd_0$r0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.altMap)).apply(dictOrd_0$r0); }; }
}
