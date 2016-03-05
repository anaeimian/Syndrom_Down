package com.example.arman.syndrom_down;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;


public class LoghatGeneralActivity2 extends ActionBarActivity {
    ImageView word;
    ImageView wordImg;
    ImageView arrow;
    int wordDragged = 0;
    MediaPlayer dragVoice;
    String category;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general_activity2);
        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);
        setViews();
        controller();
        dragVoice.start();
    }

    private void setViews() {


        word = (ImageView) findViewById(R.id.word);
        wordImg = (ImageView) findViewById(R.id.wordImg);
        arrow = (ImageView) findViewById(R.id.arrow);
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        position = Integer.parseInt(intent.getStringExtra("position"));
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbaba);
                        wordImg.setImageResource(R.drawable.imbaba);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
                        wordImg.setImageResource(R.drawable.immadar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.madar_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
                        wordImg.setImageResource(R.drawable.imkhahar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.khahar_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        wordImg.setImageResource(R.drawable.imbaradar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dadash_drag);
                        break;
                    default:
                        break;
                }
                break;
            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        wordImg.setImageResource(R.drawable.imcheshm);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.cheshm_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        wordImg.setImageResource(R.drawable.imdast);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dast_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        wordImg.setImageResource(R.drawable.impaa);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pa_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        wordImg.setImageResource(R.drawable.imgoosh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.gosh_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        wordImg.setImageResource(R.drawable.immo);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mo_drag);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        wordImg.setImageResource(R.drawable.imdahan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dahan_drag);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        wordImg.setImageResource(R.drawable.imdamagh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bini_drag);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                        wordImg.setImageResource(R.drawable.imzaban);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.zaban_drag);
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                        wordImg.setImageResource(R.drawable.imdandan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dandan_drag);
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        wordImg.setImageResource(R.drawable.imabroo);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.abro_drag);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        wordImg.setImageResource(R.drawable.immoz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moz_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        wordImg.setImageResource(R.drawable.imsib);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sib_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhiar);
                        wordImg.setImageResource(R.drawable.imkhiar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.khiar_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        wordImg.setImageResource(R.drawable.importeqal);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.porteqal_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        wordImg.setImageResource(R.drawable.imlimo);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.limo_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        wordImg.setImageResource(R.drawable.imgorbe);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.gorbe_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        wordImg.setImageResource(R.drawable.imsag);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sag_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        wordImg.setImageResource(R.drawable.imgav);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sag_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        wordImg.setImageResource(R.drawable.immahi);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mahi_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        wordImg.setImageResource(R.drawable.immorq);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.morq_drag);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        wordImg.setImageResource(R.drawable.imasb);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.asb_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        wordImg.setImageResource(R.drawable.imkafsh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kafsh_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        wordImg.setImageResource(R.drawable.imkolah);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kolah_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        wordImg.setImageResource(R.drawable.imjorab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.jorab_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        wordImg.setImageResource(R.drawable.imshalvaar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shalvar_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        wordImg.setImageResource(R.drawable.impirahan);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pirahan_drag);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        wordImg.setImageResource(R.drawable.imrusari);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.rosari_drag);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        wordImg.setImageResource(R.drawable.imbloz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bloz_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        wordImg.setImageResource(R.drawable.imshune);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shane_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        wordImg.setImageResource(R.drawable.immesvaak);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mesvak_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        wordImg.setImageResource(R.drawable.imhole);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.hole_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        wordImg.setImageResource(R.drawable.imtoop);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.toop_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        wordImg.setImageResource(R.drawable.imdocharkhe);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.docharkhe_drag);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        wordImg.setImageResource(R.drawable.immashin);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mashin_drag);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        wordImg.setImageResource(R.drawable.imbloz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bloz_drag);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        wordImg.setImageResource(R.drawable.imghashogh);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ghashoq_drag);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        wordImg.setImageResource(R.drawable.imketab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ketab_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "mashagel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        wordImg.setImageResource(R.drawable.imdoctor);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.doctor_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        wordImg.setImageResource(R.drawable.imnanva);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.nanva_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        wordImg.setImageResource(R.drawable.immoalem);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        wordImg.setImageResource(R.drawable.imabi);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.moalem_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        wordImg.setImageResource(R.drawable.imzard);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.zard_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        wordImg.setImageResource(R.drawable.imghermez);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ghermez_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        wordImg.setImageResource(R.drawable.imnun);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.nan_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        wordImg.setImageResource(R.drawable.imshir);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.shir_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        wordImg.setImageResource(R.drawable.imab);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.ab_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        wordImg.setImageResource(R.drawable.imcake);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.cake_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        wordImg.setImageResource(R.drawable.imbiscuit);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bisko_drag);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        wordImg.setImageResource(R.drawable.imbala);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bala_drag);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        wordImg.setImageResource(R.drawable.impaeen);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.paeen_drag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        wordImg.setImageResource(R.drawable.imkasif);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.kasif_drag);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        wordImg.setImageResource(R.drawable.imtamiz);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.tamiz_drag);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        wordImg.setImageResource(R.drawable.imbache);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.bache_drag);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        wordImg.setImageResource(R.drawable.imdokhtar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.dokhtar_drag);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        wordImg.setImageResource(R.drawable.impesar);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.pesar_drag);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        wordImg.setImageResource(R.drawable.imsard);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.garm_drag);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        wordImg.setImageResource(R.drawable.imgarm);
                        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.garm_drag);
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
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity2, menu);
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
        wordImg.setOnDragListener(new View.OnDragListener() {
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
                            Intent intent = new Intent(LoghatGeneralActivity2.this, LoghatGeneralActivity3.class);
                            intent.putExtra("category", category);
                            intent.putExtra("position", position + "");
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
