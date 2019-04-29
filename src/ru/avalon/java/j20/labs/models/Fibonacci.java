package ru.avalon.java.j20.labs.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci implements Iterable<Integer> {

    public static List<Integer> fibonList = new ArrayList<>();

    public static int[] fibonArray;

    public Fibonacci(int size) {
        fibonArray = fibonInitializer(size);
        for (int i : fibonArray) {
            fibonList.add(i);
        }
    }

    private int[] fibonInitializer(int ind) {
        int[] array = new int[ind];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array;
    }

    private static class FibonacciIterator implements Iterator<Integer> {

        private int index = -1;

        @Override
        public boolean hasNext() {
            return next() != null;
        }

        @Override
        public Integer next() {
            index++;
            return index < fibonArray.length ? fibonArray[index + 1] : null;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}