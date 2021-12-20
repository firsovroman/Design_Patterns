package com.firsov.design_patterns.Structural.Decorator.second_example;


// Реализация декоратора №2
public class Garland extends TreeDecorator{
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }

}
