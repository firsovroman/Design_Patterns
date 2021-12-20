package com.firsov.design_patterns.the_behavioral_Strategy.first_example.flying;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
