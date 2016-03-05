package com.example.arman.syndrom_down;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class LoghatGeneralActivity6 extends ActionBarActivity {
    ImageView word;
    ImageView pass;
    ImageView fail;
    MediaPlayer inchie;
    MediaPlayer failSound;
    int passClicked = 0;
    String category = "";
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity6);
        word = (ImageView) findViewById(R.id.word);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        inchie = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        failSound = MediaPlayer.create(getApplicationContext(), R.raw.fail);
        setViews();
        controller();
        inchie.start();
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
                Intent intent = null;
                passClicked++;
                if (passClicked >= 4) {
                    switch (category) {
                        case "khanevade":
                            intent = new Intent(LoghatGeneralActivity6.this, KhanevadeActivity.class);
                            break;
                        case "andam":
                            intent = new Intent(LoghatGeneralActivity6.this, AndamActivity.class);
                            break;
                        case "miveh":
                            intent = new Intent(LoghatGeneralActivity6.this, MiveActivity.class);
                            break;
                        case "heyvanat":
                            intent = new Intent(LoghatGeneralActivity6.this, HeyvanatActivity.class);
                            break;
                        case "pooshak":
                            intent = new Intent(LoghatGeneralActivity6.this, PooshakActivity.class);
                            break;
                        case "vasayel":
                            intent = new Intent(LoghatGeneralActivity6.this, VasayelActivity.class);
                            break;
                        case "mashaghel":
                            intent = new Intent(LoghatGeneralActivity6.this, MashaghelActivity.class);
                            break;
                        case "rang":
                            intent = new Intent(LoghatGeneralActivity6.this, RangActivity.class);
                            break;
                        case "khordani":
                            intent = new Intent(LoghatGeneralActivity6.this, KhordaniActivity.class);
                            break;
                        case "mafahim":
                            intent = new Intent(LoghatGeneralActivity6.this, MafahimActivity.class);
                            break;
                    }
                    intent.putExtra("position", "0");
                    startActivity(intent);
                }
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
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.father_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.madar_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.khahar_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.dadash_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.cheshm_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dast_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pa_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.gosh_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mo_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dahan_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bini_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.zaban_sabad);
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dandan_sabad);
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.abro_sabad);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moz_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sib_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhiar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.khiar_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.porteqal_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.limo_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.gorbe_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mahi_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.morq_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.asb_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kafsh_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kolah_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.jorab_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shalvar_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pirahan_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.rosari_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shane_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mesvak_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.hole_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.toop_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.docharkhe_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mashin_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ghashogh_sabad);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ketab_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "mashaghel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.doctor_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.nanva_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.nan_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shir_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ab_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.cake_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bisko_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bala_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.paeen_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kasif_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.tamiz_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bache_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dokhtar_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pesar_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}