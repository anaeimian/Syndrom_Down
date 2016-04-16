package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
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


public class FelGeneralActivity3 extends ActionBarActivity {

    ImageView verb;
    ImageView verbImg;
    ImageView arrow;
    int verbDragged = 0;
    MediaPlayer verbDrag;
    MediaPlayer tashvigh;
    int position;
    String category;

    //guide
    private ImageView guide;
    private ImageView guideImage;
    private ImageView hand;
    ObjectAnimator animator1;
    ObjectAnimator animator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity3);
        verb = (ImageView) findViewById(R.id.verb);
        verbImg = (ImageView) findViewById(R.id.verbImg);
        arrow = (ImageView) findViewById(R.id.arrow);
        tashvigh = MediaPlayer.create(this, R.raw.afarin);
        guide = (ImageView) findViewById(R.id.guide);
        hand = (ImageView) findViewById(R.id.hand);
        controller();
        setViews();
        verbDrag.start();

        guideImage = (ImageView) findViewById(R.id.guideWord);

        guideImage.setImageDrawable(verbImg.getDrawable());

        guide();

    }

    private void memoryReleaser(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
    }


    void guide() {


        animator1 = new ObjectAnimator();
        animator1.setDuration(1500);
        animator1.setTarget(guideImage);
        animator1.setPropertyName("translationX");

        animator2 = new ObjectAnimator();
        animator2.setDuration(1500);
        animator2.setTarget(hand);
        animator2.setPropertyName("translationX");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animator1.setFloatValues(0, -verbImg.getX() + verb.getX());
                animator1.start();
                animator2.setFloatValues(0, -verbImg.getX() + verb.getX());
                animator2.start();
            }
        }, 500);

        animator1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                guideImage.setVisibility(View.INVISIBLE);
                hand.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    private void setViews() {
        category = getIntent().getStringExtra("category");
        String pos = getIntent().getStringExtra("position");
        if (pos != null) {
            position = Integer.parseInt(pos);
        }
//        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.bede_drag);
//        verb.setImageResource(R.drawable.tbede);
//        verbImg.setImageResource(R.drawable.imbede);

        switch (category) {
            case "amr":
                switch (position) {
                    case 0:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.bede_drag);
                        verb.setImageResource(R.drawable.tbede);
                        verbImg.setImageResource(R.drawable.imbede);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.begir_drag);
                        verb.setImageResource(R.drawable.tbegir);
                        verbImg.setImageResource(R.drawable.imbegir);
                        break;
                    case 2:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.bia_drag);
                        verb.setImageResource(R.drawable.tbia);
                        verbImg.setImageResource(R.drawable.imbia);
                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.beshin_drag);
                        verb.setImageResource(R.drawable.tbeshin);
                        verbImg.setImageResource(R.drawable.imbeshin);
                        break;
                    case 4:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.beshor_drag);
                        verb.setImageResource(R.drawable.tbeshor);
                        verbImg.setImageResource(R.drawable.imbeshour);
                        break;
                    case 5:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.bokhor_drag);
                        verb.setImageResource(R.drawable.tbokhor);
                        verbImg.setImageResource(R.drawable.imbokhor);
                        break;
                }
                break;
            case "gozashte":
                switch (position) {
                    case 0:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.raft_drag);
                        verb.setImageResource(R.drawable.traft);
                        verbImg.setImageResource(R.drawable.imraft);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khord_drag);
                        verb.setImageResource(R.drawable.tkhord);
                        verbImg.setImageResource(R.drawable.imkhord);
                        break;
                    case 2:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khabid_drag);
                        verb.setImageResource(R.drawable.tkhabid);
                        verbImg.setImageResource(R.drawable.imkhabid);
                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.parid_drag);
                        verb.setImageResource(R.drawable.tparid);
//                        verbImg.setImageResource(R.drawable.imparid);                        break;
                    case 4:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.david_drag);
                        verb.setImageResource(R.drawable.tdavid);
                        verbImg.setImageResource(R.drawable.imdavidan);
                        break;
                }
                break;
            case "hessi":
                switch (position) {
                    case 0:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khabidan_drag);
                        verb.setImageResource(R.drawable.tkhabidan);
                        verbImg.setImageResource(R.drawable.imkhabidan);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.shostan_drag);
                        verb.setImageResource(R.drawable.tshostan);
                        verbImg.setImageResource(R.drawable.imshostan);
                        break;
                    case 2:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.davidan_drag);
                        verb.setImageResource(R.drawable.tdavidan);
                        verbImg.setImageResource(R.drawable.imdavidan);
                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khordan_drag);
                        verb.setImageResource(R.drawable.tkhordan);
                        verbImg.setImageResource(R.drawable.imkhordan);
                        break;
                    case 4:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khandan_drag);
                        verb.setImageResource(R.drawable.tkhandan);
                        verbImg.setImageResource(R.drawable.imkhaandan);
                        break;
                }
                break;
            case "kalame2":
                switch (position) {
                    case 0:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.babayeman_drag);
                        verb.setImageResource(R.drawable.tbabayeman);
                        verbImg.setImageResource(R.drawable.imbabayeman);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.kafsheman_drag);
                        verb.setImageResource(R.drawable.tkafsheman);
