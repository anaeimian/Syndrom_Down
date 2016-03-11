package com.example.arman.syndrom_down;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class BaziListActivity extends ActionBarActivity {
    private ListView listLoghat;
    private List<String> items;
    private ListAdapterLoghatActivity adapter;
    private Toolbar toolbar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bazi2_list);

        setTitle(getString(R.string.categories));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listLoghat = (ListView) findViewById(R.id.listLoghat);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.khanevade));
        items.add(getResources().getString(R.string.andam));
        items.add(getResources().getString(R.string.mive));
        items.add(getResources().getString(R.string.heyvanat));
        items.add(getResources().getString(R.string.pooshak));
        items.add(getResources().getString(R.string.vasayel));
        items.add(getResources().getString(R.string.mashaghel));
        items.add(getResources().getString(R.string.rang));
        items.add(getResources().getString(R.string.khordani));
        items.add(getResources().getString(R.string.mafahim));


        adapter = new ListAdapterLoghatActivity(this, items);
        listLoghat.setAdapter(adapter);
        Intent getIntent = getIntent();
        final String gameType = getIntent.getStringExtra("gameType");
        listLoghat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (gameType.equals("balloon")) {
                    intent = new Intent(BaziListActivity.this, Bazi1Activity.class);
                } else if (gameType.equals("football")) {
                    intent = new Intent(BaziListActivity.this, Bazi2Activity.class);
                }
                switch (position) {
                    case 0:
                        intent.putExtra("category", "khanevade");
                        break;
                    case 1:
                        intent.putExtra("category", "andam");
                        break;
                    case 2:
                        intent.putExtra("category", "mive");
                        break;
                    case 3:
                        intent.putExtra("category", "heivanat");
                        break;
                    case 4:
                        intent.putExtra("category", "pooshak");
                        break;
                    case 5:
                        intent.putExtra("category", "vasayel");
                        break;
                    case 6:
                        intent.putExtra("category", "mashaghel");
                        break;
                    case 7:
                        intent.putExtra("category", "rang");
                        break;
                    case 8:
                        intent.putExtra("category", "khordani");
                        break;
                    case 9:
                        intent.putExtra("category", "mafahim");
                        break;
                }
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bazi2_list, menu);
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
}
