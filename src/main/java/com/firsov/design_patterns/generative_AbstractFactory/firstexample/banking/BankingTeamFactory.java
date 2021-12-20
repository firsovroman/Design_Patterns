package com.firsov.design_patterns.generative_AbstractFactory.firstexample.banking;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Developer;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Manager;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Tester;

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
