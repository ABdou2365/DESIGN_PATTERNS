package com.abdellah.boissons;

// Composant concret
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
