package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
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
public class Bazi1Activity2 extends ActionBarActivity {
    private Toolbar toolbar;
    private ImageView word1;
    private ImageView word2;

    private ObjectAnimator animator1;
    private ObjectAnimator animator2;

    private MediaPlayer wordVoice;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;

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

//        setResources();
//        setListeners();
        handleIntent();

    }

    private void handleIntent() {
        Intent intent = getIntent();
        final String category = intent.getStringExtra("category");
        ArrayList<String> items = intent.getStringArrayListExtra("list");
        Random random = new Random();
        int answerPos = random.nextInt(2);
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

//                word1.setImageResource(R.drawable.balloon_dadash);
//                word2.setImageResource(R.drawable.balloon_khahar);
                startAnimation();
                wordVoice.start();
                if (answerPos == 0) {
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startRotateAnimation(word1, category);
                            tashvigh.start();

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

                        }
                    });
                    word1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            payMoreAttention.start();
                        }
                    });
                }


                break;
            default:
                break;

        }

    }

//    private void startRotateAnimation() {
//        RotateAnimation rotate = new RotateAnimation(0, 30, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(1000);
//        rotate.setInterpolator(new LinearInterpolator());
//        word2.startAnimation(rotate);
//        rotate.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                RotateAnimation rotate1 = new RotateAnimation(30, -30, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                rotate1.setDuration(2000);
//                rotate1.setInterpolator(new LinearInterpolator());
//
//                word2.startAnimation(rotate1);
//                rotate1.setAnimationListener(new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        RotateAnimation rotate2 = new RotateAnimation(-30, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                        rotate2.setDuration(1000);
//                        rotate2.setInterpolator(new LinearInterpolator());
//
//                        word2.startAnimation(rotate2);
//                        rotate2.setAnimationListener(new Animation.AnimationListener() {
//                            @Override
//                            public void onAnimationStart(Animation animation) {
//
//                            }
//
//                            @Override
//                            public void onAnimationEnd(Animation animation) {
//                                Intent intent = new Intent(Bazi1Activity2.this, BaziListActivity.class);
//                                intent.putExtra("category", "khanevade");
//                                intent.putExtra("gameType", "balloon");
//                                startActivity(intent);
//                            }
//
//                            @Override
//                            public void onAnimationRepeat(Animation animation) {
//
//                            }
//                        });
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animation animation) {
//
//                    }
//                });
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//    }

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
                                Intent intent = new Intent(Bazi1Activity2.this, BaziListActivity.class);
                                intent.putExtra("category", category);
                                intent.putExtra("gameType", "balloon");
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

//class ResizeAnimation extends Animation {
//    final int targetHeight;
//    View view;
//    int startHeight;
//
//    public ResizeAnimation(View view, int targetHeight, int startHeight) {
//        this.view = view;
//        this.targetHeight = targetHeight;
//        this.startHeight = startHeight;
//    }
//
//    @Override
//    protected void applyTransformation(float interpolatedTime, Transformation t) {
//        int newHeight = (int) (startHeight + targetHeight * interpolatedTime);
//        view.getLayoutParams().height = newHeight;
//        view.requestLayout();
//    }
//
//    @Override
//    public void initialize(int width, int height, int parentWidth, int parentHeight) {
//        super.initialize(width, height, parentWidth, parentHeight);
//    }
//
//    @Override
//    public boolean willChangeBounds() {
//        return true;
//    }
//}