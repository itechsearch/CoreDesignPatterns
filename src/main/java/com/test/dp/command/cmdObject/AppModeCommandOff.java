package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.AppMode;

public class AppModeCommandOff implements Command {
    AppMode appMode;
    public AppModeCommandOff(AppMode appMode){
        this.appMode=appMode;
    }
    public void execute() {
        appMode.off();
    }
}
