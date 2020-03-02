package com.gioov.structural.proxy;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        ObjectImpl object = new ProxyObject();
        object.action();
    }
}
