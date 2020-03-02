package com.gioov.behavioral.templatemethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public abstract class AbstractTemplate {

    public abstract void print();

    public void update() {
        System.out.println("开始打印");
        for(int i=0;i<10;i++) {
            print();
        }
    }
}
