package com.company.Observer;

public class Patient implements Observer {

    private String name;
    private Observable doctor = null;

    public Patient(String name, Observable doctor) {
        this.doctor = doctor;
        this.name = name;
        doctor.addObserver(this);
    }

    @Override
    public void update(boolean onWork) {
        if (onWork == true) {
            System.out.println(name + " recieved: " + "Doctor now is on work");
        }
        else System.out.println(name + " recieved: " + "Doctor is not on work");
    }
}
