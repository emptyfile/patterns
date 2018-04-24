package com.company.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VisitFactory commonVisit = FactoryMaker.makeFactory("Common Visit");
        commonVisit.getDoctorType().getDoctorType();
        commonVisit.getRequestType().getInfo();
        VisitFactory deluxeVisit = FactoryMaker.makeFactory("Deluxe Visit");
        deluxeVisit.getRequestType().getInfo();
        deluxeVisit.getDoctorType().getDoctorType();
    }
}
