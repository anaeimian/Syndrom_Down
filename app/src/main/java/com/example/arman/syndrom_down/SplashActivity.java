package com.example.arman.syndrom_down;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Szamani on 12/22/2015.
 */
public class SplashActivity extends Activity {
    TextView txt;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        InitializeDatabase();
        intent = new Intent(SplashActivity.this, UserSelectionActivity.class);

        if (Utils.database.activationCodeEntered) {
            startActivity(intent);
        } else {
            final Button btn = (Button) findViewById(R.id.okButton);
            txt = (TextView) findViewById(R.id.password);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int hour = Calendar.getInstance().get(Calendar.HOUR);
                    int minute = Calendar.getInstance().get(Calendar.MINUTE);
                    String passWord = hour + "" + minute;
                    if (txt.getText().toString().equals(passWord)) {
                        Utils.database.activationCodeEntered = true;
                        DatabaseAdapter.getInstance().saveDatabase(getApplicationContext(), Utils.database);
                        startActivity(intent);
                    } else {
                        txt.setText("");
                        Toast.makeText(getApplicationContext(), R.string.wrong_code, Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        }, Utils.SPLASH_TIMEOUT);

    }

    private void InitializeDatabase() {
        Utils.database = DatabaseAdapter.getInstance().loadDatabase(this);
    }
}
