package com.firsov.design_patterns.generative_AbstractFactory.firstexample.website;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Developer;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Manager;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
