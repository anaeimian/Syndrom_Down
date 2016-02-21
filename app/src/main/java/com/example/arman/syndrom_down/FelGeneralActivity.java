//package com.example.arman.syndrom_down;
//
//import android.animation.Animator;
//import android.animation.ObjectAnimator;
//import android.content.ClipData;
//import android.graphics.Color;
//import android.media.MediaPlayer;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.Log;
//import android.view.DragEvent;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.MediaController;
//import android.widget.ScrollView;
//import android.widget.VideoView;
//
///**
// * Created by Szamani on 12/26/2015.
// */
//public class FelGeneralActivity extends ActionBarActivity {
//    private Toolbar toolbar;
//    private int which;
//    private int type;
//    private boolean active;
//
//    private int c0;
//    private int c1;
//    private int c1w;
//    private int c2;
//    private int c3;
//
//    private MediaController mediaController;
//
//    private MediaPlayer mediaPlayerRahnama;
//    private MediaPlayer mediaPlayerTashvigh;
//
//    private ScrollView scrollView;
//
//    private LinearLayout l1;
//    private LinearLayout l2;
//    private LinearLayout l3;
//
//    private ObjectAnimator animator;
//
//    private VideoView vidView0;
//    private ImageView imViewReplay;
//    private ImageView imViewNext;
//
//    private ImageView sep1;
//
//    private VideoView vidView1;
//    private ImageView imViewPass;
//    private ImageView imViewFail;
//
//    private ImageView sep2;
//
//    private ImageView imViewVisual;
//    private ImageView imViewName;
//    private ImageView imViewRahnama;
//
//    private ImageView sep3;
//
//    private ImageView imViewVisual2;
//    private ImageView imViewName2;
//    private ImageView imViewRahnama2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fel_general);
//
//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);
//        setTitle(getIntent().getStringExtra(Utils.NAME));
//
//        type = getIntent().getIntExtra(Utils.TYPE, 0); // khanevade
//        which = getIntent().getIntExtra(Utils.WHICH, 0); // baba
//        active = getIntent().getBooleanExtra(Utils.ACTIVE, false); // is passed?
//
//        mediaController = new MediaController(this);
//
////        mediaPlayerRahnama = MediaPlayer.create(this, R.raw.beep);
////        mediaPlayerTashvigh = MediaPlayer.create(this, R.raw.step);
//
//        animator = new ObjectAnimator();
//        animator.setDuration(1500);
//        animator.setPropertyName("translationY");
//
//        initializeViews();
//        setImageResources();
//        if (!active)
//            diActivateAll();
//        setListeners();
//
//    }
//
//    private void passSection() {
//        int i = 0;
//        active = true;
//
//        switch (type) {
//            case 0: // amr
//                while (i < Utils.database.amr.length &&
//                        Utils.database.amr[++i]) ;
//                Utils.database.amr[i] = true;
//                break;
//
//            case 1: // gozashte
//                while (i < Utils.database.gozashte.length &&
//                        Utils.database.gozashte[++i]) ;
//                Utils.database.gozashte[i] = true;
//                break;
//
//            case 2: // hessi
//                while (i < Utils.database.hessi.length &&
//                        Utils.database.hessi[++i]) ;
//                Utils.database.hessi[i] = true;
//                break;
//
//            case 3: // kalame2
//                while (i < Utils.database.kalame2.length &&
//                        Utils.database.kalame2[++i]) ;
//                Utils.database.kalame2[i] = true;
//                break;
//
//            case 4: // zamir
//                while (i < Utils.database.zamir.length &&
//                        Utils.database.zamir[++i]) ;
//                Utils.database.zamir[i] = true;
//                break;
//        }
//
//        DatabaseAdapter.getInstance().saveDatabase(FelGeneralActivity.this,
//                Utils.database);
//    }
//
//    private void initializeViews() {
//        scrollView = (ScrollView) findViewById(R.id.scrollView);
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
//        sep1 = (ImageView) findViewById(R.id.sep1);
//        vidView1 = (VideoView) findViewById(R.id.vidView1);
//        imViewPass = (ImageView) findViewById(R.id.imViewPass);
//        imViewFail = (ImageView) findViewById(R.id.imViewFail);
//        sep2 = (ImageView) findViewById(R.id.sep2);
//        imViewVisual = (ImageView) findViewById(R.id.imViewVisual);
//        imViewName = (ImageView) findViewById(R.id.imViewName);
//        imViewRahnama = (ImageView) findViewById(R.id.imViewRahnama);
//        sep3 = (ImageView) findViewById(R.id.sep3);
//        imViewVisual2 = (ImageView) findViewById(R.id.imViewVisual2);
//        imViewName2 = (ImageView) findViewById(R.id.imViewName2);
//        imViewRahnama2 = (ImageView) findViewById(R.id.imViewRahnama2);
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
//        vidView0.setMediaController(mediaController);
//        vidView1.setMediaController(mediaController);
//
//        imViewRahnama.setVisibility(View.INVISIBLE);
//        imViewRahnama2.setVisibility(View.INVISIBLE);
//    }
//
//    private void diActivateAll() {
//        vidView1.setEnabled(false);
//        imViewPass.setEnabled(false);
//        imViewFail.setEnabled(false);
//        imViewVisual.setEnabled(false);
//        imViewName.setEnabled(false);
//        imViewRahnama.setEnabled(false);
//        imViewVisual2.setEnabled(false);
//        imViewName2.setEnabled(false);
//        imViewRahnama2.setEnabled(false);
//    }
//
//    private void activate1() {
//        vidView1.setEnabled(true);
//        imViewPass.setEnabled(true);
//        imViewFail.setEnabled(true);
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
//    private void deActivate1() {
//        vidView1.setEnabled(false);
//        imViewPass.setEnabled(false);
//        imViewFail.setEnabled(false);
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
//    private void activate2() {
//        imViewVisual.setEnabled(true);
//        imViewName.setEnabled(true);
//        imViewRahnama.setEnabled(true);
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
//        imViewRahnama.setX(imViewVisual.getX() + (imViewVisual.getWidth() / 2));
//
//        animator.setFloatValues(imViewVisual.getY() - imViewRahnama.getY() + (imViewVisual.getHeight() / 2)
//                , imViewName.getY() - imViewRahnama.getY() + (imViewName.getHeight() / 2));
//        animator.setTarget(imViewRahnama);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imViewRahnama.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imViewRahnama.setVisibility(View.INVISIBLE);
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
//
//    }
//
//    private void activate3() {
//        imViewVisual2.setEnabled(true);
//        imViewName2.setEnabled(true);
//        imViewRahnama2.setEnabled(true);
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
//        mediaPlayerRahnama.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                animator.start();
//            }
//        });
//
//        imViewRahnama2.setX(imViewVisual2.getX() + (imViewVisual2.getWidth() / 2));
//
//        animator.setFloatValues(imViewName2.getY() - imViewRahnama2.getY() + (imViewName2.getHeight() / 2),
//                imViewVisual2.getY() - imViewRahnama2.getY() + (imViewVisual2.getHeight() / 2));
//        animator.setTarget(imViewRahnama2);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                imViewRahnama2.setVisibility(View.VISIBLE);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                imViewRahnama2.setVisibility(View.INVISIBLE);
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
//        imViewPass.setOnClickListener(new View.OnClickListener() {
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
//        imViewFail.setOnClickListener(new View.OnClickListener() {
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
//
//        imViewVisual.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData clipData = ClipData.newPlainText("", "");
//                imViewVisual.startDrag(clipData, new View.DragShadowBuilder(v), null, 0);
//                return true;
//            }
//        });
//
//        imViewName.setOnDragListener(new View.OnDragListener() {
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
//                        ++c2;
//
//                        if (c2 >= 4) {
//                            activate3();
//                        } else mediaPlayerTashvigh.start();
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
//        imViewRahnama.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        ////////////////////////////////////////////////////////////////////
//
//        imViewVisual2.setOnDragListener(new View.OnDragListener() {
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
//                        ++c3;
//
//                        if (c3 >= 4) {
//                            if (!active)
//                                passSection();
//                        } else mediaPlayerTashvigh.start();
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
//        imViewName2.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData clipData = ClipData.newPlainText("", "");
//                imViewName2.startDrag(clipData, new View.DragShadowBuilder(v), null, 0);
//                return true;
//            }
//        });
//
//        imViewRahnama2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }
//
//    private void setImageResources() {
//        switch (type) {
//            case 0: // amr
//                switch (which) {
//                    case 0:
//                        bede();
//                        break;
//                    case 1:
//                        begir();
//                        break;
//                    case 2:
//                        bia();
//                        break;
//                    case 3:
//                        beshin();
//                        break;
//                    case 4:
//                        beshoor();
//                        break;
//                    case 5:
//                        bokhor();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 1: // gozashte
//                switch (which) {
//                    case 0:
//                        raft();
//                        break;
//                    case 1:
//                        khord();
//                        break;
//                    case 2:
//                        khabid();
//                        break;
//                    case 3:
//                        parid();
//                        break;
//                    case 4:
//                        david();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 2: // hessi
//                switch (which) {
//                    case 0:
//                        khabidan();
//                        break;
//                    case 1:
//                        shostan();
//                        break;
//                    case 2:
//                        paridan();
//                        break;
//                    case 3:
//                        davidan();
//                        break;
//                    case 4:
//                        khordan();
//                        break;
//                    case 5:
//                        khandan();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 3: // kalame2
//                switch (which) {
//                    case 0:
//                        babayeman();
//                        break;
//                    case 1:
//                        kafsheman();
//                        break;
//                    case 2:
//                        toopeman();
//                        break;
//                    case 3:
//                        babayeto();
//                        break;
//                    case 4:
//                        kafsheto();
//                        break;
//                    case 5:
//                        toopeto();
//                        break;
//                    case 6:
//                        shanezard();
//                        break;
//                    case 7:
//                        dokhtarekasif();
//                        break;
//                    case 8:
//                        kafshekasif();
//                        break;
//                    case 9:
//                        dokhtaretamiz();
//                        break;
//                    case 10:
//                        kafshetamiz();
//                        break;
//                    case 11:
//                        abbede();
//                        break;
//                    case 12:
//                        babaraft();
//                        break;
//                    case 13:
//                        mamankhabid();
//                        break;
//                    case 14:
//                        bachebeshin();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case 4: // zamir
//                switch (which) {
//                    case 0:
//                        man();
//                        break;
//                    case 1:
//                        to();
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            default:
//                break;
//        }
//
//    }
//
//    private void man() {
//        imViewName.setImageResource(R.drawable.temp);
//        imViewName2.setImageResource(R.drawable.temp);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.man));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.man));
//
//        imViewVisual.setImageResource(R.drawable.mani);
//        imViewVisual2.setImageResource(R.drawable.mani);
//    }
//
//    private void to() {
//        imViewName.setImageResource(R.drawable.temp);
//        imViewName2.setImageResource(R.drawable.temp);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.to));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.to));
//
//        imViewVisual.setImageResource(R.drawable.toi);
//        imViewVisual2.setImageResource(R.drawable.toi);
//    }
//
//    private void babayeman() {
//        imViewName.setImageResource(R.drawable.babayeman);
//        imViewName2.setImageResource(R.drawable.babayeman);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pedareman));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pedareman));
//
//        imViewVisual.setImageResource(R.drawable.pedaremani);
//        imViewVisual2.setImageResource(R.drawable.pedaremani);
//    }
//
//    private void kafsheman() {
//        imViewName.setImageResource(R.drawable.kafsheman);
//        imViewName2.setImageResource(R.drawable.kafsheman);
//
//        imViewVisual.setImageResource(R.drawable.kafsheman);
//        imViewVisual2.setImageResource(R.drawable.kafsheman);
//    }
//
//    private void toopeman() {
//        imViewName.setImageResource(R.drawable.toopeman);
//        imViewName2.setImageResource(R.drawable.toopeman);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeman));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeman));
//
//        imViewVisual.setImageResource(R.drawable.toopemani);
//        imViewVisual2.setImageResource(R.drawable.toopemani);
//    }
//
//    private void babayeto() {
//        imViewName.setImageResource(R.drawable.babayeto);
//        imViewName2.setImageResource(R.drawable.babayeto);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pedareto));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.pedareto));
//
//        imViewVisual.setImageResource(R.drawable.babayetoi);
//        imViewVisual2.setImageResource(R.drawable.babayetoi);
//    }
//
//    private void kafsheto() {
//        imViewName.setImageResource(R.drawable.kafsheto);
//        imViewName2.setImageResource(R.drawable.kafsheto);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheto));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.kafsheto));
//
//        imViewVisual.setImageResource(R.drawable.kafshetoi);
//        imViewVisual2.setImageResource(R.drawable.kafshetoi);
//    }
//
//    private void toopeto() {
//        imViewName.setImageResource(R.drawable.toopeto);
//        imViewName2.setImageResource(R.drawable.toopeto);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeto));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.toopeto));
//
//        imViewVisual.setImageResource(R.drawable.toopetoi);
//        imViewVisual2.setImageResource(R.drawable.toopetoi);
//    }
//
//    private void shanezard() {
//        imViewName.setImageResource(R.drawable.shanezard);
//        imViewName2.setImageResource(R.drawable.shanezard);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shaneghermez));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shaneghermez));
//
//        imViewVisual.setImageResource(R.drawable.shaneghermezi);
//        imViewVisual2.setImageResource(R.drawable.shaneghermezi);
//    }
//
//    private void dokhtarekasif() {
//        imViewName.setImageResource(R.drawable.dokhtarekasif);
//        imViewName2.setImageResource(R.drawable.dokhtarekasif);
//    }
//
//    private void kafshekasif() {
//        imViewName.setImageResource(R.drawable.kafshekasif);
//        imViewName2.setImageResource(R.drawable.kafshekasif);
//    }
//
//    private void dokhtaretamiz() {
//        imViewName.setImageResource(R.drawable.dokhtaretamiz);
//        imViewName2.setImageResource(R.drawable.dokhtaretamiz);
//    }
//
//    private void kafshetamiz() {
//        imViewName.setImageResource(R.drawable.kafshetamiz);
//        imViewName2.setImageResource(R.drawable.kafshetamiz);
//    }
//
//    private void abbede() {
//        imViewName.setImageResource(R.drawable.abbede);
//        imViewName2.setImageResource(R.drawable.abbede);
//    }
//
//    private void babaraft() {
//        imViewName.setImageResource(R.drawable.babaraft);
//        imViewName2.setImageResource(R.drawable.babaraft);
//    }
//
//    private void mamankhabid() {
//        imViewName.setImageResource(R.drawable.mamankhabid);
//        imViewName2.setImageResource(R.drawable.mamankhabid);
//    }
//
//    private void bachebeshin() {
//        imViewName.setImageResource(R.drawable.bachebeshin);
//        imViewName2.setImageResource(R.drawable.bachebeshin);
//    }
//
//    private void bede() {
//        imViewName.setImageResource(R.drawable.bede);
//        imViewName2.setImageResource(R.drawable.bede);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bede));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bede));
//
//        imViewVisual.setImageResource(R.drawable.bedei);
//        imViewVisual2.setImageResource(R.drawable.bedei);
//    }
//
//    private void begir() {
//        imViewName.setImageResource(R.drawable.begir);
//        imViewName2.setImageResource(R.drawable.begir);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.begir));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.begir));
//
//        imViewVisual.setImageResource(R.drawable.begiri);
//        imViewVisual2.setImageResource(R.drawable.begiri);
//    }
//
//    private void bia() {
//        imViewName.setImageResource(R.drawable.bia);
//        imViewName2.setImageResource(R.drawable.bia);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bia));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bia));
//
//        imViewVisual.setImageResource(R.drawable.biai);
//        imViewVisual2.setImageResource(R.drawable.biai);
//    }
//
//    private void beshin() {
//        imViewName.setImageResource(R.drawable.beshin);
//        imViewName2.setImageResource(R.drawable.beshin);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshin));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshin));
//
//        imViewVisual.setImageResource(R.drawable.beshini);
//        imViewVisual2.setImageResource(R.drawable.beshini);
//    }
//
//    private void beshoor() {
//        imViewName.setImageResource(R.drawable.beshoor);
//        imViewName2.setImageResource(R.drawable.beshoor);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshoor));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.beshoor));
//
//        imViewVisual.setImageResource(R.drawable.beshoori);
//        imViewVisual2.setImageResource(R.drawable.beshoori);
//    }
//
//    private void bokhor() {
//        imViewName.setImageResource(R.drawable.bokhor);
//        imViewName2.setImageResource(R.drawable.bokhor);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bokhor));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.bokhor));
//
//        imViewVisual.setImageResource(R.drawable.bokhori);
//        imViewVisual2.setImageResource(R.drawable.bokhori);
//    }
//
//    private void raft() {
//        imViewName.setImageResource(R.drawable.raft);
//        imViewName2.setImageResource(R.drawable.raft);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.raft));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.raft));
//
//        imViewVisual.setImageResource(R.drawable.rafti);
//        imViewVisual2.setImageResource(R.drawable.rafti);
//    }
//
//    private void khord() {
//        imViewName.setImageResource(R.drawable.khord);
//        imViewName2.setImageResource(R.drawable.khord);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khord));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khord));
//
//        imViewVisual.setImageResource(R.drawable.khordi);
//        imViewVisual2.setImageResource(R.drawable.khordi);
//    }
//
//    private void khabid() {
//        imViewName.setImageResource(R.drawable.khabid);
//        imViewName2.setImageResource(R.drawable.khabid);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabid));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabid));
//
//        imViewVisual.setImageResource(R.drawable.khabidi);
//        imViewVisual2.setImageResource(R.drawable.khabidi);
//    }
//
//    private void parid() {
//        imViewName.setImageResource(R.drawable.parid);
//        imViewName2.setImageResource(R.drawable.parid);
//    }
//
//    private void david() {
//        imViewName.setImageResource(R.drawable.david);
//        imViewName2.setImageResource(R.drawable.david);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan));
//
//        imViewVisual.setImageResource(R.drawable.davidani);
//        imViewVisual2.setImageResource(R.drawable.davidani);
//    }
//
//    private void khabidan() {
//        imViewName.setImageResource(R.drawable.khabidan);
//        imViewName2.setImageResource(R.drawable.khabidan);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabidan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khabidan));
//
//        imViewVisual.setImageResource(R.drawable.khabidani);
//        imViewVisual2.setImageResource(R.drawable.khabidani);
//    }
//
//    private void shostan() {
//        imViewName.setImageResource(R.drawable.shostan);
//        imViewName2.setImageResource(R.drawable.shostan);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shostan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.shostan));
//
//        imViewVisual.setImageResource(R.drawable.shostani);
//        imViewVisual2.setImageResource(R.drawable.shostani);
//    }
//
//    private void paridan() {
//        imViewName.setImageResource(R.drawable.paridan);
//        imViewName2.setImageResource(R.drawable.paridan);
//    }
//
//    private void davidan() {
//        imViewName.setImageResource(R.drawable.davidan);
//        imViewName2.setImageResource(R.drawable.davidan);
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.davidan));
//
//        imViewVisual.setImageResource(R.drawable.davidani);
//        imViewVisual2.setImageResource(R.drawable.davidani);
//    }
//
//    private void khordan() {
//        imViewName.setImageResource(R.drawable.khord);
//        imViewName2.setImageResource(R.drawable.khord);
//
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khordan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khordan));
//
//        imViewVisual.setImageResource(R.drawable.khordani);
//        imViewVisual2.setImageResource(R.drawable.khordani);
//    }
//
//    private void khandan() {
//        vidView0.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khandan));
//        vidView1.setVideoURI(Uri.parse("android.resource://" + "com.example.arman.syndrom_down" + "/" + R.raw.khandan));
//
//        imViewVisual.setImageResource(R.drawable.khandani);
//        imViewVisual2.setImageResource(R.drawable.khandani);
//    }
//}