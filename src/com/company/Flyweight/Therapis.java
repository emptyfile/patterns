package com.company.Flyweight;

public class Therapis implements ITreat {
    private static final String NAME = "Lechit Ivan Alexandrovich";
    @Override
    public void treat() {
        System.out.println(NAME + " treats you " + System.identityHashCode(this));
    }
}
