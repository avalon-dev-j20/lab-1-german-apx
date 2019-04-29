package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

public class Task3 implements Task {

    @Override
    public void run() {

        Fibonacci viewFibonacci = new Fibonacci(20);

        int fiboArraySum = Arrays.stream(Fibonacci.fiboArray).sum();

    }
}