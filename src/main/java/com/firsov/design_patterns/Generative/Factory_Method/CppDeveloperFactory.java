package com.firsov.design_patterns.Generative.Factory_Method;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

}
