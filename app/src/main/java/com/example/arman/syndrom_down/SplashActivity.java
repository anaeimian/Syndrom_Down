package com.example.arman.syndrom_down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Szamani on 12/22/2015.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        InitializeDatabase();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, Utils.SPLASH_TIMEOUT);
    }

    private void InitializeDatabase() {
        Utils.database = DatabaseAdapter.getInstance().loadDatabase(this);
    }
}
