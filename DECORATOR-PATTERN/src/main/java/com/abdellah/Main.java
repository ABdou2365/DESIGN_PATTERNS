package com.abdellah;

import com.abdellah.Decorators.CaramelDecorator;
import com.abdellah.Decorators.ChocolatDecorator;
import com.abdellah.boissons.Boisson;
import com.abdellah.boissons.Espresso;

public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------");
        boisson = new ChocolatDecorator(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------");
        boisson = new CaramelDecorator(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}