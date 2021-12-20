package com.firsov.design_patterns.generative_Singleton.holder;

public class Singleton {
    private Singleton() {
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
