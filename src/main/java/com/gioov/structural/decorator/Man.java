package com.gioov.structural.decorator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Man implements PersonImpl {

    @Override
    public void eat() {
        System.out.println("男人在吃");
    }
}
