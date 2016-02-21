package com.example.arman.syndrom_down;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szamani on 12/20/2015.
 */
public class LoghatActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listLoghat;
    private List<String> items;
    private ListAdapterLoghatActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loghat);
        setTitle(getString(R.string.loghat));

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

//        items.add("khanevade");
//        items.add("andam");
//        items.add("mive");
//        items.add("heyvanat");
//        items.add("pooshak");
//        items.add("vasayel");
//        items.add("mashaghel");
//        items.add("rang");
//        items.add("khordani");
//        items.add("mafahim");

        adapter = new ListAdapterLoghatActivity(this, items);
        listLoghat.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listLoghat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(LoghatActivity.this, KhanevadeActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(LoghatActivity.this, AndamActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(LoghatActivity.this, MiveActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(LoghatActivity.this, HeyvanatActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(LoghatActivity.this, PooshakActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(LoghatActivity.this, VasayelActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(LoghatActivity.this, MashaghelActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(LoghatActivity.this, RangActivity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(LoghatActivity.this, KhordaniActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent = new Intent(LoghatActivity.this, MafahimActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterLoghatActivity extends ArrayAdapter<String> {

    public ListAdapterLoghatActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}