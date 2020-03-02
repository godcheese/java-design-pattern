package com.gioov.structural.adapter;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Adapter implements TargetImpl {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adpateeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
