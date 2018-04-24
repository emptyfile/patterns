package com.company.Decorator;

public class DeluxeDoctor implements Doctor{
    private Doctor decorated;

    public DeluxeDoctor(Doctor decorated) {
        this.decorated = decorated;
    }

    @Override
    public String treat() {
        return "Deluxe doctor treats you";
    }

    @Override
    public int getDoctorsPrice() {
        return 50;
    }

    @Override
    public int getDoctorsSalary() {
        return decorated.getDoctorsSalary()+(getDoctorsPrice()*240);
    }
}
