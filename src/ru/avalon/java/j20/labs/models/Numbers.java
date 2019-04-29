package ru.avalon.java.j20.labs.models;

public final class Numbers {

    private Numbers() {
    }

    public static double sum(Number... values) {
        double sum = 0;
        for (Number value : values) {
            sum += value.doubleValue();
        }
        return sum;
    }

    public static double avg(Number... values) {
        return sum(values) / values.length;
    }

    public static Number max(Number a, Number b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    public static Number max(Number... values) {
        Number result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    public static Number min(Number a, Number b) {
        return a.doubleValue() < b.doubleValue() ? a : b;
    }

    public static Number min(Number... values) {
        Number result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}