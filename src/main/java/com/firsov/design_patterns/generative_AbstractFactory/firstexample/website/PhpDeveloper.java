package com.firsov.design_patterns.generative_AbstractFactory.firstexample.website;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper writes php code...");
    }
}
