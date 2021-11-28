package com.firsov.design_patterns.abstractFactory.firstexample.banking;

import com.firsov.design_patterns.abstractFactory.firstexample.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
