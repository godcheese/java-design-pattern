package com.gioov.structural.proxy;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Object implements ObjectImpl {

    @Override
    public void action() {
        System.out.println("==========");
        System.out.println("==========");
        System.out.println("这是被代理的类");
        System.out.println("==========");
        System.out.println("==========");
    }
}
