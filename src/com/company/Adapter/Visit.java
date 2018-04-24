package com.company.Adapter;

public abstract class Visit  {
    private String name;
    private String doctor;

    public Visit() {
    }

    public Visit(String name, String doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
