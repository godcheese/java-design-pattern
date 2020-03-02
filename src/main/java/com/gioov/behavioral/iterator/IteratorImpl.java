package com.gioov.behavioral.iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-14
 */
public interface IteratorImpl<E> {

    void first();

    void last();

    E next();

    boolean hasNext();
}
