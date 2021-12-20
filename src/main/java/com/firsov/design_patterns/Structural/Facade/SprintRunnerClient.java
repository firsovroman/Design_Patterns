package com.firsov.design_patterns.Structural.Facade;

public class SprintRunnerClient {
    public static void main(String[] args) {


        //without facade
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);



        //using facade
        WorkflowFacade workflowFacade = new WorkflowFacade();
        workflowFacade.solveProblems();

    }
}
