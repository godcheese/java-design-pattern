package com.gioov.behavioral.visitor;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class FloatElement implements VisitableImpl {

    private Float aFloat;

    public FloatElement(Float aFloat) {
        this.aFloat = aFloat;
    }

    public Float getFloat() {
        return aFloat;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
