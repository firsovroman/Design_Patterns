package com.firsov.design_patterns.abstractFactory.firstexample.banking;

import com.firsov.design_patterns.abstractFactory.firstexample.Developer;
import com.firsov.design_patterns.abstractFactory.firstexample.Manager;
import com.firsov.design_patterns.abstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.abstractFactory.firstexample.Tester;

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
