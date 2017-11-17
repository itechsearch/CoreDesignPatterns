package com.test.dp.decorator;

public class Backpack extends Bag {
    public Backpack(){
        description="Backpack";
    }
    public int cost() {
        return 100;
    }
}
