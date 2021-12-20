package com.firsov.design_patterns.generative_AbstractFactory.firstexample;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    Manager getManager();

}
