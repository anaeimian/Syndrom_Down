package com.example.arman.syndrom_down;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;


public class LoghatGeneralActivity4 extends ActionBarActivity {
    ImageView word;
    ImageView sabad;
    ImageView arrow;
    int wordDragged = 0;
    String category = "";
    MediaPlayer dragVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity4);
        word = (ImageView) findViewById(R.id.word);
        sabad = (ImageView) findViewById(R.id.sabad);
        arrow = (ImageView) findViewById(R.id.arrow);
        controller();
        setViews();
    }

    private void setViews() {
        int position = 0;
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbaba);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.madar_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.khahar_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dadash_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.cheshm_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dast_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pa_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.gosh_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mo_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dahan_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bini_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.zaban_sabad);
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dandan_sabad);
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.abro_sabad);
                        break;
                    default:
                        break;
                }
                break;
            case "mive":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moz_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sib_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhiar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.khiar_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.porteqal_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.limo_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "heivan":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.gorbe_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sag_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mahi_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.morq_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.asb_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "poshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafsh_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kolah_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.jorab_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shalvar_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pirahan_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.rosari_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "vasile":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shane_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mesvak_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.hole_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.toop_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.docharkhe_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mashin_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bloz_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ghashogh_sabad);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ketab_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "shoql":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.doctor_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.nanva_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.nan_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shir_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ab_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.cake_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bisko_sabad);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bala_sabad);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.paeen_sabad);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kasif_sabad);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.tamiz_sabad);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bache_sabad);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dokhtar_sabad);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pesar_sabad);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.garm_sabad);
                        break;
                    default:
                        break;
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity4, menu);
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

        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(1000);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        arrow.startAnimation(animation);

        word.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                word.startDrag(data, new View.DragShadowBuilder(v), null, 0);
                return true;
            }
        });
        sabad.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        Log.d("Slama", " Drag Entered");
                        v.setBackgroundColor(Color.LTGRAY);
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        Log.d("Slama", " Drag Exited");
                        v.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case DragEvent.ACTION_DROP:
                        Log.d("Slama", " Drag Dropped");
                        v.setBackgroundColor(Color.TRANSPARENT);
                        wordDragged++;

                        if (wordDragged >= 4) {
                            Intent intent = new Intent(LoghatGeneralActivity4.this, LoghatGeneralActivity5.class);
                            startActivity(intent);
                        } else {
                            //mediaPlayerTashvigh.start();
                        }

                        break;
                    default:
                        break;
                }

                return true;
            }
        });
    }
}
