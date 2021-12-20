package com.firsov.design_patterns.generative_AbstractFactory.firstexample.website;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project");
    }
}
