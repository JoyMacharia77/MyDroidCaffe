package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SandwichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);
        TextView icsTitle = findViewById(R.id.ics_title);
        icsTitle.setText(getIntent().getStringExtra("icsTitle"));
        TextView icsDescription = findViewById(R.id.ics_description);
        icsDescription.setText(getIntent().getStringExtra("icsDescription"));
        ImageView icsImage = findViewById(R.id.ics_image);
        Glide.with(this).load(getIntent().getIntExtra("icsImage", 0)).into(icsImage);
    }
}
