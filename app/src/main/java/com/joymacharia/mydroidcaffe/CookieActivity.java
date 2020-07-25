package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CookieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);
        TextView cookieTitle = findViewById(R.id.cookie_title);
        cookieTitle.setText(getIntent().getStringExtra("cookieTitle"));
        TextView cookieDescription = findViewById(R.id.cookie_description);
        cookieDescription.setText(getIntent().getStringExtra("cookieDescription"));
        ImageView cookieImage = findViewById(R.id.cookie_image);
        Glide.with(this).load(getIntent().getIntExtra("cookieImage", 0)).into(cookieImage);
    }
}
