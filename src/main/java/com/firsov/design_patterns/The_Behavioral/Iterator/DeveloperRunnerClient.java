package com.firsov.design_patterns.The_Behavioral.Iterator;

public class DeveloperRunnerClient {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "MySQL"};


        JavaDeveloper javaDeveloper = new JavaDeveloper("Roman Firsov", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }


    }

}
