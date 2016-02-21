//package com.example.arman.syndrom_down;
//
//import android.animation.Animator;
//import android.animation.ObjectAnimator;
//import android.content.ClipData;
//import android.content.Intent;
//import android.graphics.Color;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.Log;
//import android.view.DragEvent;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ScrollView;
//
//
///**
// * Created by Szamani on 12/23/2015.
// */
//public class LoghatGeneralActivity extends ActionBarActivity {
//    private Toolbar toolbar;
//    private int which;
//    private int type;
//    private boolean active;
//
//    private ObjectAnimator animator;
//
//    private int c0;
//    private int c1;
//    private int c2;
//    private int c3;
//    private int c4;
//    private int c5;
//
//    private MediaPlayer mediaPlayerName;
//    private MediaPlayer mediaPlayerTashvigh;
//    private MediaPlayer mediaPlayerRahnama;
//
//    private ScrollView scrollView;
//
//    private LinearLayout l1;
//    private LinearLayout l2;
//    private LinearLayout l3;
//    private LinearLayout l4;
//    private LinearLayout l5;
//
//    private ImageView imView00;
//    private ImageView imView01;
//    private ImageView imView02;
//
//    private ImageView sep1;
//
//    private ImageView imView10;
//    private ImageView imView11;
//    private ImageView imView12;
//
//    private ImageView sep2;
//
//    private ImageView imView20;
//    private ImageView imView21;
//    private ImageView imView22;
//
//    private ImageView sep3;
//
//    private ImageView imView30;
//    private ImageView imView31;
//    private ImageView imView32;
//    private ImageView imView33;
//
//    private ImageView sep4;
//
//    private ImageView imView40;
//    private ImageView imView42;
//    private ImageView imView43;
//
//    private ImageView sep5;
//
//    private ImageView imView50;
//    private ImageView imView52;
//    private ImageView imView53;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_loghat_general);
//        setTitle(getIntent().getStringExtra(Utils.NAME));
//
//        type = getIntent().getIntExtra(Utils.TYPE, 0); // khanevade
//        which = getIntent().getIntExtra(Utils.WHICH, 0); // baba
//        active = getIntent().getBooleanExtra(Utils.ACTIVE, false); // is passed?
//
//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);
//
//        animator = new ObjectAnimator();
//        animator.setDuration(1500);
//        animator.setPropertyName("translationY");
//
//        mediaPlayerTashvigh = MediaPlayer.create(this, R.raw.step);
//        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.beep);
//        mediaPlayerName = MediaPlayer.create(this, R.raw.chat);
//        /// mediaPlayerName should be initialized in setImageResources()
//
//        initializeViews();
//        setImageResources();
//        if (!active)
//            diActivateAll();
//        setListeners();
//
//    }
//
//    private void setListeners() {
//
//        /*
//            TODO: we have to add ClipDescription to our drag and drop objects later
//         */
//
//
//        imView00.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 00");
//            }
//        });
//
//        imView01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 01");
//                mediaPlayerName.start();
//                c0++;
//            }
//        });
//
//        imView02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 02");
//                if (c0 >= 4) {
//                    activate1();
//                }
//            }
//        });
//
//        /////////////////////////////////////////////////////////////////////
//
//        imView10.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData data = ClipData.newPlainText("", "");
//                imView10.startDrag(data, new View.DragShadowBuilder(v), null, 0);
//                return true;
//            }
//        });
//
//        imView11.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//                switch (event.getAction()) {
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        Log.d("Slama", " Drag Entered");
//                        v.setBackgroundColor(Color.LTGRAY);
//                        break;
//                    case DragEvent.ACTION_DRAG_EXITED:
//                        Log.d("Slama", " Drag Exited");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        break;
//                    case DragEvent.ACTION_DROP:
//                        Log.d("Slama", " Drag Dropped");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        c1++;
//
//                        if (c1 >= 4) {
//                            activate2();
//                        } else {
//                            mediaPlayerTashvigh.start();
//                        }
//
//                        break;
//                    default:
//                        break;
//                }
//
//                return true;
//            }
//        });
//
//        imView12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 12");
//            }
//        });
//
//        /////////////////////////////////////////////////////////////////////
//
//        imView20.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//                switch (event.getAction()) {
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        Log.d("Slama", " Drag Entered");
//                        v.setBackgroundColor(Color.LTGRAY);
//                        break;
//                    case DragEvent.ACTION_DRAG_EXITED:
//                        Log.d("Slama", " Drag Exited");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        break;
//                    case DragEvent.ACTION_DROP:
//                        Log.d("Slama", " Drag Dropped");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        c2++;
//
//                        if (c2 >= 4) {
//                            activate3();
//                        } else {
//                            mediaPlayerTashvigh.start();
//                        }
//
//                        break;
//                    default:
//                        break;
//                }
//
//                return true;
//            }
//        });
//
//        imView21.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData data = ClipData.newPlainText("", "");
//                imView21.startDrag(data, new View.DragShadowBuilder(v), null, 0);
//                return true;
//            }
//        });
//
//        imView22.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 22");
//            }
//        });
//
//        /////////////////////////////////////////////////////////////////////
//
//        imView30.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData data = ClipData.newPlainText("", "");
//                imView30.startDrag(data, new View.DragShadowBuilder(v), null, 0);
//                return true;
//            }
//        });
//
//        imView31.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//                switch (event.getAction()) {
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        Log.d("Slama", " Drag Entered");
//                        v.setBackgroundColor(Color.LTGRAY);
//                        break;
//                    case DragEvent.ACTION_DRAG_EXITED:
//                        Log.d("Slama", " Drag Exited");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        break;
//                    case DragEvent.ACTION_DROP:
//                        Log.d("Slama", " Drag Dropped");
//                        v.setBackgroundColor(Color.TRANSPARENT);
//                        c3++;
//
//                        if (c3 >= 4) {
//                            activate4();
//                        } else {
//                            mediaPlayerTashvigh.start();
//                        }
//
//                        break;
//                    default:
//                        break;
//                }
//
//                return true;
//            }
//        });
//
//        imView32.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 32");
//            }
//        });
//
//        imView33.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 33");
//            }
//        });
//
//        /////////////////////////////////////////////////////////////////////
//
//        imView40.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 40");
//            }
//        });
//
//        imView42.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ++c4;
//                if (c4 < 4) {
//                    mediaPlayerTashvigh.start();
//                } else {
//                    activate5();
//                }
//            }
//        });
//
//        /////////////////////////////////////////////////////////////////////
//
//        imView50.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Salam", " 50");
//            }
//        });
//
//        imView52.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ++c5;
//                if (c5 < 4) {
//                    mediaPlayerTashvigh.start();
//                } else {
//                    if (!active)
//                        passSection();
//                }
//            }
//        });
//
//    }
//
//    private void diActivateAll() {
//        imView10.setEnabled(false);
//        imView11.setEnabled(false);
//        imView12.setEnabled(false);
//        imView20.setEnabled(false);
//        imView21.setEnabled(false);
//        imView22.setEnabled(false);
//        imView30.setEnabled(false);
//        imView31.setEnabled(false);
//        imView32.setEnabled(false);
//        imView33.setEnabled(false);
//        imView40.setEnabled(false);
//        imView42.setEnabled(false);
//        imView43.setEnabled(false);
//        imView50.setEnabled(false);
//        imView52.setEnabled(false);
//        imView53.setEnabled(false);
//    }
//
//    private void activate1() {
//        imView10.setEnabled(true);
//        imView11.setEnabled(true);
//        imView12.setEnabled(true);
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
//        mediaPlayerRahnama.start();
//        mediaPlayerRahnama.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                animator.start();
//            }
//        });
//
//        imView12.setX(imView10.getX() + (imView10.getWidth() / 2));
//
//        animator.setFloatValues(imView10.getY() - imView12.getY() + (imView10.getHeight() / 2),
//                imView11.getY() - imView12.getY() + (imView10.getHeight() / 2));
//        animator.setTarget(imView12);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imView12.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imView12.setVisibility(View.INVISIBLE);
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
//    }
//
//    private void activate2() {
//        imView20.setEnabled(true);
//        imView21.setEnabled(true);
//        imView22.setEnabled(true);
//        l2.setBackgroundColor(Color.TRANSPARENT);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep2.getY());
//            }
//        });
//
//        mediaPlayerRahnama.start();
//        mediaPlayerRahnama.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                animator.start();
//            }
//        });
//
//        imView22.setX(imView21.getX() + (imView21.getWidth() / 2));
//
//        animator.setFloatValues(imView21.getY() - imView22.getY() + (imView21.getHeight() / 2),
//                imView20.getY() - imView22.getY() + (imView20.getHeight() / 2));
//        animator.setTarget(imView22);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imView22.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imView22.setVisibility(View.INVISIBLE);
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
//    }
//
//    private void activate3() {
//        imView30.setEnabled(true);
//        imView31.setEnabled(true);
//        imView32.setEnabled(true);
//        imView33.setEnabled(true);
//        l3.setBackgroundColor(Color.TRANSPARENT);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep3.getY());
//            }
//        });
//
//        mediaPlayerRahnama.start();
//
//        imView33.setX(imView30.getX() + (imView30.getWidth() / 2));
//
//        animator.setFloatValues(imView30.getY() - imView33.getY() + (imView30.getHeight() / 2),
//                imView31.getY() + (imView31.getHeight() / 2) + 400);
//        animator.setTarget(imView33);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imView33.setVisibility(View.VISIBLE);
//                Log.d("Slama", " " + imView30.getY() + " " + imView31.getY() + " " +
//                        imView33.getY() + " ");
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imView33.setVisibility(View.INVISIBLE);
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
//                animator.start();
//            }
//        });
//
//    }
//
//    private void activate4() {
//        imView40.setEnabled(true);
//        imView42.setEnabled(true);
//        imView43.setEnabled(true);
//        l4.setBackgroundColor(Color.TRANSPARENT);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep4.getY());
//            }
//        });
//
//        mediaPlayerRahnama.start();
//    }
//
//    private void activate5() {
//        imView50.setEnabled(true);
//        imView52.setEnabled(true);
//        imView53.setEnabled(true);
//        l5.setBackgroundColor(Color.TRANSPARENT);
//
//        scrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                scrollView.smoothScrollTo(scrollView.getScrollX(),
//                        (int) sep5.getY());
//            }
//        });
//
//        mediaPlayerRahnama.start();
//    }
//
//
//    private void initializeViews() {
//        scrollView = (ScrollView) findViewById(R.id.scrollView);
//        imView00 = (ImageView) findViewById(R.id.imView00);
//        imView01 = (ImageView) findViewById(R.id.imView01);
//        imView02 = (ImageView) findViewById(R.id.imView02);
//        sep1 = (ImageView) findViewById(R.id.sep1);
//        imView10 = (ImageView) findViewById(R.id.imView10);
//        imView11 = (ImageView) findViewById(R.id.imView11);
//        imView12 = (ImageView) findViewById(R.id.imView12);
//        sep2 = (ImageView) findViewById(R.id.sep2);
//        imView20 = (ImageView) findViewById(R.id.imView20);
//        imView21 = (ImageView) findViewById(R.id.imView21);
//        imView22 = (ImageView) findViewById(R.id.imView22);
//        sep3 = (ImageView) findViewById(R.id.sep3);
//        imView30 = (ImageView) findViewById(R.id.imView30);
//        imView31 = (ImageView) findViewById(R.id.imView31);
//        imView32 = (ImageView) findViewById(R.id.imView32);
//        imView33 = (ImageView) findViewById(R.id.imView33);
//        sep4 = (ImageView) findViewById(R.id.sep4);
//        imView40 = (ImageView) findViewById(R.id.imView40);
//        imView42 = (ImageView) findViewById(R.id.imView42);
//        imView43 = (ImageView) findViewById(R.id.imView43);
//        sep5 = (ImageView) findViewById(R.id.sep5);
//        imView50 = (ImageView) findViewById(R.id.imView50);
//        imView52 = (ImageView) findViewById(R.id.imView52);
//        imView53 = (ImageView) findViewById(R.id.imView53);
//
//        l1 = (LinearLayout) findViewById(R.id.l1);
//        l2 = (LinearLayout) findViewById(R.id.l2);
//        l3 = (LinearLayout) findViewById(R.id.l3);
//        l4 = (LinearLayout) findViewById(R.id.l4);
//        l5 = (LinearLayout) findViewById(R.id.l5);
//
//        scrollView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return true;
//            }
//        });
//
//        imView12.setVisibility(View.INVISIBLE);
//        imView22.setVisibility(View.INVISIBLE);
//        imView33.setVisibility(View.INVISIBLE);
//    }
//
//    private void passSection() {
//        int i = 0;
//        active = true;
//
//        switch (type) {
//            case 0:
//                while (i < Utils.database.khanevade.length &&
//                        Utils.database.khanevade[++i]) ;
//                Utils.database.khanevade[i] = true;
//                break;
//            case 1:
//                while (i < Utils.database.andam.length &&
//                        Utils.database.andam[++i]) ;
//                Utils.database.andam[i] = true;
//                break;
//            case 2:
//                while (i < Utils.database.mive.length &&
//                        Utils.database.mive[++i]) ;
//                Utils.database.mive[i] = true;
//                break;
//            case 3:
//                while (i < Utils.database.heyvanat.length &&
//                        Utils.database.heyvanat[++i]) ;
//                Utils.database.heyvanat[i] = true;
//                break;
//            case 4:
//                while (i < Utils.database.pooshak.length &&
//                        Utils.database.pooshak[++i]) ;
//                Utils.database.pooshak[i] = true;
//                break;
//            case 5:
//                while (i < Utils.database.vasayel.length &&
//                        Utils.database.vasayel[++i]) ;
//                Utils.database.vasayel[i] = true;
//                break;
//            case 6:
//                while (i < Utils.database.mashaghel.length &&
//                        Utils.database.mashaghel[++i]) ;
//                Utils.database.mashaghel[i] = true;
//                break;
//            case 7:
//                while (i < Utils.database.rang.length &&
//                        Utils.database.rang[++i]) ;
//                Utils.database.rang[i] = true;
//                break;
//            case 8:
//                while (i < Utils.database.khordani.length &&
//                        Utils.database.khordani[++i]) ;
//                Utils.database.khordani[i] = true;
//                break;
//            case 9:
//                while (i < Utils.database.mafahim.length &&
//                        Utils.database.mafahim[++i]) ;
//                Utils.database.mafahim[i] = true;
//                break;
//        }
//
//        DatabaseAdapter.getInstance().saveDatabase(LoghatGeneralActivity.this,
//                Utils.database);
//    }
//
//    private void setImageResources() {
//        switch (type) {
//            case 0: // khanevade
//                switch (which) {
//                    case 0:
//                        baba();
//                        break;
//                    case 1:
//                        maman();
//                        break;
//                    case 2:
//                        dadash();
//                        break;
//                    case 3:
//                        khahar();
//                        break;
//                }
//                break;
//
//            case 1: // andam
//                switch (which) {
//                    case 0:
//                        cheshm();
//                        break;
//                    case 1:
//                        dast();
//                        break;
//                    case 2:
//                        pa();
//                        break;
//                    case 3:
//                        goosh();
//                        break;
//                    case 4:
//                        moo();
//                        break;
//                    case 5:
//                        dahan();
//                        break;
//                    case 6:
//                        bini();
//                        break;
//                    case 7:
//                        zaban();
//                        break;
//                    case 8:
//                        dandan();
//                        break;
//                    case 9:
//                        abroo();
//                        break;
//                }
//                break;
//
//            case 2: // mive
//                switch (which) {
//                    case 0:
//                        moz();
//                        break;
//                    case 1:
//                        sib();
//                        break;
//                    case 2:
//                        khiar();
//                        break;
//                    case 3:
//                        porteghal();
//                        break;
//                    case 4:
//                        limoo();
//                        break;
//                }
//                break;
//
//            case 3: // heyvanat
//                switch (which) {
//                    case 0:
//                        gorbe();
//                        break;
//                    case 1:
//                        sag();
//                        break;
//                    case 2:
//                        gav();
//                        break;
//                    case 3:
//                        mahi();
//                        break;
//                    case 4:
//                        morgh();
//                        break;
//                    case 5:
//                        asb();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 4: // pooshak
//                switch (which) {
//                    case 0:
//                        kafsh();
//                        break;
//                    case 1:
//                        kolah();
//                        break;
//                    case 2:
//                        joorab();
//                        break;
//                    case 3:
//                        shalvar();
//                        break;
//                    case 4:
//                        pirhan();
//                        break;
//                    case 5:
//                        roosari();
//                        break;
//                    case 6:
//                        bluse();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 5: // vasayel
//                switch (which) {
//                    case 0:
//                        shane();
//                        break;
//                    case 1:
//                        mesvak();
//                        break;
//                    case 2:
//                        hole();
//                        break;
//                    case 3:
//                        toop();
//                        break;
//                    case 4:
//                        docharkhe();
//                        break;
//                    case 5:
//                        mashin();
//                        break;
//                    case 6:
//                        havapeeyma();
//                        break;
//                    case 7:
//                        ghashogh();
//                        break;
//                    case 8:
//                        ketab();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 6: // mashaghel
//                switch (which) {
//                    case 0:
//                        doctor();
//                        break;
//                    case 1:
//                        nanva();
//                        break;
//                    case 2:
//                        maoalem();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 7: // rang
//                switch (which) {
//                    case 0:
//                        abi();
//                        break;
//                    case 1:
//                        zard();
//                        break;
//                    case 2:
//                        ghemez();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 8: // khordani
//                switch (which) {
//                    case 0:
//                        nan();
//                        break;
//                    case 1:
//                        shir();
//                        break;
//                    case 2:
//                        ab();
//                        break;
//                    case 3:
//                        cake();
//                        break;
//                    case 4:
//                        bisquit();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 9: // mafahim
//                switch (which) {
//                    case 0:
//                        bala();
//                        break;
//                    case 1:
//                        paen();
//                        break;
//                    case 2:
//                        kasif();
//                        break;
//                    case 3:
//                        tamiz();
//                        break;
//                    case 4:
//                        bache();
//                        break;
//                    case 5:
//                        dokhtar();
//                        break;
//                    case 6:
//                        pesar();
//                        break;
//                    case 7:
//                        sard();
//                        break;
//                    case 8:
//                        garm();
//                        break;
//                }
//
//            default:
//                break;
//        }
//    }
//
//    private void bala() {
//        imView00.setImageResource(R.drawable.bala);
//        imView10.setImageResource(R.drawable.bala);
//        imView20.setImageResource(R.drawable.bala);
//        imView30.setImageResource(R.drawable.bala);
//        imView40.setImageResource(R.drawable.bala);
//
//        imView11.setImageResource(R.drawable.balai);
//        imView21.setImageResource(R.drawable.balai);
//        imView32.setImageResource(R.drawable.balai);
//        imView50.setImageResource(R.drawable.balai);
//    }
//
//    private void paen() {
//        imView00.setImageResource(R.drawable.paen);
//        imView10.setImageResource(R.drawable.paen);
//        imView21.setImageResource(R.drawable.paen);
//        imView30.setImageResource(R.drawable.paen);
//        imView40.setImageResource(R.drawable.paen);
//    }
//
//    private void kasif() {
//        imView00.setImageResource(R.drawable.kasif);
//        imView10.setImageResource(R.drawable.kasif);
//        imView20.setImageResource(R.drawable.kasif);
//        imView30.setImageResource(R.drawable.kasif);
//        imView40.setImageResource(R.drawable.kasif);
//
//        imView11.setImageResource(R.drawable.kasifi);
//        imView21.setImageResource(R.drawable.kasifi);
//        imView32.setImageResource(R.drawable.kasifi);
//        imView50.setImageResource(R.drawable.kasifi);
//    }
//
//    private void tamiz() {
//        imView00.setImageResource(R.drawable.tamiz);
//        imView10.setImageResource(R.drawable.tamiz);
//        imView20.setImageResource(R.drawable.tamiz);
//        imView30.setImageResource(R.drawable.tamiz);
//        imView40.setImageResource(R.drawable.tamiz);
//
//        imView11.setImageResource(R.drawable.tamizi);
//        imView21.setImageResource(R.drawable.tamizi);
//        imView32.setImageResource(R.drawable.tamizi);
//        imView50.setImageResource(R.drawable.tamizi);
//    }
//
//    private void bache() {
//        imView00.setImageResource(R.drawable.bache);
//        imView10.setImageResource(R.drawable.bache);
//        imView21.setImageResource(R.drawable.bache);
//        imView30.setImageResource(R.drawable.bache);
//        imView40.setImageResource(R.drawable.bache);
//    }
//
//    private void dokhtar() {
//        imView00.setImageResource(R.drawable.dokhtar);
//        imView10.setImageResource(R.drawable.dokhtar);
//        imView20.setImageResource(R.drawable.dokhtar);
//        imView30.setImageResource(R.drawable.dokhtar);
//        imView40.setImageResource(R.drawable.dokhtar);
//
//        imView11.setImageResource(R.drawable.dokhtari);
//        imView21.setImageResource(R.drawable.dokhtari);
//        imView32.setImageResource(R.drawable.dokhtari);
//        imView50.setImageResource(R.drawable.dokhtari);
//    }
//
//    private void pesar() {
//        imView00.setImageResource(R.drawable.pesar);
//        imView10.setImageResource(R.drawable.pesar);
//        imView20.setImageResource(R.drawable.pesar);
//        imView30.setImageResource(R.drawable.pesar);
//        imView40.setImageResource(R.drawable.pesar);
//
//        imView11.setImageResource(R.drawable.pesari);
//        imView21.setImageResource(R.drawable.pesari);
//        imView32.setImageResource(R.drawable.pesari);
//        imView50.setImageResource(R.drawable.pesari);
//    }
//
//    private void sard() {
//        imView00.setImageResource(R.drawable.sard);
//        imView10.setImageResource(R.drawable.sard);
//        imView20.setImageResource(R.drawable.sard);
//        imView30.setImageResource(R.drawable.sard);
//        imView40.setImageResource(R.drawable.sard);
//
//        imView11.setImageResource(R.drawable.sardi);
//        imView21.setImageResource(R.drawable.sardi);
//        imView32.setImageResource(R.drawable.sardi);
//        imView50.setImageResource(R.drawable.sardi);
//    }
//
//    private void garm() {
//        imView00.setImageResource(R.drawable.garm);
//        imView10.setImageResource(R.drawable.garm);
//        imView20.setImageResource(R.drawable.garm);
//        imView30.setImageResource(R.drawable.garm);
//        imView40.setImageResource(R.drawable.garm);
//
//        imView11.setImageResource(R.drawable.garmi);
//        imView21.setImageResource(R.drawable.garmi);
//        imView32.setImageResource(R.drawable.garmi);
//        imView50.setImageResource(R.drawable.garmi);
//    }
//
//    private void nan() {
//        imView00.setImageResource(R.drawable.nan);
//        imView10.setImageResource(R.drawable.nan);
//        imView20.setImageResource(R.drawable.nan);
//        imView30.setImageResource(R.drawable.nan);
//        imView40.setImageResource(R.drawable.nan);
//
//        imView11.setImageResource(R.drawable.nani);
//        imView21.setImageResource(R.drawable.nani);
//        imView32.setImageResource(R.drawable.nani);
//        imView50.setImageResource(R.drawable.nani);
//    }
//
//    private void shir() {
//        imView00.setImageResource(R.drawable.shir);
//        imView10.setImageResource(R.drawable.shir);
//        imView20.setImageResource(R.drawable.shir);
//        imView30.setImageResource(R.drawable.shir);
//        imView40.setImageResource(R.drawable.shir);
//
//        imView11.setImageResource(R.drawable.shiri);
//        imView21.setImageResource(R.drawable.shiri);
//        imView32.setImageResource(R.drawable.shiri);
//        imView50.setImageResource(R.drawable.shiri);
//    }
//
//    private void ab() {
//        imView00.setImageResource(R.drawable.ab);
//        imView10.setImageResource(R.drawable.ab);
//        imView21.setImageResource(R.drawable.ab);
//        imView30.setImageResource(R.drawable.ab);
//        imView40.setImageResource(R.drawable.ab);
//    }
//
//    private void cake() {
//        imView00.setImageResource(R.drawable.cake);
//        imView10.setImageResource(R.drawable.cake);
//        imView20.setImageResource(R.drawable.cake);
//        imView30.setImageResource(R.drawable.cake);
//        imView40.setImageResource(R.drawable.cake);
//
//        imView11.setImageResource(R.drawable.cakei);
//        imView21.setImageResource(R.drawable.cakei);
//        imView32.setImageResource(R.drawable.cakei);
//        imView50.setImageResource(R.drawable.cakei);
//    }
//
//    private void bisquit() {
//        imView00.setImageResource(R.drawable.bisquit);
//        imView10.setImageResource(R.drawable.bisquit);
//        imView20.setImageResource(R.drawable.bisquit);
//        imView30.setImageResource(R.drawable.bisquit);
//        imView40.setImageResource(R.drawable.bisquit);
//
//        imView11.setImageResource(R.drawable.bisquiti);
//        imView21.setImageResource(R.drawable.bisquiti);
//        imView32.setImageResource(R.drawable.bisquiti);
//        imView50.setImageResource(R.drawable.bisquiti);
//    }
//
//    private void abi() {
//        imView00.setImageResource(R.drawable.abi);
//        imView10.setImageResource(R.drawable.abi);
//        imView21.setImageResource(R.drawable.abi);
//        imView30.setImageResource(R.drawable.abi);
//        imView40.setImageResource(R.drawable.abi);
//    }
//
//    private void zard() {
//        imView00.setImageResource(R.drawable.zard);
//        imView10.setImageResource(R.drawable.zard);
//        imView21.setImageResource(R.drawable.zard);
//        imView30.setImageResource(R.drawable.zard);
//        imView40.setImageResource(R.drawable.zard);
//    }
//
//    private void ghemez() {
//        imView00.setImageResource(R.drawable.ghermez);
//        imView10.setImageResource(R.drawable.ghermez);
//        imView21.setImageResource(R.drawable.ghermez);
//        imView30.setImageResource(R.drawable.ghermez);
//        imView40.setImageResource(R.drawable.ghermez);
//    }
//
//    private void doctor() {
//        imView00.setImageResource(R.drawable.doctor);
//        imView10.setImageResource(R.drawable.doctor);
//        imView20.setImageResource(R.drawable.doctor);
//        imView30.setImageResource(R.drawable.doctor);
//        imView40.setImageResource(R.drawable.doctor);
//
//        imView11.setImageResource(R.drawable.doctori);
//        imView21.setImageResource(R.drawable.doctori);
//        imView32.setImageResource(R.drawable.doctori);
//        imView50.setImageResource(R.drawable.doctori);
//    }
//
//    private void nanva() {
//        imView00.setImageResource(R.drawable.nanva);
//        imView10.setImageResource(R.drawable.nanva);
//        imView20.setImageResource(R.drawable.nanva);
//        imView30.setImageResource(R.drawable.nanva);
//        imView40.setImageResource(R.drawable.nanva);
//
//        imView11.setImageResource(R.drawable.nanvai);
//        imView21.setImageResource(R.drawable.nanvai);
//        imView32.setImageResource(R.drawable.nanvai);
//        imView50.setImageResource(R.drawable.nanvai);
//    }
//
//    private void maoalem() {
//        imView00.setImageResource(R.drawable.moalem);
//        imView10.setImageResource(R.drawable.moalem);
//        imView20.setImageResource(R.drawable.moalem);
//        imView30.setImageResource(R.drawable.moalem);
//        imView40.setImageResource(R.drawable.moalem);
//
//        imView11.setImageResource(R.drawable.moalemi);
//        imView21.setImageResource(R.drawable.moalemi);
//        imView32.setImageResource(R.drawable.moalemi);
//        imView50.setImageResource(R.drawable.moalemi);
//    }
//
//    private void shane() {
//        imView00.setImageResource(R.drawable.shane);
//        imView10.setImageResource(R.drawable.shane);
//        imView20.setImageResource(R.drawable.shane);
//        imView30.setImageResource(R.drawable.shane);
//        imView40.setImageResource(R.drawable.shane);
//
//        imView11.setImageResource(R.drawable.shanei);
//        imView21.setImageResource(R.drawable.shanei);
//        imView32.setImageResource(R.drawable.shanei);
//        imView50.setImageResource(R.drawable.shanei);
//    }
//
//    private void mesvak() {
//        imView00.setImageResource(R.drawable.mesvak);
//        imView10.setImageResource(R.drawable.mesvak);
//        imView20.setImageResource(R.drawable.mesvak);
//        imView30.setImageResource(R.drawable.mesvak);
//        imView40.setImageResource(R.drawable.mesvak);
//
//        imView11.setImageResource(R.drawable.mesvaki);
//        imView21.setImageResource(R.drawable.mesvaki);
//        imView32.setImageResource(R.drawable.mesvaki);
//        imView50.setImageResource(R.drawable.mesvaki);
//    }
//
//    private void hole() {
//        imView00.setImageResource(R.drawable.hole);
//        imView10.setImageResource(R.drawable.hole);
//        imView21.setImageResource(R.drawable.hole);
//        imView30.setImageResource(R.drawable.hole);
//        imView40.setImageResource(R.drawable.hole);
//    }
//
//    private void toop() {
//        imView00.setImageResource(R.drawable.toop);
//        imView10.setImageResource(R.drawable.toop);
//        imView21.setImageResource(R.drawable.toop);
//        imView30.setImageResource(R.drawable.toop);
//        imView40.setImageResource(R.drawable.toop);
//    }
//
//    private void docharkhe() {
//        imView00.setImageResource(R.drawable.docharkhe);
//        imView10.setImageResource(R.drawable.docharkhe);
//        imView20.setImageResource(R.drawable.docharkhe);
//        imView30.setImageResource(R.drawable.docharkhe);
//        imView40.setImageResource(R.drawable.docharkhe);
//
//        imView11.setImageResource(R.drawable.docharkhei);
//        imView21.setImageResource(R.drawable.docharkhei);
//        imView32.setImageResource(R.drawable.docharkhei);
//        imView50.setImageResource(R.drawable.docharkhei);
//    }
//
//    private void mashin() {
//        imView00.setImageResource(R.drawable.mashin);
//        imView10.setImageResource(R.drawable.mashin);
//        imView20.setImageResource(R.drawable.mashin);
//        imView30.setImageResource(R.drawable.mashin);
//        imView40.setImageResource(R.drawable.mashin);
//
//        imView11.setImageResource(R.drawable.mashini);
//        imView21.setImageResource(R.drawable.mashini);
//        imView32.setImageResource(R.drawable.mashini);
//        imView50.setImageResource(R.drawable.mashini);
//    }
//
//    private void havapeeyma() {
//        imView00.setImageResource(R.drawable.havapeyma);
//        imView10.setImageResource(R.drawable.havapeyma);
//        imView20.setImageResource(R.drawable.havapeyma);
//        imView30.setImageResource(R.drawable.havapeyma);
//        imView40.setImageResource(R.drawable.havapeyma);
//
//        imView11.setImageResource(R.drawable.havapeymai);
//        imView21.setImageResource(R.drawable.havapeymai);
//        imView32.setImageResource(R.drawable.havapeymai);
//        imView50.setImageResource(R.drawable.havapeymai);
//    }
//
//    private void ghashogh() {
//        imView00.setImageResource(R.drawable.ghashogh);
//        imView10.setImageResource(R.drawable.ghashogh);
//        imView20.setImageResource(R.drawable.ghashogh);
//        imView30.setImageResource(R.drawable.ghashogh);
//        imView40.setImageResource(R.drawable.ghashogh);
//
//        imView11.setImageResource(R.drawable.ghashoghi);
//        imView21.setImageResource(R.drawable.ghashoghi);
//        imView32.setImageResource(R.drawable.ghashoghi);
//        imView50.setImageResource(R.drawable.ghashoghi);
//    }
//
//    private void ketab() {
//        imView00.setImageResource(R.drawable.ketab);
//        imView10.setImageResource(R.drawable.ketab);
//        imView20.setImageResource(R.drawable.ketab);
//        imView30.setImageResource(R.drawable.ketab);
//        imView40.setImageResource(R.drawable.ketab);
//
//        imView11.setImageResource(R.drawable.ketabi);
//        imView21.setImageResource(R.drawable.ketabi);
//        imView32.setImageResource(R.drawable.ketabi);
//        imView50.setImageResource(R.drawable.ketabi);
//    }
//
//    private void kafsh() {
//        imView00.setImageResource(R.drawable.kafsh);
//        imView10.setImageResource(R.drawable.kafsh);
//        imView20.setImageResource(R.drawable.kafsh);
//        imView30.setImageResource(R.drawable.kafsh);
//        imView40.setImageResource(R.drawable.kafsh);
//
//        imView11.setImageResource(R.drawable.kafshi);
//        imView21.setImageResource(R.drawable.kafshi);
//        imView32.setImageResource(R.drawable.kafshi);
//        imView50.setImageResource(R.drawable.kafshi);
//    }
//
//    private void kolah() {
//        imView00.setImageResource(R.drawable.kolah);
//        imView10.setImageResource(R.drawable.kolah);
//        imView20.setImageResource(R.drawable.kolah);
//        imView30.setImageResource(R.drawable.kolah);
//        imView40.setImageResource(R.drawable.kolah);
//
//        imView11.setImageResource(R.drawable.kolahi);
//        imView21.setImageResource(R.drawable.kolahi);
//        imView32.setImageResource(R.drawable.kolahi);
//        imView50.setImageResource(R.drawable.kolahi);
//    }
//
//    private void joorab() {
//        imView00.setImageResource(R.drawable.joorab);
//        imView10.setImageResource(R.drawable.joorab);
//        imView21.setImageResource(R.drawable.joorab);
//        imView30.setImageResource(R.drawable.joorab);
//        imView40.setImageResource(R.drawable.joorab);
//    }
//
//    private void shalvar() {
//        imView00.setImageResource(R.drawable.shalvar);
//        imView10.setImageResource(R.drawable.shalvar);
//        imView20.setImageResource(R.drawable.shalvar);
//        imView30.setImageResource(R.drawable.shalvar);
//        imView40.setImageResource(R.drawable.shalvar);
//
//        imView11.setImageResource(R.drawable.shalvari);
//        imView21.setImageResource(R.drawable.shalvari);
//        imView32.setImageResource(R.drawable.shalvari);
//        imView50.setImageResource(R.drawable.shalvari);
//    }
//
//    private void pirhan() {
//        imView00.setImageResource(R.drawable.pirahan);
//        imView10.setImageResource(R.drawable.pirahan);
//        imView20.setImageResource(R.drawable.pirahan);
//        imView30.setImageResource(R.drawable.pirahan);
//        imView40.setImageResource(R.drawable.pirahan);
//
//        imView11.setImageResource(R.drawable.pirhani);
//        imView21.setImageResource(R.drawable.pirhani);
//        imView32.setImageResource(R.drawable.pirhani);
//        imView50.setImageResource(R.drawable.pirhani);
//    }
//
//    private void roosari() {
//        imView00.setImageResource(R.drawable.roosari);
//        imView10.setImageResource(R.drawable.roosari);
//        imView20.setImageResource(R.drawable.roosari);
//        imView30.setImageResource(R.drawable.roosari);
//        imView40.setImageResource(R.drawable.roosari);
//
//        imView11.setImageResource(R.drawable.roosarii);
//        imView21.setImageResource(R.drawable.roosarii);
//        imView32.setImageResource(R.drawable.roosarii);
//        imView50.setImageResource(R.drawable.roosarii);
//    }
//
//    private void bluse() {
//        imView00.setImageResource(R.drawable.bluse);
//        imView10.setImageResource(R.drawable.bluse);
//        imView20.setImageResource(R.drawable.bluse);
//        imView30.setImageResource(R.drawable.bluse);
//        imView40.setImageResource(R.drawable.bluse);
//
//        imView11.setImageResource(R.drawable.blusei);
//        imView21.setImageResource(R.drawable.blusei);
//        imView32.setImageResource(R.drawable.blusei);
//        imView50.setImageResource(R.drawable.blusei);
//    }
//
//    private void gorbe() {
//        imView00.setImageResource(R.drawable.gorbe);
//        imView10.setImageResource(R.drawable.gorbe);
//        imView20.setImageResource(R.drawable.gorbe);
//        imView30.setImageResource(R.drawable.gorbe);
//        imView40.setImageResource(R.drawable.gorbe);
//
//        imView11.setImageResource(R.drawable.gorbei);
//        imView21.setImageResource(R.drawable.gorbei);
//        imView32.setImageResource(R.drawable.gorbei);
//        imView50.setImageResource(R.drawable.gorbei);
//    }
//
//    private void sag() {
//        imView00.setImageResource(R.drawable.sag);
//        imView10.setImageResource(R.drawable.sag);
//        imView20.setImageResource(R.drawable.sag);
//        imView30.setImageResource(R.drawable.sag);
//        imView40.setImageResource(R.drawable.sag);
//
//        imView11.setImageResource(R.drawable.sagi);
//        imView21.setImageResource(R.drawable.sagi);
//        imView32.setImageResource(R.drawable.sagi);
//        imView50.setImageResource(R.drawable.sagi);
//    }
//
//    private void gav() {
//        imView00.setImageResource(R.drawable.gav);
//        imView10.setImageResource(R.drawable.gav);
//        imView20.setImageResource(R.drawable.gav);
//        imView30.setImageResource(R.drawable.gav);
//        imView40.setImageResource(R.drawable.gav);
//
//        imView11.setImageResource(R.drawable.gavi);
//        imView21.setImageResource(R.drawable.gavi);
//        imView32.setImageResource(R.drawable.gavi);
//        imView50.setImageResource(R.drawable.gavi);
//    }
//
//    private void mahi() {
//        imView00.setImageResource(R.drawable.mahi);
//        imView10.setImageResource(R.drawable.mahi);
//        imView21.setImageResource(R.drawable.mahi);
//        imView30.setImageResource(R.drawable.mahi);
//        imView40.setImageResource(R.drawable.mahi);
//    }
//
//    private void morgh() {
//        imView00.setImageResource(R.drawable.morgh);
//        imView10.setImageResource(R.drawable.morgh);
//        imView21.setImageResource(R.drawable.morgh);
//        imView30.setImageResource(R.drawable.morgh);
//        imView40.setImageResource(R.drawable.morgh);
//    }
//
//    private void asb() {
//        imView00.setImageResource(R.drawable.asb);
//        imView10.setImageResource(R.drawable.asb);
//        imView21.setImageResource(R.drawable.asb);
//        imView30.setImageResource(R.drawable.asb);
//        imView40.setImageResource(R.drawable.asb);
//    }
//
//    private void moz() {
//        imView00.setImageResource(R.drawable.moz);
//        imView10.setImageResource(R.drawable.moz);
//        imView20.setImageResource(R.drawable.moz);
//        imView30.setImageResource(R.drawable.moz);
//        imView40.setImageResource(R.drawable.moz);
//
//        imView11.setImageResource(R.drawable.mozi);
//        imView21.setImageResource(R.drawable.mozi);
//        imView32.setImageResource(R.drawable.mozi);
//        imView50.setImageResource(R.drawable.mozi);
//    }
//
//    private void sib() {
//        imView00.setImageResource(R.drawable.sib);
//        imView10.setImageResource(R.drawable.sib);
//        imView20.setImageResource(R.drawable.sib);
//        imView30.setImageResource(R.drawable.sib);
//        imView40.setImageResource(R.drawable.sib);
//
//        imView11.setImageResource(R.drawable.sibi);
//        imView21.setImageResource(R.drawable.sibi);
//        imView32.setImageResource(R.drawable.sibi);
//        imView50.setImageResource(R.drawable.sibi);
//    }
//
//    private void khiar() {
//        imView00.setImageResource(R.drawable.khiar);
//        imView10.setImageResource(R.drawable.khiar);
//        imView20.setImageResource(R.drawable.khiar);
//        imView30.setImageResource(R.drawable.khiar);
//        imView40.setImageResource(R.drawable.khiar);
//
//        imView11.setImageResource(R.drawable.khiari);
//        imView21.setImageResource(R.drawable.khiari);
//        imView32.setImageResource(R.drawable.khiari);
//        imView50.setImageResource(R.drawable.khiari);
//    }
//
//    private void porteghal() {
//        imView00.setImageResource(R.drawable.porteghal);
//        imView10.setImageResource(R.drawable.porteghal);
//        imView21.setImageResource(R.drawable.porteghal);
//        imView30.setImageResource(R.drawable.porteghal);
//        imView40.setImageResource(R.drawable.porteghal);
//    }
//
//    private void limoo() {
//        imView00.setImageResource(R.drawable.limoo);
//        imView10.setImageResource(R.drawable.limoo);
//        imView20.setImageResource(R.drawable.limoo);
//        imView30.setImageResource(R.drawable.limoo);
//        imView40.setImageResource(R.drawable.limoo);
//
//        imView11.setImageResource(R.drawable.limooi);
//        imView21.setImageResource(R.drawable.limooi);
//        imView32.setImageResource(R.drawable.limooi);
//        imView50.setImageResource(R.drawable.limooi);
//    }
//
//    private void cheshm() {
//        imView00.setImageResource(R.drawable.cheshm);
//        imView10.setImageResource(R.drawable.cheshm);
//        imView20.setImageResource(R.drawable.cheshm);
//        imView30.setImageResource(R.drawable.cheshm);
//        imView40.setImageResource(R.drawable.cheshm);
//
//        imView11.setImageResource(R.drawable.cheshmi);
//        imView21.setImageResource(R.drawable.cheshmi);
//        imView32.setImageResource(R.drawable.cheshmi);
//        imView50.setImageResource(R.drawable.cheshmi);
//    }
//
//    private void dast() {
//        imView00.setImageResource(R.drawable.dast);
//        imView10.setImageResource(R.drawable.dast);
//        imView20.setImageResource(R.drawable.dast);
//        imView30.setImageResource(R.drawable.dast);
//        imView40.setImageResource(R.drawable.dast);
//
//        imView11.setImageResource(R.drawable.dasti);
//        imView21.setImageResource(R.drawable.dasti);
//        imView32.setImageResource(R.drawable.dasti);
//        imView50.setImageResource(R.drawable.dasti);
//    }
//
//    private void pa() {
//        imView00.setImageResource(R.drawable.pa);
//        imView10.setImageResource(R.drawable.pa);
//        imView20.setImageResource(R.drawable.pa);
//        imView30.setImageResource(R.drawable.pa);
//        imView40.setImageResource(R.drawable.pa);
//
//        imView11.setImageResource(R.drawable.pai);
//        imView21.setImageResource(R.drawable.pai);
//        imView32.setImageResource(R.drawable.pai);
//        imView50.setImageResource(R.drawable.pai);
//    }
//
//    private void goosh() {
//        imView00.setImageResource(R.drawable.goosh);
//        imView10.setImageResource(R.drawable.goosh);
//        imView20.setImageResource(R.drawable.goosh);
//        imView30.setImageResource(R.drawable.goosh);
//        imView40.setImageResource(R.drawable.goosh);
//
//        imView11.setImageResource(R.drawable.gooshi);
//        imView21.setImageResource(R.drawable.gooshi);
//        imView32.setImageResource(R.drawable.gooshi);
//        imView50.setImageResource(R.drawable.gooshi);
//    }
//
//    private void moo() {
//        imView00.setImageResource(R.drawable.moo);
//        imView10.setImageResource(R.drawable.moo);
//        imView20.setImageResource(R.drawable.moo);
//        imView30.setImageResource(R.drawable.moo);
//        imView40.setImageResource(R.drawable.moo);
//
//        imView11.setImageResource(R.drawable.mooi);
//        imView21.setImageResource(R.drawable.mooi);
//        imView32.setImageResource(R.drawable.mooi);
//        imView50.setImageResource(R.drawable.mooi);
//    }
//
//    private void dahan() {
//        imView00.setImageResource(R.drawable.dahan);
//        imView10.setImageResource(R.drawable.dahan);
//        imView20.setImageResource(R.drawable.dahan);
//        imView30.setImageResource(R.drawable.dahan);
//        imView40.setImageResource(R.drawable.dahan);
//
//        imView11.setImageResource(R.drawable.dahani);
//        imView21.setImageResource(R.drawable.dahani);
//        imView32.setImageResource(R.drawable.dahani);
//        imView50.setImageResource(R.drawable.dahani);
//    }
//
//    private void bini() {
//        imView00.setImageResource(R.drawable.bini);
//        imView10.setImageResource(R.drawable.bini);
//        imView20.setImageResource(R.drawable.bini);
//        imView30.setImageResource(R.drawable.bini);
//        imView40.setImageResource(R.drawable.bini);
//
//        imView11.setImageResource(R.drawable.binii);
//        imView21.setImageResource(R.drawable.binii);
//        imView32.setImageResource(R.drawable.binii);
//        imView50.setImageResource(R.drawable.binii);
//    }
//
//    private void zaban() {
//        imView00.setImageResource(R.drawable.zaban);
//        imView10.setImageResource(R.drawable.zaban);
//        imView20.setImageResource(R.drawable.zaban);
//        imView30.setImageResource(R.drawable.zaban);
//        imView40.setImageResource(R.drawable.zaban);
//
//        imView11.setImageResource(R.drawable.zabani);
//        imView21.setImageResource(R.drawable.zabani);
//        imView32.setImageResource(R.drawable.zabani);
//        imView50.setImageResource(R.drawable.zabani);
//    }
//
//    private void dandan() {
//        imView00.setImageResource(R.drawable.dandan);
//        imView10.setImageResource(R.drawable.dandan);
//        imView20.setImageResource(R.drawable.dandan);
//        imView30.setImageResource(R.drawable.dandan);
//        imView40.setImageResource(R.drawable.dandan);
//
//        imView11.setImageResource(R.drawable.dandani);
//        imView21.setImageResource(R.drawable.dandani);
//        imView32.setImageResource(R.drawable.dandani);
//        imView50.setImageResource(R.drawable.dandani);
//    }
//
//    private void abroo() {
//        imView00.setImageResource(R.drawable.abroo);
//        imView10.setImageResource(R.drawable.abroo);
//        imView20.setImageResource(R.drawable.abroo);
//        imView30.setImageResource(R.drawable.abroo);
//        imView40.setImageResource(R.drawable.abroo);
//
//        imView11.setImageResource(R.drawable.abrooi);
//        imView21.setImageResource(R.drawable.abrooi);
//        imView32.setImageResource(R.drawable.abrooi);
//        imView50.setImageResource(R.drawable.abrooi);
//    }
//
//    private void baba() {
//        imView00.setImageResource(R.drawable.baba);
//        imView10.setImageResource(R.drawable.baba);
//        imView20.setImageResource(R.drawable.baba);
//        imView30.setImageResource(R.drawable.baba);
//        imView40.setImageResource(R.drawable.baba);
//
//        imView11.setImageResource(R.drawable.pedari);
//        imView21.setImageResource(R.drawable.pedari);
//        imView32.setImageResource(R.drawable.pedari);
//        imView50.setImageResource(R.drawable.pedari);
//    }
//
//    private void maman() {
//        imView00.setImageResource(R.drawable.maman);
//        imView10.setImageResource(R.drawable.maman);
//        imView20.setImageResource(R.drawable.maman);
//        imView30.setImageResource(R.drawable.maman);
//        imView40.setImageResource(R.drawable.maman);
//
//        imView11.setImageResource(R.drawable.madari);
//        imView21.setImageResource(R.drawable.madari);
//        imView32.setImageResource(R.drawable.madari);
//        imView50.setImageResource(R.drawable.madari);
//    }
//
//    private void dadash() {
//        imView00.setImageResource(R.drawable.dadash);
//        imView10.setImageResource(R.drawable.dadash);
//        imView20.setImageResource(R.drawable.dadash);
//        imView30.setImageResource(R.drawable.dadash);
//        imView40.setImageResource(R.drawable.dadash);
//
//        imView11.setImageResource(R.drawable.baradari);
//        imView21.setImageResource(R.drawable.baradari);
//        imView32.setImageResource(R.drawable.baradari);
//        imView50.setImageResource(R.drawable.baradari);
//    }
//
//    private void khahar() {
//        imView00.setImageResource(R.drawable.khahar);
//        imView10.setImageResource(R.drawable.khahar);
//        imView20.setImageResource(R.drawable.khahar);
//        imView30.setImageResource(R.drawable.khahar);
//        imView40.setImageResource(R.drawable.khahar);
//
//        imView11.setImageResource(R.drawable.khahari);
//        imView21.setImageResource(R.drawable.khahari);
//        imView32.setImageResource(R.drawable.khahari);
//        imView50.setImageResource(R.drawable.khahari);
//    }
//
//}
