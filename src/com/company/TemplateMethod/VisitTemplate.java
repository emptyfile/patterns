package com.company.TemplateMethod;

public abstract class VisitTemplate {
    public final void makeVisit(){
        invitePatient();
        askAboutWeakness();
        inspectPatient();
        sayConclusion();
        System.out.println("Visit is done.");
    }

    protected abstract void sayConclusion();

    protected abstract void inspectPatient();

    private void askAboutWeakness() {
        System.out.println("Doctor ask`s patient about his weakness.");
    }

    private void invitePatient() {
        System.out.println("Doctor invite`s next patient from the queue.");
    }
}
