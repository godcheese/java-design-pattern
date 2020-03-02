package com.gioov.structural.facade;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ServiceA implements ServiceAImpl {

    @Override
    public void methodA() {
        System.out.println("这是服务 A");
    }
}
