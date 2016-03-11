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

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Szamani on 1/1/2016.
 */
public class Bazi2Activity extends ActionBarActivity {
    private Toolbar toolbar;

    private ImageView field;
    private ImageView ball;
    private ImageView goal2;
    private ImageView pic1;
    private ImageView pic2;
    private float ballX = 0;
    private ObjectAnimator animator;

    private MediaPlayer wordVoice;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;
    String category = "";

    Random random = new Random();
    private ArrayList<String> remianedItems;

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
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
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
        category = intent.getStringExtra("category");

        switch (category) {
            case "khanevade":
                int answerPos = random.nextInt(2);
                int selectedItem1 = random.nextInt(4);
                int selectedItem2 = random.nextInt(4);
                while (selectedItem2 == selectedItem1) {
                    selectedItem2 = random.nextInt(4);
                }
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

                if (answerPos == 0) {
                    setVoiceImage(pic1, selectedItem1, category);
                    setImage(pic2, selectedItem2);
                    pic1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            animator.setFloatValues(0, -field.getWidth() / 2 + 30);
                            animator.start();
                            tashvigh.start();
                        }
                    });
                    pic2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            payMoreAttention.start();
                        }
                    });
                } else if (answerPos == 1) {
                    setVoiceImage(pic2, selectedItem1, category);
                    setImage(pic1, selectedItem2);
                    pic2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            animator.setFloatValues(0, field.getWidth() / 2 - 30);
                            animator.start();
                            tashvigh.start();
                        }
                    });
                    pic1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            payMoreAttention.start();
                        }
                    });
                }
                animator.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        ball.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        ball.setVisibility(View.INVISIBLE);
                        Intent intent = new Intent(Bazi2Activity.this, Bazi2Activity2.class);
                        intent.putExtra("category", category);
                        intent.putExtra("list",remianedItems);
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
//                word1.setImageResource(R.drawable.balloon_baba);
//                word2.setImageResource(R.drawable.balloon_maman);
//                wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
                wordVoice.start();
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
//            case "andam":
//                ArrayList<String> andamItems;
//                andamItems = new ArrayList<>();
//                andamItems.add("cheshm");
//                andamItems.add("dast");
//                andamItems.add("pa");
//                andamItems.add("goosh");
//                andamItems.add("moo");
//                andamItems.add("dahan");
//                andamItems.add("bini");
//                andamItems.add("zaban");
//                andamItems.add("dandan");
//                andamItems.add("abroo");
//
//                remianedItems = new ArrayList<>();
//                for (int i = 0; i < andamItems.size(); i++) {
//                    if (i != selectedItem1 && i != selectedItem2)
//                        remianedItems.add(andamItems.get(i));
//                }
//
//                Log.d("rand", answerPos + " " + selectedItem1 + " " + selectedItem2);
//                if (answerPos == 0) {
//                    Log.d("rand1", "rand1");
//                    setVoiceImage(word1, selectedItem1, category);
//                    setImage(word2, selectedItem2);
//                    word1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            startRotateAnimation(word1, "andam");
//                            tashvigh.start();
//
//                        }
//                    });
//                    word2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            payMoreAttention.start();
//                        }
//                    });
//                } else if (answerPos == 1) {
//                    Log.d("rand2", "rand2");
//                    setVoiceImage(word2, selectedItem1, category);
//                    setImage(word1, selectedItem2);
//                    word2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            startRotateAnimation(word2, "andam");
//                            tashvigh.start();
//
//                        }
//                    });
//                    word1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            payMoreAttention.start();
//                        }
//                    });
//                }
////                word1.setImageResource(R.drawable.balloon_baba);
////                word2.setImageResource(R.drawable.balloon_maman);
//                startAnimation();
////                wordVoice = MediaPlayer.create(this, R.raw.baba_ko);
//                wordVoice.start();
////                word1.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        startRotateAnimation("khanevade");
////                        tashvigh.start();
////
////                    }
////                });
////                word2.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        payMoreAttention.start();
////                    }
////                });
//
//                break;
        }

    }

    void setVoiceImage(ImageView image, int index, String category) {
        switch (category) {
            case "khanevade":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tbaba);
                        wordVoice = MediaPlayer.create(this, R.raw.football_baba);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tmaman);
                        wordVoice = MediaPlayer.create(this, R.raw.football_maman);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkhahar);
                        wordVoice = MediaPlayer.create(this, R.raw.football_khahar);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tbaradar);
                        wordVoice = MediaPlayer.create(this, R.raw.football_dadash);
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
                image.setImageResource(R.drawable.tbaba);
                break;
            case 1:
                image.setImageResource(R.drawable.tmaman);
                break;
            case 2:
                image.setImageResource(R.drawable.tkhahar);
                break;
            case 3:
                image.setImageResource(R.drawable.tbaradar);
                break;
        }

    }

//    private void handleIntent1() {
//        Intent intent = getIntent();
//        category = intent.getStringExtra("category");
//        switch (category) {
//            case "khanevade":
//                pic1.setImageResource(R.drawable.tbaradar);
//                pic2.setImageResource(R.drawable.tkhahar);
//                mediaPlayerRahnama.start();
//                pic1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        tashvigh.start();
//                        animator.setFloatValues(0, -field.getWidth() / 2 + 30);
//                        animator.start();
//                    }
//                });
//                pic2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        payMoreAttention.start();
////                        animator.setFloatValues(0, field.getWidth()/2-10);
////                        animator.start();
//                    }
//                });

//
//                break;
//            default:
//                break;
//
//        }
//
//    }

    private void setListeners() {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
////                animator.setFloatValues(pic1.getX() + 500, pic1.getX());
////                animator.start();
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
