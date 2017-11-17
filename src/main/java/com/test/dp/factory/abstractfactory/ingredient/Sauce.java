package com.test.dp.factory.abstractfactory.ingredient;

public class Sauce {
    private String name;
    private String sauceType;

    public Sauce(String name,String sauceType){
        this.name=name;
        this.sauceType=sauceType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }
}
