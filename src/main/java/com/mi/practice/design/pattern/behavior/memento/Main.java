package com.mi.practice.design.pattern.behavior.memento;

import com.mi.practice.design.pattern.behavior.memento.Caretaker;
import com.mi.practice.design.pattern.behavior.memento.Originator;

/**
 * Created by michelle on 16-3-12.
 *
 * Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.
 A magic cookie that encapsulates a "check point" capability.
 Promote undo or rollback to full object status.
 */
public class Main {

    public static void main(String []args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.set("state1");
        originator.set("state2");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("state3");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("state4");
        originator.restoreFromMemento(caretaker.getMemento(1));
    }
}
