package com.abdellah;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl  implements Observable {

    private int state;

    private List<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
