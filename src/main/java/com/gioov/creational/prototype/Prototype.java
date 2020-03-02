package com.gioov.creational.prototype;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class Prototype implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
