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
public class BaziActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ImageView imViewBazi1;
    private ImageView imViewBazi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi);
        setTitle(getString(R.string.bazi));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imViewBazi1 = (ImageView) findViewById(R.id.imViewBazi1);
        imViewBazi2 = (ImageView) findViewById(R.id.imViewBazi2);

        imViewBazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaziActivity.this, BaziListActivity.class);
                intent.putExtra("gameType","balloon");
                startActivity(intent);
            }
        });
//
        imViewBazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaziActivity.this, BaziListActivity.class);
                intent.putExtra("gameType","football");
                startActivity(intent);
            }
        });

    }
}

