package com.test.dp.factory.factory.product;

public abstract class Pizza {
    String name;
    String base;
    String sauce;
    String toppings;

    public void prepare(){
        System.out.println("pizza ordered");
    }
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


    public String getBase() {
        return base;
    }

    public String getSauce() {
        return sauce;
    }


    public String getToppings() {
        return toppings;
    }


}
