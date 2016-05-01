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
public class MafahimActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listMafahim;
    private List<String> items;
    private ListAdapterMafahimActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafahim);
        setTitle(getString(R.string.mafahim));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listMafahim = (ListView) findViewById(R.id.listMafahim);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.bala));
        items.add(getResources().getString(R.string.paen));
        items.add(getResources().getString(R.string.kasif));
        items.add(getResources().getString(R.string.tamiz));
        items.add(getResources().getString(R.string.bache));
        items.add(getResources().getString(R.string.dokhtar));
        items.add(getResources().getString(R.string.pesar));
        items.add(getResources().getString(R.string.sard));
        items.add(getResources().getString(R.string.garm));

//        items.add("bala");
//        items.add("paen");
//        items.add("kasif");
//        items.add("tamiz");
//        items.add("bache");
//        items.add("dokhtar");
//        items.add("pesar");
//        items.add("sard");
//        items.add("garm");

        adapter = new ListAdapterMafahimActivity(this, items);
        listMafahim.setAdapter(adapter);

        setListener();

    }
    private void setListener() {
        listMafahim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.mafahim[position])
//                    return;

                if (Utils.database.mafahim < position)
                    return;

                Intent intent = new Intent(MafahimActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category","mafahim");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 9);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.mafahim[position + 1])
//                    intent.putExtra(Utils.ACTIVE, true);
//                else intent.putExtra(Utils.ACTIVE, false);
//                intent.putExtra(Utils.NAME, adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(MafahimActivity.this, LoghatActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterMafahimActivity extends ArrayAdapter<String> {

    public ListAdapterMafahimActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}