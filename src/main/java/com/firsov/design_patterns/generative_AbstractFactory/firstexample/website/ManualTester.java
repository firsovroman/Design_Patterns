package com.firsov.design_patterns.generative_AbstractFactory.firstexample.website;

import com.firsov.design_patterns.generative_AbstractFactory.firstexample.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests wbsite...");
    }
}
