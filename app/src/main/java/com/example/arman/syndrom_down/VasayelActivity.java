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
public class VasayelActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listVasayel;
    private List<String> items;
    private ListAdapterVasayelActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vasayel);
        setTitle(getString(R.string.vasayel));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listVasayel = (ListView) findViewById(R.id.listVasayel);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.shane));
        items.add(getResources().getString(R.string.mesvak));
        items.add(getResources().getString(R.string.hole));
        items.add(getResources().getString(R.string.toop));
        items.add(getResources().getString(R.string.docharkhe));
        items.add(getResources().getString(R.string.mashin));
        items.add(getResources().getString(R.string.havapeyma));
        items.add(getResources().getString(R.string.ghashogh));
        items.add(getResources().getString(R.string.ketab));

//        items.add("shane");
//        items.add("mesvak");
//        items.add("hole");
//        items.add("toop");
//        items.add("docharkhe");
//        items.add("mashin");
//        items.add("havapeyma");
//        items.add("ghashogh");
//        items.add("ketab");

        adapter = new ListAdapterVasayelActivity(this, items);
        listVasayel.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listVasayel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.vasayel[position])
//                    return;

                Intent intent = new Intent(VasayelActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("position", position + "");
                intent.putExtra("category","vasayel");
//                intent.putExtra(Utils.TYPE, 5);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.vasayel[position + 1])
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

class ListAdapterVasayelActivity extends ArrayAdapter<String> {

    public ListAdapterVasayelActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}