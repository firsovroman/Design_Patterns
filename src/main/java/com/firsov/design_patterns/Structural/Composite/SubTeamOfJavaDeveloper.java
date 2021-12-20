package com.firsov.design_patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class SubTeamOfJavaDeveloper implements Developer{

    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("SubTeam creates project...");
        for(Developer developer : developers) {
            developer.writeCode();
        }
    }
}
