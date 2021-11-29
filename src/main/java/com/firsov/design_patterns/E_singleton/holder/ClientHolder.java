package com.firsov.design_patterns.E_singleton.holder;

import com.firsov.design_patterns.E_singleton.lazy_initialization.SingletonLazy;

public class ClientHolder {
    public static void main(String[] args){
        Singleton sigton = Singleton.getInstance();
        Singleton sigton2 = Singleton.getInstance();

        System.out.println(sigton == sigton2);
    }
}
