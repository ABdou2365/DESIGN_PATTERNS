package com.abdellah;

public class DefaultStrategy implements Strategy {
    @Override
    public void apply() {
        System.out.println("the default strategy is executed");
    }
}
