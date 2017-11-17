package com.test.dp.factory.abstractfactory.store;

import com.test.dp.factory.abstractfactory.factory.ItalianPizzaFactory;
import com.test.dp.factory.abstractfactory.product.Pizza;

public class ItalianPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        return new ItalianPizzaFactory().createPizza(type);
    }
}
