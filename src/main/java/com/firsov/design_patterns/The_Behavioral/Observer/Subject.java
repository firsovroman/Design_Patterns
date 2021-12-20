package com.firsov.design_patterns.The_Behavioral.Observer;

public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();


}
