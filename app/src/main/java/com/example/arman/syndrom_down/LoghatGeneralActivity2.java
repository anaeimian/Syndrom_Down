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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat_general_activity2);
        word = (ImageView) findViewById(R.id.word);
        wordImg = (ImageView) findViewById(R.id.wordImg);
        arrow = (ImageView) findViewById(R.id.arrow);
        dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);
        controller();
    }

    private void setViews() {

        int position = 0;

        switch (position) {
            case 0:
                word.setImageResource(R.drawable.father);
                wordImg.setImageResource(R.drawable.fatherimg);
                dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.father_drag);

                break;
            case 1:
                word.setImageResource(R.drawable.mother);
                wordImg.setImageResource(R.drawable.motherimg);
//                dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.mother_drag);
                break;
            case 2 :
                word.setImageResource(R.drawable.brother);
                wordImg.setImageResource(R.drawable.brotherimg);
//                dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.brother_drag);
                break;
            case 3 :
                word.setImageResource(R.drawable.sister);
                wordImg.setImageResource(R.drawable.sisterimg);
//                dragVoice = MediaPlayer.create(getApplicationContext(), R.raw.sister_drag);

            default:
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
