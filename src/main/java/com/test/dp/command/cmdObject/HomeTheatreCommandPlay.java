package com.test.dp.command.cmdObject;

import com.test.dp.command.receiver.HomeTheatre;

public class HomeTheatreCommandPlay implements  Command {
    HomeTheatre homeTheatre;
    public HomeTheatreCommandPlay(HomeTheatre homeTheatre){
        this.homeTheatre = homeTheatre;
    }
    public void execute() {
        homeTheatre.switchOff();
    }
}
