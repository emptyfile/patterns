package com.company.Bridge;

public class Dentist implements IDoctor{
    @Override
    public void treat() {
        System.out.println("I pull out your teeth");
    }
}
