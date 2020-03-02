package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class WhiteCat implements CatImpl {

    @Override
    public void eat() {
        System.out.println("white cat eat");
    }
}
