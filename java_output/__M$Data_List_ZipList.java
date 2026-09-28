public class __M$Data_List_ZipList {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.List.ZipList"); }
    };


public static final Object ZipList = __init$ZipList();
    private static Object __init$ZipList() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object traversableZipList = __init$traversableZipList();
    private static Object __init$traversableZipList() { return __M$Data_List_Lazy_Types.traversableList; }
public static final Object showZipList = __init$showZipList();
    private static Object __init$showZipList() { return (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { Object showList_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy_Types.showList)).apply(dictShow_0_i0); return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (((String) ((((String) ("(ZipList ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) showList_1_i1).get("show"))).apply(v_2_i2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object semigroupZipList = __init$semigroupZipList();
    private static Object __init$semigroupZipList() { return __M$Data_List_Lazy_Types.semigroupList; }
public static final Object ordZipList = __init$ordZipList();
    private static Object __init$ordZipList() { return (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy_Types.ordList)).apply(dictOrd_0_i0); }; }
public static final Object newtypeZipList = __init$newtypeZipList();
    private static Object __init$newtypeZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object monoidZipList = __init$monoidZipList();
    private static Object __init$monoidZipList() { return __M$Data_List_Lazy_Types.monoidList; }
public static final Object functorZipList = __init$functorZipList();
    private static Object __init$functorZipList() { return __M$Data_List_Lazy_Types.functorList; }
public static final Object foldableZipList = __init$foldableZipList();
    private static Object __init$foldableZipList() { return __M$Data_List_Lazy_Types.foldableList; }
public static final Object eqZipList = __init$eqZipList();
    private static Object __init$eqZipList() { return (java.util.function.Function<Object, Object>) (dictEq_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy_Types.eqList)).apply(dictEq_0_i0); }; }
public static final Object applyZipList = __init$applyZipList();
    private static Object __init$applyZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy.zipWith)).apply(__M$Data_Function.apply))).apply(v_0_i0))).apply(v1_1_i1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_List_Lazy_Types.functorList; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_70_70_6c_79_O(new String[]{"apply", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object zipListIsNotBind = __init$zipListIsNotBind();
    private static Object __init$zipListIsNotBind() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Partial._crashWith)).apply("bind: unreachable"); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_1_i1) -> { return __M$Data_List_ZipList.applyZipList; }; return new __Record$41_70_70_6c_79_30_O$62_69_6e_64_O(new String[]{"bind", "Apply0"}, __field1, __field0); } }).get(); }; }
public static final Object applicativeZipList = __init$applicativeZipList();
    private static Object __init$applicativeZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_List_ZipList.ZipList))).apply(__M$Data_List_Lazy.repeat); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_List_ZipList.applyZipList; }; return new __Record$41_70_70_6c_79_30_O$70_75_72_65_O(new String[]{"pure", "Apply0"}, __field1, __field0); } }).get(); }
public static final Object altZipList = __init$altZipList();
    private static Object __init$altZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_List_Lazy_Types.semigroupList).get("append"))).apply(v_0_i0))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy.drop)).apply(((java.util.function.Function<Object, Object>) (__M$Data_List_Lazy.length)).apply(v_0_i0)))).apply(v1_1_i1)); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_List_Lazy_Types.functorList; }; return new __Record$46_75_6e_63_74_6f_72_30_O$61_6c_74_O(new String[]{"alt", "Functor0"}, __field1, __field0); } }).get(); }
public static final Object plusZipList = __init$plusZipList();
    private static Object __init$plusZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (__M$Data_Monoid.mempty)).apply(__M$Data_List_ZipList.monoidZipList); final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_List_ZipList.altZipList; }; return new __Record$41_6c_74_30_O$65_6d_70_74_79_O(new String[]{"empty", "Alt0"}, __field1, __field0); } }).get(); }
public static final Object alternativeZipList = __init$alternativeZipList();
    private static Object __init$alternativeZipList() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_List_ZipList.applicativeZipList; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i1) -> { return __M$Data_List_ZipList.plusZipList; }; return new __Record$41_70_70_6c_69_63_61_74_69_76_65_30_O$50_6c_75_73_31_O(new String[]{"Applicative0", "Plus1"}, __field0, __field1); } }).get(); }
}
