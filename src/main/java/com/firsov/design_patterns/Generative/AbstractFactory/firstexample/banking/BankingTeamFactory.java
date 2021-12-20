package com.firsov.design_patterns.Generative.AbstractFactory.firstexample.banking;

import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Developer;
import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Manager;
import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Tester;

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
