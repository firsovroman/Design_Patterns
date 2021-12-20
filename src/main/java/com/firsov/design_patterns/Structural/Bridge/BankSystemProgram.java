package com.firsov.design_patterns.Structural.Bridge;

public class BankSystemProgram extends Program{

    protected BankSystemProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
