package com.gioov.behavioral.iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-14
 */
public interface ListImpl<E> {

    IteratorImpl<E> iterator();

    E get(int index);

    int getSize();

    void add(E e);
}
