package com.firsov.design_patterns.The_Behavioral.Strategy.first_example.Ducks;

import com.firsov.design_patterns.The_Behavioral.Strategy.first_example.croak.Quack;
import com.firsov.design_patterns.The_Behavioral.Strategy.first_example.flying.FluWithWings;

public class MallardDuck extends Duck{


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FluWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'am MallarDuck!");
    }


}
