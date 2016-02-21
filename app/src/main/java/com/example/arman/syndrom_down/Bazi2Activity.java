//package com.example.arman.syndrom_down;
//
//import android.animation.Animator;
//import android.animation.ObjectAnimator;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//
//import java.util.Random;
//
///**
// * Created by Szamani on 1/1/2016.
// */
//public class Bazi2Activity extends ActionBarActivity {
//    private Toolbar toolbar;
//
//    private ImageView imView0;
//    private ImageView imView1;
//    private ImageView imView2;
//    private ImageView imView3;
//
//    private ObjectAnimator animator;
//    private ObjectAnimator animator1;
//
//    private MediaPlayer mediaPlayerRahnama;
//    private MediaPlayer mediaPlayerRahnama1;
//    private MediaPlayer mediaPlayerTashvigh;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bazi2);
//        setTitle(getString(R.string.footbal));
//
//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);
//
//        imView0 = (ImageView) findViewById(R.id.imView0);
//        imView1 = (ImageView) findViewById(R.id.imView1);
//        imView2 = (ImageView) findViewById(R.id.imView2);
//        imView3 = (ImageView) findViewById(R.id.imView3);
//
//        animator = new ObjectAnimator();
//        animator.setDuration(1000);
//        animator.setTarget(imView1);
//        animator.setPropertyName("translationX");
//
//        animator1 = new ObjectAnimator();
//        animator1.setDuration(1000);
//        animator1.setTarget(imView3);
//        animator1.setPropertyName("translationX");
//
//        setResources();
//        setListeners();
//    }
//
//    private void setListeners() {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                animator.setFloatValues(imView0.getX() - 200, imView0.getX() - 500);
//                animator.start();
//            }
//        }, 500);
//
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imView1.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imView1.setVisibility(View.INVISIBLE);
//                mediaPlayerRahnama.start();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//
//        animator1.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imView3.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imView3.setVisibility(View.INVISIBLE);
//                mediaPlayerRahnama1.start();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//
//        mediaPlayerRahnama.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayerTashvigh.start();
//            }
//        });
//
//        mediaPlayerRahnama1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mediaPlayerTashvigh.start();
//            }
//        });
//
//
//        imView0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator.setFloatValues(imView0.getX() - 200, imView0.getX() - 500);
//                animator.start();
//            }
//        });
//
//        imView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator1.setFloatValues(imView2.getX() - 200, imView2.getX() - 500);
//                animator1.start();
//            }
//        });
//    }
//
//    private void setResources() {
//        mediaPlayerTashvigh = MediaPlayer.create(this, R.raw.step);
//
//        //////////////////////////////////////////////////////////////
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        //////////////////////////////////////////////////////////////
//
//        Random random = new Random();
//        int cat = random.nextInt(10);
//
//        switch (cat) {
//            case 0:
//                khanevade();
//                break;
//            case 1:
//                andam();
//                break;
//            case 2:
//                mive();
//                break;
//            case 3:
//                heyvanat();
//                break;
//            case 4:
//                pooshak();
//                break;
//            case 5:
//                vasayel();
//                break;
//            case 6:
//                mashaghel();
//                break;
//            case 7:
//                rang();
//                break;
//            case 8:
//                khordani();
//                break;
//            case 9:
//                mafahim();
//                break;
//            default:
//                khanevade();
//                break;
//        }
//    }
//
//    private void khanevade() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat); // imView0
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep); // imView1
//        imView0.setImageResource(R.drawable.pedari);
//        imView1.setImageResource(R.drawable.khahar);
//    }
//
//    private void andam() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.binii);
//        imView2.setImageResource(R.drawable.dahani);
//    }
//
//    private void mive() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.moz);
//        imView2.setImageResource(R.drawable.sib);
//    }
//
//    private void heyvanat() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.sag);
//        imView2.setImageResource(R.drawable.gav);
//    }
//
//    private void pooshak() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.kafsh);
//        imView2.setImageResource(R.drawable.kolah);
//    }
//
//    private void vasayel() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.docharkhe);
//        imView2.setImageResource(R.drawable.havapeyma);
//    }
//
//    private void mashaghel() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.doctori);
//        imView2.setImageResource(R.drawable.nanvai);
//    }
//
//    private void rang() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.ghermez);
//        imView2.setImageResource(R.drawable.zard);
//    }
//
//    private void khordani() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.nan);
//        imView2.setImageResource(R.drawable.cake);
//    }
//
//    private void mafahim() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.balai);
//        imView2.setImageResource(R.drawable.sardi);
//    }
//}
