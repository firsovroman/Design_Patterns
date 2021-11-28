package com.firsov.design_patterns.abstractFactory.firstexample;

import com.firsov.design_patterns.abstractFactory.firstexample.banking.BankingTeamFactory;
import com.firsov.design_patterns.abstractFactory.firstexample.website.WebsiteTeamFactory;

public class AuctionSiteProjectClient {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating AuctionSite project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();

    }

}
