package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Szamani on 1/1/2016.
 */
public class Bazi1Activity extends ActionBarActivity {
    private Toolbar toolbar;
    private ImageView imView0;
    private ImageView imView1;
    private ImageView imView2;

    private ObjectAnimator animator;

    private MediaPlayer mediaPlayerRahnama;
    private MediaPlayer mediaPlayerRahnama1;
    private MediaPlayer mediaPlayerTashvigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi1);
        setTitle(getString(R.string.badkonak));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        imView0 = (ImageView) findViewById(R.id.imView0);
        imView1 = (ImageView) findViewById(R.id.imView1);
        imView2 = (ImageView) findViewById(R.id.imView2);

        animator = new ObjectAnimator();
        animator.setDuration(1500);
        animator.setTarget(imView2);
        animator.setPropertyName("translationY");

        setResources();
        setListeners();

    }

    private void setListeners() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animator.setFloatValues(0,
                        imView0.getY() - imView2.getY() + (imView0.getHeight() / 2));
                animator.start();
            }
        }, 500);

        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                imView2.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                imView2.setVisibility(View.INVISIBLE);
                mediaPlayerRahnama.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

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
//        imView0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayerRahnama.start();
//            }
//        });
//
//        imView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayerRahnama1.start();
//            }
//        });

    }

    private void setResources() {
//        mediaPlayerTashvigh = MediaPlayer.create(this, R.raw.step);
//
//        //////////////////////////////////////////////////////////////
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
        //////////////////////////////////////////////////////////////

        Random random = new Random();
        int cat = random.nextInt(10);

        switch (cat) {
            case 0:
                khanevade();
                break;
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
            default:
                khanevade();
                break;
        }
    }

    private void khanevade() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat); // imView0
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep); // imView1
        imView0.setImageResource(R.drawable.fatherimg);
        imView1.setImageResource(R.drawable.sisterimg);
    }

//    private void andam() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.binii);
//        imView1.setImageResource(R.drawable.dahani);
//    }
//
//    private void mive() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.moz);
//        imView1.setImageResource(R.drawable.sib);
//    }
//
//    private void heyvanat() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.sag);
//        imView1.setImageResource(R.drawable.gav);
//    }
//
//    private void pooshak() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.kafsh);
//        imView1.setImageResource(R.drawable.kolah);
//    }
//
//    private void vasayel() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.docharkhe);
//        imView1.setImageResource(R.drawable.havapeyma);
//    }
//
//    private void mashaghel() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.doctori);
//        imView1.setImageResource(R.drawable.nanvai);
//    }
//
//    private void rang() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.ghermez);
//        imView1.setImageResource(R.drawable.zard);
//    }
//
//    private void khordani() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.nan);
//        imView1.setImageResource(R.drawable.cake);
//    }
//
//    private void mafahim() {
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.chat);
//        mediaPlayerRahnama1 = MediaPlayer.create(this, R.raw.beep);
//        imView0.setImageResource(R.drawable.balai);
//        imView1.setImageResource(R.drawable.sardi);
//    }
}
