package com.firsov.design_patterns.strategy.first_example.flying;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
