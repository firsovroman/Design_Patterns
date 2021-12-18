package com.firsov.design_patterns.L_state.third;

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
