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
public class PooshakActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listPooshak;
    private List<String> items;
    private ListAdapterPooshakActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pooshak);
        setTitle(getString(R.string.pooshak));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listPooshak = (ListView) findViewById(R.id.listPooshak);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.kafsh));
        items.add(getResources().getString(R.string.kolah));
        items.add(getResources().getString(R.string.joorab));
        items.add(getResources().getString(R.string.shalvar));
        items.add(getResources().getString(R.string.pirhan));
        items.add(getResources().getString(R.string.roosari));
        items.add(getResources().getString(R.string.bluse));

//        items.add("kafsh");
//        items.add("kolah");
//        items.add("joorab");
//        items.add("shalvar");
//        items.add("pirahan");
//        items.add("roosari");
//        items.add("bluse");

        adapter = new ListAdapterPooshakActivity(this, items);
        listPooshak.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
        listPooshak.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.pooshak[position])
//                    return;

                Intent intent = new Intent(PooshakActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category", "pooshak");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 4);
//                intent.putExtra(Utils.WHICH, position);
                if (Utils.database.pooshak[position + 1])
                    intent.putExtra(Utils.ACTIVE, true);
                else intent.putExtra(Utils.ACTIVE, false);
                intent.putExtra(Utils.NAME, adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(PooshakActivity.this, LoghatActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterPooshakActivity extends ArrayAdapter<String> {

    public ListAdapterPooshakActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}