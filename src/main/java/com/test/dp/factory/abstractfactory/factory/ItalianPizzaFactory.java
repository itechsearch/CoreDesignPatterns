package com.test.dp.factory.abstractfactory.factory;

import com.test.dp.factory.abstractfactory.ingredientFactory.ItalianPizzaIngredientFacory;
import com.test.dp.factory.abstractfactory.ingredientFactory.PizzaIngredientFactory;
import com.test.dp.factory.abstractfactory.product.NonVegPizza;
import com.test.dp.factory.abstractfactory.product.Pizza;
import com.test.dp.factory.abstractfactory.product.VegPizza;

public class ItalianPizzaFactory implements SimplePizzaFactory {
    PizzaIngredientFactory pizzaIngredientFactory;
    public Pizza createPizza(String type){
        pizzaIngredientFactory=new ItalianPizzaIngredientFacory();
        if(type.equalsIgnoreCase("Veg")){
            return new VegPizza(pizzaIngredientFactory);
        }
        else if (type.equalsIgnoreCase("Nonveg")){
            return new NonVegPizza(pizzaIngredientFactory);
        }
       else {
            return new VegPizza(pizzaIngredientFactory);
        }

    }
}
