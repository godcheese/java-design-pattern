package com.gioov.behavioral.interpreter;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.add(new SimpleExpression());
        context.add(new AdvanceExpression());
        context.add(new SimpleExpression());
        for(AbstractExpression expression : context.getList()) {
            expression.interpret(context);
        }
    }
}
