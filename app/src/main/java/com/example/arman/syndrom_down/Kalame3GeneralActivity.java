//package com.example.arman.syndrom_down;
//
//import android.graphics.Color;
//import android.media.MediaPlayer;
//import android.net.Uri;
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.Log;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ScrollView;
//import android.widget.VideoView;
//
///**
// * Created by Szamani on 12/28/2015.
// */
//public class Kalame3GeneralActivity extends ActionBarActivity {
//    private Toolbar toolbar;
//    private int which;
//    private boolean active;
//
//    private int c0;
//    private int c1;
//    private int c1w;
//    private int c2;
//    private int c3;
//
//    MediaPlayer mediaPlayer1;
//    MediaPlayer mediaPlayer2;
//    MediaPlayer mediaPlayer3;
//
//    MediaPlayer mediaPlayerRahnama;
//    private MediaPlayer mediaPlayerTashvigh;
//
//    private ScrollView scrollView;
//
//    private LinearLayout l1;
//    private LinearLayout l2;
//    private LinearLayout l3;
//
//    private VideoView vidView0;
//    private ImageView imViewReplay;
//    private ImageView imViewNext;
//
//    private ImageView sep1;
//
//    private VideoView vidView1;
//    private ImageView imViewPass0;
//    private ImageView imViewFail0;
//
//    private ImageView sep2;
//
//    private ImageView imViewIcon;
//    private ImageView imView0;
//    private ImageView imView1;
//    private ImageView imView2;
//
//    private ImageView sep3;
//
//    private ImageView imViewIcon2;
//    private ImageView imViewPass;
//    private ImageView imViewFail;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_kalame_3_general);
//
//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);
//        setTitle(getIntent().getStringExtra(Utils.NAME));
//
//        which = getIntent().getIntExtra(Utils.WHICH, 0);
//        active = getIntent().getBooleanExtra(Utils.ACTIVE, false); // is passed?
//
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayerTashvigh = MediaPlayer.create(this, R.raw.step);
//
//        initializeViews();
//        setImageResources();
//        if (!active)
//            diActivateAll();
//        setListeners();
//    }
//
//    private void initializeViews() {
//        scrollView = (ScrollView) findViewById(R.id.scrollView);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
//            }
//        });
//
//        vidView0 = (VideoView) findViewById(R.id.vidView0);
//        imViewReplay = (ImageView) findViewById(R.id.imViewReplay);
//        imViewNext = (ImageView) findViewById(R.id.imViewNext);
//
//        sep1 = (ImageView) findViewById(R.id.sep1);
//
//        vidView1 = (VideoView) findViewById(R.id.vidView1);
//        imViewPass0 = (ImageView) findViewById(R.id.imViewPass0);
//        imViewFail0 = (ImageView) findViewById(R.id.imViewFail0);
//
//        sep2 = (ImageView) findViewById(R.id.sep2);
//
//        imViewIcon = (ImageView) findViewById(R.id.imViewIcon);
//        imView0 = (ImageView) findViewById(R.id.imView0);
//        imView1 = (ImageView) findViewById(R.id.imView1);
//        imView2 = (ImageView) findViewById(R.id.imView2);
//
//        imView0.setVisibility(View.INVISIBLE);
//        imView1.setVisibility(View.INVISIBLE);
//        imView2.setVisibility(View.INVISIBLE);
//
//        l1 = (LinearLayout) findViewById(R.id.l1);
//        l2 = (LinearLayout) findViewById(R.id.l2);
//        l3 = (LinearLayout) findViewById(R.id.l3);
//
//        scrollView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return true;
//            }
//        });
//
//        sep3 = (ImageView) findViewById(R.id.sep3);
//
//        imViewIcon2 = (ImageView) findViewById(R.id.imViewIcon2);
//        imViewPass = (ImageView) findViewById(R.id.imViewPass);
//        imViewFail = (ImageView) findViewById(R.id.imViewFail);
//    }
//
//    private void passSection() {
//        int i = 0;
//        active = true;
//
//        while (i < Utils.database.kalame3.length &&
//                Utils.database.kalame3[++i]) ;
//        Utils.database.kalame3[i] = true;
//
//        DatabaseAdapter.getInstance().saveDatabase(Kalame3GeneralActivity.this,
//                Utils.database);
//    }
//
//    private void diActivateAll() {
//        vidView1.setEnabled(false);
//        imViewPass.setEnabled(false);
//        imViewFail.setEnabled(false);
//        imViewIcon.setEnabled(false);
//        imView0.setEnabled(false);
//        imView1.setEnabled(false);
//        imView2.setEnabled(false);
//        imViewIcon2.setEnabled(false);
//        imViewPass.setEnabled(false);
//        imViewFail.setEnabled(false);
//    }
//
//    private void deActivate1() {
//        vidView1.setEnabled(false);
//        imViewPass0.setEnabled(false);
//        imViewFail0.setEnabled(false);
//        l1.setBackgroundColor(Color.parseColor("#CCC"));
//
//        c0 = 0;
//        c1 = 0;
//        c1w = 0;
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
//            }
//        });
//    }
//
//    private void activate1() {
//        vidView1.setEnabled(true);
//        imViewPass0.setEnabled(true);
//        imViewFail0.setEnabled(true);
//        l1.setBackgroundColor(Color.TRANSPARENT);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep1.getY());
//            }
//        });
//
//        vidView1.post(new Runnable() {
//            @Override
//            public void run() {
//                if (!vidView1.isPlaying())
//                    vidView1.start();
//            }
//        });
//    }
//
//    private void activate2() {
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep2.getY());
//            }
//        });
//
//        imViewIcon.setEnabled(true);
//
//        imView0.setEnabled(true);
//        imView1.setEnabled(true);
//        imView2.setEnabled(true);
//        l2.setBackgroundColor(Color.TRANSPARENT);
//
//        mediaPlayerRahnama.start();
//    }
//
//    private void activate3() {
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep3.getY());
//            }
//        });
//
//        imViewIcon2.setEnabled(true);
//        imViewPass.setEnabled(true);
//        imViewFail.setEnabled(true);
//        l3.setBackgroundColor(Color.TRANSPARENT);
//
//    }
//
//    private void setListeners() {
//        imViewReplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!vidView0.isPlaying()) {
//                    vidView0.requestFocus();
//                    vidView0.start();
//                    ++c0;
//                }
//            }
//        });
//
//        imViewNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!vidView0.isPlaying() && c0 >= 4) {
//                    activate1();
//                }
//            }
//        });
//
//        ////////////////////////////////////////////////////////////////////
//
//        imViewPass0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ++c1;
//
//                if (!vidView1.isPlaying()) {
//                    if (c1 >= 4)
//                        activate2();
//                    else vidView1.start();
//                }
//            }
//        });
//
//        imViewFail0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ++c1w;
//
//                if (!vidView1.isPlaying()) {
//                    if (c1w >= 3)
//                        deActivate1();
//                    else vidView1.start();
//                }
//            }
//        });
//
//        ////////////////////////////////////////////////////////////////////
//        imViewIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (c2 < 4)
//                    mediaPlayer1.start();
//                else activate3();
//            }
//        });
//
//        mediaPlayer1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                imView0.setVisibility(View.VISIBLE);
//                mediaPlayer2.start();
//            }
//        });
//
//        mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                imView1.setVisibility(View.VISIBLE);
//                mediaPlayer3.start();
//            }
//        });
//
//        mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                imView2.setVisibility(View.VISIBLE);
//                ++c2;
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        imView0.setVisibility(View.INVISIBLE);
//                        imView1.setVisibility(View.INVISIBLE);
//                        imView2.setVisibility(View.INVISIBLE);
//                    }
//                }, 500);
//            }
//        });
//
//        ////////////////////////////////////////////////////////////////////////////////
//
//        imViewPass.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ++c3;
//
//                if (c3 >= 4)
//                    if (!active)
//                        passSection();
//                    else mediaPlayerTashvigh.start();
//            }
//        });
//    }
//
//    private void setImageResources() {
//        switch (which) {
//            case 0:
//                gorbeheyvanast();
//                break;
//
//            case 1:
//                abirangast();
//                break;
//
//            case 2:
//                mozmiveast();
//                break;
//
//            case 3:
//                pesarmadreseraft();
//                break;
//
//            default:
//                break;
//        }
//    }
//
//    private void gorbeheyvanast() {
//        imView0.setImageResource(R.drawable.gorbe);
//        imView1.setImageResource(R.drawable.heyvan);
//        imView2.setImageResource(R.drawable.ast);
//        imViewIcon.setImageResource(R.drawable.gorbei);
//        imViewIcon2.setImageResource(R.drawable.gorbeheyvanasti);
//
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.gorbeheyvanast));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.gorbeheyvanast));
//
//        mediaPlayer1 = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayer2 = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayer3 = MediaPlayer.create(this, R.raw.step);
//    }
//
//    private void abirangast() {
//        imView0.setImageResource(R.drawable.abi);
//        imView1.setImageResource(R.drawable.rang);
//        imView2.setImageResource(R.drawable.ast);
//        imViewIcon.setImageResource(R.drawable.abi);
//        imViewIcon2.setImageResource(R.drawable.medadabiasti);
//
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.medadabiast));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.medadabiast));
//
//        mediaPlayer1 = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayer2 = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayer3 = MediaPlayer.create(this, R.raw.step);
//    }
//
//    private void mozmiveast() {
//        imView0.setImageResource(R.drawable.moz);
//        imView1.setImageResource(R.drawable.mive);
//        imView2.setImageResource(R.drawable.ast);
//        imViewIcon.setImageResource(R.drawable.mozi);
//        imViewIcon2.setImageResource(R.drawable.mozmiveasti);
//
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.mozmiveast));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.mozmiveast));
//
//        mediaPlayer1 = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayer2 = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayer3 = MediaPlayer.create(this, R.raw.step);
//    }
//
//    private void pesarmadreseraft() {
//        imView0.setImageResource(R.drawable.pesar);
//        imView1.setImageResource(R.drawable.madrese);
//        imView2.setImageResource(R.drawable.raft);
//        imViewIcon.setImageResource(R.drawable.pesari);
//        imViewIcon2.setImageResource(R.drawable.dokhtarmadreserafti);
//
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtarmadreseraft));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.dokhtarmadreseraft));
//
//        mediaPlayer1 = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayer2 = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayer3 = MediaPlayer.create(this, R.raw.step);
//    }
//
//}
