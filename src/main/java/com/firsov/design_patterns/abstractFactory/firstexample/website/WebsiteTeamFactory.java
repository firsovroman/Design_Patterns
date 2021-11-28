package com.firsov.design_patterns.abstractFactory.firstexample.website;

import com.firsov.design_patterns.abstractFactory.firstexample.Developer;
import com.firsov.design_patterns.abstractFactory.firstexample.Manager;
import com.firsov.design_patterns.abstractFactory.firstexample.ProjectTeamFactory;
import com.firsov.design_patterns.abstractFactory.firstexample.Tester;

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
