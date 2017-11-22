package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.HomeTheatre;

public class HomeTheatreCommandOff implements Command {
    HomeTheatre homeTheatre;

    public HomeTheatreCommandOff(HomeTheatre homeTheatre){

        this.homeTheatre=homeTheatre;

    }
    public void execute() {
        homeTheatre.switchOn();

    }
}
