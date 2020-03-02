package com.gioov.structural.composite;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public class ProjectAssistant extends AbstractEmployer {

    public ProjectAssistant(String name) {
        setName(name);

        // 项目助理，表示没有下属了
        setEmployers(null);
    }

    @Override
    public void add(AbstractEmployer employer) {

    }

    @Override
    public void delete(AbstractEmployer employer) {

    }
}
