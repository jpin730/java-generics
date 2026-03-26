package dev.jpineda;

public class MathUtils {
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
