package com.firsov.design_patterns.Structural.Bridge;

public abstract class Program {

    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();


}