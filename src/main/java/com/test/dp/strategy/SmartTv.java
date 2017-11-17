package com.test.dp.strategy;

public class SmartTv extends Television
{
    public SmartTv(TvCapability tvCapability, TvDisplay tvDisplay){
        super(tvCapability,tvDisplay);

    }

    void manufacturer() {
        System.out.println("Samsung");
    }



}