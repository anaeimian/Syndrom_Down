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
import android.view.animation.Transformation;
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
    private ArrayList<String> remianedItems;
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
        Intent intent = new Intent(Bazi1Activity.this, BaziListActivity.class);
        startActivity(intent);
    }

    private void handleIntent() {
        Intent intent = getIntent();
        String category = intent.getStringExtra("category");
        int answerPos = random.nextInt(2);
        int selectedItem1 = random.nextInt(4);
        int selectedItem2 = random.nextInt(4);
        while (selectedItem2 == selectedItem1) {
            selectedItem2 = random.nextInt(4);
        }

        switch (category) {
            case "khanevade":
                ArrayList<String> khanevadeItems;
                khanevadeItems = new ArrayList<>();
                khanevadeItems.add("baba");
                khanevadeItems.add("maman");
                khanevadeItems.add("khahar");
                khanevadeItems.add("dadash");


                remianedItems = new ArrayList<>();
                for (int i = 0; i < khanevadeItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(khanevadeItems.get(i));
                }

                Log.d("rand", answerPos + " " + selectedItem1 + " " + selectedItem2);
                if (answerPos == 0) {
                    Log.d("rand1", "rand1");
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "khanevade");
                            tashvigh.start();
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
//                word1.setImageResource(R.drawable.balloon_baba);
//                word2.setImageResource(R.drawable.balloon_maman);
                startAnimation();
//                wordVoice = MediaPlayer.create(this, R.raw.baba_ko);

//                word1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startRotateAnimation("khanevade");
//                        tashvigh.start();
//
//                    }
//                });
//                word2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        payMoreAttention.start();
//                    }
//                });

                break;
            case "andam":
                ArrayList<String> andamItems;
                andamItems = new ArrayList<>();
                andamItems.add("cheshm");
                andamItems.add("dast");
                andamItems.add("pa");
                andamItems.add("goosh");
                andamItems.add("moo");
                andamItems.add("dahan");
                andamItems.add("bini");
                andamItems.add("zaban");
                andamItems.add("dandan");
                andamItems.add("abroo");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < andamItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(andamItems.get(i));
                }

                Log.d("rand", answerPos + " " + selectedItem1 + " " + selectedItem2);
                if (answerPos == 0) {
                    Log.d("rand1", "rand1");
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "andam");
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
                        }
                    });
                } else if (answerPos == 1) {
                    Log.d("rand2", "rand2");
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "andam");
                            tashvigh.start();
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
//                word1.setImageResource(R.drawable.balloon_baba);
//                word2.setImageResource(R.drawable.balloon_maman);
                startAnimation();
