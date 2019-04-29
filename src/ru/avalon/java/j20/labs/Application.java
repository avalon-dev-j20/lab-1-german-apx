package ru.avalon.java.j20.labs;

import ru.avalon.java.j20.labs.tasks.*;

public class Application {

    private static final Task[] TASKS = {
            new Task1(),
            new Task2(),
            new Task3(),
            new Task4(),
            new Task5()
    };

    public static void main(String[] args) {

        for (Task task : TASKS) {
            task.run();
        }

    }
}