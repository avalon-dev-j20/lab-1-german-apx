package ru.avalon.java.j20.labs.models;
import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

    private int n;
        public Fibonacci(int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Число должно быть больше 0!");
            }
            this.n = n;
        }

    private class FibonacciIterator implements Iterator<Integer> {

        private int first = 0;
        private int second = 1;
        private int i;
        private int sum;

        @Override
            public boolean hasNext() {
                return i < n;
            }

        @Override
            public Integer next() {
                i++;
                if (i == 1) {
                    return 0;
                } else if (i == 2) {
                    return 1;
                }
                sum = first + second;
                first = second;
                second = sum;
                return sum;
            }
    }

        @Override

            public Iterator<Integer> iterator() {
                return new FibonacciIterator();
            }
}