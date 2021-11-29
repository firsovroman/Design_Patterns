package com.firsov.design_patterns.D_abstractFactory.firstexample.website;

import com.firsov.design_patterns.D_abstractFactory.firstexample.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper writes php code...");
    }
}