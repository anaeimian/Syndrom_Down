package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LoghatGeneralActivity1 extends FragmentActivity {

    private ImageView word;
    private ImageView pass;
    private ImageView replay;
    private int replayClicked = 0;
    MediaPlayer wordSound;
    MediaPlayer dragVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general1);
        setTitle(R.string.repeatTitle);
        setViews();
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

    private void setViews() {

        int position = 0;
        Intent intent = getIntent();
        String category = intent.getStringExtra("category");
        Log.d("test", category);
        pass = (ImageView) findViewById(R.id.pass);
        replay = (ImageView) findViewById(R.id.replay);
        word = (ImageView) findViewById(R.id.word);

        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.father);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.fathersound);
                        break;
                    case 1:
//                        word.setImageResource(R.drawable.mother);
//             wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mothersound);
                        break;
                    case 2:
//                        word.setImageResource(R.drawable.brother);
//                wordSound = MediaPlayer.create(getApplicationContext(), R.raw.brothersound);
                        break;
                    case 3:
//                        word.setImageResource(R.drawable.sister);
//                wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sistersound);
                        break;
                    default:
                        break;
                }
                break;
            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.garm);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.garm);
                        break;
                    default:
                        break;
                }
                break;
        }
    }

    public void controller() {
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

                if (replayClicked >= 4) {
                    Intent intent = new Intent(LoghatGeneralActivity1.this, LoghatGeneralActivity2.class);
                    startActivity(intent);
                    dragVoice.start();
                }
            }
        });
    }
}
