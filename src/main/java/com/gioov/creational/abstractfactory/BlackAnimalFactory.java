package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class BlackAnimalFactory implements AnimalFactoryImpl {

    @Override
    public CatImpl createCat() {
        return new BlackCat();
    }

    @Override
    public DogImpl createDog() {
        return new BlackDog();
    }
}
