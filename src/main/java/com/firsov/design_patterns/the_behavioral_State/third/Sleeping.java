package com.firsov.design_patterns.the_behavioral_State.third;

public class Sleeping extends Activity {

    Sleeping(Developer developer) {
        super(developer);
    }

    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
        developer.changeActivity(new Training(developer));
    }



}
