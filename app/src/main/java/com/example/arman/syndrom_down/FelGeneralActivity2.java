package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;


public class FelGeneralActivity2 extends ActionBarActivity {
    private VideoView felVideo;
    private MediaPlayer felVoice;
    ImageView pass;
    ImageView fail;
    int passclicked = 0;
    int failclicked = 0;
    String category;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity2);
        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        felVideo = (VideoView) findViewById(R.id.videoView);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
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
        getMenuInflater().inflate(R.menu.menu_fel_general_activity2, menu);
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
                passclicked++;
                if (passclicked >= 4) {
                    Intent intent = new Intent(FelGeneralActivity2.this, FelGeneralActivity3.class);
                    startActivity(intent);
                }
            }
        });
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                failclicked++;
                felVoice.start();
                if (failclicked >= 3) {
                    Intent intent = new Intent(FelGeneralActivity2.this, FelGeneralActivity1.class);
                    startActivity(intent);
                }

            }
        });
    }
}
