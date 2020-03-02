package com.gioov.behavioral.command;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        AbstractCommand command = new Command(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}
