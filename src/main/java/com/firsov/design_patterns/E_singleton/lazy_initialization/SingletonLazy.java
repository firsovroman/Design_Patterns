package com.firsov.design_patterns.E_singleton.lazy_initialization;

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

