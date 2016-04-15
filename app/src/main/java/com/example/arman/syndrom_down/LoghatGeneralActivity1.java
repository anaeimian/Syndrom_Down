package com.example.arman.syndrom_down;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


public class LoghatGeneralActivity1 extends FragmentActivity {

    private ImageView word;
    private ImageView pass;
    private ImageView replay;
    private int replayClicked = 0;
    MediaPlayer wordSound;
    MediaPlayer dragVoice;
    String category;
    int position = 0;
    private ImageView guide;
    LinearLayout popUpLayout;
    PopupWindow popUp;
    ImageView imGuide;
    Dialog settingsDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general1);
        setTitle(R.string.repeatTitle);
        setViews();
        controller();
        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);
        guide = (ImageView) findViewById(R.id.guide);
        settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.dialog_layout, null));
//        popUpLayout.addView(text);
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
        getMenuInflater().inflate(R.menu.menu_loghat_general_activity_new, menu);
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
    protected void onDestroy() {
        super.onDestroy();
        if (!wordSound.equals(null)) {
            wordSound.release();
            wordSound = null;
        }
        if (!dragVoice.equals(null)) {
            dragVoice.release();
            dragVoice = null;
        }

    }

    private void setViews() {


        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        position = Integer.parseInt(intent.getStringExtra("position"));
        pass = (ImageView) findViewById(R.id.pass);
        replay = (ImageView) findViewById(R.id.replay);
        word = (ImageView) findViewById(R.id.word);

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
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.sistersound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.brothersound);
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
            case "miveh":
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
                        word.setImageResource(R.drawable.tkhiar);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.khiarsound);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.porteqalsound);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        wordSound = MediaPlayer.create(getApplicationContext(), R.raw.limosound);
                        break;

                    default:
                        break;
                }
                break;

            case "heyvanat":
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

            case "pooshak":
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

            case "vasayel":
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

            case "mashaghel":
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


    public void controller() {
        wordSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(final MediaPlayer mediaPlayer) {
                replay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wordSound.start();
//                        if (wordSound.isPlaying())
//                            memoryReleaser(wordSound);
                        replayClicked++;
                    }

                });
            }
        });


        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (replayClicked >= 4) {
//                    memoryReleaser(wordSound);
                    wordSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            wordSound.release();
                            wordSound = null;
                        }
                    });
                    Intent intent = new Intent(LoghatGeneralActivity1.this, LoghatGeneralActivity2.class);
                    intent.putExtra("category", category);
                    intent.putExtra("position", position + "");
                    startActivity(intent);
//                    dragVoice.start();
                }
            }
        });
    }
}
