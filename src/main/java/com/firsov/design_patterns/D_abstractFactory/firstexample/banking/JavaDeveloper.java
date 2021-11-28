package com.firsov.design_patterns.D_abstractFactory.firstexample.banking;

import com.firsov.design_patterns.D_abstractFactory.firstexample.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
