package com.gioov.creational.builder;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public interface PersonBuilderImpl {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
