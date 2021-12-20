package com.firsov.design_patterns.The_Behavioral.Strategy.first_example.flying;

public class FluWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can Fly");
    }
}
