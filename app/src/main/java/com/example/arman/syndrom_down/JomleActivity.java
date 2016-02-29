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
public class JomleActivity extends ActionBarActivity {
    private Toolbar toolbar;

    private ImageView imViewFel;
    private ImageView imView2Kalame;
    private ImageView imView3Kalame;
    private ImageView imViewZamir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jomle);
        setTitle(getString(R.string.jomle));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imViewFel = (ImageView) findViewById(R.id.imViewFel);
        imView2Kalame = (ImageView) findViewById(R.id.imView2Kalame);
        imView3Kalame = (ImageView) findViewById(R.id.imView3Kalame);
        imViewZamir = (ImageView) findViewById(R.id.imViewZamir);

        imViewFel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JomleActivity.this, FelActivity.class);
                startActivity(intent);
            }
        });

        imView2Kalame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JomleActivity.this, Kalame2Activity.class);
                startActivity(intent);
            }
        });

        imView3Kalame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JomleActivity.this, Kalame3Activity.class);
                startActivity(intent);
            }
        });

        imViewZamir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JomleActivity.this, ZamirActivity.class);
                startActivity(intent);
            }
        });

    }
}