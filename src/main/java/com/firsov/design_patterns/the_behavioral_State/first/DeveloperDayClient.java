package com.firsov.design_patterns.the_behavioral_State.first;

public class DeveloperDayClient {

    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for(int i =0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }

    }

}
