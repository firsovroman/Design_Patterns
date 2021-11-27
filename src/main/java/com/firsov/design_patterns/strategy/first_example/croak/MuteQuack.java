package com.firsov.design_patterns.strategy.first_example.croak;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silance");
    }
}
