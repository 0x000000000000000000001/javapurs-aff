public class __M$Data_Monoid_Generic {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Monoid.Generic"); }
    };


public static final Object genericMonoidNoArguments = __init$genericMonoidNoArguments();
    private static Object __init$genericMonoidNoArguments() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Generic_Rep.__singleton$NoArguments.value; return new __Record$67_65_6e_65_72_69_63_4d_65_6d_70_74_79_27_O(new String[]{"genericMempty'"}, __field0); } }).get(); }
public static final Object genericMonoidArgument = __init$genericMonoidArgument();
    private static Object __init$genericMonoidArgument() { return (java.util.function.Function<Object, Object>) (dictMonoid_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.Map<String, Object>) dictMonoid_0$r0).get("mempty"); return new __Record$67_65_6e_65_72_69_63_4d_65_6d_70_74_79_27_O(new String[]{"genericMempty'"}, __field0); } }).get(); }; }
public static final Object genericMemptyprime = __init$genericMemptyprime();
    private static Object __init$genericMemptyprime() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("genericMempty'"); }; }
public static final Object genericMonoidConstructor = __init$genericMonoidConstructor();
    private static Object __init$genericMonoidConstructor() { return (java.util.function.Function<Object, Object>) (dictGenericMonoid_0$r0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.Map<String, Object>) dictGenericMonoid_0$r0).get("genericMempty'"); return new __Record$67_65_6e_65_72_69_63_4d_65_6d_70_74_79_27_O(new String[]{"genericMempty'"}, __field0); } }).get(); }; }
public static final Object genericMonoidProduct = __init$genericMonoidProduct();
    private static Object __init$genericMonoidProduct() { return (java.util.function.Function<Object, Object>) (dictGenericMonoid_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictGenericMonoid1_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = new __M$Data_Generic_Rep.Product(((java.util.Map<String, Object>) dictGenericMonoid_0$r0).get("genericMempty'"), ((java.util.Map<String, Object>) dictGenericMonoid1_1$r1).get("genericMempty'")); return new __Record$67_65_6e_65_72_69_63_4d_65_6d_70_74_79_27_O(new String[]{"genericMempty'"}, __field0); } }).get(); }; }; }
public static final Object genericMempty = __init$genericMempty();
    private static Object __init$genericMempty() { return (java.util.function.Function<Object, Object>) (dictGeneric_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictGenericMonoid_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictGeneric_0$r0).get("to"))).apply(((java.util.Map<String, Object>) dictGenericMonoid_1$r1).get("genericMempty'")); }; }; }
}
