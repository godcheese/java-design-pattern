package com.gioov.behavioral.interpreter;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class SimpleExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("这是简单解析器！");
    }
}
