package com.abdellah;

public class Main {
    public static void main(String[] args) {


        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverMoyenImpl();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setState(10);
        observable.setState(20);


    }
}