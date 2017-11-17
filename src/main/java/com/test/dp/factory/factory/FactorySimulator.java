package com.test.dp.factory.factory;

import com.test.dp.factory.factory.product.Pizza;
import com.test.dp.factory.factory.store.ItalianPizzaStore;
import com.test.dp.factory.factory.store.MexicanPizzaStore;
import com.test.dp.factory.factory.store.PizzaStore;

public class FactorySimulator {
    public static void main(String[] args) {
        PizzaStore italianPizzaStore=new ItalianPizzaStore();
        Pizza pizza = italianPizzaStore.orderPizza("veg");
        System.out.println(pizza.getBase()+" " +pizza.getName()+" "+pizza.getSauce()+" "+pizza.getToppings());
        PizzaStore mexicanPizzaStore=new MexicanPizzaStore();
        Pizza pizza1 = mexicanPizzaStore.orderPizza("veg");
        System.out.println(pizza1.getBase()+" " +pizza1.getName()+" "+pizza1.getSauce()+" "+pizza1.getToppings());

    }
}
