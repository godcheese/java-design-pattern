package com.gioov.behavioral.memento;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-18
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
