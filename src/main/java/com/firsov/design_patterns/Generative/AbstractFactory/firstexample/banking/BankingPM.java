package com.firsov.design_patterns.Generative.AbstractFactory.firstexample.banking;

import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking project...");
    }
}
