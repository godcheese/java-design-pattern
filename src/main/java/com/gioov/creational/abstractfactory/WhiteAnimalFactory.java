package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class WhiteAnimalFactory implements AnimalFactoryImpl {

    @Override
    public CatImpl createCat() {
        return new WhiteCat();
    }

    @Override
    public DogImpl createDog() {
        return new WhiteDog();
    }
}
