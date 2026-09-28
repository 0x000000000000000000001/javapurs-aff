public class __M$Data_Array_ST {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Array.ST"); }
    };
    // FFI provided by ../javapurs-arrays/src/Data/Array/ST.java
    // Port of Data/Array/ST.js. An STArray is an ArrayList; ST values are
    // Suppliers, the convention the other ST ports use.
    public static Object $new = (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<Object>();

    public static Object unsafeFreezeImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) st).toArray(new Object[0]);

    public static Object unsafeThawImpl = (java.util.function.Function<Object, Object>) (arr) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>(java.util.Arrays.asList((Object[]) arr));

    public static Object thawImpl = (java.util.function.Function<Object, Object>) (arr) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>(java.util.Arrays.asList((Object[]) arr));

    public static Object freezeImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) st).toArray(new Object[0]);

    public static Object cloneImpl = (java.util.function.Function<Object, Object>) (st) ->
        (java.util.function.Supplier<Object>) () -> new java.util.ArrayList<>((java.util.List<Object>) st);

    public static Object peekImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int index = ((Number) i).intValue();
                return index >= 0 && index < list.size()
                    ? ((java.util.function.Function<Object, Object>) just).apply(list.get(index))
                    : nothing;
            };

    public static Object pokeImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int index = ((Number) i).intValue();
                if (index >= 0 && index < list.size()) { list.set(index, a); return true; }
                return false;
            };

    public static Object lengthImpl = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Supplier<Object>) () -> ((java.util.List<Object>) xs).size();

    public static Object popImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                return list.isEmpty() ? nothing : ((java.util.function.Function<Object, Object>) just).apply(list.remove(list.size() - 1));
            };

    public static Object shiftImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                return list.isEmpty() ? nothing : ((java.util.function.Function<Object, Object>) just).apply(list.remove(0));
            };

    public static Object pushImpl = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                list.add(a);
                return list.size();
            };

    public static Object pushAllImpl = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                for (Object item : (Object[]) as) list.add(item);
                return list.size();
            };

    public static Object unshiftAllImpl = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                Object[] items = (Object[]) as;
                for (int index = items.length - 1; index >= 0; index--) list.add(0, items[index]);
                return list.size();
            };

    public static Object spliceImpl = (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (howMany) ->
        (java.util.function.Function<Object, Object>) (bs) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                int start = Math.max(0, Math.min(((Number) i).intValue(), list.size()));
                int count = Math.max(0, Math.min(((Number) howMany).intValue(), list.size() - start));
                java.util.List<Object> removed = new java.util.ArrayList<>();
                for (int index = 0; index < count; index++) removed.add(list.remove(start));
                Object[] items = (Object[]) bs;
                for (int index = 0; index < items.length; index++) list.add(start + index, items[index]);
                return removed.toArray(new Object[0]);
            };

    public static Object sortByImpl = (java.util.function.Function<Object, Object>) (compare) ->
        (java.util.function.Function<Object, Object>) (fromOrdering) ->
        (java.util.function.Function<Object, Object>) (xs) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.List<Object> list = (java.util.List<Object>) xs;
                list.sort((java.util.Comparator<Object>) (a, b) -> ((Number)
                    ((java.util.function.Function<Object, Object>) fromOrdering).apply(
                        ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) compare).apply(a)).apply(b))).intValue());
                return list;
            };

    public static Object toAssocArrayImpl = (java.util.function.Function<Object, Object>) (xs) ->
        (java.util.function.Supplier<Object>) () -> {
            java.util.List<Object> list = (java.util.List<Object>) xs;
            Object[] out = new Object[list.size()];
            for (int index = 0; index < list.size(); index++) {
                java.util.Map<String, Object> assoc = new java.util.LinkedHashMap<>();
                assoc.put("value", list.get(index));
                assoc.put("index", index);
                out[index] = assoc;
            }
            return out;
        };


public static final Object unshiftAll = __init$unshiftAll();
    private static Object __init$unshiftAll() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn2)).apply(__M$Data_Array_ST.unshiftAllImpl); }
public static final Object unshift = __init$unshift();
    private static Object __init$unshift() { return (java.util.function.Function<Object, Object>) (a_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn2)).apply(__M$Data_Array_ST.unshiftAllImpl))).apply(new Object[]{a_0_i0}); }; }
public static final Object unsafeThaw = __init$unsafeThaw();
    private static Object __init$unsafeThaw() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.unsafeThawImpl); }
public static final Object unsafeFreeze = __init$unsafeFreeze();
    private static Object __init$unsafeFreeze() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.unsafeFreezeImpl); }
