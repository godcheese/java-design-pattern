package com.gioov.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-21
 */
public abstract class Citizen {

    private List<PolicemanImpl> policemen;

    private String help = "normal";

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    abstract void sendMessage(String help);

    public void setPolicemen() {
        this.policemen = new ArrayList<>();
    }

    public List<PolicemanImpl> getPolicemen() {
        return policemen;
    }

    public void register(PolicemanImpl policeman) {
        this.policemen.add(policeman);
    }

    public void unRegister(PolicemanImpl policeman) {
        this.policemen.remove(policeman);
    }
}
