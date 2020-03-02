package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class BlackDog implements DogImpl {

    @Override
    public void eat() {
        System.out.println("black dog eat");
    }
}
