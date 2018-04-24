package com.company.Command;

public class Doctor {
    private String name = "Surgent";

    public void startDay(){
        System.out.println(name + " started his working day.");
    }

    public void endDay(){
        System.out.println(name + " ended his working day.");
    }

    public void inspection(){
        System.out.println(name + " is inspecting a patient.");
    }

    public void surgery(){
        System.out.println(name + " is making a surgery.");
    }
}
