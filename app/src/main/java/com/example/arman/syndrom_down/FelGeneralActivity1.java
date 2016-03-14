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
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bedeh_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.begir_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.begir_clip));
                        break;
                    case 2:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.biya_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.biya_clip));
                        break;
                    case 3:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.beshin_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshin_clip));
                        break;
                    case 4:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.beshour_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshour_clip));
                        break;
                    case 5:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.bokhor_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bokhor_clip));
                        break;
                }
                break;
            case "gozashte":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.raft_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.raft_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.khord_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khord_clip));
                        break;
                    case 2:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.khabid_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabid_clip));
                        break;
                    case 3:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.parid_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.parid_clip));
                        break;
                    case 4:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.david_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.david_clip));
                        break;
                }
                break;
            case "hessi":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.khabidan_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabidan_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.shostan_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shostan_clip));
                        break;
                    case 2:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.paridan_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.paridan_clip));
                        break;
                    case 3:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.davidan_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan_clip));
                        break;
                    case 4:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.khordan_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khordan_clip));
                        break;
                    case 5:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.khandan_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khandan_clip));
                        break;
                }
                break;
            case "twowords":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.babayeman_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babayeman_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafsheman_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheman_clip));
                        break;
                    case 2:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.toopeman_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeman_clip));
                        break;
                    case 3:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.babayeto_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babayeto_clip));
                        break;
                    case 4:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafsheto_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheto_clip));
                        break;
                    case 5:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.toopeto_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeto_clip));
                        break;
                    case 6:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.shanbeghermez_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shaneqermez_clip));
                        break;
                    case 7:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.dokhtarekasif_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtarekasif_clip));
                        break;
                    case 8:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafshekasif_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafshekasif_clip));
                        break;
                    case 9:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.dokhtartamiz_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtaretamiz_clip));
                        break;
                    case 10:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafshetamiz_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafshetamiz_clip));
                        break;
                    case 11:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.abbedeh_voice);
//                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.abbedeh_clip));
                        break;
                    case 12:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.babaraft_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babaraft_clip));
                        break;
                    case 13:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.babakhabid_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babakhabid_clip));
                        break;
                    case 14:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.bachebeshin_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bachebeshin_clip));
                        break;
                }
                break;

            case "threewords":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.gorbeheivanast_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.gorbeheivanast_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.abirangast_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.abirangast_clip));
                        break;
                    case 2:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.mozmiveast_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.mozmiveast_clip));
                        break;
                    case 3:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.pesarmadreseraft_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pesarmadreseraft_clip));
                        break;
                }
                break;
            case "zamir":
                switch (position) {
                    case 0:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.man_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.man_clip));
                        break;
                    case 1:
                        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.to_voice);
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.to_clip));
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

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(FelGeneralActivity1.this, FelActivity.class);
        startActivity(intent);
    }

    void controller() {
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FelGeneralActivity1.this, FelGeneralActivity2.class);
                intent.putExtra("category", category);
                intent.putExtra("position", position + "");
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
