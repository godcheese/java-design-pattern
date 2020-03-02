package com.gioov.behavioral.mediator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-18
 */
public class ConcreteMediator extends AbstractMediator {

    private ColleagueA colleagueA;

    private ColleagueB colleagueB;

    public ConcreteMediator() {
        this.colleagueA = new ColleagueA();
        this.colleagueB = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if(content.equals("boss")) {
            // 老板来了，通知员工 A
            colleagueA.action();
        }
        if(content.equals("client")) {
            // 客户来了，通知前台 B
            colleagueB.action();
        }
    }
}
