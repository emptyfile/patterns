package com.company.Observer;

import java.util.ArrayList;

public class Doctor implements Observable{
    private ArrayList<Observer> clients = new ArrayList<Observer>();

    private boolean onWork = true;

    public boolean isOnWork() {
        return onWork;
    }

    public void setOnWork(boolean onWork) {
        this.onWork = onWork;
        notifyObserver(onWork);
    }


    @Override
    public void addObserver(Observer o) {
        clients.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        clients.remove(o);
    }

    @Override
    public void notifyObserver(boolean onWork) {
        for (Observer client : clients) {
            client.update(onWork);
        }
    }
}
