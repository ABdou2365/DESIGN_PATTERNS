package com.abdellah.boissons;

public class Moca extends Boisson {

    public Moca() {
        description="Moca";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cout() {
        return 13;
    }
}
