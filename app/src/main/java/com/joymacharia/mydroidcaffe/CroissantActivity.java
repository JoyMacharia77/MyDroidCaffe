package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CroissantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_croissant);
        TextView croissantTitle = findViewById(R.id.croissant_title);
        croissantTitle.setText(getIntent().getStringExtra("croissantTitle"));
        TextView croissantDescription = findViewById(R.id.croissant_description);
        croissantDescription.setText(getIntent().getStringExtra("croissantDescription"));
        ImageView croissantImage = findViewById(R.id.croissant_image);
        Glide.with(this).load(getIntent().getIntExtra("croissantImage", 0)).into(croissantImage);
    }
}
