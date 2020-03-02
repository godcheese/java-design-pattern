package com.gioov.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        StringElement stringElement = new StringElement("abc");
        stringElement.accept(visitor);

        FloatElement floatElement = new FloatElement(5.5f);
        floatElement.accept(visitor);

        List<VisitableImpl> list = new ArrayList<>();
        list.add(new StringElement("abc1"));
        list.add(new StringElement("abc2"));
        list.add(new StringElement("abc3"));
        list.add(new FloatElement(1.1f));
        list.add(new FloatElement(2.2f));
        list.add(new FloatElement(3.3f));
        visitor.visitCollection(list);
    }
}
