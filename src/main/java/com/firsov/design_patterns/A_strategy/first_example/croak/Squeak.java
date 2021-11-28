package com.firsov.design_patterns.A_strategy.first_example.croak;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
