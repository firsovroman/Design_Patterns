package com.firsov.design_patterns.D_abstractFactory.firstexample.website;

import com.firsov.design_patterns.D_abstractFactory.firstexample.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests wbsite...");
    }
}
