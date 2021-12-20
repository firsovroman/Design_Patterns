package com.firsov.design_patterns.Generative.AbstractFactory.firstexample.website;

import com.firsov.design_patterns.Generative.AbstractFactory.firstexample.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests wbsite...");
    }
}
