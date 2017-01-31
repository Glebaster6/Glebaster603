package com.company;

/**
 * Created by Admin on 30.01.2017.
 */
public class Entrance1 implements Observable{
    private Observer observer;


    public void enter (String name){
        notifyObserver(name);
    }

    @Override
    public void addObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver(Object argument) {
        observer.handle(argument);
    }
}
