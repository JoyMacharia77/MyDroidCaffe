package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        TextView mallTitle = findViewById(R.id.mall_title);
        mallTitle.setText(getIntent().getStringExtra("mallTitle"));
        TextView mallDescription = findViewById(R.id.mall_description);
        mallDescription.setText(getIntent().getStringExtra("mallDescription"));
        ImageView mallImage = findViewById(R.id.mall_image);
        Glide.with(this).load(getIntent().getIntExtra("mallImage", 0)).into(mallImage);
    }
}
