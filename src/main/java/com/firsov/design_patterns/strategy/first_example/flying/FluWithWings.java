package com.firsov.design_patterns.strategy.first_example.flying;

public class FluWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can Fly");
    }
}
