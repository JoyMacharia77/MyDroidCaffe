package com.joymacharia.mydroidcaffe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter <StoreAdapter.ViewHolder>{
    private ArrayList<Store> storeData;
    private Context myContext;
    /*step 3.1
     * Create Constructor to pass in the recipes data and the context*/
    StoreAdapter(ArrayList<Store> storeData,Context context)
    {
        //Initialize the objects
        this.myContext = context;
        this.storeData = storeData;
    }

    @NonNull
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(myContext).inflate(R.layout.store_list_item, parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.ViewHolder holder, int position) {
        Store currentStore= storeData.get(position);
        //Step 5.1 Populate the current view with data
        holder.bindTo(currentStore);
    }

    @Override
    public int getItemCount() {
        return storeData.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        /*Step 2.1
         * Create a constructor for the viewHolder used in an onCreateViewHolder() method
         * @param itemView rootView of the recipe_list_item layout*/
        //Step 2.2 Declare the private member variables that the viewHolder will hold
        private ImageView myStoreImage;
        private TextView myStoreTitle;
        private TextView myStoreDescription;
        //  private TextView myDessertRecycler;
        // private TextView myRecipeIngredients;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            myStoreImage = itemView.findViewById(R.id.store_image);
            myStoreTitle = itemView.findViewById(R.id.store_title);
            myStoreDescription = itemView.findViewById(R.id.store_description);
            // myRecipeIngredients = itemView.findViewById(R.id.recipe_ingredients);
            //onclick of items
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int storePosition = getAdapterPosition();
                    Store currentStore = storeData.get(storePosition);
                    if (storePosition == 0) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);

                    } else if (storePosition == 1) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);

                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    } else if (storePosition == 2) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);

                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    } else if (storePosition == 3) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);

                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    } else if (storePosition == 4) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);
                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    } else if (storePosition == 5) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);
                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    } else if (storePosition == 6) {
                        Intent mallIntent = new Intent(myContext, MallActivity.class);
                        mallIntent.putExtra("mallTitle", currentStore.getStoreTitle());
                        mallIntent.putExtra("mallImage", currentStore.getStoreImage());
                        mallIntent.putExtra("mallDescription", currentStore.getStoreDescription());
                        myContext.startActivity(mallIntent);
                        //Toast.makeText(myContext, "Create an Activity for the Dessert", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        //STEP 6
        /*Create a method to bind the current view with data(Image, title and description)*/
        public void bindTo(Store currentStore)
        {
            /*6.1 Populate the view with the data
             * For loading the images use the Glide library
             * To prevent app from crashing due to loading many images of different resolutions
             * Implement the Glide Library first in your Gradle Module(App) level*/
            Glide.with(myContext).load(currentStore.getStoreImage()).into(myStoreImage);
            myStoreTitle.setText(currentStore.getStoreTitle());
            myStoreDescription.setText(currentStore.getStoreDescription());
        }
    }

}
