package com.test.dp.factory.abstractfactory.product;

import com.test.dp.factory.abstractfactory.ingredient.Base;
import com.test.dp.factory.abstractfactory.ingredient.Sauce;
import com.test.dp.factory.abstractfactory.ingredient.Toppings;
import com.test.dp.factory.abstractfactory.ingredientFactory.PizzaIngredientFactory;

public abstract class Pizza {
    private String name;
    private Base base;
    private Sauce sauce;
    private Toppings toppings;
    private PizzaIngredientFactory pizzaIngredientFactory;
    public abstract void prepare();
    public void bake(){
        System.out.println("Pizza baked");
    }
    public void pack(){
        System.out.println("Pizza packed");
    }
    public void deliver(){
        System.out.println("pizza delivered");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    public void setPizzaIngredientFactory(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}
