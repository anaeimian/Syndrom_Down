package com.example.arman.syndrom_down;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;


public class FelGeneralActivity4 extends ActionBarActivity {

    ImageView verb;
    ImageView verbImg;
    ImageView arrow;
    int verbDragged = 0;
    MediaPlayer verbDrag;
    MediaPlayer tashvigh;
    MediaPlayer clapSound;
    int position;
    String category;
    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;
    private ObjectAnimator animator5;
    private ObjectAnimator animator6;
    private ObjectAnimator animator7;
    private ObjectAnimator animator8;
    private ObjectAnimator animator9;
    private ObjectAnimator animator10;
    ImageView star1;
    ImageView star2;
    ImageView star3;
    ImageView star4;
    ImageView star5;
    ImageView star6;
    ImageView star7;
    ImageView star8;
    ImageView star9;
    ImageView star10;
    ImageView bottomAligner;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity4);
        verb = (ImageView) findViewById(R.id.verb);
        verbImg = (ImageView) findViewById(R.id.verbImg);
        arrow = (ImageView) findViewById(R.id.arrow);
        tashvigh = MediaPlayer.create(this, R.raw.afarin);
        clapSound = MediaPlayer.create(getApplicationContext(), R.raw.clap);
        controller();
        setViews();
        verbDrag.start();

    }

    private void setViews() {
        category = getIntent().getStringExtra("category");
        String pos = getIntent().getStringExtra("position");
        if (pos != null) {
            position = Integer.parseInt(pos);
        }
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
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.paridan_drag);
                        verb.setImageResource(R.drawable.tparidan);
