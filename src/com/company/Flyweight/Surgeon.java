package com.company.Flyweight;

public class Surgeon implements ITreat {
    private static final String NAME = "Rezh Nogu Valerievich";
    @Override
    public void treat() {
        System.out.println(NAME + " is your surgeon. "+ System.identityHashCode(this));
    }


}
