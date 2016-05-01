package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class LoghatGeneralActivity6 extends ActionBarActivity {
    ImageView word;
    ImageView pass;
    ImageView fail;
    MediaPlayer inchie;
    MediaPlayer payMoreAttention;
    MediaPlayer tashvigh;
    MediaPlayer clapSound;
    int passClicked = 0;
    String category = "";
    int position = 0;
    Dialog settingsDialog;
    private ImageView guide;
    Intent intent = null;
    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;
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
        setContentView(R.layout.loghat_general_activity6);
        word = (ImageView) findViewById(R.id.word);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        inchie = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
        clapSound = MediaPlayer.create(getApplicationContext(), R.raw.clap);
        setViews();
        controller();
        inchie.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                inchie.start();
//                memoryReleaser(inchie);
            }
        });


        guide = (ImageView) findViewById(R.id.guide);
        settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.dialog_layout6, null));
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity6, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        memoryReleaser(inchie);
        memoryReleaser(payMoreAttention);
        memoryReleaser(tashvigh);
        memoryReleaser(clapSound);
        inchie = null;
        payMoreAttention = null;
        tashvigh = null;
        clapSound = null;
        Intent intent1 = new Intent(LoghatGeneralActivity6.this, LoghatActivity.class);
        startActivity(intent1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (tashvigh != null)
            tashvigh.release();
        tashvigh = null;
        if (clapSound != null)
            clapSound.release();
        clapSound = null;
        if (payMoreAttention != null)
            payMoreAttention.release();
        payMoreAttention = null;
        if (inchie != null)
            inchie.release();
        inchie = null;
    }

    void controller() {
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payMoreAttention.start();
//                memoryReleaser(payMoreAttention);

            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                passClicked++;
                if (passClicked < 4)
                    tashvigh.start();
//                memoryReleaser(tashvigh);

                tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        if (passClicked <= 3) {
                            inchie.start();
//                            memoryReleaser(inchie);
                        }

                        if (passClicked >= 4) {
//                            Utils.database.activate(category, position);
                            switch (category) {
                                case "khanevade":
                                    intent = new Intent(LoghatGeneralActivity6.this, KhanevadeActivity.class);
                                    successAnimation();
                                    passSection();

                                    break;
                                case "andam":
                                    intent = new Intent(LoghatGeneralActivity6.this, AndamActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "miveh":
                                    intent = new Intent(LoghatGeneralActivity6.this, MiveActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "heyvanat":
                                    intent = new Intent(LoghatGeneralActivity6.this, HeyvanatActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "pooshak":
                                    intent = new Intent(LoghatGeneralActivity6.this, PooshakActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "vasayel":
                                    intent = new Intent(LoghatGeneralActivity6.this, VasayelActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "mashaghel":
                                    intent = new Intent(LoghatGeneralActivity6.this, MashaghelActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "rang":
                                    intent = new Intent(LoghatGeneralActivity6.this, RangActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                                case "khordani":
                                    intent = new Intent(LoghatGeneralActivity6.this, KhordaniActivity.class);
                                          passSection();
                                    successAnimation();
                                    break;
                                case "mafahim":
                                    intent = new Intent(LoghatGeneralActivity6.this, MafahimActivity.class);
                                    passSection();
                                    successAnimation();
                                    break;
                            }

                        }
                    }
                });

            }
        });
    }

    void successAnimation() {
        Log.d("succes", "succes animation");
        clapSound.start();
//        memoryReleaser(clapSound);

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
        animator1 = new ObjectAnimator();
        animator1.setDuration(2000);
        animator1.setTarget(star1);
        animator1.setPropertyName("translationY");

        animator2 = new ObjectAnimator();
        animator2.setDuration(2000);
        animator2.setTarget(star2);
        animator2.setPropertyName("translationY");

        animator3 = new ObjectAnimator();
        animator3.setDuration(2000);
        animator3.setTarget(star3);
        animator3.setPropertyName("translationY");

        animator4 = new ObjectAnimator();
        animator4.setDuration(2000);
        animator4.setTarget(star4);
        animator4.setPropertyName("translationY");

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
                animator1.setFloatValues(0, -height - 300);
                animator1.start();
                animator2.setFloatValues(0, -height - 300);
                animator2.start();
                animator3.setFloatValues(0, -height - 300);
                animator3.start();
                animator4.setFloatValues(0, -height - 300);
                animator4.start();
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
        animator1.addListener(new Animator.AnimatorListener() {
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
//                star1.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
//                memoryReleaser(inchie);
//                memoryReleaser(payMoreAttention);
//                memoryReleaser(tashvigh);
//                memoryReleaser(clapSound);
                inchie.release();
                payMoreAttention.release();
                tashvigh.release();
                clapSound.release();
                inchie = null;
                payMoreAttention = null;
                tashvigh = null;
                clapSound = null;
                star1.setVisibility(View.INVISIBLE);
                star2.setVisibility(View.INVISIBLE);
                star3.setVisibility(View.INVISIBLE);
                star4.setVisibility(View.INVISIBLE);
                star5.setVisibility(View.INVISIBLE);
                intent.putExtra("position", "0");
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

    private void passSection() {
        int i = 0;
//        active = true;

        switch (category) {
            case "khanevade":
                if (Utils.database.khanevade < position + 1)
                    Utils.database.khanevade = position + 1;
                break;
            case "andam":
                if (Utils.database.andam < position + 1)
                    Utils.database.andam = position + 1;
//                while (i < Utils.database.andam.length &&
//                        Utils.database.andam[++i]) ;
//                Utils.database.andam[i] = true;
                break;
            case "miveh":
                if (Utils.database.mive < position + 1)
                    Utils.database.mive = position + 1;
//                while (i < Utils.database.mive.length &&
//                        Utils.database.mive[++i]) ;
//                Utils.database.mive[i] = true;
                break;
            case "heyvanat":
                if (Utils.database.heyvanat < position + 1) {
                    Log.d("test", Utils.database.heyvanat + " " + position);
                    Utils.database.heyvanat = position + 1;
                }
//                while (i < Utils.database.heyvanat.length &&
//                        Utils.database.heyvanat[++i]) ;
//                Utils.database.heyvanat[i] = true;
                break;
            case "pooshak":
                if (Utils.database.pooshak < position + 1)
                    Utils.database.pooshak = position + 1;
//                while (i < Utils.database.pooshak.length &&
//                        Utils.database.pooshak[++i]) ;
//                Utils.database.pooshak[i] = true;
                break;
            case "vasayel":
                if (Utils.database.vasayel < position + 1)
                    Utils.database.vasayel = position + 1;
//                while (i < Utils.database.vasayel.length &&
//                        Utils.database.vasayel[++i]) ;
//                Utils.database.vasayel[i] = true;
                break;
            case "mashaghel":
                if (Utils.database.mashaghel < position + 1)
                    Utils.database.mashaghel = position + 1;
//                while (i < Utils.database.mashaghel.length &&
//                        Utils.database.mashaghel[++i]) ;
//                Utils.database.mashaghel[i] = true;
                break;
            case "rang":
                if (Utils.database.rang < position + 1)
                    Utils.database.rang = position + 1;
//                while (i < Utils.database.rang.length &&
//                        Utils.database.rang[++i]) ;
//                Utils.database.rang[i] = true;
                break;
            case "khordani":
                if (Utils.database.khordani < position + 1)
                    Utils.database.khordani = position + 1;
//                while (i < Utils.database.khordani.length &&
//                        Utils.database.khordani[++i]) ;
//                Utils.database.khordani[i] = true;
                break;
            case "mafahim":
                if (Utils.database.mafahim < position + 1)
                    Utils.database.mafahim = position + 1;
//                while (i < Utils.database.mafahim.length &&
//                        Utils.database.mafahim[++i]) ;
//                Utils.database.mafahim[i] = true;
                break;
        }

        DatabaseAdapter.getInstance().saveDatabase(LoghatGeneralActivity6.this,
                Utils.database);
    }

    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }

    private void setViews() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        position = Integer.parseInt(intent.getStringExtra("position"));
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbaba);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhiar);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        break;
                    default:
                        break;
                }
                break;

            case "mashaghel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}