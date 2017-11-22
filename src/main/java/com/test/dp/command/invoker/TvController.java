package com.test.dp.command.invoker;

import com.test.dp.command.cmdObject.Command;
import com.test.dp.command.cmdObject.UnknownCommand;
import com.test.dp.strategy.TvCapability;

public class TvController {
    Command[] commandOn;
    Command[] commandOff;

    public TvController(){
         commandOn = new Command[3];
        commandOff = new Command[3];
        Command emptyCommand= new UnknownCommand();
    for (int i=0; i<=2; i++){
        commandOn[i]=emptyCommand;
        commandOff[i]=emptyCommand;
    }
    }
    public void setCommand(Integer buttonIndex, Command commandOn, Command commandOff) {
        this.commandOn[buttonIndex] = commandOn;
        this.commandOff[buttonIndex]=commandOff;
    }

    public void selectOn(Integer buttonIndex){
        commandOn[buttonIndex].execute();
    }
    public void selectOff(Integer buttonIndex){
        commandOff[buttonIndex].execute();
    }
}
