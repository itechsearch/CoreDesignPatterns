package com.test.dp.command.cmdObject;

public class UnknownCommand implements  Command{
    public void execute() {
        System.out.println("No execution");
    }
}
