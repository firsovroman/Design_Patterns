package com.firsov.design_patterns.D_abstractFactory.firstexample.banking;

import com.firsov.design_patterns.D_abstractFactory.firstexample.Developer;
import com.firsov.design_patterns.D_abstractFactory.firstexample.Manager;
import com.firsov.design_patterns.D_abstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.D_abstractFactory.firstexample.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
