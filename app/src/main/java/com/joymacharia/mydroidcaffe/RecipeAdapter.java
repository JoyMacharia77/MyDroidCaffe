package com.joymacharia.mydroidcaffe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/*Step 1
 *Create a recipe Adapter that extends recycler view.adapter and uses the RecyclerView.ViewHolder Class */

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {
   /*3.0 Declare the private member variables Recipe Data and the context*/
    private ArrayList<Recipe> recipeData;
    private Context myContext;
    /*step 3.1
    * Create Constructor to pass in the recipes data and the context*/
RecipeAdapter(ArrayList<Recipe> myRecipeData,Context context)
{
    //Initialize the objects
    this.myContext = context;
    this.recipeData = myRecipeData;
}
    /*step 1.1 Required
     * implement the method onCreateViewHolder for creating viewHolder Objects
     * @param parent The view group of which the view object will be added after it's bound to the adapter position
     * @param viewType viewType of the new view
     * @return the newly created viewHolder*/
    @NonNull
    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       /*Step 4.1 Create a new View Holder*/
        return new ViewHolder(LayoutInflater.from(myContext).inflate(R.layout.recipe_list_item, parent,false));
    }
     /*Step 1.1
     * Required for binding the view to the data
     * @holder viewHolder which the data should be put
     * @position the adapter position*/
    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.ViewHolder holder, int position) {
    /*Step 5
    * Get the Current View Object and Populate it using its position and populate it with data*/
    Recipe currentRecipe= recipeData.get(position);
    //Step 5.1 Populate the current view with data
        holder.bindTo(currentRecipe);
    }
    /*Step 1.1
    * Required for getting the size of the data set
    * @return the size of the dataset
    * */
    @Override
    public int getItemCount() {
        /*Step 4.0*/
        return recipeData.size();
    }
    /*Step 2
    * Create the ViewHolder class that rep each and every row in the recycler view*/
    public class ViewHolder extends RecyclerView.ViewHolder {
        /*Step 2.1
        * Create a constructor for the viewHolder used in an onCreateViewHolder() method
        * @param itemView rootView of the recipe_list_item layout*/
        //Step 2.2 Declare the private member variables that the viewHolder will hold
        private ImageView myRecipeImage;
        private TextView myRecipeTitle;
        private TextView myRecipeDescription;
      //  private TextView myDessertRecycler;
       // private TextView myRecipeIngredients;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            myRecipeImage = itemView.findViewById(R.id.recipe_image);
            myRecipeTitle = itemView.findViewById(R.id.recipe_title);
            myRecipeDescription = itemView.findViewById(R.id.recipe_description);
           // myRecipeIngredients = itemView.findViewById(R.id.recipe_ingredients);
            //onclick of items
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int dessertPosition = getAdapterPosition();
                    Recipe currentDessert = recipeData.get(dessertPosition);
                   // myDessertRecycler = itemView.findViewById(R.id.recycler_dessert);
                  //  if (itemView == myDessertRecycler) {
                        if (dessertPosition == 0) {
                            Intent donutIntent = new Intent(myContext, DonutActivity.class);
                            donutIntent.putExtra("dTitle", currentDessert.getRecipeTitle());
                            donutIntent.putExtra("dImage", currentDessert.getRecipeImage());
                            donutIntent.putExtra("dDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(donutIntent);

                        } else if (dessertPosition == 1) {
                            Intent froyoIntent = new Intent(myContext, FroyoActivity.class);
                            froyoIntent.putExtra("fTitle", currentDessert.getRecipeTitle());
                            froyoIntent.putExtra("fImage", currentDessert.getRecipeImage());
                            froyoIntent.putExtra("fDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(froyoIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 2) {
                            Intent icsIntent = new Intent(myContext, SandwichActivity.class);
                            icsIntent.putExtra("icsTitle", currentDessert.getRecipeTitle());
                            icsIntent.putExtra("icsImage", currentDessert.getRecipeImage());
                            icsIntent.putExtra("icsDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(icsIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 3) {
                            Intent cupIntent = new Intent(myContext, CupcakeActivity.class);
                            cupIntent.putExtra("cupTitle", currentDessert.getRecipeTitle());
                            cupIntent.putExtra("cupImage", currentDessert.getRecipeImage());
                            cupIntent.putExtra("cupDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(cupIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 4) {
                            Intent jellyIntent = new Intent(myContext, JellyActivity.class);
                            jellyIntent.putExtra("jellyTitle", currentDessert.getRecipeTitle());
                            jellyIntent.putExtra("jellyImage", currentDessert.getRecipeImage());
                            jellyIntent.putExtra("jellyDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(jellyIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 5) {
                            Intent icIntent = new Intent(myContext, IceCreamActivity.class);
                            icIntent.putExtra("icTitle", currentDessert.getRecipeTitle());
                            icIntent.putExtra("icImage", currentDessert.getRecipeImage());
                            icIntent.putExtra("icDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(icIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 6) {
                            Intent tIntent = new Intent(myContext, TiramisuActivity.class);
                            tIntent.putExtra("tTitle", currentDessert.getRecipeTitle());
                            tIntent.putExtra("tImage", currentDessert.getRecipeImage());
                            tIntent.putExtra("tDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(tIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 7) {
                            Intent cookieIntent = new Intent(myContext, CookieActivity.class);
                            cookieIntent.putExtra("cookieTitle", currentDessert.getRecipeTitle());
                            cookieIntent.putExtra("cookieImage", currentDessert.getRecipeImage());
                            cookieIntent.putExtra("cookieDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(cookieIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        } else if (dessertPosition == 8) {
                            Intent ccIntent = new Intent(myContext, CheeseCakeActivity.class);
                            ccIntent.putExtra("ccTitle", currentDessert.getRecipeTitle());
                            ccIntent.putExtra("ccImage", currentDessert.getRecipeImage());
                            ccIntent.putExtra("ccDescription", currentDessert.getRecipeDescription());
                            myContext.startActivity(ccIntent);
                            //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                        }
                   // }
                }
            });
        }

        //STEP 6
        /*Create a method to bind the current view with data(Image, title and description)*/
        public void bindTo(Recipe currentRecipe)
        {
            /*6.1 Populate the view with the data
            * For loading the images use the Glide library
            * To prevent app from crashing due to loading many images of different resolutions
            * Implement the Glide Library first in your Gradle Module(App) level*/
            Glide.with(myContext).load(currentRecipe.getRecipeImage()).into(myRecipeImage);
            myRecipeTitle.setText(currentRecipe.getRecipeTitle());
            myRecipeDescription.setText(currentRecipe.getRecipeDescription());
        }
    }
}
