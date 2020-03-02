package com.gioov.behavioral.observer;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public class TianHeCitizen extends Citizen {

    public TianHeCitizen(PolicemanImpl policeman) {
        setPolicemen();
        register(policeman);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for(int i=0; i<getPolicemen().size(); i++) {
            PolicemanImpl policeman = getPolicemen().get(i);
            // 通知警察行动
            policeman.action(this);
        }
    }
}
