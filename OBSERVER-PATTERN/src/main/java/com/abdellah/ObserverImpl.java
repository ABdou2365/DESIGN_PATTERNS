package com.abdellah;

public class ObserverImpl implements Observer {

    @Override
    public void update(Observable observable) {
        System.out.println("############## - Default Observer - ##############");
        System.out.println("######## Observer" + observable.getClass().getSimpleName()
                + " changed his state = " + ((ObservableImpl)observable).getState());
    }
}
