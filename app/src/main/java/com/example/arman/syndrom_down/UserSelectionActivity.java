package com.example.arman.syndrom_down;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class UserSelectionActivity extends ActionBarActivity {
    String[] items;
    int selectedState;
    TextView tv;
    Button btn;
    Spinner s;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selection);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        items = new String[]{
                getResources().getString(R.string.family1), getResources().getString(R.string.family2), getResources().getString(R.string.family3), getResources().getString(R.string.family4), getResources().getString(R.string.family5), getResources().getString(R.string.family6), getResources().getString(R.string.family7), getResources().getString(R.string.family8), getResources().getString(R.string.public_user)
        };
        tv = (TextView) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.okButton);
        s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedState = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        intent = new Intent(UserSelectionActivity.this, MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (selectedState) {
                    case 0:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass1))) {
                            User.setName("akhavan");
                            startActivity(intent);

                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass2))) {
                            User.setName("aghamohammadi");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass3))) {
                            User.setName("biabani");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass4))) {
                            User.setName("seraji");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass5))) {
                            User.setName("tahmasbi");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass6))) {
                            User.setName("ghader");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass7))) {
                            User.setName("niknejad");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        if (tv.getText().toString().trim().equals(getResources().getString(R.string.pass8))) {
                            User.setName("usefi");
                            startActivity(intent);
                        } else
                            Toast.makeText(getApplicationContext(), R.string.wrong_pass, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        User.setName("public");
                        startActivity(intent);
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_selection, menu);
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
        finish();
    }
}
