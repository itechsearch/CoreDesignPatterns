package com.test.dp.factory.abstractfactory.ingredient;

public class Toppings {
    private String name;
    private String toppingColor;

    public Toppings(String name,String toppingColor){
        this.name=name;
        this.toppingColor=toppingColor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppingColor() {
        return toppingColor;
    }

    public void setToppingColor(String toppingColor) {
        this.toppingColor = toppingColor;
    }
}
