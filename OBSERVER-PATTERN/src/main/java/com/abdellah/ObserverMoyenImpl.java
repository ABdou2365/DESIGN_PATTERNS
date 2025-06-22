package com.abdellah;

public class ObserverMoyenImpl implements Observer {

    @Override
    public void update(Observable observable) {
        System.out.println("############## - Average Observer - ##############");
        System.out.println("######## Observer" + observable.getClass().getSimpleName()
                + " changed his state = " + (((ObservableImpl)observable).getState()/2));
    }
}
