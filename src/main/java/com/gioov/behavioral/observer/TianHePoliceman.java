package com.gioov.behavioral.observer;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class TianHePoliceman implements PolicemanImpl {

    @Override
    public void action(Citizen citizen) {
        String help = citizen.getHelp();
        if(help.equals("normal")) {
            System.out.println("一切正常，不用出动");
        }
        if(help.equals("unnormal")) {
            System.out.println("有犯罪行为, 天河警察出动!");
        }
    }
}
