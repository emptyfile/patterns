package com.company.Strategy;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Igor");

        Therapist therapist = new Therapist();
        therapist.inspect(patient);

        Traumatologist traumatologist = new Traumatologist();
        traumatologist.inspect(patient);
    }
}
