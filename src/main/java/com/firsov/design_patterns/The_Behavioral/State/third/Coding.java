package com.firsov.design_patterns.The_Behavioral.State.third;

public class Coding extends Activity {

    Coding(Developer developer) {
        super(developer);
    }

    @Override
    public void justDoIt() {
        System.out.println("Writing code...");
        developer.changeActivity(new Reading(developer));
    }

}