//                        verbImg.setImageResource(R.drawable.imparidan);                        break;
                    case 3:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.davidan_drag);
                        verb.setImageResource(R.drawable.tdavidan);
                        verbImg.setImageResource(R.drawable.imdavidan);
                        break;
                    case 4:
                        verbDrag = MediaPlayer.create(getApplicationContext(), R.raw.khordan_drag);
                        verb.setImageResource(R.drawable.tkhordan);
                        verbImg.setImageResource(R.drawable.imkhordan);
                        break;
                    case 5:
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

    void successAnimation() {
        clapSound.start();
        star1 = (ImageView) findViewById(R.id.star1);
        star2 = (ImageView) findViewById(R.id.star2);
        star3 = (ImageView) findViewById(R.id.star3);
        star4 = (ImageView) findViewById(R.id.star4);
        star5 = (ImageView) findViewById(R.id.star5);
        star6 = (ImageView) findViewById(R.id.star6);
        star7 = (ImageView) findViewById(R.id.star7);
        star8 = (ImageView) findViewById(R.id.star8);
        star9 = (ImageView) findViewById(R.id.star9);
        star10 = (ImageView) findViewById(R.id.star10);
        bottomAligner = (ImageView) findViewById(R.id.bottomAligner);

        animator1 = new ObjectAnimator();
        animator1.setDuration(2500);
        animator1.setTarget(star1);
        animator1.setPropertyName("translationY");

        animator2 = new ObjectAnimator();
        animator2.setDuration(2500);
        animator2.setTarget(star2);
        animator2.setPropertyName("translationY");

        animator3 = new ObjectAnimator();
        animator3.setDuration(2500);
        animator3.setTarget(star3);
        animator3.setPropertyName("translationY");

        animator4 = new ObjectAnimator();
        animator4.setDuration(2500);
        animator4.setTarget(star4);
        animator4.setPropertyName("translationY");

        animator5 = new ObjectAnimator();
        animator5.setDuration(2500);
        animator5.setTarget(star5);
        animator5.setPropertyName("translationY");

        animator6 = new ObjectAnimator();
        animator6.setDuration(4000);
        animator6.setTarget(star6);
        animator6.setPropertyName("translationY");

        animator7 = new ObjectAnimator();
        animator7.setDuration(4000);
        animator7.setTarget(star7);
        animator7.setPropertyName("translationY");

        animator8 = new ObjectAnimator();
        animator8.setDuration(4000);
        animator8.setTarget(star8);
        animator8.setPropertyName("translationY");

        animator9 = new ObjectAnimator();
        animator9.setDuration(4000);
        animator9.setTarget(star9);
        animator9.setPropertyName("translationY");

        animator10 = new ObjectAnimator();
        animator10.setDuration(4000);
        animator10.setTarget(star10);
        animator10.setPropertyName("translationY");

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        final int width = size.x;
        final int height = size.y;
        Log.d("test", width + "");
        Log.d("test", height + "");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animator1.setFloatValues(0, -height - 300);
                animator1.start();
                animator2.setFloatValues(0, -height - 300);
                animator2.start();
                animator3.setFloatValues(0, -height - 300);
                animator3.start();
                animator4.setFloatValues(0, -height - 300);
                animator4.start();
                animator5.setFloatValues(0, -height - 300);
                animator5.start();
                animator6.setFloatValues(0, -height - 300);
                animator6.start();
                animator7.setFloatValues(0, -height - 300);
                animator7.start();
                animator8.setFloatValues(0, -height - 300);
                animator8.start();
                animator9.setFloatValues(0, -height - 300);
                animator9.start();
                animator10.setFloatValues(0, -height - 300);
                animator10.start();
            }
        }, 500);
        animator1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                star1.setX(width / 6);
                star2.setX(2 * width / 6);
                star3.setX(3 * width / 6);
                star4.setX(4 * width / 6);
                star5.setX(5 * width / 6);

                star6.setX(width / 6);
                star7.setX(2 * width / 6);
                star8.setX(3 * width / 6);
                star9.setX(4 * width / 6);
                star10.setX(5 * width / 6);

                star1.setY(height + 100);
                star2.setY(height + 100);
                star3.setY(height + 100);
                star4.setY(height + 100);
                star5.setY(height + 100);
                star6.setY(height + 100);
                star7.setY(height + 100);
                star8.setY(height + 100);
                star9.setY(height + 100);
                star10.setY(height + 100);

                star1.setVisibility(View.VISIBLE);
                star2.setVisibility(View.VISIBLE);
                star3.setVisibility(View.VISIBLE);
                star4.setVisibility(View.VISIBLE);
                star5.setVisibility(View.VISIBLE);
                star6.setVisibility(View.VISIBLE);
                star7.setVisibility(View.VISIBLE);
                star8.setVisibility(View.VISIBLE);
                star9.setVisibility(View.VISIBLE);
                star10.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                star1.setVisibility(View.INVISIBLE);
                star2.setVisibility(View.INVISIBLE);
                star3.setVisibility(View.INVISIBLE);
                star4.setVisibility(View.INVISIBLE);
                star5.setVisibility(View.INVISIBLE);
                intent.putExtra("position", "0");
                startActivity(intent);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fel_general_activity4, menu);
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

    private void controller() {
        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(1000);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        arrow.startAnimation(animation);

        verb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                verb.startDrag(data, new View.DragShadowBuilder(v), null, 0);
                return true;
            }
        });
        verbImg.setOnDragListener(new View.OnDragListener() {
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
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                if (verbDragged <= 3) {
                                    verbDrag.start();
                                }
                            }
                        });

                        if (verbDragged >= 4) {
                            tashvigh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                public void onCompletion(MediaPlayer mp) {
                                    if (verbDragged >= 4) {
//                                        Intent intent = null;
                                        switch (category) {
                                            case "amr":
                                                intent = new Intent(FelGeneralActivity4.this, AmrActivity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                            case "gozashte":
                                                intent = new Intent(FelGeneralActivity4.this, GozashteActivity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                            case "hessi":
                                                intent = new Intent(FelGeneralActivity4.this, HessiActivity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                            case "kalame2":
                                                intent = new Intent(FelGeneralActivity4.this, Kalame2Activity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                            case "kalame3":
                                                intent = new Intent(FelGeneralActivity4.this, Kalame3Activity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                            case "zamir":
                                                intent = new Intent(FelGeneralActivity4.this, ZamirActivity.class);
                                                passSection();
                                                successAnimation();
                                                break;
                                        }
//                                        startActivity(intent);
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


    private void passSection() {
        int i = 0;
//        active = true;

        switch (category) {
            case "amr": // amr
                while (i < Utils.database.amr.length &&
                        Utils.database.amr[++i]) ;
                Utils.database.amr[i] = true;
                break;

            case "gozashte": // gozashte
                while (i < Utils.database.gozashte.length &&
                        Utils.database.gozashte[++i]) ;
                Utils.database.gozashte[i] = true;
                break;

            case "hessi": // hessi
                while (i < Utils.database.hessi.length &&
                        Utils.database.hessi[++i]) ;
                Utils.database.hessi[i] = true;
                break;

            case "kalame2": // kalame2
                while (i < Utils.database.kalame2.length &&
                        Utils.database.kalame2[++i]) ;
                Utils.database.kalame2[i] = true;
                break;

            case "zamir": // zamir
                while (i < Utils.database.zamir.length &&
                        Utils.database.zamir[++i]) ;
                Utils.database.zamir[i] = true;
                break;
        }

        DatabaseAdapter.getInstance().saveDatabase(FelGeneralActivity4.this,
                Utils.database);
    }


    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(FelGeneralActivity4.this, FelActivity.class);
        startActivity(intent);
    }
}
