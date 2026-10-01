public class __M$Data_Functor_Contravariant {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Functor.Contravariant"); }
    };


public static final Object contravariantConst = __init$contravariantConst();
    private static Object __init$contravariantConst() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (v1_1$r1) -> { return v1_1$r1; }; }; return new __Record$63_6d_61_70_O(new String[]{"cmap"}, __field0); } }).get(); }
public static final Object cmap = __init$cmap();
    private static Object __init$cmap() { return (java.util.function.Function<Object, Object>) (dict_0$r0) -> { return ((java.util.Map<String, Object>) dict_0$r0).get("cmap"); }; }
public static final Object cmapFlipped = __init$cmapFlipped();
    private static Object __init$cmapFlipped() { return (java.util.function.Function<Object, Object>) (dictContravariant_0$r0) -> { return (java.util.function.Function<Object, Object>) (x_1$r1) -> { return (java.util.function.Function<Object, Object>) (f_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictContravariant_0$r0).get("cmap"))).apply(f_2$r2))).apply(x_1$r1); }; }; }; }
public static final Object coerce = __init$coerce();
    private static Object __init$coerce() { return (java.util.function.Function<Object, Object>) (dictContravariant_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictFunctor_1$r1) -> { return (java.util.function.Function<Object, Object>) (a_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictFunctor_1$r1).get("map"))).apply(__M$Data_Void.absurd))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictContravariant_0$r0).get("cmap"))).apply(__M$Data_Void.absurd))).apply(a_2$r2)); }; }; }; }
public static final Object imapC = __init$imapC();
    private static Object __init$imapC() { return (java.util.function.Function<Object, Object>) (dictContravariant_0$r0) -> { return (java.util.function.Function<Object, Object>) (v_1$r1) -> { return (java.util.function.Function<Object, Object>) (f_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictContravariant_0$r0).get("cmap"))).apply(f_2$r2); }; }; }; }
}
