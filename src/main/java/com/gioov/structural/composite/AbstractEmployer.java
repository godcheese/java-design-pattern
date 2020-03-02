package com.gioov.structural.composite;


import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public abstract class AbstractEmployer {

    private String name;

    private List<AbstractEmployer> employers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(AbstractEmployer employer);

    public abstract void delete(AbstractEmployer employer);

    public void printInfo() {
        System.out.println(name);
    }

    public void setEmployers(List<AbstractEmployer> employers) {
        this.employers = employers;
    }

    public List<AbstractEmployer> getEmployers() {
        return employers;
    }
}
