package com.gioov.behavioral.observer;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        PolicemanImpl tianHePoliceman = new TianHePoliceman();
        PolicemanImpl huangPuPoliceman = new HuangPuPoliceman();

        Citizen citizen = new TianHeCitizen(tianHePoliceman);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
        System.out.println("==========");
        citizen = new HuangPuCitizen(huangPuPoliceman);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }
}
