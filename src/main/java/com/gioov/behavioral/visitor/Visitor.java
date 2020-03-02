package com.gioov.behavioral.visitor;

import java.util.Collection;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public interface Visitor {

    void visitString(StringElement stringElement);

    void visitFloat(FloatElement floatElement);

    void visitCollection(Collection<?> collection);
}
