package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IceCreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream);
        TextView icTitle = findViewById(R.id.ic_title);
        icTitle.setText(getIntent().getStringExtra("icTitle"));
        TextView icDescription = findViewById(R.id.ic_description);
        icDescription.setText(getIntent().getStringExtra("icDescription"));
        ImageView icImage = findViewById(R.id.ic_image);
        Glide.with(this).load(getIntent().getIntExtra("icImage", 0)).into(icImage);
    }
}
