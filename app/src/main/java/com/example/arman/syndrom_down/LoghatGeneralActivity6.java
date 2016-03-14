package com.example.arman.syndrom_down;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class LoghatGeneralActivity6 extends ActionBarActivity {
    ImageView word;
    ImageView pass;
    ImageView fail;
    MediaPlayer inchie;
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
        setContentView(R.layout.loghat_general_activity6);
        word = (ImageView) findViewById(R.id.word);
        pass = (ImageView) findViewById(R.id.pass);
        fail = (ImageView) findViewById(R.id.fail);
        inchie = MediaPlayer.create(getApplicationContext(), R.raw.inchie);
        payMoreAttention = MediaPlayer.create(getApplicationContext(), R.raw.pay_more_attention);
        tashvigh = MediaPlayer.create(getApplicationContext(), R.raw.afarin);
        setViews();
        controller();
        inchie.start();

        guide = (ImageView) findViewById(R.id.guide);
        settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.dialog_layout6, null));
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

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(LoghatGeneralActivity6.this, LoghatActivity.class);
        startActivity(intent);
    }

    void controller() {
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payMoreAttention.start();
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                passClicked++;
                tashvigh.start();
                if (passClicked >= 4) {
                    switch (category) {
                        case "khanevade":
                            intent = new Intent(LoghatGeneralActivity6.this, KhanevadeActivity.class);
                            passSection();
                            break;
                        case "andam":
                            intent = new Intent(LoghatGeneralActivity6.this, AndamActivity.class);
                            passSection();
                            break;
                        case "miveh":
                            intent = new Intent(LoghatGeneralActivity6.this, MiveActivity.class);
                            passSection();
                            break;
                        case "heyvanat":
                            intent = new Intent(LoghatGeneralActivity6.this, HeyvanatActivity.class);
                            passSection();
                            break;
                        case "pooshak":
                            intent = new Intent(LoghatGeneralActivity6.this, PooshakActivity.class);
                            passSection();
                            break;
                        case "vasayel":
                            intent = new Intent(LoghatGeneralActivity6.this, VasayelActivity.class);
                            passSection();
                            break;
                        case "mashaghel":
                            intent = new Intent(LoghatGeneralActivity6.this, MashaghelActivity.class);
                            passSection();
                            break;
                        case "rang":
                            intent = new Intent(LoghatGeneralActivity6.this, RangActivity.class);
                            passSection();
                            break;
                        case "khordani":
                            intent = new Intent(LoghatGeneralActivity6.this, KhordaniActivity.class);
                            passSection();
                            break;
                        case "mafahim":
                            intent = new Intent(LoghatGeneralActivity6.this, MafahimActivity.class);
                            passSection();
                            break;
                    }
                    intent.putExtra("position", "0");
                    startActivity(intent);
                }
            }
        });
    }

    private void passSection() {
        int i = 0;
//        active = true;

        switch (category) {
            case "khanevade":
                while (i < Utils.database.khanevade.length &&
                        Utils.database.khanevade[++i]) ;
                Utils.database.khanevade[i] = true;
                break;
            case "andam":
                while (i < Utils.database.andam.length &&
                        Utils.database.andam[++i]) ;
                Utils.database.andam[i] = true;
                break;
            case "miveh":
                while (i < Utils.database.mive.length &&
                        Utils.database.mive[++i]) ;
                Utils.database.mive[i] = true;
                break;
            case "heyvanat":
                while (i < Utils.database.heyvanat.length &&
                        Utils.database.heyvanat[++i]) ;
                Utils.database.heyvanat[i] = true;
                break;
            case "pooshak":
                while (i < Utils.database.pooshak.length &&
                        Utils.database.pooshak[++i]) ;
                Utils.database.pooshak[i] = true;
                break;
            case "vasayel":
                while (i < Utils.database.vasayel.length &&
                        Utils.database.vasayel[++i]) ;
                Utils.database.vasayel[i] = true;
                break;
            case "mashaghel":
                while (i < Utils.database.mashaghel.length &&
                        Utils.database.mashaghel[++i]) ;
                Utils.database.mashaghel[i] = true;
                break;
            case "rang":
                while (i < Utils.database.rang.length &&
                        Utils.database.rang[++i]) ;
                Utils.database.rang[i] = true;
                break;
            case "khordani":
                while (i < Utils.database.khordani.length &&
                        Utils.database.khordani[++i]) ;
                Utils.database.khordani[i] = true;
                break;
            case "mafahim":
                while (i < Utils.database.mafahim.length &&
                        Utils.database.mafahim[++i]) ;
                Utils.database.mafahim[i] = true;
                break;
        }

        DatabaseAdapter.getInstance().saveDatabase(LoghatGeneralActivity6.this,
                Utils.database);
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
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmaman);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhahar);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tbaradar);
                        break;
                    default:
                        break;
                }
                break;

            case "andam":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tcheshm);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tdast);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tpa);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tgosh);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmo);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdahan);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbini);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tzaban);
                    case 8:
                        word.setImageResource(R.drawable.tdandan);
                    case 9:
                        word.setImageResource(R.drawable.tabro);
                        break;
                    default:
                        break;
                }
                break;
            case "miveh":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tmoz);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsib);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkhiar);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tporteqal);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tlimo);
                        break;
                    default:
                        break;
                }
                break;

            case "heyvanat":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tgorbe);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tsag);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tgav);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tmahi);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tmorq);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tasb);
                        break;
                    default:
                        break;
                }
                break;

            case "pooshak":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tkafsh);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tkolah);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tjorab);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tshalvar);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tpirahan);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.trosari);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tbloz);
                        break;
                    default:
                        break;
                }
                break;

            case "vasayel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tshane);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tmesvak);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.thole);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttop);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tdocharkhe);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tmashin);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.thavapeima);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tghashoq);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tketab);
                        break;
                    default:
                        break;
                }
                break;

            case "mashaghel":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tdoctor);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tnanva);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tmoalem);
                        break;
                    default:
                        break;
                }
                break;

            case "rang":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tabi);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tzard);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tghermez);
                        break;
                    default:
                        break;
                }
                break;

            case "khordani":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tnan);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tshir);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tab);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.tcake);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbisko);
                        break;
                    default:
                        break;
                }
                break;

            case "mafahim":
                switch (position) {
                    case 0:
                        word.setImageResource(R.drawable.tbala);
                        break;
                    case 1:
                        word.setImageResource(R.drawable.tpaeen);
                        break;
                    case 2:
                        word.setImageResource(R.drawable.tkasif);
                        break;
                    case 3:
                        word.setImageResource(R.drawable.ttamiz);
                        break;
                    case 4:
                        word.setImageResource(R.drawable.tbache);
                        break;
                    case 5:
                        word.setImageResource(R.drawable.tdokhtar);
                        break;
                    case 6:
                        word.setImageResource(R.drawable.tpesar);
                        break;
                    case 7:
                        word.setImageResource(R.drawable.tsard);
                        break;
                    case 8:
                        word.setImageResource(R.drawable.tgarm);
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}