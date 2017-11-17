package com.test.dp.factory.abstractfactory.product;

import com.test.dp.factory.abstractfactory.ingredientFactory.PizzaIngredientFactory;

public class NonVegPizza extends Pizza {

  public   NonVegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
      this.setPizzaIngredientFactory(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
      setName("Chicken pizza");
        setBase(getPizzaIngredientFactory().createBase());
        setSauce(getPizzaIngredientFactory().pourSauce());
        setToppings(getPizzaIngredientFactory().addToppings());
    }
}
