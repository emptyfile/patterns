package com.company.Proxy;

public class Patient {
    private final String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient " + name;
    }
}
