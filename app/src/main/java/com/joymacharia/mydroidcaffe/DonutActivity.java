package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DonutActivity extends AppCompatActivity {

    //tryyy
   // private ArrayList<Ingredients> donutRecipeData;
    //private TextView donutIngredients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut);
        TextView donutTitle = findViewById(R.id.donut_title);
        donutTitle.setText(getIntent().getStringExtra("dTitle"));
        TextView donutDescription = findViewById(R.id.donut_description);
        donutDescription.setText(getIntent().getStringExtra("dDescription"));
        ImageView donutImage = findViewById(R.id.donut_image);
        Glide.with(this).load(getIntent().getIntExtra("dImage", 0)).into(donutImage);

        //tryyy
       // donutRecipeData = new ArrayList<>();
       // initializeData();
        ///2
       /* String[][] a = new String[][]{
                {"000", "aaaa"},
                {"111", "nnnn"},
                {"222", "ssss"},
                {"333", "zaaaa"},
                {"444", "ahhhh"},
                {"555", "mmmmmm"}
        };

        donutIngredients = (TextView) findViewById(R.id.donut_ingredients);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                donutIngredients.setText(a[i][j]);
            }
        }*/
    }


   /* private void initializeData() {
        String[] dessertTitles = getResources().getStringArray(R.array.dessert_title);
        String[] dessertDescriptions = getResources().getStringArray(R.array.dessert_description);

        donutRecipeData.clear();

        for (int i=0; i<dessertTitles.length; i++)
        {
            donutRecipeData.add(new Ingredients(dessertTitles[i],dessertDescriptions[i]));
        }

    }*/

}
