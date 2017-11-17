package com.test.dp.factory.abstractfactory;

import com.test.dp.factory.abstractfactory.product.Pizza;
import com.test.dp.factory.abstractfactory.store.ItalianPizzaStore;
import com.test.dp.factory.abstractfactory.store.MexicanPizzaStore;
import com.test.dp.factory.abstractfactory.store.PizzaStore;

public class FactorySimulator {
    public static void main(String[] args) {
        PizzaStore italianPizzaStore=new ItalianPizzaStore();
        Pizza pizzaone = italianPizzaStore.orderPizza("nonveg");
        System.out.println(pizzaone.getName()+" " +pizzaone.getBase().getBaseName()+" "+pizzaone.getSauce().getName()
                +" "+pizzaone.getToppings().getName());
        Pizza pizzatwo = italianPizzaStore.orderPizza("something");
        System.out.println(pizzatwo.getName()+" " +pizzatwo.getBase().getBaseName()+" "+pizzatwo.getSauce().getName()
                +" "+pizzatwo.getToppings().getName());
        PizzaStore mexicanPizzaStore=new MexicanPizzaStore();
        Pizza pizzathree = mexicanPizzaStore.orderPizza("veg");
        System.out.println(pizzathree.getName()+" " +pizzathree.getBase().getBaseName()+" "
                +pizzathree.getSauce().getName()+" "+pizzathree.getToppings().getName());
        Pizza pizzafour = mexicanPizzaStore.orderPizza("nonveg");
        System.out.println(pizzafour.getName()+" " +pizzafour.getBase().getBaseName()+" "
                +pizzafour.getSauce().getName()+" "+pizzafour.getToppings().getName());


    }
}
