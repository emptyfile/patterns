package com.company.Decorator;

public class SimpeDoctor implements Doctor{

    public SimpeDoctor() {
    }

    @Override
    public String treat() {
        return "Casual doctor treats you";
    }

    @Override
    public int getDoctorsPrice() {
        return 0;
    }

    @Override
    public int getDoctorsSalary() {
        return 5000;
    }
}
