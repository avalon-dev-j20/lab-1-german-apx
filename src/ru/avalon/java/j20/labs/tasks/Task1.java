package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

public class Task1 implements Task {


    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();


    @Override
    public void run() {

        int[] array = arrayFactory.getInstance(20);

        Number[] objArray = new Number[array.length];
        int i = 0;
        for (int value : array) {
            objArray[i++] = value;
        }

        int min = Numbers.min(objArray).intValue();
        int max = Numbers.max(objArray).intValue();
        double avg = Numbers.avg(objArray);

    }
