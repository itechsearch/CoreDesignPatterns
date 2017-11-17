package com.test.dp.factory.factory.factory;

import com.test.dp.factory.factory.product.CheesePizza;
import com.test.dp.factory.factory.product.MexicanVegPizza;
import com.test.dp.factory.factory.product.NonVegPizza;
import com.test.dp.factory.factory.product.Pizza;

public class MexicanPizzaFactory implements SimplePizzaFactory{


    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("Veg")){
            return new MexicanVegPizza();
        }
        else if (type.equalsIgnoreCase("Nonveg")){
            return new NonVegPizza();
        }
        else  {
            return new CheesePizza();
        }

    }
}
