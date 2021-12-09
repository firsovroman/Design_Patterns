package com.firsov.design_patterns.I_template_method;

public class WebsiteRunnerClient {
    public static void main(String[] args) {

        // до реализации паттерна
//        WelcomePage welcomePage = new WelcomePage();
//        NewsPage newsPage = new NewsPage();
//
//        welcomePage.showPage();
//        System.out.println("================================================================");
//        newsPage.showPage();

        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("==================================================================");
        welcomePage.showPage();
    }
}
