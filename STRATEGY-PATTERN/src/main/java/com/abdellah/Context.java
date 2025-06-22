package com.abdellah;


public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void perform(){

        System.out.println("############## - Debut de l'operation - ############");
//        if (strategy == 1){
//            System.out.println("Strategy number 1 is executed");
//        } else if (strategy == 2) {
//            System.out.println("Strategy number 2 is executed");
//        }else if (strategy == 3) {
//            System.out.println("Strategy number 3 is executed");
//        }else {
//            System.out.println("the default strategy is executed");
//        }

        strategy.apply();

        System.out.println("############## - Fin de l'operation - ############");
    }
}
