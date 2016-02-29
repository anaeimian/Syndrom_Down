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
public class GozashteActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listGozashte;
    private List<String> items;
    private ListAdapterGozashteActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gozashte);
        setTitle(R.string.gozashte);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listGozashte = (ListView) findViewById(R.id.listGozashte);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.raft));
        items.add(getResources().getString(R.string.khord));
        items.add(getResources().getString(R.string.khabid));
        items.add(getResources().getString(R.string.parid));
        items.add(getResources().getString(R.string.david));

//        items.add("raft");
//        items.add("khord");
//        items.add("khabid");
//        items.add("parid");
//        items.add("david");

        adapter = new ListAdapterGozashteActivity(this, items);
        listGozashte.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
        listGozashte.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Utils.database.gozashte[position])
                    return;

                Intent intent = new Intent(GozashteActivity.this, FelGeneralActivity.class);
                intent.putExtra(Utils.TYPE, 1);
                intent.putExtra(Utils.WHICH, position);
                if (Utils.database.gozashte[position + 1])
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

class ListAdapterGozashteActivity extends ArrayAdapter<String> {

    public ListAdapterGozashteActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}