package com.example.andrew.sharedelementanimationdemo;

import android.content.Intent;
import android.support.annotation.InterpolatorRes;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView = null;
    private Button lionBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.simple_activity_a_imageView);
        lionBtn = (Button) findViewById(R.id.lion_btn);
        lionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, imageView, "simple_activity_a_imageView");
                startActivity(intent, options.toBundle());
            }
        });
    }
}
