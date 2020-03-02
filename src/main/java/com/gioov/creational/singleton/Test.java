package com.gioov.creational.singleton;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
