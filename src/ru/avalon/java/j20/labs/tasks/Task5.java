package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashSet;


public class Task5 implements Task {

    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    @Override
    public void run() {
        final int[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

    for (int i : array) {
            list.add(i);
            set.add(i);
        }
    }
}