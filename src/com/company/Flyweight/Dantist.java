package com.company.Flyweight;

public class Dantist implements ITreat {
    private static final String  NAME = "Lomay Zub Georgievich";
    @Override
    public void treat() {
        System.out.println( NAME + " treats you. "+ System.identityHashCode(this));
    }
}
