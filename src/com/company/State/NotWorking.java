package com.company.State;

public class NotWorking implements State {
    @Override
    public void action(Doctor doctor) {
        System.out.println("Doctor is not working.");
        doctor.setState(this);
    }
}
