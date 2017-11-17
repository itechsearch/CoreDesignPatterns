package com.test.dp.factory.factory.store;

import com.test.dp.factory.factory.factory.ItalianPizzaFactory;
import com.test.dp.factory.factory.product.Pizza;

public class ItalianPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        return new ItalianPizzaFactory().createPizza("veg");
    }
}
