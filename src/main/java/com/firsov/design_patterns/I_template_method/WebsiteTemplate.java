package com.firsov.design_patterns.I_template_method;

public abstract class WebsiteTemplate {

    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();

}
