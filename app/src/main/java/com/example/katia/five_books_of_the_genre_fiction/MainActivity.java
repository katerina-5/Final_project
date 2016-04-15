package com.example.katia.five_books_of_the_genre_fiction;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity1.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity2.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity3.class);
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity4.class);
        startActivity(intent);
    }

    public void onClick5(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity5.class);
        startActivity(intent);
    }
}
