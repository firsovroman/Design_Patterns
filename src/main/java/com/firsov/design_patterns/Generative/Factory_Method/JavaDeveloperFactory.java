package com.firsov.design_patterns.Generative.Factory_Method;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
