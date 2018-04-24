package com.company.Mediator;

import java.util.ArrayList;

public class Doctorgram implements Mediator {
    private ArrayList<Doctor> doctors;

    public Doctorgram() {
        doctors = new ArrayList<Doctor>();
    }

    public void add(Doctor doctor){
        doctors.add(doctor);
    }

    @Override
    public void send(String message, Doctor reciever) {
        reciever.recieve(message);
    }
}
