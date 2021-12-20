package com.firsov.design_patterns.Generative.AbstractFactory.firstexample.website;

import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project");
    }
}
