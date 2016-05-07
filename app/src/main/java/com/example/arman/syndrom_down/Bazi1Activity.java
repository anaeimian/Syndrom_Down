package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Szamani on 1/1/2016.
 */
public class Bazi1Activity extends ActionBarActivity {
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
    private ArrayList<String> remainedItems;
    Random random = new Random();

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
        Intent temp = getIntent();
        String gameType = temp.getStringExtra("gameType");
        Intent intent = new Intent(Bazi1Activity.this, BaziListActivity.class);
        intent.putExtra("gameType", gameType);
        tashvigh.release();
        tashvigh = null;
        wordVoice.release();
        wordVoice = null;
        payMoreAttention.release();
        payMoreAttention = null;
        startActivity(intent);
    }


    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }


    void setVoiceImage(ImageView image, int index, String category) {
        switch (category) {
            case "khanevade":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_baba);
                        wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_maman);
                        wordVoice = MediaPlayer.create(this, R.raw.maman_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_khahar);
                        wordVoice = MediaPlayer.create(this, R.raw.khahar_ko);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_dadash);
                        wordVoice = MediaPlayer.create(this, R.raw.dadash_ko);
                        break;
                }
                break;
            case "andam":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_cheshm);
                        wordVoice = MediaPlayer.create(this, R.raw.cheshm_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_dast);
                        wordVoice = MediaPlayer.create(this, R.raw.dast_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_pa);
                        wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_gush);
                        wordVoice = MediaPlayer.create(this, R.raw.gush_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_mo);
                        wordVoice = MediaPlayer.create(this, R.raw.mo_ko);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_dahan);
                        wordVoice = MediaPlayer.create(this, R.raw.dahan_ko);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_bini);
                        wordVoice = MediaPlayer.create(this, R.raw.bini_ko);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_zaban);
                        wordVoice = MediaPlayer.create(this, R.raw.zaban_ko);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_dandan);
                        wordVoice = MediaPlayer.create(this, R.raw.dandan_ko);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.balloon_abro);
                        wordVoice = MediaPlayer.create(this, R.raw.abro_ko);
                        break;
                }
                break;
            case "miveh":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_moz);
                        wordVoice = MediaPlayer.create(this, R.raw.moz_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_sib);
                        wordVoice = MediaPlayer.create(this, R.raw.sib_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_khiar);
                        wordVoice = MediaPlayer.create(this, R.raw.khiar_ko);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.balloon_porteqal);
                        wordVoice = MediaPlayer.create(this, R.raw.porteqal_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_limo);
                        wordVoice = MediaPlayer.create(this, R.raw.limo_ko);
                        break;
                }
                break;
            case "heyvanat":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_gorbe);
                        wordVoice = MediaPlayer.create(this, R.raw.gorbe_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_sag);
                        wordVoice = MediaPlayer.create(this, R.raw.sag_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_gav);
                        wordVoice = MediaPlayer.create(this, R.raw.gav_ko);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.balloon_mahi);
                        wordVoice = MediaPlayer.create(this, R.raw.mahi_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_morq);
                        wordVoice = MediaPlayer.create(this, R.raw.morq_ko);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_asb);
                        wordVoice = MediaPlayer.create(this, R.raw.asb_ko);
                        break;

                }

                break;
            case "pooshak":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_kafsh);
                        wordVoice = MediaPlayer.create(this, R.raw.kafsh_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_kolah);
                        wordVoice = MediaPlayer.create(this, R.raw.kolah_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_jorab);
                        wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                    case 3:
                        image.setImageResource(R.drawable.balloon_shalvar);
                        wordVoice = MediaPlayer.create(this, R.raw.shalvar_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_pirahan);
                        wordVoice = MediaPlayer.create(this, R.raw.pirhan_ko);
                    case 5:
                        image.setImageResource(R.drawable.balloon_rosari);
                        wordVoice = MediaPlayer.create(this, R.raw.rosari_ko);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_bloz);
                        wordVoice = MediaPlayer.create(this, R.raw.bloz_ko);
                }
                break;
            case "vasayel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_shane);
                        wordVoice = MediaPlayer.create(this, R.raw.shane_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_mesvak);
                        wordVoice = MediaPlayer.create(this, R.raw.mesvak_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_hole);
                        wordVoice = MediaPlayer.create(this, R.raw.hole_ko);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.balloon_toop);
                        wordVoice = MediaPlayer.create(this, R.raw.toop_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_docharkhe);
                        wordVoice = MediaPlayer.create(this, R.raw.docharkhe_ko);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_mashin);
                        wordVoice = MediaPlayer.create(this, R.raw.mashin_ko);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_havapeima);
                        wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_ghashoq);
                        wordVoice = MediaPlayer.create(this, R.raw.qashoq_ko);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_ketab);
                        wordVoice = MediaPlayer.create(this, R.raw.ketab_ko);
                        break;


                }
                break;
            case "mashaghel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_doctor);
                        wordVoice = MediaPlayer.create(this, R.raw.doctor_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_nanva);
                        wordVoice = MediaPlayer.create(this, R.raw.nanva_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_moalem);
                        wordVoice = MediaPlayer.create(this, R.raw.moalem_ko);
                        break;
                }
                break;
            case "rang":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_abi);
                        wordVoice = MediaPlayer.create(this, R.raw.abi_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_zard);
                        wordVoice = MediaPlayer.create(this, R.raw.zard_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_ghermez);
                        wordVoice = MediaPlayer.create(this, R.raw.qermez_ko);
                        break;
                }
                break;
            case "khordani":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_nan);
                        wordVoice = MediaPlayer.create(this, R.raw.nan_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_shir);
                        wordVoice = MediaPlayer.create(this, R.raw.shir_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_ab);
                        wordVoice = MediaPlayer.create(this, R.raw.ab_ko);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_cake);
                        wordVoice = MediaPlayer.create(this, R.raw.cake_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_bisko);
                        wordVoice = MediaPlayer.create(this, R.raw.bisko_ko);
                        break;
                }
                break;

            case "mafahim":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_bala);
                        wordVoice = MediaPlayer.create(this, R.raw.bala_ko);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_paeen);
                        wordVoice = MediaPlayer.create(this, R.raw.paeen_ko);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_kasif);
                        wordVoice = MediaPlayer.create(this, R.raw.kasif_ko);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_tamiz);
                        wordVoice = MediaPlayer.create(this, R.raw.tamiz_ko);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_bache);
                        wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_dokhtar);
                        wordVoice = MediaPlayer.create(this, R.raw.dokhtar_ko);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_pesar);
                        wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_sard);
                        wordVoice = MediaPlayer.create(this, R.raw.sard_ko);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_garm);
                        wordVoice = MediaPlayer.create(this, R.raw.garm_ko);
                        break;

                }
        }
    }

    private void handleIntent() {
        Intent intent = getIntent();
        final String category = intent.getStringExtra("category");
        int answerPos = random.nextInt(2);
        int categorySize = 0;

        switch (category) {
            case "khanevade":
                categorySize = 4;
                break;
            case "andam":
                categorySize = 10;
                break;
            case "miveh":
                categorySize = 5;
                break;
            case "heyvanat":
                categorySize = 6;
                break;
            case "pooshak":
                categorySize = 7;
                break;
            case "vasayel":
                categorySize = 9;
                break;

            case "mashaghel":
                categorySize = 3;
                break;
            case "rang":
                categorySize = 3;
                break;
            case "khordani":
                categorySize = 5;
                break;
            case "mafahim":
                categorySize = 9;
                break;
        }
        final int selectedItem1 = random.nextInt(categorySize);
        int selectedItem2 = random.nextInt(categorySize);
        while (selectedItem2 == selectedItem1) {
            selectedItem2 = random.nextInt(categorySize);
        }

        switch (category) {
            case "khanevade":
                ArrayList<String> khanevadeItems;
                khanevadeItems = new ArrayList<>();
                khanevadeItems.add("baba");
                khanevadeItems.add("maman");
                khanevadeItems.add("khahar");
                khanevadeItems.add("dadash");


                remainedItems = new ArrayList<>();
                for (int i = 0; i < khanevadeItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(khanevadeItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "khanevade");
                            tashvigh.start();
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "khanevade");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });

                        }
                    });
                }
                startAnimation();

                break;
            case "andam":
                ArrayList<String> andamItems;
                andamItems = new ArrayList<>();
                andamItems.add("cheshm");
                andamItems.add("dast");
                andamItems.add("pa");
                andamItems.add("goosh");
                andamItems.add("mo");
                andamItems.add("dahan");
                andamItems.add("bini");
                andamItems.add("zaban");
                andamItems.add("dandan");
                andamItems.add("abro");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < andamItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(andamItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "andam");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    Log.d("rand2", "rand2");
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "andam");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "miveh":
                ArrayList<String> mivehItems;
                mivehItems = new ArrayList<>();
                mivehItems.add("moz");
                mivehItems.add("sib");
                mivehItems.add("khiar");
                mivehItems.add("porteghal");
                mivehItems.add("limo");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < mivehItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(mivehItems.get(i));
                }
                remainedItems.add(mivehItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "miveh");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "miveh");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;

            case "heyvanat":
                ArrayList<String> heyvanatItems;
                heyvanatItems = new ArrayList<>();
                heyvanatItems.add("gorbe");
                heyvanatItems.add("sag");
                heyvanatItems.add("gav");
                heyvanatItems.add("mahi");
                heyvanatItems.add("morgh");
                heyvanatItems.add("asb");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < heyvanatItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(heyvanatItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "heyvanat");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "heyvanat");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "pooshak":
                ArrayList<String> pooshakItems;
                pooshakItems = new ArrayList<>();
                pooshakItems.add("kafsh");
                pooshakItems.add("kolah");
                pooshakItems.add("joorab");
                pooshakItems.add("shalvar");
                pooshakItems.add("pirahan");
                pooshakItems.add("rosari");
                pooshakItems.add("bolooz");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < pooshakItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(pooshakItems.get(i));
                }
                remainedItems.add(pooshakItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "pooshak");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "pooshak");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;

            case "vasayel":
                ArrayList<String> vasayelItems;
                vasayelItems = new ArrayList<>();
                vasayelItems.add("shane");
                vasayelItems.add("mesvak");
                vasayelItems.add("hole");
                vasayelItems.add("toop");
                vasayelItems.add("docharkhe");
                vasayelItems.add("mashin");
                vasayelItems.add("havapeyma");
                vasayelItems.add("ghashoq");
                vasayelItems.add("ketab");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < vasayelItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(vasayelItems.get(i));
                }
                remainedItems.add(vasayelItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "vasayel");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "vasayel");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "mashaghel":
                ArrayList<String> mashagelItems;
                mashagelItems = new ArrayList<>();
                mashagelItems.add("doctor");
                mashagelItems.add("nanva");
                mashagelItems.add("moalem");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < mashagelItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(mashagelItems.get(i));
                }
                remainedItems.add(mashagelItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "mashaghel");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "mashaghel");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "rang":
                ArrayList<String> rangItems;
                rangItems = new ArrayList<>();
                rangItems.add("abi");
                rangItems.add("zard");
                rangItems.add("ghermez");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < rangItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(rangItems.get(i));
                }
                remainedItems.add(rangItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "rang");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "rang");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "khordani":
                ArrayList<String> khordaniItems;
                khordaniItems = new ArrayList<>();
                khordaniItems.add("nan");
                khordaniItems.add("shir");
                khordaniItems.add("ab");
                khordaniItems.add("cake");
                khordaniItems.add("bisko");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < khordaniItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(khordaniItems.get(i));
                }
                remainedItems.add(khordaniItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "khordani");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "khordani");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;
            case "mafahim":
                ArrayList<String> mafahimItems;
                mafahimItems = new ArrayList<>();
                mafahimItems.add("bala");
                mafahimItems.add("paeen");
                mafahimItems.add("kasif");
                mafahimItems.add("tamiz");
                mafahimItems.add("bache");
                mafahimItems.add("dokhtar");
                mafahimItems.add("pesar");
                mafahimItems.add("sard");
                mafahimItems.add("garm");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < mafahimItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(mafahimItems.get(i));
                }
                remainedItems.add(mafahimItems.get(selectedItem1));//make number of elements even!
                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2, category);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "mafahim");
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
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                }
                            });
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2, category);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "mafahim");
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
                            setVoiceImage(new ImageView(getApplicationContext()), selectedItem1, category);
                            payMoreAttention.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mediaPlayer) {
                                    wordVoice.start();
                                    wordVoice.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mediaPlayer) {
                                            mediaPlayer.release();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                startAnimation();

                break;

        }

    }

    void setImage(ImageView image, int index, String category) {
        switch (category) {
            case "khanevade":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_baba);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_maman);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_khahar);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_dadash);
                        break;
                }
                break;
            case "andam":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_cheshm);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_dast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_pa);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_gush);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_gush);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_mo);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_dahan);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_bini);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_zaban);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.balloon_dandan);
                        break;
                    case 10:
                        image.setImageResource(R.drawable.balloon_abro);
                        break;
                }
                break;
            case "miveh":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_moz);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_sib);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_khiar);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_porteqal);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_limo);
                        break;
                }
                break;
            case "heyvanat":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_gorbe);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_sag);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_gav);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_mahi);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_morq);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_asb);
                        break;
                }
                break;
            case "pooshak":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_kafsh);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_kolah);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_jorab);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_shalvar);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_pirahan);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_rosari);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_bloz);
                        break;
                }
                break;

            case "vasayel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_shane);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_mesvak);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_hole);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_toop);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_docharkhe);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_mashin);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_havapeima);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_ghashoq);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_ketab);
                        break;
                }
                break;

            case "mashaghel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_doctor);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_nanva);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_moalem);
                        break;
                }
                break;
            case "rang":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_abi);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_zard);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_ghermez);
                        break;
                }
                break;
            case "khordani":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_nan);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_shir);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_ab);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_cake);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_bisko);
                        break;
                }
                break;

            case "mafahim":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.balloon_bala);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.balloon_paeen);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.balloon_kasif);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.balloon_tamiz);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.balloon_bache);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.balloon_dokhtar);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.balloon_pesar);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.balloon_sard);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.balloon_garm);
                        break;

                }
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
                                Intent intent = new Intent(Bazi1Activity.this, Bazi1Activity2.class);
                                intent.putExtra("category", category);
                                intent.putStringArrayListExtra("list", remainedItems);
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
                                startActivity(intent);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void startAnimation() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                animator.setFloatValues(0,
//                        imView0.getY() - imView2.getY() + (imView0.getHeight() / 2));
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

