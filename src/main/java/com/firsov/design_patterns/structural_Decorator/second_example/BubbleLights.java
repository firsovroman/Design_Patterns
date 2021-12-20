package com.firsov.design_patterns.structural_Decorator.second_example;


//// Реализация декоратора №1
public class BubbleLights extends TreeDecorator{


    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }

}
