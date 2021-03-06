package com.firsov.design_patterns.Structural.Decorator.first_example;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }


    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

}
