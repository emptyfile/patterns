package com.company.State;

public class Doctor {
    private State state;

    public void changeState(State state){
        setState(state);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
