package com.example.arman.syndrom_down;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.VideoView;


public class FelGeneralActivity2 extends ActionBarActivity {
    private VideoView felVideo;
    private MediaPlayer felVoice;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;
    ImageView pass;
    ImageView fail;
    int passclicked = 0;
    int failclicked = 0;
    String category;
    int position;
    private ImageView guide;
    Dialog settingsDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity2);
        felVoice = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        payMoreAttention = MediaPlayer.create(this, R.raw.pay_more_attention);
        tashvigh = MediaPlayer.create(this, R.raw.afarin);
        felVideo = (VideoView) findViewById(R.id.videoView);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        setViews();
        controller();
        felVideo.start();
        felVoice.start();
        guide = (ImageView) findViewById(R.id.guide);
        settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.fel_dialog_layout2, null));
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                settingsDialog.show();
            }
        });
    }


    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
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
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bedeh_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.begir_clip));
                        break;
                    case 2:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.biya_clip));
                        break;
                    case 3:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshin_clip));
                        break;
                    case 4:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shostan_clip));
                        break;
                    case 5:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bokhor_clip));
                        break;
                }
                break;
            case "gozashte":
                switch (position) {
                    case 0:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.raft_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khord_clip));
                        break;
                    case 2:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabidan_clip));
                        break;
                    case 3:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan_clip));
                        break;
                }
                break;
            case "hessi":
                switch (position) {
                    case 0:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabidan_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shostan_clip));
                        break;
                    case 2:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan_clip));
                        break;
                    case 3:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khordan_clip));
                        break;
                    case 4:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khandan_clip));
                        break;
                }
                break;
            case "kalame2":
                switch (position) {
                    case 0:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babayeman_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheman_clip));
                        break;
                    case 2:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeman_clip));
                        break;
                    case 3:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babayeto_clip));
                        break;
                    case 4:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheto_clip));
                        break;
                    case 5:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeto_clip));
                        break;
                    case 6:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shaneqermez_clip));
                        break;
                    case 7:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtarekasif_clip));
                        break;
                    case 8:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafshekasif_clip));
                        break;
                    case 9:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtaretamiz_clip));
                        break;
                    case 10:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafshetamiz_clip));
                        break;
                    case 11:
                       felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.abbedeh_clip));
                        break;
                    case 12:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babaraft_clip));
                        break;
                    case 13:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.babakhabid_clip));
                        break;
                    case 14:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bachebeshin_clip));
                        break;
                }
                break;

            case "kalame3":
                switch (position) {
                    case 0:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.gorbeheivanast_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.abirangast_clip));
                        break;
                    case 2:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.mozmiveast_clip));
                        break;
                    case 3:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pesarmadreseraft_clip));
                        break;
                }
                break;
            case "zamir":
                switch (position) {
                    case 0:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.man_clip));
                        break;
                    case 1:
                        felVideo.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.to_clip));
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

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = null;
        switch (category) {
            case "amr":
                intent = new Intent(FelGeneralActivity2.this, AmrActivity.class);
                break;
            case "gozashte":
                intent = new Intent(FelGeneralActivity2.this, GozashteActivity.class);
                break;
            case "hessi":
                intent = new Intent(FelGeneralActivity2.this, HessiActivity.class);
                break;
            case "kalame2":
                intent = new Intent(FelGeneralActivity2.this, Kalame2Activity.class);
                break;
            case "kalame3":
                intent = new Intent(FelGeneralActivity2.this, Kalame3Activity.class);
                break;
            case "zamir":
                intent = new Intent(FelGeneralActivity2.this, ZamirActivity.class);
                break;
        }
        startActivity(intent);
    }

    void controller() {
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passclicked++;
                tashvigh.start();
                if (passclicked <= 3)
                    tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            if (passclicked <= 3) {
                                felVoice.start();
                                felVideo.start();
                            }
                        }
                    });


                if (passclicked >= 4) {

                    tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            if (passclicked >= 4) {
                                felVoice.release();
                                felVoice = null;
                                payMoreAttention.release();
                                payMoreAttention = null;
                                tashvigh.release();
                                tashvigh = null;
                                Intent intent;
                                if (category.equals("kalame3")) {
                                    intent = new Intent(FelGeneralActivity2.this, FelGeneralActivity4.class);
                                } else {
                                    intent = new Intent(FelGeneralActivity2.this, FelGeneralActivity3.class);
                                }
                                intent.putExtra("category", category);
                                intent.putExtra("position", position + "");
                                startActivity(intent);
                            }
                        }
                    });

                }
            }
        });
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                failclicked++;
                payMoreAttention.start();
                if (failclicked >= 3) {
                    Intent intent = new Intent(FelGeneralActivity2.this, FelGeneralActivity1.class);
                    intent.putExtra("category", category);
                    intent.putExtra("position", position + "");
                    startActivity(intent);
                }

            }
        });
    }
}
