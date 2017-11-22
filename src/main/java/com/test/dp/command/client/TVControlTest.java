package com.test.dp.command.client;

import com.test.dp.command.cmdObject.*;
import com.test.dp.command.invoker.TvController;
import com.test.dp.command.receiver.AppMode;
import com.test.dp.command.receiver.HomeTheatre;
import com.test.dp.command.receiver.MultimediaMode;

public class TVControlTest {

    public static void main(String[] args) {
        TvController tvController=new TvController();
        Command appModeOnCommandOn=new AppModeCommandOn(new AppMode());
        Command appModeCommandOff=new AppModeCommandOff(new AppMode());
        Command multiMediaModeCommandOn=new MultiMediaModeCommandOn(new AppMode(),new HomeTheatre(),new MultimediaMode());
        Command multiMediaModeCommandOff=new MultiMediaModeCommandOff(new AppMode(),new HomeTheatre(), new MultimediaMode());
        Command homeThreatreCommandOn=new HomeTheatreCommandPlay(new HomeTheatre());
        Command homeThreatureCommandOff=new HomeTheatreCommandOff(new HomeTheatre());
        tvController.setCommand(0,multiMediaModeCommandOn,multiMediaModeCommandOff);
        tvController.setCommand(1,appModeOnCommandOn,appModeCommandOff);
        tvController.setCommand(2,homeThreatreCommandOn,homeThreatureCommandOff);
        tvController.selectOn(0);
        tvController.selectOff(0);
        tvController.selectOn(1);
        tvController.selectOff(1);

        tvController.selectOn(2);
        tvController.selectOff(2);

    }


}
