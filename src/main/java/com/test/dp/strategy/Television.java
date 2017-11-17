package com.test.dp.strategy;

public abstract class Television {
     TvDisplay tvDisplayMode;
     TvCapability tvCapability;

    public Television(TvCapability tvCapability, TvDisplay tvDisplay) {
        this.tvCapability=tvCapability;
        this.tvDisplayMode=tvDisplay;
    }
    public void displayCapability() {
        System.out.println(tvCapability.getCapability());

    }
    public void displayTvMode(){
        System.out.println(tvDisplayMode.displayMode());
    }

    abstract void manufacturer();

}
