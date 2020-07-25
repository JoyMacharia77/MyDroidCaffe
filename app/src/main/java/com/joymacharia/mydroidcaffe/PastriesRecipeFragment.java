package com.joymacharia.mydroidcaffe;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class PastriesRecipeFragment extends Fragment {
    /*private RecyclerView pastriesRecyclerView;
    private ArrayList<Recipe> pastriesRecipeData;
    private RecipeAdapter pastriesAdapter;*/
    private RecyclerView dessertRecyclerView;
    private ArrayList<Recipe> dessertRecipeData;
    private RecipeAdapter dessertAdapter;

    public PastriesRecipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*// 1.Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_pastries_recipe, container, false);
        //3. Initialize the recycler view
        pastriesRecyclerView = rootView.findViewById(R.id.recycler_dessert);
        //4. set a layout for the recycler view
        pastriesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //5. Initialize the array list that will contain data
        pastriesRecipeData = new ArrayList<>();
        //6 Initialize recipe adapter
        pastriesAdapter = new RecipeAdapter(pastriesRecipeData,getContext());
        //7. Set the adapter
        pastriesRecyclerView.setAdapter(pastriesAdapter);
        //8. Get Data
        initializeData();
        ItemTouchHelper helper= new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.RIGHT|ItemTouchHelper.LEFT|ItemTouchHelper.DOWN|ItemTouchHelper.UP, ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to= viewHolder.getAdapterPosition();
                Collections.swap(pastriesRecipeData,from,to);
                pastriesAdapter.notifyItemMoved(from,to);

                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                pastriesRecipeData.remove(viewHolder.getAdapterPosition());
                pastriesAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(pastriesRecyclerView);

        return rootView;*/
        // 1.Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_pastries_recipe, container, false);
        //3. Initialize the recycler view
        dessertRecyclerView = rootView.findViewById(R.id.recycler_pastries);
        //4. set a layout for the recycler view
        dessertRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //5. Initialize the array list that will contain data
        dessertRecipeData = new ArrayList<>();
        //6 Initialize recipe adapter
        dessertAdapter = new RecipeAdapter(dessertRecipeData,getContext());
        //7. Set the adapter
        dessertRecyclerView.setAdapter(dessertAdapter);
        //8. Get Data
        initializeData();
        //9.Implement Swiping and moving of Card Items
        ItemTouchHelper helper= new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.RIGHT|ItemTouchHelper.LEFT|ItemTouchHelper.DOWN|ItemTouchHelper.UP, ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to= viewHolder.getAdapterPosition();
                Collections.swap(dessertRecipeData,from,to);
                dessertAdapter.notifyItemMoved(from,to);

                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                dessertRecipeData.remove(viewHolder.getAdapterPosition());
                dessertAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(dessertRecyclerView);

        return rootView;
    }
    /*

    private void initializeData()
    {
        //8.1 Get the data you created in the resource file: strings.xml
        String[] pastriesTitles = getResources().getStringArray(R.array.dessert_title);
        String[] pastriesDescriptions = getResources().getStringArray(R.array.dessert_description);
        TypedArray pastriesImages= getResources().obtainTypedArray(R.array.desserts_images);
        //8.2 Clear Existing data to avoid duplications
        pastriesRecipeData.clear();
        //8.3 Create an array list of dessert Recipes with the title,description and images
        for (int i=0; i<pastriesTitles.length; i++)
        {
            pastriesRecipeData.add(new Recipe(pastriesImages.getResourceId(i, 0), pastriesTitles[i], pastriesDescriptions[i]));
        }
        //8.4 Clean Up the data in the typed array
        pastriesImages.recycle();
        //8.5 Notify the adapter of the change in the data set
        pastriesAdapter.notifyDataSetChanged();
    } */
    private void initializeData()
    {
        //8.1 Get the data you created in the resource file: strings.xml
        String[] dessertTitles = getResources().getStringArray(R.array.pastries_title);
        String[] dessertDescriptions = getResources().getStringArray(R.array.pastries_description);
        TypedArray dessertImages= getResources().obtainTypedArray(R.array.pastries_images);
        //8.2 Clear Existing data to avoid duplications
        dessertRecipeData.clear();
        //8.3 Create an array list of dessert Recipes with the title,description and images
        for (int i=0; i<dessertTitles.length; i++)
        {
            dessertRecipeData.add(new Recipe(dessertImages.getResourceId(i, 0), dessertTitles[i], dessertDescriptions[i]));
        }
        //8.4 Clean Up the data in the typed array
        dessertImages.recycle();
        //8.5 Notify the adapter of the change in the data set
        dessertAdapter.notifyDataSetChanged();
    }
}
