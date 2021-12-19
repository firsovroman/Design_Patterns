package com.firsov.design_patterns.N_factory_method;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

}
