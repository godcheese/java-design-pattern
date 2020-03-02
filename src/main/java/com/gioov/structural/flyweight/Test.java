package com.gioov.structural.flyweight;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        FlyweightImpl flyweight1 = FlyweightFactory.getFlyweight("a");
        flyweight1.action(1);

        FlyweightImpl flyweight2 = FlyweightFactory.getFlyweight("a");
        System.out.println(flyweight1 == flyweight2);

        FlyweightImpl flyweight3 = FlyweightFactory.getFlyweight("b");
        flyweight3.action(2);

        FlyweightImpl flyweight4 = FlyweightFactory.getFlyweight("c");
        flyweight4.action(3);

        FlyweightImpl flyweight5 = FlyweightFactory.getFlyweight("d");
        flyweight5.action(4);

        System.out.println(FlyweightFactory.getSize());
    }
}
