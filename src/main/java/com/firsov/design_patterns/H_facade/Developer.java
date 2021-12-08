package com.firsov.design_patterns.H_facade;

public class Developer {

    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else {
            System.out.println("Developer is reading habrahabr...");
        }
    }

}
