package com.gioov.creational.builder;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class ManBuilder implements PersonBuilderImpl {

    private Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("set head");
    }

    @Override
    public void buildBody() {
        person.setBody("set body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("set foot");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
