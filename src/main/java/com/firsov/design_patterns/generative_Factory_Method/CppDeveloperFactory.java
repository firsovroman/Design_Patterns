package com.firsov.design_patterns.generative_Factory_Method;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

}
