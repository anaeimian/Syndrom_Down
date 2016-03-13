package com.example.arman.syndrom_down;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Szamani on 12/20/2015.
 */
public class AmoozeshActivity extends ActionBarActivity {
    private ImageView imViewLoghat;
    private ImageView imViewJomle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amoozesh);
        setTitle(getString(R.string.amoozesh));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imViewLoghat = (ImageView) findViewById(R.id.imViewLoghat);
        imViewJomle = (ImageView) findViewById(R.id.imViewJomle);

        imViewLoghat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmoozeshActivity.this, LoghatActivity.class);
                startActivity(intent);
            }
        });

        imViewJomle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmoozeshActivity.this, JomleActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(AmoozeshActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
