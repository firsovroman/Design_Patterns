package com.firsov.design_patterns.The_Behavioral.Strategy.first_example.croak;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
