package com.gioov.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        ListImpl<String> list = new List<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("=第一种迭代方式=");
//        java.util.List<E>;
//        ArrayList<>
//        Iterator<E>
        IteratorImpl<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=第二种迭代方式=");
        for (int i=0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
