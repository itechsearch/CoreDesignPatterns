package com.test.dp.strategy;

public class StrategySimulator {
    public static void main(String[] args) {
        Television androidTelevision=new AndroidTv(new AndroidTvCapability(),new LEDDisplay());
        Television smartTelevision = new SmartTv(new SmartTvCapability(),new LCDDisplay());

        androidTelevision.manufacturer();
        androidTelevision.displayCapability();
        androidTelevision.displayTvMode();

        smartTelevision.manufacturer();
        smartTelevision.displayCapability();
        smartTelevision.displayTvMode();


    }
}
