package com.example.arman.syndrom_down;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Szamani on 12/26/2015.
 */
public class FelActivity extends ActionBarActivity {
    private Toolbar toolbar;

    private ImageView imViewAmr;
    private ImageView imViewGozashte;
    private ImageView imViewHessi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fel);
        setTitle(R.string.fel);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imViewAmr = (ImageView) findViewById(R.id.imViewAmr);
        imViewGozashte = (ImageView) findViewById(R.id.imViewGozashte);
        imViewHessi = (ImageView) findViewById(R.id.imViewHessi);

        imViewAmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FelActivity.this, AmrActivity.class);
                startActivity(intent);
            }
        });
//
        imViewGozashte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FelActivity.this, GozashteActivity.class);
                startActivity(intent);
            }
        });

        imViewHessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FelActivity.this, HessiActivity.class);
                startActivity(intent);
            }
        });
    }

}
