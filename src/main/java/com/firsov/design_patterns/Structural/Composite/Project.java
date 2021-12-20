package com.firsov.design_patterns.Structural.Composite;



public class Project {
    public static void main(String[] args) {

        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        SubTeamOfJavaDeveloper subTeamOfJavaDeveloper = new SubTeamOfJavaDeveloper();
        subTeamOfJavaDeveloper.addDeveloper(firstJavaDeveloper);
        subTeamOfJavaDeveloper.addDeveloper(secondJavaDeveloper);

        team.addDeveloper(cppDeveloper);
        team.addDeveloper(subTeamOfJavaDeveloper);

        team.writeCode();

    }
}
