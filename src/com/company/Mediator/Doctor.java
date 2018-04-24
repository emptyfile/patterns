package com.company.Mediator;

public abstract class Doctor {
    private Mediator mediator;

    public Doctor(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message, Doctor reciever){
        mediator.send(message, reciever);
    }

    public Mediator getMediator() {
        return mediator;
    }
    public abstract void recieve(String message);
}
