package com.mi.practice.design.pattern.behavior.memento;

import java.util.ArrayList;

/**
 * Created by michelle on 16-3-12.
 * the object that knows why and when the Originator needs to save and restore itself.
 */
public class Caretaker {

    private ArrayList<Memento> savedStates = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }
}
