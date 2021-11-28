package com.firsov.design_patterns.D_abstractFactory.firstexample;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    Manager getManager();

}
