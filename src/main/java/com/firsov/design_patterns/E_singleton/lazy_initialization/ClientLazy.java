package com.firsov.design_patterns.E_singleton.lazy_initialization;

public class ClientLazy {
    public static void main(String[] args){
        SingletonLazy sigton = SingletonLazy.getInstance();
        SingletonLazy sigton2 = SingletonLazy.getInstance();

        System.out.println(sigton == sigton2);
    }
}
