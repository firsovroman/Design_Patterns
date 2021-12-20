package com.firsov.design_patterns.Structural.Decorator.first_example;

public class Client {

    public static void main(String[] args) {

//        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
//        System.out.println(developer.makeJob());

        Developer developer2 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer2.makeJob());

    }

}
