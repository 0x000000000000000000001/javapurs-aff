public class MainRun {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Object main = __M$Test_Main.main;
        if (main instanceof java.util.function.Supplier<?>) {
            ((java.util.function.Supplier<Object>) main).get();
        } else if (main instanceof java.util.function.Function<?, ?>) {
            ((java.util.function.Function<Object, Object>) main).apply(null);
        }
    }
}
