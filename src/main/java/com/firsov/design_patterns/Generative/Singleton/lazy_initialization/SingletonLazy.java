package com.firsov.design_patterns.Generative.Singleton.lazy_initialization;

public class SingletonLazy {

    private static SingletonLazy INSTANCE;
    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}

