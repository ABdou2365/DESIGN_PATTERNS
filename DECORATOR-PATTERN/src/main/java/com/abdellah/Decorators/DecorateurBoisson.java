package com.abdellah.Decorators;

import com.abdellah.boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {

    Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();

    public abstract double cout();
}
