public class __M$Data_Interval_Duration {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.Interval.Duration"); }
    };


public static final class Second {
            
            public Second(){
                
            }
        }
public static final class __singleton$Second {
    public static final Second value = new Second();
}
public static final class Minute {
            
            public Minute(){
                
            }
        }
public static final class __singleton$Minute {
    public static final Minute value = new Minute();
}
public static final class Hour {
            
            public Hour(){
                
            }
        }
public static final class __singleton$Hour {
    public static final Hour value = new Hour();
}
public static final class Day {
            
            public Day(){
                
            }
        }
public static final class __singleton$Day {
    public static final Day value = new Day();
}
public static final class Week {
            
            public Week(){
                
            }
        }
public static final class __singleton$Week {
    public static final Week value = new Week();
}
public static final class Month {
            
            public Month(){
                
            }
        }
public static final class __singleton$Month {
    public static final Month value = new Month();
}
public static final class Year {
            
            public Year(){
                
            }
        }
public static final class __singleton$Year {
    public static final Year value = new Year();
}
public static final Object Second = __M$Data_Interval_Duration.__singleton$Second.value;
public static final Object Minute = __M$Data_Interval_Duration.__singleton$Minute.value;
public static final Object Hour = __M$Data_Interval_Duration.__singleton$Hour.value;
public static final Object Day = __M$Data_Interval_Duration.__singleton$Day.value;
public static final Object Week = __M$Data_Interval_Duration.__singleton$Week.value;
public static final Object Month = __M$Data_Interval_Duration.__singleton$Month.value;
public static final Object Year = __M$Data_Interval_Duration.__singleton$Year.value;
public static final Object Duration = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; };
public static final Object showDurationComponent = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Minute))) ? "Minute" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Second))) ? "Second" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Hour))) ? "Hour" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Day))) ? "Day" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Week))) ? "Week" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Month))) ? "Month" : ( ((Boolean) ((v_0_i0 instanceof __M$Data_Interval_Duration.Year))) ? "Year" : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object showDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (((String) ((((String) ("(Duration ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.showMap)).apply(__M$Data_Interval_Duration.showDurationComponent))).apply(__M$Data_Show.showNumber)).get("show"))).apply(v_0_i0)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get();
public static final Object newtypeDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get();
public static final Object eqDurationComponent = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Second))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Second) : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Minute))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Minute) : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Hour))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Hour) : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Day))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Day) : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Week))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Week) : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Month))) ? (y_1_i1 instanceof __M$Data_Interval_Duration.Month) : (((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Year))) && ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Year)))))))))); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get();
public static final Object ordDurationComponent = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Second))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Second))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Second))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Minute))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Minute))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Minute))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Hour))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Hour))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Hour))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Day))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Day))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Day))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Week))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Week))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Week))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Month))) ? ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Month))) ? __M$Data_Ordering.__singleton$EQ.value : __M$Data_Ordering.__singleton$LT.value) : ( ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Month))) ? __M$Data_Ordering.__singleton$GT.value : ( ((Boolean) ((((Boolean) ((x_0_i0 instanceof __M$Data_Interval_Duration.Year))) && ((Boolean) ((y_1_i1 instanceof __M$Data_Interval_Duration.Year)))))) ? __M$Data_Ordering.__singleton$EQ.value : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))))))))))); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_Interval_Duration.eqDurationComponent; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get();
public static final Object semigroupDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.unsafeUnionWith)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Ord.compare)).apply(__M$Data_Interval_Duration.ordDurationComponent)))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Semiring.add)).apply(__M$Data_Semiring.semiringNumber)))).apply(v_0_i0))).apply(v1_1_i1); }; }; return new __Record$61_70_70_65_6e_64_O(new String[]{"append"}, __field0); } }).get();
public static final Object monoidDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_Map_Internal.empty; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return __M$Data_Interval_Duration.semigroupDuration; }; return new __Record$53_65_6d_69_67_72_6f_75_70_30_O$6d_65_6d_70_74_79_O(new String[]{"mempty", "Semigroup0"}, __field1, __field0); } }).get();
public static final Object eqDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.eqMap)).apply(__M$Data_Interval_Duration.eqDurationComponent))).apply(__M$Data_Eq.eqNumber)).get("eq"))).apply(x_0_i0))).apply(y_1_i1); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get();
public static final Object ordDuration = (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0_i0) -> { return (java.util.function.Function<Object, Object>) (y_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Map_Internal.ordMap)).apply(__M$Data_Interval_Duration.ordDurationComponent))).apply(__M$Data_Ord.ordNumber)).get("compare"))).apply(x_0_i0))).apply(y_1_i1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_Interval_Duration.eqDuration; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get();
public static final Object hour = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Hour.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object millisecond = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply((java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Second.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); }))).apply((java.util.function.Function<Object, Object>) (v_0_i1) -> { return (((Double) (v_0_i1)) / ((Double) (1000.0))); });
public static final Object minute = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Minute.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object month = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Month.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object second = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Second.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object week = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Week.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object year = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Year.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
public static final Object day = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return new __M$Data_Map_Internal.Node(1, 1, __M$Data_Interval_Duration.__singleton$Day.value, v_0_i0, __M$Data_Map_Internal.__singleton$Leaf.value, __M$Data_Map_Internal.__singleton$Leaf.value); };
}
