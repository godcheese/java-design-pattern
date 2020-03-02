package com.gioov.behavioral.command;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public abstract class AbstractCommand {

    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
