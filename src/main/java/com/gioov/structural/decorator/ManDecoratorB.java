package com.gioov.structural.decorator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat() {
        super.eat();
        System.out.println("==========");
    System.out.println("ManDecoratorB 类");
    }
}
