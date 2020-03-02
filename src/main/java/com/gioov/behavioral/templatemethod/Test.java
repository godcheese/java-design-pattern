package com.gioov.behavioral.templatemethod;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        AbstractTemplate template = new TemplateConcrete();
        template.update();
    }
}
