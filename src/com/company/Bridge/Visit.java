package com.company.Bridge;

public abstract class Visit implements IVisitable {
    private IDoctor doctor;
    public abstract void visitDoctor();

    public Visit(IDoctor doctor) {
        this.doctor = doctor;
    }

    public IDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }
}
