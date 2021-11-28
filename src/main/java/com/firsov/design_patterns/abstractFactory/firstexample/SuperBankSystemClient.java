package com.firsov.design_patterns.abstractFactory.firstexample;

import com.firsov.design_patterns.abstractFactory.firstexample.banking.BankingTeamFactory;

public class SuperBankSystemClient {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
