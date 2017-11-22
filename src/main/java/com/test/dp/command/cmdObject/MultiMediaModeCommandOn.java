package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.AppMode;
import com.test.dp.command.receiver.HomeTheatre;
import com.test.dp.command.receiver.MultimediaMode;

public class MultiMediaModeCommandOn implements Command {
    AppMode appMode;
    HomeTheatre homeTheatre;
    MultimediaMode multimediaMode;

        public MultiMediaModeCommandOn (AppMode appMode, HomeTheatre homeTheatre, MultimediaMode multimediaMode) {
        this.appMode=appMode;
        this.homeTheatre=homeTheatre;
        this.multimediaMode=multimediaMode;
        }

    public void execute() {
homeTheatre.switchOn();
appMode.on();
multimediaMode.turnOn();
    }
}
