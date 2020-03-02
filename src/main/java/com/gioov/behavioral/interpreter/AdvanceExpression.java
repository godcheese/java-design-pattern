package com.gioov.behavioral.interpreter;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class AdvanceExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("这是高级解析器！");
    }
}
