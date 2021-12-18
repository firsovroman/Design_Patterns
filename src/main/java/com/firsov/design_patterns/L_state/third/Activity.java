package com.firsov.design_patterns.L_state.third;

public abstract class Activity {

    Developer developer;

    Activity(Developer developer) {
        this.developer = developer;
    }

    abstract void justDoIt();

}
