package com.abdellah;

public class BasicStrategy implements Strategy {
    @Override
    public void apply() {
        System.out.println("############## - Basic Strategy is executed - ############");
    }
}
