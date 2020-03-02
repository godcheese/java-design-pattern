package com.gioov.behavioral.iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-14
 */
public class Iterator<E> implements IteratorImpl<E> {

   private List<E> list;

   private int index;

    public Iterator(List<E> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public E next() {
        E e = list.get(index);
        index++;
        return e;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}
