package com.gioov.behavioral.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visitString(StringElement stringElement) {
        System.out.println(stringElement.getString());
    }

    @Override
    public void visitFloat(FloatElement floatElement) {
        System.out.println(floatElement.getFloat());
    }

    @Override
    public void visitCollection(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if(object instanceof VisitableImpl) {
                ((VisitableImpl) object).accept(this);
            }
        }
    }
}
