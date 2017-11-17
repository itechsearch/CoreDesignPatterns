package com.test.dp.decorator;

public class AdditionalWarrantyDecorator extends  BagDecorator {

    Bag bag;
    AdditionalWarrantyDecorator(Bag bag){
        this.bag=bag;
    }
    int cost() {
        return 20 + bag.cost();
    }

    String getDescription() {
        return bag.description + " Additional Warranty ";
    }
}
