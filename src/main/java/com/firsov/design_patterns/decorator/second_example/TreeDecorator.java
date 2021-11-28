package com.firsov.design_patterns.decorator.second_example;

// Абстрактный класс для реализации декоратора
public class TreeDecorator implements ChristmasTree{

    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
