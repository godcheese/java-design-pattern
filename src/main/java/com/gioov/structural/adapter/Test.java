package com.gioov.structural.adapter;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        TargetImpl target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}
