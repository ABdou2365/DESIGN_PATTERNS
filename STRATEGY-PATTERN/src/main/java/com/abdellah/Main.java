package com.abdellah;

public class Main {

    // JUST A SIMPLE EXAMPLE OF THE STRATEGY PATTERN

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new DefaultStrategy());
        context.perform();
        context.setStrategy(new AdvancedStrategy());
        context.perform();
        context.setStrategy(new BasicStrategy());
        context.perform();
    }
}