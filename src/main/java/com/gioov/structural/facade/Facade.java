package com.gioov.structural.facade;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Facade {

    private ServiceAImpl serviceA;

    private ServiceBImpl serviceB;

    private ServiceCImpl serviceC;

    public Facade() {
        this.serviceA = new ServiceA();
        this.serviceB = new ServiceB();
        this.serviceC = new ServiceC();
    }

    public void methodA() {
        serviceA.methodA();
        serviceB.methodB();
    }

    public void methodB() {
        serviceB.methodB();
        serviceC.methodC();
    }

    public void methodC() {
        serviceC.methodC();
        serviceA.methodA();
    }

}
