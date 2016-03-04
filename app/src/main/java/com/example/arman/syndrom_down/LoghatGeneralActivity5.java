package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LoghatGeneralActivity5 extends ActionBarActivity {
    ImageView wordImg;
    ImageView pass;
    ImageView fail;
    MediaPlayer shapeShows;
    MediaPlayer failSound;
    int passClicked = 0;
    String category = "";
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity5);
        wordImg = (ImageView) findViewById(R.id.wordImg);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.shapeshows);
        failSound = MediaPlayer.create(getApplicationContext(), R.raw.fail);
        setViews();
        controller();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity5, menu);
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
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        failSound.start();
    }

    void controller() {
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                failSound.start();
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passClicked++;
                if (passClicked >= 4) {
                    Intent intent = new Intent(LoghatGeneralActivity5.this, LoghatGeneralActivity6.class);
                    intent.putExtra("category", category);
                    intent.putExtra("position", position + "");
                    startActivity(intent);
                }
            }
        });
        shapeShows.start();
    }

    private void setViews() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        position = Integer.parseInt(intent.getStringExtra("position"));
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.tbaba);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.father_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.tmaman);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.madar_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.tkhahar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.khahar_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.tbaradar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.dadash_sabad);
                        break;
                    default:
                        break;
                }
                break;

//            case "andam":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tcheshm);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.cheshm_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tdast);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.dast_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tpa);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.pa_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.tgosh);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.gosh_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tmo);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.mo_sabad);
//                        break;
//                    case 5:
//                        wordImg.setImageResource(R.drawable.tdahan);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.dahan_sabad);
//                        break;
//                    case 6:
//                        wordImg.setImageResource(R.drawable.tbini);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bini_sabad);
//                        break;
//                    case 7:
//                        wordImg.setImageResource(R.drawable.tzaban);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.zaban_sabad);
//                    case 8:
//                        wordImg.setImageResource(R.drawable.tdandan);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.dandan_sabad);
//                    case 9:
//                        wordImg.setImageResource(R.drawable.tabro);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.abro_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//            case "mive":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tmoz);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.moz_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tsib);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.sib_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tkhiar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.khiar_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.tporteqal);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.porteqal_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tlimo);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.limo_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "heivan":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tgorbe);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.gorbe_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tsag);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tgav);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.tmahi);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.mahi_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tmorq);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.morq_sabad);
//                        break;
//                    case 5:
//                        wordImg.setImageResource(R.drawable.tasb);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.asb_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "poshak":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tkafsh);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.kafsh_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tkolah);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.kolah_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tjorab);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.jorab_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.tshalvar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.shalvar_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tpirahan);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.pirahan_sabad);
//                        break;
//                    case 5:
//                        wordImg.setImageResource(R.drawable.trosari);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.rosari_sabad);
//                        break;
//                    case 6:
//                        wordImg.setImageResource(R.drawable.tbloz);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "vasile":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tshane);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.shane_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tmesvak);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.mesvak_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.thole);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.hole_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.ttop);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.toop_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tdocharkhe);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.docharkhe_sabad);
//                        break;
//                    case 5:
//                        wordImg.setImageResource(R.drawable.tmashin);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.mashin_sabad);
//                        break;
//                    case 6:
//                        wordImg.setImageResource(R.drawable.thavapeima);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
//                        break;
//                    case 7:
//                        wordImg.setImageResource(R.drawable.tghashoq);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.ghashogh_sabad);
//                        break;
//                    case 8:
//                        wordImg.setImageResource(R.drawable.tketab);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.ketab_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "shoql":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tdoctor);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.doctor_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tnanva);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.nanva_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tmoalem);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "rang":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tabi);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tzard);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tghermez);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "khordani":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tnan);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.nan_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tshir);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.shir_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tab);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.ab_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.tcake);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.cake_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tbisko);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bisko_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
//
//            case "mafahim":
//                switch (position) {
//                    case 0:
//                        wordImg.setImageResource(R.drawable.tbala);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bala_sabad);
//                        break;
//                    case 1:
//                        wordImg.setImageResource(R.drawable.tpaeen);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.paeen_sabad);
//                        break;
//                    case 2:
//                        wordImg.setImageResource(R.drawable.tkasif);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.kasif_sabad);
//                        break;
//                    case 3:
//                        wordImg.setImageResource(R.drawable.ttamiz);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.tamiz_sabad);
//                        break;
//                    case 4:
//                        wordImg.setImageResource(R.drawable.tbache);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.bache_sabad);
//                        break;
//                    case 5:
//                        wordImg.setImageResource(R.drawable.tdokhtar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.dokhtar_sabad);
//                        break;
//                    case 6:
//                        wordImg.setImageResource(R.drawable.tpesar);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.pesar_sabad);
//                        break;
//                    case 7:
//                        wordImg.setImageResource(R.drawable.tsard);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
//                        break;
//                    case 8:
//                        wordImg.setImageResource(R.drawable.tgarm);
//                        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
//                        break;
//                    default:
//                        break;
//                }
//                break;
        }
    }
}
