package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

public class Task4 implements Task {

    @Override
    public void run() {
        Person a = new Person("Василий", "Петров");
        Person b = new Person("Василий", "Петров");
        boolean isEqual = a.equals(b);

    }
}