//                        verbImg.setImageResource(R.drawable.imkafsheman);                        break;
                    case 2:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.toopeman_drag);
                        verb.setImageResource(R.drawable.ttoopman);
                        verbImg.setImageResource(R.drawable.imtoopeman);
                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.babayeto_drag);
                        verb.setImageResource(R.drawable.tbabayeto);
                        verbImg.setImageResource(R.drawable.imbabayeto);
                        break;
                    case 4:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.kafsheto_drag);
                        verb.setImageResource(R.drawable.tkafsheto);
                        verbImg.setImageResource(R.drawable.imkafsheto);
                        break;
                    case 5:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.toopeto_drag);
                        verb.setImageResource(R.drawable.ttoopeto);
                        verbImg.setImageResource(R.drawable.imtoopeto);
                        break;
                    case 6:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.shaneghermez_drag);
                        verb.setImageResource(R.drawable.tshaneqhermez);
                        verbImg.setImageResource(R.drawable.imshaneghermez);
                        break;
                    case 7:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.dokhtarekasif_drag);
                        verb.setImageResource(R.drawable.tdokhtarekasif);
                        verbImg.setImageResource(R.drawable.imdokhtarekasif);
                        break;
                    case 8:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.kafshekasif_drag);
                        verb.setImageResource(R.drawable.tkafshekasif);
                        verbImg.setImageResource(R.drawable.imkafshekasif);
                        break;
                    case 9:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.dokhtaretamiz_drag);
                        verb.setImageResource(R.drawable.tcleangirl);
                        verbImg.setImageResource(R.drawable.imdokhtaretamiz);
                        break;
                    case 10:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.kafshetamiz_drag);
                        verb.setImageResource(R.drawable.tkafshetamiz);
                        verbImg.setImageResource(R.drawable.imkafshetamiz);
                        break;
                    case 11:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.abbedeh_drag);
                        verb.setImageResource(R.drawable.tabbedeh);
//                        verbImg.setImageResource(R.drawable.imabbedeh);                        break;
                    case 12:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.babaraft_drag);
                        verb.setImageResource(R.drawable.tbabaraft);
                        verbImg.setImageResource(R.drawable.imbabaraft);
                        break;
                    case 13:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.babakhabid_drag);
                        verb.setImageResource(R.drawable.tbabakhabid);
                        verbImg.setImageResource(R.drawable.imbabakhabid);
                        break;
                    case 14:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.bachebeshin_drag);
                        verb.setImageResource(R.drawable.tbachebeshin);
                        verbImg.setImageResource(R.drawable.imbachebeshin);
                        break;
                }
                break;

            case "kalame3":
                switch (position) {
                    case 0:
                        Log.d("gorbe", "gorbe");
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.gorbeheivan_drag);
                        verb.setImageResource(R.drawable.tgorbeheivan);
                        verbImg.setImageResource(R.drawable.imgorbeheivan);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.abirangast_drag);
                        verb.setImageResource(R.drawable.tabirangast);
                        verbImg.setImageResource(R.drawable.imtabirangast);
                        break;
                    case 2:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.mozmiveast_drag);
                        verb.setImageResource(R.drawable.tmozmiveast);
                        verbImg.setImageResource(R.drawable.immozmiveast);
                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.pesarmadrese_drag);
                        verb.setImageResource(R.drawable.tpesarmadrese);
                        verbImg.setImageResource(R.drawable.impesarmadrese);
                        break;
                }
                break;
            case "zamir":
                switch (position) {
                    case 0:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.man_drag);
                        verb.setImageResource(R.drawable.tman);
                        verbImg.setImageResource(R.drawable.imman);
                        break;
                    case 1:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.to_drag);
                        verb.setImageResource(R.drawable.tto);
                        verbImg.setImageResource(R.drawable.imto);
                        break;
                }
                break;


        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fel_general_activity3, menu);
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
        Intent intent = null;
        switch (category) {
            case "amr":
                intent = new Intent(FelGeneralActivity3.this, AmrActivity.class);
                break;
            case "gozashte":
                intent = new Intent(FelGeneralActivity3.this, GozashteActivity.class);
                break;
            case "hessi":
                intent = new Intent(FelGeneralActivity3.this, HessiActivity.class);
                break;
            case "kalame2":
                intent = new Intent(FelGeneralActivity3.this, Kalame2Activity.class);
                break;
            case "kalame3":
                intent = new Intent(FelGeneralActivity3.this, Kalame3Activity.class);
                break;
            case "zamir":
                intent = new Intent(FelGeneralActivity3.this, ZamirActivity.class);
                break;
        }
        startActivity(intent);
    }

    void controller() {

        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(1000);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        arrow.startAnimation(animation);

        verbImg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                verbImg.startDrag(data, new View.DragShadowBuilder(v), null, 0);
                return true;
            }
        });
        verb.setOnDragListener(new View.OnDragListener() {
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
                        verbDragged++;
                        tashvigh.start();
                        tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                verbDrag.start();
                            }
                        });
                        if (verbDragged >= 4) {
                            tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                public void onCompletion(MediaPlayer mp) {
                                    if (verbDragged >= 4) {
                                        verbDrag.release();
                                        verbDrag = null;
                                        tashvigh.release();
                                        tashvigh = null;
//                                        memoryReleaser(verbDrag);
//                                        memoryReleaser(tashvigh);
                                        Intent intent = new Intent(FelGeneralActivity3.this, FelGeneralActivity4.class);
                                        intent.putExtra("category", category);
                                        intent.putExtra("position", position + "");
                                        startActivity(intent);
                                    }
                                }
                            });

//                            wordDrag.start();
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
