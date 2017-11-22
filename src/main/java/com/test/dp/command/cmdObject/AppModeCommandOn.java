package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.AppMode;

public class AppModeCommandOn implements  Command{
    AppMode appMode;
    public AppModeCommandOn(AppMode appMode){
        this.appMode=appMode;
    }

    public void execute() {
        appMode.on();
    }
}
