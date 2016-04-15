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
    private ArrayList<String> remainedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi2);
//        setTitle(getString(R.string.footbal));

//        toolbar = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(toolbar);

        ball = (ImageView) findViewById(R.id.ball);
        field = (ImageView) findViewById(R.id.field);
        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
        animator = new ObjectAnimator();
        animator.setDuration(1000);
        animator.setTarget(ball);
        animator.setPropertyName("translationX");

        handleIntent();
    }

    @Override
    public void onBackPressed() {
        Intent temp = getIntent();
        String gameType = temp.getStringExtra("gameType");
        Intent intent = new Intent(Bazi2Activity.this, BaziListActivity.class);
        intent.putExtra("gameType", gameType);
        tashvigh.release();
        tashvigh = null;
        wordVoice.release();
        wordVoice = null;
        payMoreAttention.release();
        payMoreAttention = null;
        startActivity(intent);
    }


    private void handleIntent() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
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


                remainedItems = new ArrayList<>();
                for (int i = 0; i < khanevadeItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(khanevadeItems.get(i));
                }


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
                break;
            case "khordani":
                ArrayList<String> khordaniItems;
                khordaniItems = new ArrayList<>();
                khordaniItems.add("nan");
                khordaniItems.add("shir");
                khordaniItems.add("ab");
                khordaniItems.add("cake");
                khordaniItems.add("bisco");

                remainedItems = new ArrayList<>();
                for (int i = 0; i < khordaniItems.size(); i++) {
                    if (i != selectedItem1 && i != selectedItem2)
                        remainedItems.add(khordaniItems.get(i));
                }
                remainedItems.add(khordaniItems.get(selectedItem1));//make number of elements even!
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
                break;

        }
        if (answerPos == 0) {
            setVoiceImage(pic1, selectedItem1, category);
            setImage(pic2, selectedItem2, category);
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
            setImage(pic1, selectedItem2, category);
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
                intent.putExtra("list", remainedItems);
                tashvigh.release();
                tashvigh = null;
                payMoreAttention.release();
                payMoreAttention = null;
                wordVoice.release();
                wordVoice = null;
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
        wordVoice.start();

    }

    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
    }


    void setVoiceImage(ImageView image, int index, String category) {
        switch (category) {
            case "khanevade":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tbaba);
                        wordVoice = MediaPlayer.create(this, R.raw.baba_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tmaman);
                        wordVoice = MediaPlayer.create(this, R.raw.maman_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkhahar);
                        wordVoice = MediaPlayer.create(this, R.raw.khahar_kojast);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tbaradar);
                        wordVoice = MediaPlayer.create(this, R.raw.dadash_kojast);
                        break;
                }
                break;
            case "andam":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tcheshm);
                        wordVoice = MediaPlayer.create(this, R.raw.cheshm_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tdast);
                        wordVoice = MediaPlayer.create(this, R.raw.dast_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tpa);
                        wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tgosh);
                        wordVoice = MediaPlayer.create(this, R.raw.gush_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tmo);
                        wordVoice = MediaPlayer.create(this, R.raw.mo_kojast);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tdahan);
                        wordVoice = MediaPlayer.create(this, R.raw.dahan_kojast);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tbini);
                        wordVoice = MediaPlayer.create(this, R.raw.bini_kojast);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tzaban);
                        wordVoice = MediaPlayer.create(this, R.raw.zaban_kojast);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tdandan);
                        wordVoice = MediaPlayer.create(this, R.raw.dandan_kojast);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.tabro);
                        wordVoice = MediaPlayer.create(this, R.raw.abro_kojast);
                        break;
                }
                break;
            case "miveh":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tmoz);
                        wordVoice = MediaPlayer.create(this, R.raw.moz_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tsib);
                        wordVoice = MediaPlayer.create(this, R.raw.sib_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkhiar);
                        wordVoice = MediaPlayer.create(this, R.raw.khiar_kojast);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.tporteqal);
                        wordVoice = MediaPlayer.create(this, R.raw.porteqal_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tlimo);
                        wordVoice = MediaPlayer.create(this, R.raw.limo_kojast);
                        break;
                }
                break;
            case "heyvanat":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tgorbe);
                        wordVoice = MediaPlayer.create(this, R.raw.gorbe_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tsag);
                        wordVoice = MediaPlayer.create(this, R.raw.sag_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tgav);
                        wordVoice = MediaPlayer.create(this, R.raw.gav_kojast);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.tmahi);
                        wordVoice = MediaPlayer.create(this, R.raw.mahi_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tmorq);
                        wordVoice = MediaPlayer.create(this, R.raw.morq_kojast);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tasb);
                        wordVoice = MediaPlayer.create(this, R.raw.asb_kojast);
                        break;

                }

                break;
            case "pooshak":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tkafsh);
                        wordVoice = MediaPlayer.create(this, R.raw.kafsh_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tkolah);
                        wordVoice = MediaPlayer.create(this, R.raw.kolah_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tjorab);
                        wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                    case 3:
                        image.setImageResource(R.drawable.tshalvar);
                        wordVoice = MediaPlayer.create(this, R.raw.shalvar_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tpirahan);
                        wordVoice = MediaPlayer.create(this, R.raw.pirhan_kojast);
                    case 5:
                        image.setImageResource(R.drawable.trosari);
                        wordVoice = MediaPlayer.create(this, R.raw.rosari_kojast);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tbloz);
                        wordVoice = MediaPlayer.create(this, R.raw.bloz_kojast);
                }
                break;
            case "vasayel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tshane);
                        wordVoice = MediaPlayer.create(this, R.raw.shane_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tmesvak);
                        wordVoice = MediaPlayer.create(this, R.raw.mesvak_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.thole);
                        wordVoice = MediaPlayer.create(this, R.raw.hole_kojast);
                        break;

                    case 3:
                        image.setImageResource(R.drawable.ttop);
                        wordVoice = MediaPlayer.create(this, R.raw.toop_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tdocharkhe);
                        wordVoice = MediaPlayer.create(this, R.raw.docharkhe_kojast);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tmashin);
                        wordVoice = MediaPlayer.create(this, R.raw.mashin_kojast);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.thavapeima);
                        wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tghashoq);
                        wordVoice = MediaPlayer.create(this, R.raw.qashoq_kojast);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tketab);
                        wordVoice = MediaPlayer.create(this, R.raw.ketab_kojast);
                        break;


                }
                break;
            case "mashaghel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tdoctor);
                        wordVoice = MediaPlayer.create(this, R.raw.doctor_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tnanva);
                        wordVoice = MediaPlayer.create(this, R.raw.nanva_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tmoalem);
                        wordVoice = MediaPlayer.create(this, R.raw.moalem_kojast);
                        break;
                }
                break;
            case "rang":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tabi);
                        wordVoice = MediaPlayer.create(this, R.raw.abi_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tzard);
                        wordVoice = MediaPlayer.create(this, R.raw.zard_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tghermez);
                        wordVoice = MediaPlayer.create(this, R.raw.qermez_kojast);
                        break;
                }
                break;
            case "khordani":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tnan);
                        wordVoice = MediaPlayer.create(this, R.raw.nan_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tshir);
                        wordVoice = MediaPlayer.create(this, R.raw.shir_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tab);
                        wordVoice = MediaPlayer.create(this, R.raw.ab_kojast);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tcake);
                        wordVoice = MediaPlayer.create(this, R.raw.cake_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tbisko);
                        wordVoice = MediaPlayer.create(this, R.raw.bisko_kojast);
                        break;
                }
                break;

            case "mafahim":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tbala);
                        wordVoice = MediaPlayer.create(this, R.raw.bala_kojast);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tpaeen);
                        wordVoice = MediaPlayer.create(this, R.raw.paeen_kojast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkasif);
                        wordVoice = MediaPlayer.create(this, R.raw.kasif_kojast);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ttamiz);
                        wordVoice = MediaPlayer.create(this, R.raw.tamiz_kojast);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tbache);
                        wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tdokhtar);
                        wordVoice = MediaPlayer.create(this, R.raw.dokhtar_kojast);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tpesar);
                        wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tsard);
                        wordVoice = MediaPlayer.create(this, R.raw.sard_kojast);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tgarm);
                        wordVoice = MediaPlayer.create(this, R.raw.garm_kojast);
                        break;

                }

        }
    }

    void setImage(ImageView image, int index, String category) {
        switch (category) {
            case "khanevade":
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
                break;
            case "andam":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tcheshm);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tdast);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tpa);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tgosh);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tgosh);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tmo);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tdahan);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tbini);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tzaban);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.tdandan);
                        break;
                    case 10:
                        image.setImageResource(R.drawable.tabro);
                        break;
                }
                break;
            case "miveh":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tmoz);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tsib);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkhiar);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tporteqal);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tlimo);
                        break;
                }
                break;
            case "heyvanat":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tgorbe);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tsag);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tgav);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tmahi);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tmorq);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tasb);
                        break;
                }
                break;
            case "pooshak":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tkafsh);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tkolah);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tjorab);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tshalvar);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tpirahan);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.trosari);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tbloz);
                        break;
                }
                break;

            case "vasayel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tshane);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tmesvak);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.thole);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ttop);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tdocharkhe);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tmashin);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.thavapeima);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tghashoq);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tketab);
                        break;
                }
                break;

            case "mashaghel":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tdoctor);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tnanva);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tmoalem);
                        break;
                }
                break;
            case "rang":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tabi);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tzard);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tghermez);
                        break;
                }
                break;
            case "khordani":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tnan);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tshir);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tab);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tcake);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tbisko);
                        break;
                }
                break;

            case "mafahim":
                switch (index) {
                    case 0:
                        image.setImageResource(R.drawable.tbala);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.tpaeen);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.tkasif);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ttamiz);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.tbache);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.tdokhtar);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.tpesar);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.tsard);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.tgarm);
                        break;

                }
        }
    }

}