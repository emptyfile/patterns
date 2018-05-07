package com.company.Observer;

public interface Observable {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver(boolean onWork);
}
