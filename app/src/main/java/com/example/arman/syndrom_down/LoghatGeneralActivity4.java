package com.example.arman.syndrom_down;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghat_general_activity4);
        word = (ImageView) findViewById(R.id.word);
        sabad = (ImageView) findViewById(R.id.sabad);
        arrow = (ImageView) findViewById(R.id.arrow);
        controller();
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
