public class __M$Data_Generic_Rep {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Generic.Rep"); }
    };


public static final class Inl {
            public final Object value0;
            public Inl(Object value0){
                this.value0 = value0;
            }
        }
public static final class Inr {
            public final Object value0;
            public Inr(Object value0){
                this.value0 = value0;
            }
        }
public static final class Product {
            public final Object value0;
            public final Object value1;
            public Product(Object value0, Object value1){
                this.value0 = value0;
                this.value1 = value1;
            }
        }
public static final class NoArguments {
            
            public NoArguments(){
                
            }
        }
public static final class __singleton$NoArguments {
    public static final NoArguments value = new NoArguments();
}
public static final Object Inl = __init$Inl();
    private static Object __init$Inl() { return (java.util.function.Function<Object, Object>) (value0_i0) -> { return new __M$Data_Generic_Rep.Inl(value0_i0); }; }
public static final Object Inr = __init$Inr();
    private static Object __init$Inr() { return (java.util.function.Function<Object, Object>) (value0_i0) -> { return new __M$Data_Generic_Rep.Inr(value0_i0); }; }
public static final Object Product = __init$Product();
    private static Object __init$Product() { return (java.util.function.Function<Object, Object>) (value0_i0) -> (java.util.function.Function<Object, Object>) (value1_i1) -> { return new __M$Data_Generic_Rep.Product(value0_i0, value1_i1); }; }
public static final Object NoArguments = __init$NoArguments();
    private static Object __init$NoArguments() { return __M$Data_Generic_Rep.__singleton$NoArguments.value; }
public static final Object Constructor = __init$Constructor();
    private static Object __init$Constructor() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object Argument = __init$Argument();
    private static Object __init$Argument() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object to = __init$to();
    private static Object __init$to() { return (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("to"); }; }
public static final Object showSum = __init$showSum();
    private static Object __init$showSum() { return (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (dictShow1_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return ( ((Boolean) ((((Object) (v_2_i2)) instanceof __M$Data_Generic_Rep.Inl))) ? (((String) ((((String) ("(Inl ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(((__M$Data_Generic_Rep.Inl) (Object)(v_2_i2)).value0)))))) + ((String) (")"))) : ( ((Boolean) ((((Object) (v_2_i2)) instanceof __M$Data_Generic_Rep.Inr))) ? (((String) ((((String) ("(Inr ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow1_1_i1).get("show"))).apply(((__M$Data_Generic_Rep.Inr) (Object)(v_2_i2)).value0)))))) + ((String) (")"))) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }; }
public static final Object showProduct = __init$showProduct();
    private static Object __init$showProduct() { return (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (dictShow1_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (((String) ((((String) ((((String) ((((String) ("(Product ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(((__M$Data_Generic_Rep.Product) (Object)(v_2_i2)).value0)))))) + ((String) (" "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow1_1_i1).get("show"))).apply(((__M$Data_Generic_Rep.Product) (Object)(v_2_i2)).value1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }; }
public static final Object showNoArguments = __init$showNoArguments();
    private static Object __init$showNoArguments() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return "NoArguments"; }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object showConstructor = __init$showConstructor();
    private static Object __init$showConstructor() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0_i0) -> { return (java.util.function.Function<Object, Object>) (dictShow_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_2_i2) -> { return (((String) ((((String) ((((String) ((((String) ("(Constructor @")) + ((String) (((java.util.function.Function<Object, Object>) (__M$Data_Show.showStringImpl)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0_i0).get("reflectSymbol"))).apply(__M$Type_Proxy.__singleton$Proxy.value))))))) + ((String) (" "))))) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_1_i1).get("show"))).apply(v_2_i2)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }; }
public static final Object showArgument = __init$showArgument();
    private static Object __init$showArgument() { return (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_1_i1) -> { return (((String) ((((String) ("(Argument ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(v_1_i1)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }; }
public static final Object repOf = __init$repOf();
    private static Object __init$repOf() { return (java.util.function.Function<Object, Object>) (dictGeneric_0_i0) -> { return (java.util.function.Function<Object, Object>) (v_1_i1) -> { return __M$Type_Proxy.__singleton$Proxy.value; }; }; }
public static final Object from = __init$from();
    private static Object __init$from() { return (java.util.function.Function<Object, Object>) (dict_0_i0) -> { return ((java.util.Map<String, Object>) dict_0_i0).get("from"); }; }
}
