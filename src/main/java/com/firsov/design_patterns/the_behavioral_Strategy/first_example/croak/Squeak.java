package com.firsov.design_patterns.the_behavioral_Strategy.first_example.croak;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
