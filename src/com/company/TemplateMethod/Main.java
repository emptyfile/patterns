package com.company.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        VisitTemplate visitType = new TherapistVisit();
        visitType.makeVisit();

        System.out.println("*********************");

        visitType = new OtolaryngologistVisit();
        visitType.makeVisit();
    }
}
