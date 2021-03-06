package com.firsov.design_patterns.Structural.Decorator.first_example;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeMeeting() {
        return " Make meeting.";
    }


    public String makeJob() {
        return super.makeJob() + makeMeeting();
    }


}
