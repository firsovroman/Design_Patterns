package com.firsov.design_patterns.strategy.first_example.Ducks;

import com.firsov.design_patterns.strategy.first_example.croak.Quack;
import com.firsov.design_patterns.strategy.first_example.flying.FlyNoWay;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'am ModelDuck!");
    }
}
