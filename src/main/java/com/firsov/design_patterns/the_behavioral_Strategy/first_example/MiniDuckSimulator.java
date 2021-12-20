package com.firsov.design_patterns.the_behavioral_Strategy.first_example;

import com.firsov.design_patterns.the_behavioral_Strategy.first_example.Ducks.Duck;
import com.firsov.design_patterns.the_behavioral_Strategy.first_example.Ducks.ModelDuck;
import com.firsov.design_patterns.the_behavioral_Strategy.first_example.flying.FlyRocket;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocket()); // изменяем поведение утки переопределением переменной
        model.performFly();
    }
}
