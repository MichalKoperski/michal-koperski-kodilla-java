package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworksStack implements Observable{
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String name;

    public HomeworksStack(String name) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
    }
    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public List<String> getHomeworks() {
        return homeworks;
    }
    public String getName() {
        return name;
    }
}
