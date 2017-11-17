package com.test.dp.factory.factory.store;

import com.test.dp.factory.factory.factory.MexicanPizzaFactory;
import com.test.dp.factory.factory.product.Pizza;

public class MexicanPizzaStore extends PizzaStore
{
    Pizza createPizza(String type) {
        return new MexicanPizzaFactory().createPizza("veg");
    }
}
