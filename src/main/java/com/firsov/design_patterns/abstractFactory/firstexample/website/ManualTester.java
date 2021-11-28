package com.firsov.design_patterns.abstractFactory.firstexample.website;

import com.firsov.design_patterns.abstractFactory.firstexample.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests wbsite...");
    }
}
