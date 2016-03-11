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


public class FelGeneralActivity4 extends ActionBarActivity {

    ImageView verb;
    ImageView verbImg;
    ImageView arrow;
    int verbDragged = 0;
    MediaPlayer verbDrag;
    int position;
    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fel_general_activity4);
        verb = (ImageView) findViewById(R.id.verb);
        verbImg = (ImageView) findViewById(R.id.verbImg);
        arrow = (ImageView) findViewById(R.id.arrow);
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
                        break;
                }
                break;
            case "gozashte":
                break;
            case "hessi":
                break;
            case "twowords":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;

            case "threewords":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;
            case "zamir":
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                break;


        }

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

                        if (verbDragged >= 4) {
                            Intent intent = new Intent(FelGeneralActivity4.this, AmrActivity.class);
                            intent.putExtra("position", position + "");
                            startActivity(intent);
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
