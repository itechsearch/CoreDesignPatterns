package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.CableMode;

public class CableModeCommandOn  implements Command{
    CableMode cableMode;
    public CableModeCommandOn(CableMode cableMode){
        this.cableMode=cableMode;
    }
    public void execute() {
        this.cableMode.on();
    }
}
