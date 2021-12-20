package com.firsov.design_patterns.The_Behavioral.State.third;

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