public static final Object toAssocArray = __init$toAssocArray();
    private static Object __init$toAssocArray() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.toAssocArrayImpl); }
public static final Object thaw = __init$thaw();
    private static Object __init$thaw() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.thawImpl); }
public static final Object withArray = __init$withArray();
    private static Object __init$withArray() { return (java.util.function.Function<Object, Object>) (f_0_i0) -> { return (java.util.function.Function<Object, Object>) (xs_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2_i2 = ((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.thaw)).apply(xs_1_i1); Object result_3_i3 = ((java.util.function.Supplier) (Object)(__local_var_2_i2)).get(); Object _dollar___unused_4_i4 = ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (f_0_i0)).apply(result_3_i3))).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.unsafeFreeze)).apply(result_3_i3))).get(); } }); }; }; }
public static final Object splice = __init$splice();
    private static Object __init$splice() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn4)).apply(__M$Data_Array_ST.spliceImpl); }
public static final Object sortBy = __init$sortBy();
    private static Object __init$sortBy() { return (java.util.function.Function<Object, Object>) (comp_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn3)).apply(__M$Data_Array_ST.sortByImpl))).apply(comp_0_i0))).apply((java.util.function.Function<Object, Object>) (v_1_i1) -> { return ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_Ordering.GT))) ? 1 : ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_Ordering.EQ))) ? 0 : ( ((Boolean) ((((Object) (v_1_i1)) instanceof __M$Data_Ordering.LT))) ? -1 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }); }; }
public static final Object sortWith = __init$sortWith();
    private static Object __init$sortWith() { return (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.sortBy)).apply((java.util.function.Function<Object, Object>) (x_2_i2) -> { return (java.util.function.Function<Object, Object>) (y_3_i3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictOrd_0_i0).get("compare"))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply(x_2_i2)))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply(y_3_i3)); }; }); }; }; }
public static final Object sort = __init$sort();
    private static Object __init$sort() { return (java.util.function.Function<Object, Object>) (dictOrd_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.sortBy)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(dictOrd_0_i0)); }; }
public static final Object shift = __init$shift();
    private static Object __init$shift() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn3)).apply(__M$Data_Array_ST.shiftImpl))).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object run = __init$run();
    private static Object __init$run() { return (java.util.function.Function<Object, Object>) (st_0_i0) -> { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Internal.run)).apply((new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1_i1 = ((java.util.function.Supplier) (Object)(st_0_i0)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.unsafeFreeze)).apply(__local_var_1_i1))).get(); } })); }; }
public static final Object pushAll = __init$pushAll();
    private static Object __init$pushAll() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn2)).apply(__M$Data_Array_ST.pushAllImpl); }
public static final Object push = __init$push();
    private static Object __init$push() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn2)).apply(__M$Data_Array_ST.pushImpl); }
public static final Object pop = __init$pop();
    private static Object __init$pop() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn3)).apply(__M$Data_Array_ST.popImpl))).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object poke = __init$poke();
    private static Object __init$poke() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn3)).apply(__M$Data_Array_ST.pokeImpl); }
public static final Object peek = __init$peek();
    private static Object __init$peek() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn4)).apply(__M$Data_Array_ST.peekImpl))).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object modify = __init$modify();
    private static Object __init$modify() { return (java.util.function.Function<Object, Object>) (i_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return (java.util.function.Function<Object, Object>) (xs_2_i2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_3_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.peek)).apply(i_0_i0))).apply(xs_2_i2); Object entry_4_i4 = ((java.util.function.Supplier) (Object)(__local_var_3_i3)).get(); return ((java.util.function.Supplier) (Object)(( ((Boolean) ((((Object) (entry_4_i4)) instanceof __M$Data_Maybe.Just))) ? ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Array_ST.poke)).apply(i_0_i0))).apply(((java.util.function.Function<Object, Object>) (f_1_i1)).apply(((__M$Data_Maybe.Just) (Object)(entry_4_i4)).value0)))).apply(xs_2_i2) : ( ((Boolean) ((((Object) (entry_4_i4)) instanceof __M$Data_Maybe.Nothing))) ? (new java.util.function.Supplier<Object>() { public Object get() { return false; } }) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())))).get(); } }); }; }; }; }
public static final Object length = __init$length();
    private static Object __init$length() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.lengthImpl); }
public static final Object freeze = __init$freeze();
    private static Object __init$freeze() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.freezeImpl); }
public static final Object clone = __init$clone();
    private static Object __init$clone() { return ((java.util.function.Function<Object, Object>) (__M$Control_Monad_ST_Uncurried.runSTFn1)).apply(__M$Data_Array_ST.cloneImpl); }
}
