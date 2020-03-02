package com.gioov.structural.decorator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Decorator implements PersonImpl {

    protected PersonImpl person;

    public void setPerson(PersonImpl person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
