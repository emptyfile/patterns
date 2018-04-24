package com.company.AbstractFactory;

public class CommonDoctorType implements DoctorType {
    @Override
    public void getDoctorType() {
        System.out.println("Common Doctor type");
    }
}
