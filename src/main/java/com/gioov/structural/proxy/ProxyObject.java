package com.gioov.structural.proxy;


/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ProxyObject implements ObjectImpl {

    private ObjectImpl object;

    public ProxyObject() {
        System.out.println("这是代理类");
        object = new Object();
    }

    @Override
    public void action() {
        System.out.println("代理开始");
        object.action();
        System.out.println("代理结束");
    }
}
