package com.test.intentrestaurant;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
     Button btn1, btn2, btn3, btn4;
     TextView txtname,txtmenu;
     String Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }
    private void initViews(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        txtmenu=findViewById(R.id.txtmenu);
        txtname=findViewById(R.id.txtmenu2);

    }
    private void initListeners(){
       btn1.setOnClickListener(new btn1());
       btn2.setOnClickListener(new btn2());
       btn3.setOnClickListener(new btn3());
       btn4.setOnClickListener(new btn4());
    }

    class btn1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("img1",R.drawable.starter1);
            intent.putExtra("img2",R.drawable.starter2);
            intent.putExtra("img3",R.drawable.starter3);
            intent.putExtra("img4",R.drawable.starter4);
           startActivity(intent);
        }
    }
    class btn2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class );
            intent.putExtra("img1", R.drawable.drink1);
            intent.putExtra("img2", R.drawable.drink2);
            intent.putExtra("img3", R.drawable.drink3);
            intent.putExtra("img4", R.drawable.drink4);
            startActivity(intent);
        }
    }
    class btn3 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("img1", R.drawable.maincource1);
            intent.putExtra("img2", R.drawable.maincource2);
            intent.putExtra("img3", R.drawable.maincource3);
            intent.putExtra("img4", R.drawable.maincource4);
            startActivity(intent);
        }
    }

    class btn4 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("img1", R.drawable.dessert1);
            intent.putExtra("img2", R.drawable.dessert2);
            intent.putExtra("img3", R.drawable.dessert3);
            intent.putExtra("img4", R.drawable.dessert4);
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        Result=bundle.getString("Result");

    }
}



