package com.firsov.design_patterns.generative_AbstractFactory.firstexample;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.banking.BankingTeamFactory;


// Клиент пользуется исключительно интерфейсами

public class SuperBankSystemClient {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        // Можно заменить BankingTeamFactory на WebsiteTeamFactory и в результате
        // изменится все сеймейство объектов получаемых ниже.


        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
