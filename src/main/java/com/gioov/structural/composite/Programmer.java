package com.gioov.structural.composite;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class Programmer extends AbstractEmployer {

    public Programmer(String name) {
        setName(name);

        // 程序员，表示没有下属了
       setEmployers(null);
    }

    @Override
    public void add(AbstractEmployer employer) {

    }

    @Override
    public void delete(AbstractEmployer employer) {

    }
}
