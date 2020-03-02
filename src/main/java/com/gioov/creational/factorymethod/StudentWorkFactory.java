package com.gioov.creational.factorymethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class StudentWorkFactory implements WorkFactoryImpl {

    @Override
    public WorkImpl getWork() {
        return new StudentWork();
    }
}
