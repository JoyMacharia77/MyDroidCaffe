package com.joymacharia.mydroidcaffe;

public class Store {
    //Declare private member variables
    private final int storeImage;
    private String storeTitle;
    private String storeDescription;


    /*Create a constructor for the recipe data model
     * Pass the parameters recipeImage, recipeTitle and recipeDescription*/

    Store(int storeImage, String storeTitle, String storeDescription)// String recipeIngredients)
    {
        this.storeImage =storeImage;
        this.storeTitle = storeTitle;
        this.storeDescription = storeDescription;

    }
    /* Create the getters and return the specific object*/
    public int getStoreImage() { return storeImage; }
    public String getStoreTitle()
    {
        return storeTitle;
    }
    public String getStoreDescription()
    {
        return storeDescription;
    }
}
