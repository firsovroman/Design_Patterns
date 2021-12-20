package com.firsov.design_patterns.the_behavioral_Observer;

public class ClientJobSearch {


    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("first position");
        jobSite.addVacancy("second position");

        Observer firstSubscriber = new Subscriber("Ivan");
        Observer secondSubscriber = new Subscriber("Petr");

        jobSite.subscribers.add(firstSubscriber);
        jobSite.subscribers.add(secondSubscriber);

        jobSite.addVacancy("third position");

        jobSite.removeVacancy("first position");
    }

}
