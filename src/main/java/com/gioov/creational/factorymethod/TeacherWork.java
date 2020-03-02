package com.gioov.creational.factorymethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class TeacherWork implements WorkImpl {

    @Override
    public void doWork() {
        System.out.println("老师批改作业！");
    }
}
