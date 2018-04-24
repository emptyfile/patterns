package com.company.Command;

public class Surgery implements Action {
    private Doctor doctor;

    public Surgery(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void execute() {
        doctor.surgery();
    }
}
