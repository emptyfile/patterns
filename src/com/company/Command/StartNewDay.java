package com.company.Command;

public class StartNewDay implements Action {
    private Doctor doctor;

    public StartNewDay(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void execute() {
        doctor.startDay();
    }
}
