package com.gioov.behavioral.mediator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();

        // 老板来了
        mediator.notice("boss");

        // 客户来了
        mediator.notice("client");
    }
}
