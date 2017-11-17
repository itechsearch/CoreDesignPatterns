package com.test.dp.strategy;

public class AndroidTvCapability implements TvCapability {
    public String getCapability() {
        return "Android apps, HDMI, USB, Internet, Wifi";
    }
}
