package com.test.intentrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ImageView imgView1, imgView2, imgView3, imgView4;
    int imageAtView1, imageAtView2, imageAtView3, imageAtView4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        iniListeners();
    }
    private void initViews() {
        imgView1 = findViewById(R.id.imgView1);
        imgView2 = findViewById(R.id.imgView2);
        imgView3 = findViewById(R.id.imgView3);
        imgView4 = findViewById(R.id.imgView4);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        imageAtView1 = bundle.getInt("img1");
        imageAtView2 = bundle.getInt("img2");
        imageAtView3 = bundle.getInt("img3");
        imageAtView4 = bundle.getInt("img4");

        imgView1.setImageResource(imageAtView1);
        imgView2.setImageResource(imageAtView2);
        imgView3.setImageResource(imageAtView3);
        imgView4.setImageResource(imageAtView4);
    }
    public void iniListeners(){
        imgView1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", imageAtView1);
                setResult(1, resultIntent);
                startActivity(resultIntent);

            }
        }));

            imgView2.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", imageAtView2);
                    setResult(2, resultIntent);
                    startActivity(resultIntent);

                }
            }));

        imgView3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", imageAtView3);
                setResult(3, resultIntent);
                startActivity(resultIntent);

            }
        }));

        imgView4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", imageAtView4);
                setResult(4, resultIntent);
                startActivity(resultIntent);

            }
        }));


    }

}