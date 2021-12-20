package com.firsov.design_patterns.the_behavioral_State.third;

public abstract class Activity {

    Developer developer;

    Activity(Developer developer) {
        this.developer = developer;
    }

    abstract void justDoIt();

}
