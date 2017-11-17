package com.test.dp.factory.abstractfactory.factory;

import com.test.dp.factory.abstractfactory.product.Pizza;

public interface SimplePizzaFactory {
    Pizza createPizza(String type);
}
