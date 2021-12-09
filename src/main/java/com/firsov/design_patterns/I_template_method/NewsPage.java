package com.firsov.design_patterns.I_template_method;

public class NewsPage extends WebsiteTemplate{

    // до реализации паттерна
//    public void showPage() {
//        System.out.println("Header");
//        System.out.println("News");
//        System.out.println("Footer");
//    }

    @Override
    public void showPageContent() {
        System.out.println("News");
    }

}
