package com.example.arman.syndrom_down;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szamani on 12/26/2015.
 */
public class AmrActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listAmr;
    private List<String> items;
    private ListAdapterAmrActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amr);
        setTitle(R.string.amr);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listAmr = (ListView) findViewById(R.id.listAmr);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.bede));
        items.add(getResources().getString(R.string.begir));
        items.add(getResources().getString(R.string.bia));
        items.add(getResources().getString(R.string.beshin));
        items.add(getResources().getString(R.string.beshoor));
        items.add(getResources().getString(R.string.bokhor));

//        items.add("bede");
//        items.add("begir");
//        items.add("bia");
//        items.add("beshin");
//        items.add("beshoor");
//        items.add("bokhor");

        adapter = new ListAdapterAmrActivity(this, items);
        listAmr.setAdapter(adapter);

        setListener();

        Intent intent = getIntent();
        String temp = intent.getStringExtra("temp");
        if (temp != null)
            Log.d("temp", temp);
    }

    private void setListener() {
        listAmr.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.amr[position])
//                    return;

                Intent intent = new Intent(AmrActivity.this, FelGeneralActivity1.class);
                intent.putExtra("category","amr");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 0);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.amr[position + 1])
//                    intent.putExtra(Utils.ACTIVE, true);
//                else intent.putExtra(Utils.ACTIVE, false);
//                intent.putExtra(Utils.NAME, adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterAmrActivity extends ArrayAdapter<String> {

    public ListAdapterAmrActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}