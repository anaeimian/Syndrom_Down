package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;


public class Bazi2Activity4 extends ActionBarActivity {


    private ImageView field;
    private ImageView ball;
    private ImageView pic1;
    private ImageView pic2;
    private ObjectAnimator animator;
    private String category;
    private MediaPlayer wordVoice;
    private MediaPlayer payMoreAttention;
    private MediaPlayer tashvigh;
    private ArrayList<String> remainedItems;
    private ArrayList<String> receivedItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi2);
        ball = (ImageView) findViewById(R.id.ball);
        field = (ImageView) findViewById(R.id.field);
        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        wordVoice = MediaPlayer.create(getApplicationContext(), R.raw.football_madar);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        animator = new ObjectAnimator();
        animator.setDuration(1000);
        animator.setTarget(ball);
        animator.setPropertyName("translationX");

        handleIntent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bazi2_activity4, menu);
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


    private void handleIntent() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        receivedItems = intent.getStringArrayListExtra("list");
        Random random = new Random();
        int answerPos = random.nextInt(2);


        int categorySize = 0;

        switch (category) {
            case "andam":
                categorySize = 10 - 2 - 2 - 2;
                break;
            case "pooshak":
                categorySize = 7 - 2 + 1 - 2 - 2;
                break;
            case "vasayel":
                categorySize = 9 - 2 + 1 - 2 - 2;
                break;
            case "mafahim":
                categorySize = 9 - 2 + 1 - 2 - 2;
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
                        pic1.setImageResource(R.drawable.tbaba);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.baba_kojast);
                        }
                        break;
                    case "maman":
                        pic1.setImageResource(R.drawable.tmaman);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.maman_kojast);
                        }
                        break;

                    case "khahar":
                        pic1.setImageResource(R.drawable.tkhahar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.khahar_kojast);
                        }
                        break;
                    case "dadash":
                        pic1.setImageResource(R.drawable.tbaradar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dadash_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "baba":
                        pic2.setImageResource(R.drawable.tbaba);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.baba_kojast);
                        }
                        break;
                    case "maman":
                        pic2.setImageResource(R.drawable.tmaman);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.maman_kojast);
                        }
                        break;
                    case "khahar":
                        pic2.setImageResource(R.drawable.tkhahar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.khahar_kojast);
                        }
                        break;
                    case "dadash":
                        pic2.setImageResource(R.drawable.tbaradar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dadash_kojast);
                        }
                        break;
                }

                break;

            case "andam":
                switch (items.get(0)) {
                    case "cheshm":
                        pic1.setImageResource(R.drawable.tcheshm);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.cheshm_kojast);
                        }
                        break;
                    case "dast":
                        pic1.setImageResource(R.drawable.tdast);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dast_kojast);
                        }
                        break;

                    case "pa":
                        pic1.setImageResource(R.drawable.tpa);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        }
                        break;
                    case "goosh":
                        pic1.setImageResource(R.drawable.tgosh);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gush_kojast);
                        }
                        break;
                    case "mo":
                        pic1.setImageResource(R.drawable.tmo);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mo_kojast);
                        }
                        break;
                    case "dahan":
                        pic1.setImageResource(R.drawable.tdahan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dahan_kojast);
                        }
                        break;

                    case "bini":
                        pic1.setImageResource(R.drawable.tbini);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bini_kojast);
                        }
                        break;
                    case "zaban":
                        pic1.setImageResource(R.drawable.tzaban);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.zaban_kojast);
                        }
                        break;
                    case "dandan":
                        pic1.setImageResource(R.drawable.tdandan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dandan_kojast);
                        }
                        break;
                    case "abro":
                        pic1.setImageResource(R.drawable.tabro);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.abro_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "cheshm":
                        pic2.setImageResource(R.drawable.tcheshm);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.cheshm_kojast);
                        }
                        break;
                    case "dast":
                        pic2.setImageResource(R.drawable.tdast);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dast_kojast);
                        }
                        break;

                    case "pa":
                        pic2.setImageResource(R.drawable.tpa);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pa_ko);
                        }
                        break;
                    case "goosh":
                        pic2.setImageResource(R.drawable.tgosh);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gush_kojast);
                        }
                        break;
                    case "mo":
                        pic2.setImageResource(R.drawable.tmo);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mo_kojast);
                        }
                        break;
                    case "dahan":
                        pic2.setImageResource(R.drawable.tdahan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dahan_kojast);
                        }
                        break;

                    case "bini":
                        pic2.setImageResource(R.drawable.tbini);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bini_kojast);
                        }
                        break;
                    case "zaban":
                        pic2.setImageResource(R.drawable.tzaban);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.zaban_kojast);
                        }
                        break;
                    case "dandan":
                        pic2.setImageResource(R.drawable.tdandan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dandan_kojast);
                        }
                        break;
                    case "abro":
                        pic2.setImageResource(R.drawable.tabro);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.abro_kojast);
                        }
                        break;
                }

                break;
            case "miveh":

                switch (items.get(0)) {
                    case "moz":
                        pic1.setImageResource(R.drawable.tmoz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.moz_kojast);
                        }
                        break;
                    case "sib":
                        pic1.setImageResource(R.drawable.tsib);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sib_kojast);
                        }
                        break;

                    case "khiar":
                        pic1.setImageResource(R.drawable.tkhiar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.khiar_kojast);
                        }
                        break;
                    case "porteghal":
                        pic1.setImageResource(R.drawable.tporteqal);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.porteqal_kojast);
                        }
                        break;
                    case "limo":
                        pic1.setImageResource(R.drawable.tlimo);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.limo_kojast);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "moz":
                        pic2.setImageResource(R.drawable.tmoz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.moz_kojast);
                        }
                        break;
                    case "sib":
                        pic2.setImageResource(R.drawable.tsib);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sib_kojast);
                        }
                        break;

                    case "khiar":
                        pic2.setImageResource(R.drawable.tkhiar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.khiar_kojast);
                        }
                        break;
                    case "porteghal":
                        pic2.setImageResource(R.drawable.tporteqal);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.porteqal_kojast);
                        }
                        break;
                    case "limo":
                        pic2.setImageResource(R.drawable.tlimo);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.limo_kojast);
                        }
                        break;

                }

                break;
            case "heyvanat":
                switch (items.get(0)) {
                    case "gorbe":
                        pic1.setImageResource(R.drawable.tgorbe);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gorbe_kojast);
                        }
                        break;
                    case "sag":
                        pic1.setImageResource(R.drawable.tsag);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sag_kojast);
                        }
                        break;
                    case "gav":
                        pic1.setImageResource(R.drawable.tgav);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.gav_kojast);
                        }
                        break;

                    case "mahi":
                        pic1.setImageResource(R.drawable.tmahi);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mahi_kojast);
                        }
                        break;
                    case "morgh":
                        pic1.setImageResource(R.drawable.tmorq);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.morq_kojast);
                        }
                        break;
                    case "asb":
                        pic1.setImageResource(R.drawable.tasb);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.asb_kojast);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "gorbe":
                        pic2.setImageResource(R.drawable.tgorbe);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gorbe_kojast);
                        }
                    case "sag":
                        pic2.setImageResource(R.drawable.tsag);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sag_kojast);
                        }
                        break;
                    case "gav":
                        pic2.setImageResource(R.drawable.tgav);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.gav_kojast);
                        }
                        break;

                    case "mahi":
                        pic2.setImageResource(R.drawable.tmahi);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mahi_kojast);
                        }
                        break;
                    case "morgh":
                        pic2.setImageResource(R.drawable.tmorq);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.morq_kojast);
                        }
                        break;
                    case "asb":
                        pic2.setImageResource(R.drawable.tasb);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.asb_kojast);
                        }
                        break;

                }

                break;
            case "pooshak":
                switch (items.get(0)) {
                    case "kafsh":
                        pic1.setImageResource(R.drawable.tkafsh);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kafsh_kojast);
                        }
                        break;
                    case "kolah":
                        pic1.setImageResource(R.drawable.tkolah);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kolah_kojast);
                        }
                        break;
                    case "joorab":
                        pic1.setImageResource(R.drawable.tjorab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                        }
                        break;

                    case "shalvar":
                        pic1.setImageResource(R.drawable.tshalvar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shalvar_kojast);
                        }
                        break;
                    case "pirahan":
                        pic1.setImageResource(R.drawable.tpirahan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pirhan_kojast);
                        }
                        break;
                    case "rosari":
                        pic1.setImageResource(R.drawable.trosari);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.rosari_kojast);
                        }
                        break;
                    case "bolooz":
                        pic1.setImageResource(R.drawable.tbloz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bloz_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "kafsh":
                        pic2.setImageResource(R.drawable.tkafsh);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kafsh_kojast);
                        }
                    case "kolah":
                        pic2.setImageResource(R.drawable.tkolah);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kolah_kojast);
                        }
                        break;
                    case "joorab":
                        pic2.setImageResource(R.drawable.tjorab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.jorab_ko);
                        }
                        break;

                    case "shalvar":
                        pic2.setImageResource(R.drawable.tshalvar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shalvar_kojast);
                        }
                        break;
                    case "pirahan":
                        pic2.setImageResource(R.drawable.tpirahan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pirhan_kojast);
                        }
                        break;
                    case "rosari":
                        pic2.setImageResource(R.drawable.trosari);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.rosari_kojast);
                        }
                        break;
                    case "bolooz":
                        pic2.setImageResource(R.drawable.tbloz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bloz_kojast);
                        }
                        break;
                }
                break;
            case "vasayel":
                switch (items.get(0)) {
                    case "shane":
                        pic1.setImageResource(R.drawable.tshane);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shane_kojast);
                        }
                        break;
                    case "mesvak":
                        pic1.setImageResource(R.drawable.tmesvak);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mesvak_kojast);
                        }
                        break;
                    case "hole":
                        pic1.setImageResource(R.drawable.thole);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.hole_kojast);
                        }
                        break;

                    case "toop":
                        pic1.setImageResource(R.drawable.ttop);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.toop_kojast);
                        }
                        break;
                    case "docharkhe":
                        pic1.setImageResource(R.drawable.tdocharkhe);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.docharkhe_kojast);
                        }
                        break;
                    case "mashin":
                        pic1.setImageResource(R.drawable.tmashin);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.mashin_kojast);
                        }
                        break;
                    case "havapeyma":
                        pic1.setImageResource(R.drawable.thavapeima);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        }
                        break;
                    case "ghashoq":
                        pic1.setImageResource(R.drawable.tghashoq);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.qashoq_kojast);
                        }
                        break;
                    case "ketab":
                        pic1.setImageResource(R.drawable.tketab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.ketab_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "shane":
                        pic2.setImageResource(R.drawable.tshane);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shane_kojast);
                        }
                    case "mesvak":
                        pic2.setImageResource(R.drawable.tmesvak);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mesvak_kojast);
                        }
                        break;
                    case "hole":
                        pic2.setImageResource(R.drawable.thole);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.hole_kojast);
                        }
                        break;

                    case "toop":
                        pic2.setImageResource(R.drawable.ttop);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.toop_kojast);
                        }
                        break;
                    case "docharkhe":
                        pic2.setImageResource(R.drawable.tdocharkhe);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.docharkhe_kojast);
                        }
                        break;
                    case "mashin":
                        pic2.setImageResource(R.drawable.tmashin);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.mashin_kojast);
                        }
                        break;
                    case "havapeyma":
                        pic2.setImageResource(R.drawable.thavapeima);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.havapeima_kojast);
                        }
                        break;
                    case "ghashoq":
                        pic2.setImageResource(R.drawable.tghashoq);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.qashoq_kojast);
                        }
                        break;
                    case "ketab":
                        pic2.setImageResource(R.drawable.tketab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.ketab_kojast);
                        }
                        break;
                }
                break;
            case "mashaghel":
                switch (items.get(0)) {
                    case "doctor":
                        pic1.setImageResource(R.drawable.tdoctor);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.doctor_kojast);
                        }
                        break;
                    case "nanva":
                        pic1.setImageResource(R.drawable.tnanva);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.nanva_kojast);
                        }
                        break;
                    case "moalem":
                        pic1.setImageResource(R.drawable.tmoalem);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.moalem_kojast);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "doctor":
                        pic2.setImageResource(R.drawable.tdoctor);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.doctor_kojast);
                        }
                    case "nanva":
                        pic2.setImageResource(R.drawable.tnanva);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.nanva_kojast);
                        }
                        break;
                    case "moalem":
                        pic2.setImageResource(R.drawable.tmoalem);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.moalem_kojast);
                        }
                        break;
                }

                break;
            case "rang":
                switch (items.get(0)) {
                    case "abi":
                        pic1.setImageResource(R.drawable.tabi);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.abi_kojast);
                        }
                        break;
                    case "zard":
                        pic1.setImageResource(R.drawable.tzard);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.zard_kojast);
                        }
                        break;
                    case "ghermez":
                        pic1.setImageResource(R.drawable.tghermez);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.qermez_kojast);
                        }
                        break;

                }
                switch (items.get(1)) {
                    case "abi":
                        pic2.setImageResource(R.drawable.tabi);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.abi_kojast);
                        }
                    case "zard":
                        pic2.setImageResource(R.drawable.tzard);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.zard_kojast);
                        }
                        break;
                    case "ghermez":
                        pic2.setImageResource(R.drawable.tghermez);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.qermez_kojast);
                        }
                        break;
                }
                break;
            case "khordani":
                switch (items.get(0)) {
                    case "nan":
                        pic1.setImageResource(R.drawable.tnan);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.nan_kojast);
                        }
                        break;
                    case "shir":
                        pic1.setImageResource(R.drawable.tshir);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.shir_kojast);
                        }
                        break;
                    case "ab":
                        pic1.setImageResource(R.drawable.tab);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.ab_kojast);
                        }
                        break;
                    case "cake":
                        pic1.setImageResource(R.drawable.tcake);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.cake_kojast);
                        }
                        break;
                    case "bisko":
                        pic1.setImageResource(R.drawable.tbisko);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bisko_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "nan":
                        pic2.setImageResource(R.drawable.tnan);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.nan_kojast);
                        }
                    case "cake":
                        pic2.setImageResource(R.drawable.tcake);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.cake_kojast);
                        }
                        break;
                    case "ab":
                        pic2.setImageResource(R.drawable.tab);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.ab_kojast);
                        }
                        break;
                    case "shir":
                        pic2.setImageResource(R.drawable.tshir);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.shir_kojast);
                        }
                        break;
                    case "bisko":
                        pic2.setImageResource(R.drawable.tbisko);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bisko_kojast);
                        }
                        break;
                }
                break;
            case "mafahim":
                switch (items.get(0)) {
                    case "bala":
                        pic1.setImageResource(R.drawable.tbala);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bala_kojast);
                        }
                        break;
                    case "paeen":
                        pic1.setImageResource(R.drawable.tpaeen);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.paeen_kojast);
                        }
                        break;
                    case "kasif":
                        pic1.setImageResource(R.drawable.tkasif);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.kasif_kojast);
                        }
                        break;

                    case "tamiz":
                        pic1.setImageResource(R.drawable.ttamiz);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.tamiz_kojast);
                        }
                        break;
                    case "bache":
                        pic1.setImageResource(R.drawable.tbache);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        }
                        break;
                    case "dokhtar":
                        pic1.setImageResource(R.drawable.tdokhtar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.dokhtar_kojast);
                        }
                        break;
                    case "pesar":
                        pic1.setImageResource(R.drawable.tpesar);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        }
                        break;
                    case "sard":
                        pic1.setImageResource(R.drawable.tsard);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.sard_kojast);
                        }
                        break;
                    case "garm":
                        pic1.setImageResource(R.drawable.tgarm);
                        if (answerPos == 0) {
                            wordVoice = MediaPlayer.create(this, R.raw.garm_kojast);
                        }
                        break;
                }
                switch (items.get(1)) {
                    case "bala":
                        pic2.setImageResource(R.drawable.tbala);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bala_kojast);
                        }
                    case "paeen":
                        pic2.setImageResource(R.drawable.tpaeen);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.paeen_kojast);
                        }
                        break;
                    case "kasif":
                        pic2.setImageResource(R.drawable.tkasif);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.kasif_kojast);
                        }
                        break;

                    case "tamiz":
                        pic2.setImageResource(R.drawable.ttamiz);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.tamiz_kojast);
                        }
                        break;
                    case "bache":
                        pic2.setImageResource(R.drawable.tbache);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.bache_kojast);
                        }
                        break;
                    case "dokhtar":
                        pic2.setImageResource(R.drawable.tdokhtar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.dokhtar_kojast);
                        }
                        break;
                    case "pesar":
                        pic2.setImageResource(R.drawable.tpesar);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.pesar_kojast);
                        }
                        break;
                    case "sard":
                        pic2.setImageResource(R.drawable.tsard);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.sard_kojast);
                        }
                        break;
                    case "garm":
                        pic2.setImageResource(R.drawable.tgarm);
                        if (answerPos == 1) {
                            wordVoice = MediaPlayer.create(this, R.raw.garm_kojast);
                        }
                        break;
                }
                break;
            default:
                break;


        }


        wordVoice.start();
        if (answerPos == 0) {
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
                Intent intent = null;
                if (category.equals("pooshak")) {
                    intent = new Intent(Bazi2Activity4.this, BaziListActivity.class);
                } else {
                    intent = new Intent(Bazi2Activity4.this, Bazi2Activity5.class);
                }
                ball.setVisibility(View.INVISIBLE);
                intent.putExtra("category", category);
                intent.putExtra("gameType", "football");
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
//                mediaPlayerTashvigh.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
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


    @Override
    public void onBackPressed() {
        Intent temp = getIntent();
        String gameType = temp.getStringExtra("gameType");
        Intent intent = new Intent(Bazi2Activity4.this, BaziListActivity.class);
        intent.putExtra("gameType", gameType);
        tashvigh.release();
        tashvigh = null;
        payMoreAttention.release();
        payMoreAttention = null;
        wordVoice.release();
        wordVoice = null;
        startActivity(intent);
    }

}
