package com.company.TemplateMethod;

public class OtolaryngologistVisit extends VisitTemplate {
    @Override
    protected void sayConclusion() {
        System.out.println("OtolaryngologistVisit gives patient his final conclusion.");
    }

    @Override
    protected void inspectPatient() {
        System.out.println("OtolaryngologistVisit is inspecting the patient.");
    }
}
