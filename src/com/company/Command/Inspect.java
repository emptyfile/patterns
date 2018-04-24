package com.company.Command;

public class Inspect implements Action {
    private Doctor doctor;

    public Inspect(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void execute() {
        doctor.inspection();
    }
}
