package com.company.Strategy;

public class Therapist implements InspectStrategy{

    public Therapist() {
    }

    @Override
    public void inspect(Patient patient) {
        System.out.println("Therapist is inspecting " + patient.getName() + ".");
        //inspecting process
    }
}
