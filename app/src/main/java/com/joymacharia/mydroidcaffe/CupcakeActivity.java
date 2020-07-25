package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CupcakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcake);
        TextView cupTitle = findViewById(R.id.cup_title);
        cupTitle.setText(getIntent().getStringExtra("cupTitle"));
        TextView cupDescription = findViewById(R.id.cup_description);
        cupDescription.setText(getIntent().getStringExtra("cupDescription"));
        ImageView cupImage = findViewById(R.id.cup_image);
        Glide.with(this).load(getIntent().getIntExtra("cupImage", 0)).into(cupImage);
    }
}
