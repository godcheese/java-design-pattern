package com.gioov.creational.prototype;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype1 = new ConcretePrototype("prototype");
        Prototype prototype2 = (Prototype) prototype1.clone();
        System.out.println(prototype1.getName());
        System.out.println(prototype2.getName());
    }
}
