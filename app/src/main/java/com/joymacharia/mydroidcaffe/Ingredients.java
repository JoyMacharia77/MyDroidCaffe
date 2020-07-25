package com.joymacharia.mydroidcaffe;

public class Ingredients {
    //Declare private member variables
    String ingredient;
    private String steps;

    Ingredients(String ingredient, String steps)
    {
        this.ingredient=ingredient;
        this.steps = steps;

    }
    /* Create the getters and return the specific object*/
    public String getIngredient()
    {
        return ingredient;
    }
    public String getSteps()
    {
        return steps;
    }

}
