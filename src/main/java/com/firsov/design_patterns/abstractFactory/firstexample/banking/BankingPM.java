package com.firsov.design_patterns.abstractFactory.firstexample.banking;

import com.firsov.design_patterns.abstractFactory.firstexample.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking project...");
    }
}
