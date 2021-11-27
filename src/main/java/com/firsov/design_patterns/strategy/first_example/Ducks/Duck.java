package com.firsov.design_patterns.strategy.first_example.Ducks;

import com.firsov.design_patterns.strategy.first_example.flying.FlyBehavior;
import com.firsov.design_patterns.strategy.first_example.croak.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();


    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can float!");
    }



    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
