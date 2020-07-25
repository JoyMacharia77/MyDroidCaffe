package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TiramisuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiramisu);
        TextView tTitle = findViewById(R.id.t_title);
        tTitle.setText(getIntent().getStringExtra("tTitle"));
        TextView tDescription = findViewById(R.id.t_description);
        tDescription.setText(getIntent().getStringExtra("tDescription"));
        ImageView tImage = findViewById(R.id.t_image);
        Glide.with(this).load(getIntent().getIntExtra("tImage", 0)).into(tImage);
    }
}
