package com.company.AbstractFactory;

public class CommonRequestType implements RequestType {
    @Override
    public void getInfo() {
        System.out.println("Common Request Type");
    }
}
