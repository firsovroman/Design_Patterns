package com.firsov.design_patterns.the_behavioral_Observer;

public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();


}
