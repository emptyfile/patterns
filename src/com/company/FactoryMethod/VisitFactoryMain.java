package com.company.FactoryMethod;

public class VisitFactoryMain {
    public static void main(String[] args) {
        Visit commonVisit = VisitFactory.createVisit("Common Visit");
        commonVisit.getInfo();
        Visit timeVisit = VisitFactory.createVisit("Time Visit");
        timeVisit.getInfo();
    }
}
