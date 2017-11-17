package com.test.dp.factory.factory.store;

import com.test.dp.factory.factory.product.Pizza;

public abstract class PizzaStore {
    Pizza pizza;
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.pack();
        pizza.deliver();
        return pizza;
    }

}
