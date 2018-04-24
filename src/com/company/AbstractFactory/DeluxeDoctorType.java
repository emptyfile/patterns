package com.company.AbstractFactory;

public class DeluxeDoctorType implements DoctorType {
    @Override
    public void getDoctorType() {
        System.out.println("Deluxe Doctor Type");
    }
}
