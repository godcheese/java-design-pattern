package com.gioov.behavioral.visitor;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class StringElement implements VisitableImpl {

    private String string;

    public StringElement(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
