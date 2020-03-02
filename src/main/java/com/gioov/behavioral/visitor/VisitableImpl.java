package com.gioov.behavioral.visitor;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public interface VisitableImpl {

    void accept(Visitor visitor);
}
