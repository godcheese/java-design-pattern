package com.gioov.behavioral.command;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class Invoker {

    private AbstractCommand command;

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
