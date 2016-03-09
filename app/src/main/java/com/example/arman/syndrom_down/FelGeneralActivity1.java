package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;


public class FelGeneralActivity1 extends ActionBarActivity {
    private VideoView felVideo;
    private MediaPlayer felVoice;
    ImageView pass;
    ImageView replay;
    int position = 0;
    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity1);

        felVideo = (VideoView) findViewById(R.id.videoView);
        pass = (ImageView) findViewById(R.id.pass);
        replay = (ImageView) findViewById(R.id.replay);
        setViews();
        controller();
        felVideo.start();
        felVoice.start();
    }

    private void setViews() {
        category = getIntent().getStringExtra("category");
        String pos = getIntent().getStringExtra("position");
        if (pos != null) {
            position = Integer.parseInt(pos);

        }
        switch (category) {
            case "amr":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.bedeh_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bedeh));
                        break;
                    case 1:
                        break;
                }
                break;
            case "gozashte":
                break;
            case "hessi":
                break;
            case "twowords":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;

            case "threewords":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;
            case "zamir":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;


        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fel_general_activity1, menu);
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
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FelGeneralActivity1.this, FelGeneralActivity2.class);
                startActivity(intent);
            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                felVideo.start();
                felVoice.start();
            }
        });
    }
}
