package com.gioov.structural.decorator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reEat();
    System.out.println("ManDecoratorA 类");
    }

    private void reEat() {
    System.out.println("再吃一顿饭");
    }
}
