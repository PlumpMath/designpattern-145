package com.mi.practice.design.pattern.behavior.memento;

/**
 * Created by michelle on 16-3-12.
 * the lock box that is written and read by the Originator, and shepherded by the Caretaker.
 */
public class Memento {
    private String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    public String getSavedState() {
        return state;
    }
}
