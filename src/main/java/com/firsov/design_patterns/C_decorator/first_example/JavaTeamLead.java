package com.firsov.design_patterns.C_decorator.first_example;

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
