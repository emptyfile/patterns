package com.company.State;

public class Inspecting implements State {
    @Override
    public void action(Doctor doctor) {
        System.out.println("Doctor is inspecting patients.");
        doctor.setState(this);
    }
}
