package com.abdellah.Decorators;

import com.abdellah.boissons.Boisson;

public class ChocolatDecorator extends DecorateurBoisson {


    public ChocolatDecorator(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.5;
    }
}
