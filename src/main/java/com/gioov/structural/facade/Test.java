package com.gioov.structural.facade;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        ServiceAImpl serviceA = new ServiceA();
        ServiceBImpl serviceB = new ServiceB();

        serviceA.methodA();
        serviceB.methodB();

        System.out.println("==========");

        // facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
