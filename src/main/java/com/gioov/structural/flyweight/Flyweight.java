package com.gioov.structural.flyweight;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Flyweight implements FlyweightImpl {

    @Override
    public void action(int arg) {
        System.out.println("参数值：" + arg);
    }
}
