package com.firsov.design_patterns.Generative.Factory_Method;



public class Program {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperFactoryBySpectialty("java");

        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static  DeveloperFactory createDeveloperFactoryBySpectialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else  if(specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }


    }

}
