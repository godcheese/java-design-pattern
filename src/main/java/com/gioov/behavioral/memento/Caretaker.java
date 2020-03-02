package com.gioov.behavioral.memento;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-18
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
