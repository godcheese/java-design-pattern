package com.gioov.structural.bridge;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Trouser extends AbstractClothing {
    @Override
    public void personDressCloth(AbstractPerson person) {
        System.out.println(person.getType() + "穿裤子");
    }
}
