package com.joymacharia.mydroidcaffe;

public class Recipe {
    //Declare private member variables
    private final int recipeImage;
    private String recipeTitle;
    private String recipeDescription;
   // private String recipeIngredients;

    /*Create a constructor for the recipe data model
    * Pass the parameters recipeImage, recipeTitle and recipeDescription*/

    Recipe(int recipeImage, String recipeTitle, String recipeDescription)// String recipeIngredients)
    {
        this.recipeImage=recipeImage;
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
       // this.recipeIngredients = recipeIngredients;
    }
    /* Create the getters and return the specific object*/
    public int getRecipeImage()
    {
        return recipeImage;
    }
    public String getRecipeTitle()
    {
        return recipeTitle;
    }
    public String getRecipeDescription()
    {
        return recipeDescription;
    }
  /*  public String getRecipeIngredients()
    {
        return recipeIngredients;
    }*/
}
