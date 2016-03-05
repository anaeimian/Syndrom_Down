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
        shapeShows.start();
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
    }

    private void setViews() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        position = Integer.parseInt(intent.getStringExtra("position"));
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imbaba);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.father_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.immadar);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.madar_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkhahar);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.khahar_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imbaradar);
//                        // = MediaPlayer.create(getApplicationContext(), R.raw.dadash_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imcheshm);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.cheshm_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imdast);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dast_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.impaa);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pa_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imgoosh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.gosh_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.immo);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mo_sabad);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imdahan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dahan_sabad);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imdamagh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bini_sabad);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imzaban);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.zaban_sabad);
                    case 8:
                        wordImg.setImageResource(R.drawable.imdandan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dandan_sabad);
                    case 9:
                        wordImg.setImageResource(R.drawable.imabroo);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.abro_sabad);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.immoz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moz_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imsib);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sib_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkhiar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.khiar_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.importeqal);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.porteqal_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imlimo);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.limo_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imgorbe);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.gorbe_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imsag);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imgav);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.immahi);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mahi_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.immorq);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.morq_sabad);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imasb);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.asb_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imkafsh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kafsh_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imkolah);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kolah_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imjorab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.jorab_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imshalvaar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shalvar_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.impirahan);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pirahan_sabad);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imrusari);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.rosari_sabad);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imbloz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imshune);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shane_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.immesvaak);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mesvak_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imhole);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.hole_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imtoop);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.toop_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imdocharkhe);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.docharkhe_sabad);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.immashin);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.mashin_sabad);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imhavapeimaa);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imghashogh);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ghashoq_sabad);
                        break;
                    case 8:
                        wordImg.setImageResource(R.drawable.imketab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ketab_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "mashaghel":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imdoctor);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.doctor_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imnanva);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.nanva_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.immoalem);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imabi);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imzard);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imghermez);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imnun);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.nan_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imshir);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.shir_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imab);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.ab_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imcake);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.cake_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imbiscuit);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bisko_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imbala);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bala_sabad);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.impaeen);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.paeen_sabad);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkasif);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.kasif_sabad);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imtamiz);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.tamiz_sabad);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imbache);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.bache_sabad);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imdokhtar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.dokhtar_sabad);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.impesar);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.pesar_sabad);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imsard);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    case 8:
                        wordImg.setImageResource(R.drawable.imgarm);
                        // = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}
