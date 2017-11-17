package com.test.dp.factory.abstractfactory.ingredientFactory;

import com.test.dp.factory.abstractfactory.ingredient.Base;
import com.test.dp.factory.abstractfactory.ingredient.Sauce;
import com.test.dp.factory.abstractfactory.ingredient.Toppings;

public interface PizzaIngredientFactory  {
    Base createBase();
    Sauce pourSauce();
    Toppings addToppings();

}
