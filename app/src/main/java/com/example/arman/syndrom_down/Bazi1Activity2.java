package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Bazi1Activity2 extends ActionBarActivity {
    private Toolbar toolbar;
    private ImageView word1;
    private ImageView word2;

    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;

    private MediaPlayer wordVoice;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;
    MediaPlayer clapSound;

    ArrayList<String> receivedItems;
    ArrayList<String> remainedItems;
    String category;

    private ObjectAnimator animator11;
    private ObjectAnimator animator12;
    private ObjectAnimator animator13;
    private ObjectAnimator animator14;
    private ObjectAnimator animator5;
    private ObjectAnimator animator6;
    private ObjectAnimator animator7;
    private ObjectAnimator animator8;
    private ObjectAnimator animator9;
    private ObjectAnimator animator10;

    ImageView star1;
    ImageView star2;
    ImageView star3;
    ImageView star4;
    ImageView star5;
    ImageView star6;
    ImageView star7;
    ImageView star8;
    ImageView star9;
    ImageView star10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi1);
        setTitle(getString(R.string.badkonak));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        word1 = (ImageView) findViewById(R.id.imView0);
        word2 = (ImageView) findViewById(R.id.imView1);
        tashvigh = MediaPlayer.create(this, R.raw.afarin);
        payMoreAttention = MediaPlayer.create(this, R.raw.pay_more_attention);
        clapSound = MediaPlayer.create(getApplicationContext(), R.raw.clap);

        animator1 = new ObjectAnimator();
        animator1.setDuration(1500);
        animator1.setTarget(word1);
        animator1.setPropertyName("translationY");

        animator2 = new ObjectAnimator();
        animator2.setDuration(1500);
        animator2.setTarget(word2);
        animator2.setPropertyName("translationY");

        animator3 = new ObjectAnimator();
        animator3.setDuration(1500);
        animator3.setTarget(word1);
        animator3.setPropertyName("translationY");

        animator4 = new ObjectAnimator();
        animator4.setDuration(1500);
        animator4.setTarget(word2);
        animator4.setPropertyName("translationY");