//                wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
//                wordVoice.start();
//                word1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startRotateAnimation("khanevade");
//                        tashvigh.start();
//
//                    }
//                });
//                word2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        payMoreAttention.start();
//                    }
//                });

                break;
            case "miveh":
                ArrayList<String> mivehItems;
                mivehItems = new ArrayList<>();
                mivehItems.add("moz");
                mivehItems.add("sib");
                mivehItems.add("khiar");
                mivehItems.add("porteghal");
                mivehItems.add("limo");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < mivehItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(mivehItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "miveh");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "miveh");
                            tashvigh.start();
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

                remianedItems = new ArrayList<>();
                for (int i = 0; i < heyvanatItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(heyvanatItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "heyvanat");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "heyvanat");
                            tashvigh.start();
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

                remianedItems = new ArrayList<>();
                for (int i = 0; i < pooshakItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(pooshakItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "pooshak");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "pooshak");
                            tashvigh.start();
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
                vasayelItems.add("ghashogh");
                vasayelItems.add("ketab");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < vasayelItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(vasayelItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "vasayel");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "vasayel");
                            tashvigh.start();
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
                startAnimation();

                break;
            case "mashagel":
                ArrayList<String> mashagelItems;
                mashagelItems = new ArrayList<>();
                mashagelItems.add("doctor");
                mashagelItems.add("nanva");
                mashagelItems.add("moalem");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < mashagelItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(mashagelItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "mashaghel");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "mashaghel");
                            tashvigh.start();
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
                startAnimation();

                break;
            case "rang":
                ArrayList<String> rangItems;
                rangItems = new ArrayList<>();
                rangItems.add("abi");
                rangItems.add("zard");
                rangItems.add("ghermez");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < rangItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(rangItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "rang");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "rang");
                            tashvigh.start();
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
                startAnimation();

                break;
            case "khordani":
                ArrayList<String> khordaniItems;
                khordaniItems = new ArrayList<>();
                khordaniItems.add("nan");
                khordaniItems.add("shir");
                khordaniItems.add("ab");
                khordaniItems.add("cake");
                khordaniItems.add("biscuit");

                remianedItems = new ArrayList<>();
                for (int i = 0; i < khordaniItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(khordaniItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "khordani");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "khordani");
                            tashvigh.start();
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

                remianedItems = new ArrayList<>();
                for (int i = 0; i < mafahimItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remianedItems.add(mafahimItems.get(i));
                }

                if (answerPos == 0) {
                    setVoiceImage(word1, selectedItem1, category);
                    setImage(word2, selectedItem2);
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, "mafahim");
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
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(word2, selectedItem1, category);
                    setImage(word1, selectedItem2);
                    word2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word2, "mafahim");
                            tashvigh.start();
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
                startAnimation();

                break;

        }

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
//            case "andam":
//                switch (index) {
//                    case 0:
//                        image.setImageResource(R.drawable.balloon_cheshm);
//                        wordVoice = MediaPlayer.create(this, R.raw.cheshm_ko);
//                        break;
//                    case 1:
//                        image.setImageResource(R.drawable.balloon_dast);
//                        wordVoice = MediaPlayer.create(this, R.raw.dast_ko);
//                        break;
//                    case 2:
//                        image.setImageResource(R.drawable.balloon_paa);
//                        wordVoice = MediaPlayer.create(this, R.raw.paa_ko);
//                        break;
//                    case 3:
//                        image.setImageResource(R.drawable.balloon_goosh);
//                        wordVoice = MediaPlayer.create(this, R.raw.goosh_ko);
//                        break;
//                    case 4:
//                        image.setImageResource(R.drawable.balloon_mo);
//                        wordVoice = MediaPlayer.create(this, R.raw.mo_ko);
//                        break;
//                    case 5:
//                        image.setImageResource(R.drawable.balloon_dahan);
//                        wordVoice = MediaPlayer.create(this, R.raw.dahan_ko);
//                        break;
//                    case 6:
//                        image.setImageResource(R.drawable.balloon_bini);
//                        wordVoice = MediaPlayer.create(this, R.raw.bini_ko);
//                        break;
//                    case 7:
//                        image.setImageResource(R.drawable.balloon_zaban);
//                        wordVoice = MediaPlayer.create(this, R.raw.zaban_ko);
//                        break;
//                    case 8:
//                        image.setImageResource(R.drawable.balloon_dandan);
//                        wordVoice = MediaPlayer.create(this, R.raw.dandan_ko);
//                        break;
//                    case 9:
//                        image.setImageResource(R.drawable.balloon_abroo);
//                        wordVoice = MediaPlayer.create(this, R.raw.dandan_ko);
//                        break;
//                }
//                break;

        }
    }

    void setImage(ImageView image, int index) {
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
                                intent.putStringArrayListExtra("list", remianedItems);
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

//    private void setListeners() {
//
//        word1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });
//
//
////        mediaPlayerRahnama.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
////            @Override
////            public void onCompletion(MediaPlayer mp) {
////                mediaPlayerTashvigh.start();
////            }
////        });
////
////        mediaPlayerRahnama1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
////            @Override
////            public void onCompletion(MediaPlayer mp) {
////                mediaPlayerTashvigh.start();
////            }
////        });
////
////        imView0.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                mediaPlayerRahnama.start();
////            }
////        });
////
////        imView1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                mediaPlayerRahnama1.start();
////            }
////        });
//
//    }

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
//        imView0.setImageResource(R.drawable.imbaba);
//        imView1.setImageResource(R.drawable.imkhahar);
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

class ResizeAnimation extends Animation {
    final int targetHeight;
    View view;
    int startHeight;

    public ResizeAnimation(View view, int targetHeight, int startHeight) {
        this.view = view;
        this.targetHeight = targetHeight;
        this.startHeight = startHeight;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newHeight = (int) (startHeight + targetHeight * interpolatedTime);
        view.getLayoutParams().height = newHeight;
        view.requestLayout();
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    public boolean willChangeBounds() {
        return true;
    }
}