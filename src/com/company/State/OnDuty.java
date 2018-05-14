package com.company.State;

public class OnDuty implements State{
    @Override
    public void action(Doctor doctor) {
        System.out.println("Docor is on duty.");
        doctor.changeState(this);
    }
}
