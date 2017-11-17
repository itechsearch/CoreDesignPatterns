package com.test.dp.factory.abstractfactory.product;

import com.test.dp.factory.abstractfactory.ingredientFactory.PizzaIngredientFactory;

public class VegPizza extends Pizza {
   public VegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
       this.setPizzaIngredientFactory(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
       this.setName("Veg cheese pizza");
       setBase(getPizzaIngredientFactory().createBase());
       setSauce(getPizzaIngredientFactory().pourSauce());
       setToppings(getPizzaIngredientFactory().addToppings());
    }
}
