package com.test.dp.factory.abstractfactory.ingredient;

public class Base {
    private String baseName;
    private String ingredient;

    public Base(String baseName,String ingredient){
        this.baseName=baseName;
        this.ingredient=ingredient;
    }
    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
