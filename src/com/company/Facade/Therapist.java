package com.company.Facade;

public class Therapist extends Doctor {
    @Override
    public String name() {
        return "Therapist";
    }

    @Override
    public String treat() {
        return "treating patients";
    }
}
