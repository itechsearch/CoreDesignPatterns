package com.test.dp.factory.abstractfactory.store;

import com.test.dp.factory.abstractfactory.factory.MexicanPizzaFactory;
import com.test.dp.factory.abstractfactory.product.Pizza;

public class MexicanPizzaStore extends PizzaStore
{
    Pizza createPizza(String type) {
        return new MexicanPizzaFactory().createPizza(type);
    }
}
