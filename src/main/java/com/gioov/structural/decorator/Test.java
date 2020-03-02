package com.gioov.structural.decorator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();

        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
    }
}
