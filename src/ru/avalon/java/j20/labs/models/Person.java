package ru.avalon.java.j20.labs.models;

import java.util.Objects;

public class Person {

    private final String NAME;
    private final String SURNAME;

    public Person(String name, String surname) {
        this.NAME = name;
        this.SURNAME = surname;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Person) {
            Person otherPerson = (Person) otherObject;
            return NAME.equals(otherPerson.NAME) && SURNAME.equals(otherPerson.SURNAME);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, SURNAME);
    }
}