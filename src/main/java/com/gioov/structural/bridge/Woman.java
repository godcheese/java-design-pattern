package com.gioov.structural.bridge;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Woman extends AbstractPerson {

    public Woman() {
        setType("女人");
    }

    @Override
    public void dress() {
        AbstractClothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
