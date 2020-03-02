package com.gioov.behavioral.strategy;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.doMethod();

        context = new Context(new StrategyB());
        context.doMethod();

        context = new Context(new StrategyC());
        context.doMethod();

    }
}
