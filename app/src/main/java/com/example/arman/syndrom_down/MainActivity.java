package com.example.arman.syndrom_down;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends ActionBarActivity {
    private ImageView imViewAmoozesh;
    private ImageView imViewBazi;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.asli));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imViewAmoozesh = (ImageView) findViewById(R.id.imViewAmoozesh);
        imViewBazi = (ImageView) findViewById(R.id.imViewBazi);

        imViewAmoozesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AmoozeshActivity.class);
                startActivity(intent);
            }
        });

        imViewBazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaziActivity.class);
                startActivity(intent);
            }
        });
    }
}
