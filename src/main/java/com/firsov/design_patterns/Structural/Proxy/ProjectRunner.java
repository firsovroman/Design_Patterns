package com.firsov.design_patterns.Structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        System.out.println();
        Project project = new RealProject("https://www.github.com/romanfirsov/realProject");
        System.out.println("=============");
        project.run();

        System.out.println();
        System.out.println();
        System.out.println();


        Project project2 = new ProxyProject("https://www.github.com/romanfirsov/realProject");
        System.out.println("=============");
        project2.run();

    }
}
