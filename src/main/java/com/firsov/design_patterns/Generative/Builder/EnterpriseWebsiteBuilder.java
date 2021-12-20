package com.firsov.design_patterns.Generative.Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESSCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
