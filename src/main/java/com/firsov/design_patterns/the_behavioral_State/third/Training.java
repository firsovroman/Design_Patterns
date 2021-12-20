package com.firsov.design_patterns.the_behavioral_State.third;

public class Training extends Activity {

    Training(Developer developer) {
        super(developer);
    }

    @Override
    public void justDoIt() {
        System.out.println("Training...");
        developer.changeActivity(new Coding(developer));
    }
}
