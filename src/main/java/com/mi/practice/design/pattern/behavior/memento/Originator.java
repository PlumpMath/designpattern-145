package com.mi.practice.design.pattern.behavior.memento;

/**
 * Created by michelle on 16-3-12.
 * the object that knows how to save itself.
 */
public class Originator {
    private String state;

    public void set(String state) {
        System.out.println("Originator: Setting state to "+state);
        this.state = state;
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento: " + state);
        return new Memento(state);
    }
    public void restoreFromMemento(Memento m) {
        state = m.getSavedState();
        System.out.println("Originator: State after restoring from Memento: "+state);
    }
}
