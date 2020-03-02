package com.gioov.behavioral.strategy;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class Context {

    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void doMethod() {
        strategy.method();
    }
}
