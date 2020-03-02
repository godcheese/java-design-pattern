package com.gioov.creational.singleton;


/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
