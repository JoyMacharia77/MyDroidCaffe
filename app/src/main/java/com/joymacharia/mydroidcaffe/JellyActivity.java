package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class JellyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jelly);
        TextView jellyTitle = findViewById(R.id.jelly_title);
        jellyTitle.setText(getIntent().getStringExtra("jellyTitle"));
        TextView jellyDescription = findViewById(R.id.jelly_description);
        jellyDescription.setText(getIntent().getStringExtra("jellyDescription"));
        ImageView jellyImage = findViewById(R.id.jelly_image);
        Glide.with(this).load(getIntent().getIntExtra("jellyImage", 0)).into(jellyImage);
    }
}
