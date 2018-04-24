package com.company.Bridge;

public class Surgeon implements IDoctor{
    @Override
    public void treat() {
        System.out.println("I kut leg off");
    }
}
