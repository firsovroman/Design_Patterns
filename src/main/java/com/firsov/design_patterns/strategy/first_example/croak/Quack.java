package com.firsov.design_patterns.strategy.first_example.croak;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
