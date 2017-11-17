package com.test.dp.decorator;

public class DecoratorSimulator {
    public static void main(String[] args) {
        Bag bag=new Backpack();
        bag=new ExtraZipDecorator(bag);
        bag=new AdditionalWarrantyDecorator(bag);
        System.out.println(bag.description + bag.cost());
        Bag bag1=new Duffel();
        bag1=new
                    AdditionalWarrantyDecorator(bag1);
        System.out.println(bag1.description + bag1.cost());
    }
}
