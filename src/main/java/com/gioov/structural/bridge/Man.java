package com.gioov.structural.bridge;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Man extends AbstractPerson {

    public Man() {
        setType("男人");
    }

    @Override
    public void dress() {
        AbstractClothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
