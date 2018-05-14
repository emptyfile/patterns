package com.company.Strategy;

public class Traumatologist implements InspectStrategy{

    public Traumatologist() {
    }

    @Override
    public void inspect(Patient patient) {
        System.out.println("Traumatologist is inspecting " + patient.getName() + ".");
        //inspecting process
    }
}
