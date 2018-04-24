package com.company.Mediator;

public class Therapist extends Doctor {


    public Therapist(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Therapist recieved: " + message);
    }
}
