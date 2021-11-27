package com.firsov.design_patterns.strategy.first_example.flying;

public class FlyRocket implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
