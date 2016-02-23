package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LoghatGeneralActivity6 extends ActionBarActivity {
    ImageView word;
    ImageView pass;
    ImageView fail;
    MediaPlayer inchie;
    MediaPlayer failSound;
    int passClicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity6);
        word = (ImageView) findViewById(R.id.word);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        inchie = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        failSound = MediaPlayer.create(getApplicationContext(), R.raw.fail);
        controller();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity6, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void controller() {
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                failSound.start();
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passClicked++;
                if (passClicked >= 4) {
                    Intent intent = new Intent(LoghatGeneralActivity6.this, KhanevadeActivity.class);
                    startActivity(intent);
                }
            }
        });
        inchie.start();
    }
}
