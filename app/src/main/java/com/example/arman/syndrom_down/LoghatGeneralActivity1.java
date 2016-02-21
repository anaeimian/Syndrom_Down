package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LoghatGeneralActivity1 extends FragmentActivity {

    private ImageView word;
    private ImageView pass;
    private ImageView replay;
    private int replayClicked=0;
    MediaPlayer wordSound;
    MediaPlayer babaDrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general1);
        setTitle(R.string.repeatTitle);
        word = (ImageView) findViewById(R.id.word);
        pass = (ImageView) findViewById(R.id.pass);
        replay = (ImageView) findViewById(R.id.replay);
        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.baba);
        babaDrag = MediaPlayer.create(getApplicationContext(), R.raw.baba_drag);
        controller();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity_new, menu);
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

    public void controller(){
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wordSound.start();
                replayClicked++;
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                babaDrag.start();
                if(replayClicked>=4){
                    Intent intent = new Intent(LoghatGeneralActivity1.this, LoghatGeneralActivity2.class);
                    startActivity(intent);

                }
            }
        });
    }
}