//        setResources();
//        setListeners();
        handleIntent();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Bazi1Activity2.this, BaziListActivity.class);
        tashvigh.release();
        tashvigh = null;
        wordVoice.release();
        wordVoice = null;
        payMoreAttention.release();
        payMoreAttention = null;
        startActivity(intent);
    }


    void successAnimation() {
        Log.d("succes", "succes animation");
        clapSound.start();
        clapSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        star1 = (ImageView) findViewById(R.id.star1);
        star2 = (ImageView) findViewById(R.id.star2);
        star3 = (ImageView) findViewById(R.id.star3);
        star4 = (ImageView) findViewById(R.id.star4);
        star5 = (ImageView) findViewById(R.id.star5);
        star6 = (ImageView) findViewById(R.id.star6);
        star7 = (ImageView) findViewById(R.id.star7);
        star8 = (ImageView) findViewById(R.id.star8);
        star9 = (ImageView) findViewById(R.id.star9);
        star10 = (ImageView) findViewById(R.id.star10);
        animator11 = new ObjectAnimator();
        animator11.setDuration(2000);
        animator11.setTarget(star1);
        animator11.setPropertyName("translationY");

        animator12 = new ObjectAnimator();
        animator12.setDuration(2000);
        animator12.setTarget(star2);
        animator12.setPropertyName("translationY");

        animator13 = new ObjectAnimator();
        animator13.setDuration(2000);
        animator13.setTarget(star3);
        animator13.setPropertyName("translationY");

        animator14 = new ObjectAnimator();
        animator14.setDuration(2000);
        animator14.setTarget(star4);
        animator14.setPropertyName("translationY");

        animator5 = new ObjectAnimator();
        animator5.setDuration(2000);
        animator5.setTarget(star5);
        animator5.setPropertyName("translationY");

        animator6 = new ObjectAnimator();
        animator6.setDuration(3000);
        animator6.setTarget(star6);
        animator6.setPropertyName("translationY");

        animator7 = new ObjectAnimator();
        animator7.setDuration(3000);
        animator7.setTarget(star7);
        animator7.setPropertyName("translationY");

        animator8 = new ObjectAnimator();
        animator8.setDuration(3000);
        animator8.setTarget(star8);
        animator8.setPropertyName("translationY");

        animator9 = new ObjectAnimator();
        animator9.setDuration(3000);
        animator9.setTarget(star9);
        animator9.setPropertyName("translationY");

        animator10 = new ObjectAnimator();
        animator10.setDuration(3000);
        animator10.setTarget(star10);
        animator10.setPropertyName("translationY");

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final int width = size.x;
        final int height = size.y;
        Log.d("test", width + "");
        Log.d("test", height + "");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animator11.setFloatValues(0, -height - 300);
                animator11.start();
                animator12.setFloatValues(0, -height - 300);
                animator12.start();
                animator13.setFloatValues(0, -height - 300);
                animator13.start();
                animator14.setFloatValues(0, -height - 300);
                animator14.start();
                animator5.setFloatValues(0, -height - 300);
                animator5.start();
                animator6.setFloatValues(0, -height - 300);
                animator6.start();
                animator7.setFloatValues(0, -height - 300);
                animator7.start();
                animator8.setFloatValues(0, -height - 300);
                animator8.start();
                animator9.setFloatValues(0, -height - 300);
                animator9.start();
                animator10.setFloatValues(0, -height - 300);
                animator10.start();
            }
        }, 500);
        animator11.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                star1.setX(width / 6);
                star2.setX(2 * width / 6);
                star3.setX(3 * width / 6);
                star4.setX(4 * width / 6);
                star5.setX(5 * width / 6);
                star6.setX(width / 6);
                star7.setX(2 * width / 6);
                star8.setX(3 * width / 6);
                star9.setX(4 * width / 6);
                star10.setX(5 * width / 6);
                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
                star3.setVisibility(View.VISIBLE);
                star4.setVisibility(View.VISIBLE);
                star5.setVisibility(View.VISIBLE);
                star6.setVisibility(View.VISIBLE);
                star7.setVisibility(View.VISIBLE);
                star8.setVisibility(View.VISIBLE);
                star9.setVisibility(View.VISIBLE);
                star10.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = null;
                if (category.equals("mashaghel") || category.equals("rang") || category.equals("khanevade")) {
                    intent = new Intent(Bazi1Activity2.this, BaziListActivity.class);
                } else {
                    intent = new Intent(Bazi1Activity2.this, Bazi1Activity3.class);
                }
                intent.putExtra("category", category);
                intent.putExtra("gameType", "balloon");
                intent.putExtra("list", remainedItems);
                tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        tashvigh.release();
                        tashvigh = null;
                        payMoreAttention.release();
                        payMoreAttention = null;
                        wordVoice.release();
                        wordVoice = null;

                    }
                });
