package com.gioov.creational.builder;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilderImpl personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
