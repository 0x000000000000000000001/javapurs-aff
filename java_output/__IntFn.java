
@FunctionalInterface
public interface __IntFn extends java.util.function.Function<Object, Object>, java.util.function.IntUnaryOperator {
    @Override
    default Object apply(Object value) {
        return applyAsInt((int) value);
    }

    static java.util.function.IntUnaryOperator from(java.util.function.Function<Object, Object> function) {
        if (function == null) return null;
        if (function instanceof __IntFn specialized) return specialized;
        return value -> (int) function.apply(value);
    }
}
