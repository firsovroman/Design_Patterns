package com.firsov.design_patterns.Q_bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes Cpp code...");
    }
}
