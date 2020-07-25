package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CheeseCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_cake);
        TextView ccTitle = findViewById(R.id.cc_title);
        ccTitle.setText(getIntent().getStringExtra("ccTitle"));
        TextView ccDescription = findViewById(R.id.cc_description);
        ccDescription.setText(getIntent().getStringExtra("ccDescription"));
        ImageView ccImage = findViewById(R.id.cc_image);
        Glide.with(this).load(getIntent().getIntExtra("ccImage", 0)).into(ccImage);
    }
}