//                                memoryReleaser(tashvigh);
//                                memoryReleaser(wordVoice);
//                                memoryReleaser(payMoreAttention);
                startActivity(intent);


            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    private void handleIntent() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        receivedItems = intent.getStringArrayListExtra("list");
        Random random = new Random();
        int answerPos = random.nextInt(2);

        int categorySize = 0;

        switch (category) {
            case "khanevade":
                categorySize = 4 - 2;
                break;
            case "andam":
                categorySize = 10 - 2;
                break;
            case "miveh":
                categorySize = 5 - 2 + 1;
                break;
            case "heyvanat":
                categorySize = 6 - 2;
                break;
            case "pooshak":
                categorySize = 7 - 2 + 1;
                break;
            case "vasayel":
                categorySize = 9 - 2 + 1;
                break;

            case "mashaghel":
                categorySize = 3 - 2 + 1;
                break;
            case "rang":
                categorySize = 3 - 2 + 1;
                break;
            case "khordani":
                categorySize = 5 - 2 + 1;
                break;
            case "mafahim":
                categorySize = 9 - 2 + 1;
                break;
        }
        int selectedItem1 = random.nextInt(categorySize);
        int selectedItem2 = random.nextInt(categorySize);
        while (selectedItem2 == selectedItem1) {
            selectedItem2 = random.nextInt(categorySize);
        }
        ArrayList<String> items = new ArrayList();
        items.add(receivedItems.get(selectedItem1));
        items.add(receivedItems.get(selectedItem2));

        remainedItems = new ArrayList<>();
        for (int i = 0; i < receivedItems.size(); i++) {
            if (i != selectedItem1 && i != selectedItem2)
                remainedItems.add(receivedItems.get(i));
        }

        switch (category) {
            case "khanevade":
                switch (items.get(0)) {
                    case "baba":
                        word1.setImageResource(R.drawable.balloon_baba);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
                        }
                        break;
                    case "maman":
                        word1.setImageResource(R.drawable.balloon_maman);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.maman_ko);
                        }
                        break;

                    case "khahar":
                        word1.setImageResource(R.drawable.balloon_khahar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.khahar_ko);
                        }
                        break;
                    case "dadash":
                        word1.setImageResource(R.drawable.balloon_dadash);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dadash_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "baba":
                        word2.setImageResource(R.drawable.balloon_baba);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
                        }
                        break;
                    case "maman":
                        word2.setImageResource(R.drawable.balloon_maman);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.maman_ko);
                        }
                        break;
                    case "khahar":
                        word2.setImageResource(R.drawable.balloon_khahar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.khahar_ko);
                        }
                        break;
                    case "dadash":
                        word2.setImageResource(R.drawable.balloon_dadash);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dadash_ko);
                        }
                        break;
                }

                break;

            case "andam":
                switch (items.get(0)) {
                    case "cheshm":
                        word1.setImageResource(R.drawable.balloon_cheshm);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.cheshm_ko);
                        }
                        break;
                    case "dast":
                        word1.setImageResource(R.drawable.balloon_dast);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dast_ko);
                        }
                        break;

                    case "pa":
                        word1.setImageResource(R.drawable.balloon_pa);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        }
                        break;
                    case "goosh":
                        word1.setImageResource(R.drawable.balloon_gush);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gush_ko);
                        }
                        break;
                    case "mo":
                        word1.setImageResource(R.drawable.balloon_mo);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mo_ko);
                        }
                        break;
                    case "dahan":
                        word1.setImageResource(R.drawable.balloon_dahan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dahan_ko);
                        }
                        break;

                    case "bini":
                        word1.setImageResource(R.drawable.balloon_bini);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bini_ko);
                        }
                        break;
                    case "zaban":
                        word1.setImageResource(R.drawable.balloon_zaban);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.zaban_ko);
                        }
                        break;
                    case "dandan":
                        word1.setImageResource(R.drawable.balloon_dandan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dandan_ko);
                        }
                        break;
                    case "abro":
                        word1.setImageResource(R.drawable.balloon_abro);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.abro_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "cheshm":
                        word2.setImageResource(R.drawable.balloon_cheshm);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.cheshm_ko);
                        }
                        break;
                    case "dast":
                        word2.setImageResource(R.drawable.balloon_dast);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dast_ko);
                        }
                        break;

                    case "pa":
                        word2.setImageResource(R.drawable.balloon_pa);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        }
                        break;
                    case "goosh":
                        word2.setImageResource(R.drawable.balloon_gush);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gush_ko);
                        }
                        break;
                    case "mo":
                        word2.setImageResource(R.drawable.balloon_mo);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mo_ko);
                        }
                        break;
                    case "dahan":
                        word2.setImageResource(R.drawable.balloon_dahan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dahan_ko);
                        }
                        break;

                    case "bini":
                        word2.setImageResource(R.drawable.balloon_bini);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bini_ko);
                        }
                        break;
                    case "zaban":
                        word2.setImageResource(R.drawable.balloon_zaban);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.zaban_ko);
                        }
                        break;
                    case "dandan":
                        word2.setImageResource(R.drawable.balloon_dandan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dandan_ko);
                        }
                        break;
                    case "abro":
                        word2.setImageResource(R.drawable.balloon_abro);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.abro_ko);
                        }
                        break;
                }

                break;
            case "miveh":

                switch (items.get(0)) {
                    case "moz":
                        word1.setImageResource(R.drawable.balloon_moz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.moz_ko);
                        }
                        break;
                    case "sib":
                        word1.setImageResource(R.drawable.balloon_sib);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sib_ko);
                        }
                        break;

                    case "khiar":
                        word1.setImageResource(R.drawable.balloon_khiar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.khiar_ko);
                        }
                        break;
                    case "porteghal":
                        word1.setImageResource(R.drawable.balloon_porteqal);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.porteqal_ko);
                        }
                        break;
                    case "limo":
                        word1.setImageResource(R.drawable.balloon_limo);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.limo_ko);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "moz":
                        word2.setImageResource(R.drawable.balloon_moz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.moz_ko);
                        }
                        break;
                    case "sib":
                        word2.setImageResource(R.drawable.balloon_sib);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sib_ko);
                        }
                        break;

                    case "khiar":
                        word2.setImageResource(R.drawable.balloon_khiar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.khiar_ko);
                        }
                        break;
                    case "porteghal":
                        word2.setImageResource(R.drawable.balloon_porteqal);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.porteqal_ko);
                        }
                        break;
                    case "limo":
                        word2.setImageResource(R.drawable.balloon_limo);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.limo_ko);
                        }
                        break;

                }

                break;
            case "heyvanat":
                switch (items.get(0)) {
                    case "gorbe":
                        word1.setImageResource(R.drawable.balloon_gorbe);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gorbe_ko);
                        }
                        break;
                    case "sag":
                        word1.setImageResource(R.drawable.balloon_sag);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sag_ko);
                        }
                        break;
                    case "gav":
                        word1.setImageResource(R.drawable.balloon_gav);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gav_ko);
                        }
                        break;

                    case "mahi":
                        word1.setImageResource(R.drawable.balloon_mahi);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mahi_ko);
                        }
                        break;
                    case "morgh":
                        word1.setImageResource(R.drawable.balloon_morq);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.morq_ko);
                        }
                        break;
                    case "asb":
                        word1.setImageResource(R.drawable.balloon_asb);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.asb_ko);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "gorbe":
                        word2.setImageResource(R.drawable.balloon_gorbe);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gorbe_ko);
                        }
                    case "sag":
                        word2.setImageResource(R.drawable.balloon_sag);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sag_ko);
                        }
                        break;
                    case "gav":
                        word2.setImageResource(R.drawable.balloon_gav);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gav_ko);
                        }
                        break;

                    case "mahi":
                        word2.setImageResource(R.drawable.balloon_mahi);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mahi_ko);
                        }
                        break;
                    case "morgh":
                        word2.setImageResource(R.drawable.balloon_morq);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.morq_ko);
                        }
                        break;
                    case "asb":
                        word2.setImageResource(R.drawable.balloon_asb);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.asb_ko);
                        }
                        break;

                }

                break;
            case "pooshak":
                switch (items.get(0)) {
                    case "kafsh":
                        word1.setImageResource(R.drawable.balloon_kafsh);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kafsh_ko);
                        }
                        break;
                    case "kolah":
                        word1.setImageResource(R.drawable.balloon_kolah);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kolah_ko);
                        }
                        break;
                    case "joorab":
                        word1.setImageResource(R.drawable.balloon_jorab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                        }
                        break;

                    case "shalvar":
                        word1.setImageResource(R.drawable.balloon_shalvar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shalvar_ko);
                        }
                        break;
                    case "pirahan":
                        word1.setImageResource(R.drawable.balloon_pirahan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pirhan_ko);
                        }
                        break;
                    case "rosari":
                        word1.setImageResource(R.drawable.balloon_rosari);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.rosari_ko);
                        }
                        break;
                    case "bolooz":
                        word1.setImageResource(R.drawable.balloon_bloz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bloz_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "kafsh":
                        word2.setImageResource(R.drawable.balloon_kafsh);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kafsh_ko);
                        }
                    case "kolah":
                        word2.setImageResource(R.drawable.balloon_kolah);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kolah_ko);
                        }
                        break;
                    case "joorab":
                        word2.setImageResource(R.drawable.balloon_jorab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                        }
                        break;

                    case "shalvar":
                        word2.setImageResource(R.drawable.balloon_shalvar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shalvar_ko);
                        }
                        break;
                    case "pirahan":
                        word2.setImageResource(R.drawable.balloon_pirahan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pirhan_ko);
                        }
                        break;
                    case "rosari":
                        word2.setImageResource(R.drawable.balloon_rosari);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.rosari_ko);
                        }
                        break;
                    case "bolooz":
                        word2.setImageResource(R.drawable.balloon_bloz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bloz_ko);
                        }
                        break;
                }
                break;
            case "vasayel":
                switch (items.get(0)) {
                    case "shane":
                        word1.setImageResource(R.drawable.balloon_shane);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shane_ko);
                        }
                        break;
                    case "mesvak":
                        word1.setImageResource(R.drawable.balloon_mesvak);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mesvak_ko);
                        }
                        break;
                    case "hole":
                        word1.setImageResource(R.drawable.balloon_hole);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.hole_ko);
                        }
                        break;

                    case "toop":
                        word1.setImageResource(R.drawable.balloon_toop);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.toop_ko);
                        }
                        break;
                    case "docharkhe":
                        word1.setImageResource(R.drawable.balloon_docharkhe);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.docharkhe_ko);
                        }
                        break;
                    case "mashin":
                        word1.setImageResource(R.drawable.balloon_mashin);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mashin_ko);
                        }
                        break;
                    case "havapeyma":
                        word1.setImageResource(R.drawable.balloon_havapeima);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        }
                        break;
                    case "ghashoq":
                        word1.setImageResource(R.drawable.balloon_ghashoq);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.qashoq_ko);
                        }
                        break;
                    case "ketab":
                        word1.setImageResource(R.drawable.balloon_ketab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.ketab_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "shane":
                        word2.setImageResource(R.drawable.balloon_shane);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shane_ko);
                        }
                    case "mesvak":
                        word2.setImageResource(R.drawable.balloon_mesvak);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mesvak_ko);
                        }
                        break;
                    case "hole":
                        word2.setImageResource(R.drawable.balloon_hole);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.hole_ko);
                        }
                        break;

                    case "toop":
                        word2.setImageResource(R.drawable.balloon_toop);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.toop_ko);
                        }
                        break;
                    case "docharkhe":
                        word2.setImageResource(R.drawable.balloon_docharkhe);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.docharkhe_ko);
                        }
                        break;
                    case "mashin":
                        word2.setImageResource(R.drawable.balloon_mashin);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mashin_ko);
                        }
                        break;
                    case "havapeyma":
                        word2.setImageResource(R.drawable.balloon_havapeima);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        }
                        break;
                    case "ghashoq":
                        word2.setImageResource(R.drawable.balloon_ghashoq);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.qashoq_ko);
                        }
                        break;
                    case "ketab":
                        word2.setImageResource(R.drawable.balloon_ketab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.ketab_ko);
                        }
                        break;
                }
                break;
            case "mashaghel":
                switch (items.get(0)) {
                    case "doctor":
                        word1.setImageResource(R.drawable.balloon_doctor);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.doctor_ko);
                        }
                        break;
                    case "nanva":
                        word1.setImageResource(R.drawable.balloon_nanva);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.nanva_ko);
                        }
                        break;
                    case "moalem":
                        word1.setImageResource(R.drawable.balloon_moalem);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.moalem_ko);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "doctor":
                        word2.setImageResource(R.drawable.balloon_doctor);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.doctor_ko);
                        }
                    case "nanva":
                        word2.setImageResource(R.drawable.balloon_nanva);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.nanva_ko);
                        }
                        break;
                    case "moalem":
                        word2.setImageResource(R.drawable.balloon_moalem);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.moalem_ko);
                        }
                        break;
                }

                break;
            case "rang":
                switch (items.get(0)) {
                    case "abi":
                        word1.setImageResource(R.drawable.balloon_abi);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.abi_ko);
                        }
                        break;
                    case "zard":
                        word1.setImageResource(R.drawable.balloon_zard);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.zard_ko);
                        }
                        break;
                    case "ghermez":
                        word1.setImageResource(R.drawable.balloon_ghermez);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.qermez_ko);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "abi":
                        word2.setImageResource(R.drawable.balloon_abi);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.abi_ko);
                        }
                    case "zard":
                        word2.setImageResource(R.drawable.balloon_zard);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.zard_ko);
                        }
                        break;
                    case "ghermez":
                        word2.setImageResource(R.drawable.balloon_ghermez);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.qermez_ko);
                        }
                        break;
                }
                break;
            case "khordani":
                switch (items.get(0)) {
                    case "nan":
                        word1.setImageResource(R.drawable.balloon_nan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.nan_ko);
                        }
                        break;
                    case "shir":
                        word1.setImageResource(R.drawable.balloon_shir);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shir_ko);
                        }
                        break;
                    case "ab":
                        word1.setImageResource(R.drawable.balloon_ab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.ab_ko);
                        }
                        break;
                    case "cake":
                        word1.setImageResource(R.drawable.balloon_cake);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.cake_ko);
                        }
                        break;
                    case "bisko":
                        word1.setImageResource(R.drawable.balloon_bisko);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bisko_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "nan":
                        word2.setImageResource(R.drawable.balloon_nan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.nan_ko);
                        }
                    case "cake":
                        word2.setImageResource(R.drawable.balloon_cake);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.cake_ko);
                        }
                        break;
                    case "ab":
                        word2.setImageResource(R.drawable.balloon_ab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.ab_ko);
                        }
                        break;
                    case "shir":
                        word2.setImageResource(R.drawable.balloon_shir);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shir_ko);
                        }
                        break;
                    case "bisko":
                        word2.setImageResource(R.drawable.balloon_bisko);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bisko_ko);
                        }
                        break;
                }
                break;
            case "mafahim":
                switch (items.get(0)) {
                    case "bala":
                        word1.setImageResource(R.drawable.balloon_bala);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bala_ko);
                        }
                        break;
                    case "paeen":
                        word1.setImageResource(R.drawable.balloon_paeen);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.paeen_ko);
                        }
                        break;
                    case "kasif":
                        word1.setImageResource(R.drawable.balloon_kasif);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kasif_ko);
                        }
                        break;

                    case "tamiz":
                        word1.setImageResource(R.drawable.balloon_tamiz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.tamiz_ko);
                        }
                        break;
                    case "bache":
                        word1.setImageResource(R.drawable.balloon_bache);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        }
                        break;
                    case "dokhtar":
                        word1.setImageResource(R.drawable.balloon_dokhtar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dokhtar_ko);
                        }
                        break;
                    case "pesar":
                        word1.setImageResource(R.drawable.balloon_pesar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        }
                        break;
                    case "sard":
                        word1.setImageResource(R.drawable.balloon_sard);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sard_ko);
                        }
                        break;
                    case "garm":
                        word1.setImageResource(R.drawable.balloon_garm);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.garm_ko);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "bala":
                        word2.setImageResource(R.drawable.balloon_bala);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bala_ko);
                        }
                    case "paeen":
                        word2.setImageResource(R.drawable.balloon_paeen);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.paeen_ko);
                        }
                        break;
                    case "kasif":
                        word2.setImageResource(R.drawable.balloon_kasif);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kasif_ko);
                        }
                        break;

                    case "tamiz":
                        word2.setImageResource(R.drawable.balloon_tamiz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.tamiz_ko);
                        }
                        break;
                    case "bache":
                        word2.setImageResource(R.drawable.balloon_bache);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        }
                        break;
                    case "dokhtar":
                        word2.setImageResource(R.drawable.balloon_dokhtar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dokhtar_ko);
                        }
                        break;
                    case "pesar":
                        word2.setImageResource(R.drawable.balloon_pesar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        }
                        break;
                    case "sard":
                        word2.setImageResource(R.drawable.balloon_sard);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sard_ko);
                        }
                        break;
                    case "garm":
                        word2.setImageResource(R.drawable.balloon_garm);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.garm_ko);
                        }
                        break;
                }
                break;
            default:
                break;

        }
        startAnimation();

        if (answerPos == 0) {
            word1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startRotateAnimation(word1, category);
                    tashvigh.start();
                    tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mediaPlayer.release();
                        }
                    });
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animator4.setFloatValues(0, 1000);
                            animator4.start();
                        }
                    }, 500);

                }
            });
            word2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    payMoreAttention.start();
                }
            });
        } else if (answerPos == 1) {
            word2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startRotateAnimation(word2, category);
                    tashvigh.start();
                    tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mediaPlayer.release();
                        }
                    });
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animator3.setFloatValues(0, 1000);
                            animator3.start();
                        }
                    }, 500);

                }
            });
            word1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    payMoreAttention.start();
                }
            });
        }


    }


    private void startRotateAnimation(final ImageView image, final String category) {
        RotateAnimation rotate = new RotateAnimation(0, 30, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setInterpolator(new LinearInterpolator());
        image.startAnimation(rotate);
        rotate.setAnimationListener(new Animation.AnimationListener() {
                                        @Override
                                        public void onAnimationStart(Animation animation) {

                                        }

                                        @Override
                                        public void onAnimationEnd(Animation animation) {
                                            RotateAnimation rotate1 = new RotateAnimation(30, -30, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                                            rotate1.setDuration(2000);
                                            rotate1.setInterpolator(new LinearInterpolator());

                                            image.startAnimation(rotate1);
                                            rotate1.setAnimationListener(new Animation.AnimationListener() {
                                                                             @Override
                                                                             public void onAnimationStart(Animation animation) {

                                                                             }

                                                                             @Override
                                                                             public void onAnimationEnd(Animation animation) {
                                                                                 RotateAnimation rotate2 = new RotateAnimation(-30, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                                                                                 rotate2.setDuration(1000);
                                                                                 rotate2.setInterpolator(new LinearInterpolator());

                                                                                 image.startAnimation(rotate2);
                                                                                 rotate2.setAnimationListener(new Animation.AnimationListener() {
                                                                                                                  @Override
                                                                                                                  public void onAnimationStart(Animation animation) {

                                                                                                                  }

                                                                                                                  @Override
                                                                                                                  public void onAnimationEnd(Animation animation) {
                                                                                                                      if (category.equals("mashaghel") || category.equals("rang") || category.equals("khanevade"))
                                                                                                                          successAnimation();
                                                                                                                      else {
                                                                                                                          Intent intent = null;
                                                                                                                          intent = new Intent(Bazi1Activity2.this, Bazi1Activity3.class);
                                                                                                                          intent.putExtra("category", category);
                                                                                                                          intent.putExtra("gameType", "balloon");
                                                                                                                          intent.putExtra("list", remainedItems);
                                                                                                                          tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                                                                                              @Override
                                                                                                                              public void onCompletion(MediaPlayer mediaPlayer) {
                                                                                                                                  tashvigh.release();
                                                                                                                                  tashvigh = null;
                                                                                                                                  payMoreAttention.release();
                                                                                                                                  payMoreAttention = null;
                                                                                                                                  wordVoice.release();
                                                                                                                                  wordVoice = null;
                                                                                                                                  clapSound.release();
                                                                                                                                  clapSound = null;
                                                                                                                              }
                                                                                                                          });
                                                                                                                          startActivity(intent);
                                                                                                                      }
                                                                                                                  }

                                                                                                                  @Override
                                                                                                                  public void onAnimationRepeat(Animation animation) {

                                                                                                                  }
                                                                                                              }

                                                                                 );
                                                                             }

                                                                             @Override
                                                                             public void onAnimationRepeat(Animation animation) {

                                                                             }
                                                                         }

                                            );
                                        }

                                        @Override
                                        public void onAnimationRepeat(Animation animation) {

                                        }
                                    }

        );
    }

    private void startAnimation() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animator1.setFloatValues(1000, 0);
                animator1.start();
                animator2.setFloatValues(1000, 0);
                animator2.start();
            }
        }, 500);

        animator1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                word1.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                wordVoice.start();
                wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        animator2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                word2.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
//                imView0.setVisibility(View.INVISIBLE);
//                mediaPlayerRahnama.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}