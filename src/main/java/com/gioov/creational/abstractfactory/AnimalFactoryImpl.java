package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public interface AnimalFactoryImpl {

    CatImpl createCat();

    DogImpl createDog();
}
