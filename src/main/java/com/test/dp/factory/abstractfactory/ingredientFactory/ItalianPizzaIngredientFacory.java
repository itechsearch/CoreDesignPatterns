package com.test.dp.factory.abstractfactory.ingredientFactory;

import com.test.dp.factory.abstractfactory.ingredient.Base;
import com.test.dp.factory.abstractfactory.ingredient.Sauce;
import com.test.dp.factory.abstractfactory.ingredient.Toppings;

public class ItalianPizzaIngredientFacory implements PizzaIngredientFactory {
    public Base createBase() {
        return  new Base("Whole grain power","Whole grains");
    }

    public Sauce pourSauce() {
        return new Sauce("Tomato star","Tomato plus vinegar");
    }

    public Toppings addToppings() {
        return new Toppings("Mixed Veg","Veg");
    }
}
