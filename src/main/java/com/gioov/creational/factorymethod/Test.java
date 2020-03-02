package com.gioov.creational.factorymethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        WorkFactoryImpl studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        WorkFactoryImpl teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
