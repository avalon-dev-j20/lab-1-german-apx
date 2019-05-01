package ru.avalon.java.j20.labs.models;

public final class Numbers {

    private Numbers() {

    }

    public static <T extends Number> double sum(T[] values) {
        double sum = 0;
        for (T value : values) sum += value.doubleValue();
        return sum;
    }

    public static <T extends Number> double avg(T[] values) {
        return sum(values) / values.length;
    }

    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    public static <T extends Number> T max(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    public static <T extends Number> T min(T a, T b) {
        return a.doubleValue() < b.doubleValue() ? a : b;
    }

    public static <T extends Number> T min(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}