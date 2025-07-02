package com.abdellah.boissons;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cout() {
        return 12;
    }
}
