package com.firsov.design_patterns.C_decorator.second_example;

// Класс реализующий интерфейс (всегда выполняется этот класс плюс надстройка)

public class ChristmasTreeImpl implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}