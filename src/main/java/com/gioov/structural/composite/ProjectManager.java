package com.gioov.structural.composite;

import java.util.ArrayList;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ProjectManager extends AbstractEmployer {

    public ProjectManager(String name) {
        setName(name);
        setEmployers(new ArrayList<AbstractEmployer>());
    }

    @Override
    public void add(AbstractEmployer employer) {
        getEmployers().add(employer);
    }

    @Override
    public void delete(AbstractEmployer employer) {
        getEmployers().remove(employer);
    }
}
