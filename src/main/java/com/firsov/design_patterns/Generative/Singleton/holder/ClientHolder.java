package com.firsov.design_patterns.Generative.Singleton.holder;

public class ClientHolder {
    public static void main(String[] args){
        Singleton sigton = Singleton.getInstance();
        Singleton sigton2 = Singleton.getInstance();

        System.out.println(sigton == sigton2);
    }
}
