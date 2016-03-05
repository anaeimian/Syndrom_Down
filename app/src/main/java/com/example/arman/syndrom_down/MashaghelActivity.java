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
public class MashaghelActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listMashaghel;
    private List<String> items;
    private ListAdapterMashaghelActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mashaghel);
        setTitle(getString(R.string.mashaghel));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listMashaghel = (ListView) findViewById(R.id.listMashaghel);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.doctor));
        items.add(getResources().getString(R.string.nanva));
        items.add(getResources().getString(R.string.moalem));

//        items.add("doctor");
//        items.add("nanva");
//        items.add("moalem");

        adapter = new ListAdapterMashaghelActivity(this, items);
        listMashaghel.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listMashaghel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.mashaghel[position])
//                    return;

                Intent intent = new Intent(MashaghelActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category","mashaghel");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 6);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.mashaghel[position + 1])
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

class ListAdapterMashaghelActivity extends ArrayAdapter<String> {

    public ListAdapterMashaghelActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}