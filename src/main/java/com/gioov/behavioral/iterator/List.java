package com.gioov.behavioral.iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-14
 */
public class List<E> implements ListImpl<E> {

    private E[] array;

    private int index;

    private int size;

    @SuppressWarnings("unchecked")
    public List() {
        index = 0;
        size = 0;
        array = (E[]) new Object[100];
    }

    @Override
    public IteratorImpl<E> iterator() {
        return new Iterator<E>(this);
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(E e) {
        array[index++] = e;
        size++;
    }
}
