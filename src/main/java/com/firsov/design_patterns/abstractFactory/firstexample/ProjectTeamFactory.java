package com.firsov.design_patterns.abstractFactory.firstexample;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    Manager getManager();

}
