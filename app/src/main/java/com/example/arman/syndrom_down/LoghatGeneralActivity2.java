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
    ImageView word ;
    ImageView wordImg;
    ImageView arrow;
    int wordDragged=0;
    MediaPlayer dragVoice;
    String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general_activity2);
        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);
        controller();
        setViews();
    }

    private void setViews() {

        int position = 0;
        word = (ImageView) findViewById(R.id.word);
        wordImg = (ImageView) findViewById(R.id.wordImg);
        arrow = (ImageView) findViewById(R.id.arrow);
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        switch (category) {
            case "khanevade":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbaba);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.fathersound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mothersound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.brothersound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sistersound);
                        break;
                    default:
                        break;
                }
                break;
            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.cheshmsound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.dastsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.pasound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.goshsound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mosound);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.dahansound);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.binisound);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.zabansound);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.dandansound);
                        break;
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.abrosound);
                        break;
                    default:
                        break;
                }
                break;
            case "mive":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mozsound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sibsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tporteqal);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.porteqalsound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tlimo);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.limosound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mosound);
                        break;
                    default:
                        break;
                }
                break;

            case "heivan":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.gorbesound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sagsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.gavsound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mahisound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.morqsound);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.asbsound);
                        break;
                    default:
                        break;
                }
                break;

            case "poshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.kafshsound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.kolahsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.jorabsound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.shalvarsound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.pirahansound);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.rosarisound);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.blozsound);
                        break;
                    default:
                        break;
                }
                break;

            case "vasile":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.shanesound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mesvaksound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.holesound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.topsound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.docharkhesound);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.mashinsound);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.havapeimasound);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.ghashoqsound);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.ketabsound);
                        break;
                    default:
                        break;
                }
                break;

            case "shoql":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.doctorsound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.nanvasound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.moalemsound);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.abisound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.zardsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.ghermezsound);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.nansound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.shirsound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.absound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.cakesound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.biskosound);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.balasound);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.paeensound);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.kasifsound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.tamizsound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.bachesound);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.dokhtarsound);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.pesarsound);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sardsound);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.garmsound);
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
    void controller(){

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
                            startActivity(intent);
                            dragVoice.start();
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
