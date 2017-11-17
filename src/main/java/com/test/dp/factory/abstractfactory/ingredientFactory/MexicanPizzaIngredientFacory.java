package com.test.dp.factory.abstractfactory.ingredientFactory;

import com.test.dp.factory.abstractfactory.ingredient.Base;
import com.test.dp.factory.abstractfactory.ingredient.Sauce;
import com.test.dp.factory.abstractfactory.ingredient.Toppings;

public class MexicanPizzaIngredientFacory implements PizzaIngredientFactory {
    public Base createBase() {
        return  new Base("Bread  gain","Brown bread");
    }

    public Sauce pourSauce() {
        return new Sauce("Chilly star","Chilly plus vinegar");
    }

    public Toppings addToppings() {
        return new Toppings("Cheese","red");
    }
}
