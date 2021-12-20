package com.firsov.design_patterns.Structural.Decorator.second_example;

// Класс реализующий интерфейс (всегда выполняется этот класс плюс надстройка)

public class ChristmasTreeImpl implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
