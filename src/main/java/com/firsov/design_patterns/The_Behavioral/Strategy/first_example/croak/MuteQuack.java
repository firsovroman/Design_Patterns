package com.firsov.design_patterns.The_Behavioral.Strategy.first_example.croak;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silance");
    }
}
