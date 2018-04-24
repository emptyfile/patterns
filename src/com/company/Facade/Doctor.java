package com.company.Facade;

public abstract class Doctor {
    public void startWorkDay(){
        System.out.println(name() + " comes to work and starts " + treat() + ".");
    }
    public void endWorkDay(){
        System.out.println(name() + " ends " + treat() + " and goes home"+ ".");
    }
    public abstract String  name();

    public abstract String  treat();
}
