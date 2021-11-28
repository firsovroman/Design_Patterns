package com.firsov.design_patterns.A_strategy.first_example.croak;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silance");
    }
}
