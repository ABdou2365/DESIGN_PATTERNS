package com.abdellah.Decorators;

import com.abdellah.boissons.Boisson;

// Décorateur concret : ajoute du Caramel
public class CaramelDecorator extends DecorateurBoisson {

    public CaramelDecorator(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.5;
    }
}
