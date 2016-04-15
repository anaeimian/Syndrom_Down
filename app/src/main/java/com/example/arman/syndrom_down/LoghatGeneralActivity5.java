package com.example.arman.syndrom_down;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class LoghatGeneralActivity5 extends ActionBarActivity {
    ImageView wordImg;
    ImageView pass;
    ImageView fail;
    MediaPlayer shapeShows;
    MediaPlayer payMoreAttention;
    MediaPlayer tashvigh;
    int passClicked = 0;
    String category = "";
    int position = 0;
    Dialog settingsDialog;
    private ImageView guide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity5);
        wordImg = (ImageView) findViewById(R.id.wordImg);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        shapeShows = MediaPlayer.create(getApplicationContext(), R.raw.shapeshows);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        shapeShows.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                shapeShows.start();
//                memoryReleaser(shapeShows);
            }
        });

        tashvigh = MediaPlayer.create(this, R.raw.afarin);
        setViews();
        controller();

        guide = (ImageView) findViewById(R.id.guide);
        settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.dialog_layout5, null));
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
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(LoghatGeneralActivity5.this, LoghatActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tashvigh.release();
        tashvigh = null;
        shapeShows.release();
        shapeShows = null;
        payMoreAttention.release();
        payMoreAttention = null;
    }


    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
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
                tashvigh.start();
//                memoryReleaser(tashvigh);

                tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        if (passClicked <= 3) {
                            shapeShows.start();
//                            memoryReleaser(shapeShows);
                        }
                        if (passClicked >= 4) {
                            tashvigh.release();
                            shapeShows.release();
                            payMoreAttention.release();
//                            memoryReleaser(shapeShows);
//                            memoryReleaser(payMoreAttention);
//                            memoryReleaser(tashvigh);
                            shapeShows = null;
                            payMoreAttention = null;
                            tashvigh = null;
                            Intent intent = new Intent(LoghatGeneralActivity5.this, LoghatGeneralActivity6.class);
                            intent.putExtra("category", category);
                            intent.putExtra("position", position + "");
                            startActivity(intent);
                        }
                    }
                });


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
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.immadar);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkhahar);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imbaradar);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imcheshm);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imdast);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.impaa);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imgoosh);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.immo);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imdahan);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imdamagh);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imzaban);
                    case 8:
                        wordImg.setImageResource(R.drawable.imdandan);
                    case 9:
                        wordImg.setImageResource(R.drawable.imabroo);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.immoz);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imsib);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkhiar);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.importeqal);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imlimo);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imgorbe);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imsag);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imgav);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.immahi);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.immorq);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imasb);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imkafsh);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imkolah);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imjorab);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imshalvaar);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.impirahan);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imrusari);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imbloz);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imshune);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.immesvaak);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imhole);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imtoop);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imdocharkhe);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.immashin);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.imhavapeimaa);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imghashogh);
                        break;
                    case 8:
                        wordImg.setImageResource(R.drawable.imketab);
                        break;
                    default:
                        break;
                }
                break;

            case "mashaghel":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imdoctor);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imnanva);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.immoalem);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imabi);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imzard);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imghermez);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imnun);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.imshir);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imab);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imcake);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imbiscuit);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        wordImg.setImageResource(R.drawable.imbala);
                        break;
                    case 1:
                        wordImg.setImageResource(R.drawable.impaeen);
                        break;
                    case 2:
                        wordImg.setImageResource(R.drawable.imkasif);
                        break;
                    case 3:
                        wordImg.setImageResource(R.drawable.imtamiz);
                        break;
                    case 4:
                        wordImg.setImageResource(R.drawable.imbache);
                        break;
                    case 5:
                        wordImg.setImageResource(R.drawable.imdokhtar);
                        break;
                    case 6:
                        wordImg.setImageResource(R.drawable.impesar);
                        break;
                    case 7:
                        wordImg.setImageResource(R.drawable.imsard);
                        break;
                    case 8:
                        wordImg.setImageResource(R.drawable.imgarm);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}
