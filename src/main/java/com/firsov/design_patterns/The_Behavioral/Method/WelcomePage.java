package com.firsov.design_patterns.The_Behavioral.Method;

public class WelcomePage extends WebsiteTemplate{

    // до реализации паттерна
//    public void showPage() {
//
//        System.out.println("Header");
//        System.out.println("Welcome");
//        System.out.println("Footer");
//
//    }

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }

}
