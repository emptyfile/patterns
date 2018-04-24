package com.company.AbstractFactory;

public class TimeRequestType implements RequestType {

    @Override
    public void getInfo() {
        System.out.println("Time Request Type");
    }
}
