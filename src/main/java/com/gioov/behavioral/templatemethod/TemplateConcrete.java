package com.gioov.behavioral.templatemethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class TemplateConcrete extends AbstractTemplate {

    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}
