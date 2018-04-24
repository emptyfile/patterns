package com.company.Command;

public class EndWorkDay implements Action{
    private Doctor doctor;

    public EndWorkDay(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void execute() {
        doctor.endDay();
    }
}
