package com.company.Flyweight;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        registry.createVisit(DoctorsOffice.C322).treat();
        registry.createVisit(DoctorsOffice.C340).treat();
        registry.createVisit(DoctorsOffice.C420).treat();
        registry.createVisit(DoctorsOffice.C420).treat();
        registry.createVisit(DoctorsOffice.C340).treat();
        registry.createVisit(DoctorsOffice.C322).treat();
    }
}
