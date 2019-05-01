package ru.avalon.java.j20.labs.models;

public class Point<T extends Number> {

    private final T X;
    private final T Y;

    public Point(T X, T Y) {
        this.X = X;
        this.Y = Y;
    }

    public T getX() {
        return X;
    }

    public T getY() {
        return Y;
    }

    public double distanceTo(Point point) {
        double dx = X.doubleValue() - point.X.doubleValue();
        double dy = Y.doubleValue() - point.Y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}