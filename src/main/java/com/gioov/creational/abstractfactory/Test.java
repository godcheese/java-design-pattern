package com.gioov.creational.abstractfactory;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        AnimalFactoryImpl blackAnimalFactory = new BlackAnimalFactory();
        CatImpl cat1 = blackAnimalFactory.createCat();
        cat1.eat();
        DogImpl dog1 = blackAnimalFactory.createDog();
        dog1.eat();

        AnimalFactoryImpl whiteAnimalFactory = new WhiteAnimalFactory();
        CatImpl cat2 = whiteAnimalFactory.createCat();
        cat2.eat();
        DogImpl dog2 = whiteAnimalFactory.createDog();
        dog2.eat();
    }
}
