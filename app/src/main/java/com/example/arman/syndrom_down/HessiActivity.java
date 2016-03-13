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
 * Created by Szamani on 12/26/2015.
 */
public class HessiActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listHessi;
    private List<String> items;
    private ListAdapterHessiActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hessi);
        setTitle(R.string.hessi);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listHessi = (ListView) findViewById(R.id.listHessi);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.khabidan));
        items.add(getResources().getString(R.string.shostan));
        items.add(getResources().getString(R.string.paridan));
        items.add(getResources().getString(R.string.davidan));
        items.add(getResources().getString(R.string.khordan));
        items.add(getResources().getString(R.string.khandan));

        adapter = new ListAdapterHessiActivity(this, items);
        listHessi.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listHessi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.hessi[position])
//                    return;

                Intent intent = new Intent(HessiActivity.this, FelGeneralActivity1.class);
                intent.putExtra("position", position + "");
                intent.putExtra("category", "hessi");
//                intent.putExtra(Utils.TYPE, 2);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.hessi[position + 1])
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

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(HessiActivity.this, FelActivity.class);
        startActivity(intent);
    }
}

class ListAdapterHessiActivity extends ArrayAdapter<String> {

    public ListAdapterHessiActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}