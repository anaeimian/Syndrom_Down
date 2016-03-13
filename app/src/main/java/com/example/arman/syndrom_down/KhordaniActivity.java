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
public class KhordaniActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listKhordani;
    private List<String> items;
    private ListAdapterKhordaniActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khordani);
        setTitle(getString(R.string.khordani));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listKhordani = (ListView) findViewById(R.id.listKhordani);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.nan));
        items.add(getResources().getString(R.string.shir));
        items.add(getResources().getString(R.string.ab));
        items.add(getResources().getString(R.string.cake));
        items.add(getResources().getString(R.string.bisquit));

//        items.add("nan");
//        items.add("shir");
//        items.add("ab");
//        items.add("cake");
//        items.add("bisquit");

        adapter = new ListAdapterKhordaniActivity(this, items);
        listKhordani.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
        listKhordani.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Utils.database.khordani[position])
                    return;

                Intent intent = new Intent(KhordaniActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category","khordani");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 8);
//                intent.putExtra(Utils.WHICH, position);
                if (Utils.database.khordani[position + 1])
                    intent.putExtra(Utils.ACTIVE, true);
                else intent.putExtra(Utils.ACTIVE, false);
                intent.putExtra(Utils.NAME, adapter.getItem(position));
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

class ListAdapterKhordaniActivity extends ArrayAdapter<String> {

    public ListAdapterKhordaniActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}