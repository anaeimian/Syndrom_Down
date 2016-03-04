package com.example.arman.syndrom_down;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class Bazi2Activity2 extends ActionBarActivity {
    private ImageView field;
    private ImageView ball;
    private ImageView goal2;
    private ImageView pic1;
    private ImageView pic2;
    private MediaPlayer mediaPlayerRahnama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazi2_activity2);
        ball = (ImageView) findViewById(R.id.ball);
        field = (ImageView) findViewById(R.id.field);
//        goal2 = (ImageView) findViewById(R.id.goal2);
        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        mediaPlayerRahnama = MediaPlayer.create(getApplicationContext(), R.raw.football_dadash);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bazi2_activity2, menu);
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

//    private void handleIntent() {
//        Intent intent = getIntent();
//        String category = intent.getStringExtra("category");
//        switch (category) {
//            case "khanevade":
//                pic1.setImageResource(R.drawable.tbaradar);
//                pic2.setImageResource(R.drawable.tkhahar);
//                mediaPlayerRahnama.start();
//                pic1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        animator.setFloatValues(0, -ball.getX() + pic1.getX());
//                        animator.start();
//                    }
//                });
//                pic2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        animator.setFloatValues(0, pic2.getX() - ball.getX());
//                        animator.start();
//                    }
//                });
//                animator.addListener(new Animator.AnimatorListener() {
//                    @Override
//                    public void onAnimationStart(Animator animation) {
//                        ball.setVisibility(View.VISIBLE);
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        Intent intent = new Intent(Bazi2Activity.this, Bazi2Activity2.class);
//                        startActivity(intent);
////                mediaPlayerTashvigh.start();
//                    }
//
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animator animation) {
//
//                    }
//                });
//
//                break;
//
//        }
//
//    }
}
