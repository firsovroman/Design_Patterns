package com.firsov.design_patterns.generative_AbstractFactory.firstexample;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.website.WebsiteTeamFactory;

// Клиент пользуется исключительно интерфейсами

public class AuctionSiteProjectClient {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        // Можно заменить WebsiteTeamFactory на BankingTeamFactory и в результате
        // изменится все сеймейство объектов получаемых ниже.

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating AuctionSite project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();

    }

}
