package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

public class Task2 implements Task {

    @Override
    public void run() {

        Point a = new Point(5.f, 7.f);
        Point b = new Point(2, 6);
        double length = a.distanceTo(b);

    }
}
