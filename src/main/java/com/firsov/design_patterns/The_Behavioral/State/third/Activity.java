package com.firsov.design_patterns.The_Behavioral.State.third;

public abstract class Activity {

    Developer developer;

    Activity(Developer developer) {
        this.developer = developer;
    }

    abstract void justDoIt();

}
