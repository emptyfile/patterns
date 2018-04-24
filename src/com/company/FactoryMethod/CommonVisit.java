package com.company.FactoryMethod;

public class CommonVisit implements Visit {
    @Override
    public void getInfo() {
        System.out.println("Common Visit");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
