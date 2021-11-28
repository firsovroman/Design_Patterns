package com.firsov.design_patterns.D_abstractFactory.firstexample.website;

import com.firsov.design_patterns.D_abstractFactory.firstexample.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project");
    }
}
