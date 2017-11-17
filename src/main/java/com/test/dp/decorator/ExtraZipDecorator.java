package com.test.dp.decorator;

    public class ExtraZipDecorator extends BagDecorator{
    Bag bag;
    public ExtraZipDecorator(Bag bag){
        this.bag=bag;
    }

    int cost() {
        return 10 + bag.cost();
    }

    String getDescription() {
        return bag.description + " ExtraZip ";
    }
}