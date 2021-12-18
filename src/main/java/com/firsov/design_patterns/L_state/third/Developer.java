package com.firsov.design_patterns.L_state.third;

public class Developer {

    Activity activity;

    public void changeActivity(Activity activity) {
        this.activity = activity;
    }

    public void justDoIt() {
        activity.justDoIt();
    }

}
