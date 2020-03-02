package com.gioov.structural.composite;

import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        AbstractEmployer projectManager = new ProjectManager("项目经理");
        AbstractEmployer projectAssistant = new ProjectAssistant("项目助理");
        AbstractEmployer programmer1 = new Programmer("程序员1");
        AbstractEmployer programmer2 = new Programmer("程序员2");

        projectManager.add(projectAssistant);
        projectManager.add(programmer1);
        projectManager.add(programmer2);

        List<AbstractEmployer> employers = projectManager.getEmployers();
        for(AbstractEmployer employer : employers) {
            System.out.println(employer.getName());
        }
    }
}
