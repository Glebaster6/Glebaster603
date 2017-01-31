package com.company;

/**
 * Created by Admin on 30.01.2017.
 */
public interface Observable {

    void addObserver (Observer observer);

    void notifyObserver (Object argument);

}
