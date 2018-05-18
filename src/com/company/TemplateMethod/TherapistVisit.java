package com.company.TemplateMethod;

public class TherapistVisit extends VisitTemplate {
    @Override
    protected void sayConclusion() {
        System.out.println("Therapist gives patient his final conclusion.");
    }

    @Override
    protected void inspectPatient() {
        System.out.println("Therapist is inspecting the patient.");
    }
}
