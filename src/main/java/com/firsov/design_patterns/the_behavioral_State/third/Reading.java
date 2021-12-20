package com.firsov.design_patterns.the_behavioral_State.third;

public class Reading extends Activity {

    Reading(Developer developer) {
        super(developer);
    }

    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
        developer.changeActivity(new Sleeping(developer));
    }
}
