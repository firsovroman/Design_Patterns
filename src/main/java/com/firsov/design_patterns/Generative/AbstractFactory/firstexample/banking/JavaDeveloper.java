package com.firsov.design_patterns.Generative.AbstractFactory.firstexample.banking;

import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
