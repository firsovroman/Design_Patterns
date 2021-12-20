package com.firsov.design_patterns.generative_AbstractFactory.firstexample.banking;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
