package com.company.Proxy;

public class Therapist implements IDoctor {
    @Override
    public void treat(Patient patient) {
        System.out.println(patient + " visiting the therapist.");
    }
}
