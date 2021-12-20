package com.firsov.design_patterns.Generative.AbstractFactory.firstexample;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    Manager getManager();

}
