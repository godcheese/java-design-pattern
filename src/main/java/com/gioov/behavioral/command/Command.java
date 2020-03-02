package com.gioov.behavioral.command;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class Command extends AbstractCommand {

    public Command(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        getReceiver().receive();
    }
}
