package com.test.dp.factory.factory.factory;

import com.test.dp.factory.factory.product.*;

public class ItalianPizzaFactory implements SimplePizzaFactory {
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("Veg")){
            return new ItalianVegPizza();
        }
        else if (type.equalsIgnoreCase("Nonveg")){
            return new NonVegPizza();
        }
        else  {
            return new CheesePizza();
        }

    }
}
