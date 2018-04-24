package com.company.Mediator;

public class Surgeon extends Doctor {

    public Surgeon(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Surgeon recieved: " + message);
    }
}
