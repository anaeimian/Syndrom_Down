package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Szamani on 1/1/2016.
 */
public class Bazi2Activity2 extends ActionBarActivity {
    private Toolbar toolbar;

    private ImageView field;
    private ImageView ball;
    private ImageView goal2;
    private ImageView pic1;
    private ImageView pic2;
    private float ballX = 0;
    private ObjectAnimator animator;

    private MediaPlayer mediaPlayerRahnama;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi2);
//        setTitle(getString(R.string.footbal));

//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);

//        imView0 = (ImageView) findViewById(R.id.imView0);
//        goal1 = (ImageView) findViewById(R.id.goal1);
        ball = (ImageView) findViewById(R.id.ball);
        field = (ImageView) findViewById(R.id.field);
//        goal2 = (ImageView) findViewById(R.id.goal2);
        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        mediaPlayerRahnama = MediaPlayer.create(getApplicationContext(), R.raw.football_madar);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
//        Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        int width = size.x;
//        int height = size.y;
//        xCenter = width;
        animator = new ObjectAnimator();
        animator.setDuration(1000);
        animator.setTarget(ball);
        animator.setPropertyName("translationX");

//        animator1 = new ObjectAnimator();
//        animator1.setDuration(1000);
//        animator1.setTarget(imView3);
//        animator1.setPropertyName("translationX");
        handleIntent();
//        setResources();
        setListeners();
    }

    private void handleIntent() {
        Intent intent = getIntent();
        String category = intent.getStringExtra("category");
        switch (category) {
            case "khanevade":
                pic1.setImageResource(R.drawable.tbaba);
                pic2.setImageResource(R.drawable.tmaman);
                mediaPlayerRahnama.start();
                pic2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tashvigh.start();
                        animator.setFloatValues(0, field.getWidth() / 2 - 30);
                        animator.start();
                    }
                });
                pic1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payMoreAttention.start();
//                        animator.setFloatValues(0, field.getWidth()/2-10);
//                        animator.start();
                    }
                });
                animator.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        ball.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        ball.setVisibility(View.INVISIBLE);
                        Intent intent = new Intent(Bazi2Activity2.this, BaziListActivity.class);
                        intent.putExtra("gameType", "football");
                        startActivity(intent);
//                mediaPlayerTashvigh.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });

                break;
            default:
                break;

        }

    }

    private void setListeners() {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                animator.setFloatValues(imView1.getX() + 500, imView1.getX());
//                animator.start();
//            }
//        }, 500);

//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                ball.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                ball.setVisibility(View.INVISIBLE);
////                mediaPlayerRahnama.start();
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


//        imView0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator.setFloatValues(imView0.getX() - 200, imView0.getX() - 500);
//                animator.start();
//            }
//        });

//        goal1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator.setFloatValues(0, -ball.getX() + goal1.getX());
//                animator.start();
//            }
//        });
//        goal2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator.setFloatValues(0, goal2.getX() - ball.getX());
//                animator.start();
//            }
//        });
    }

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
}
