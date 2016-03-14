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
public class AndamActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listAndam;
    private List<String> items;
    private ListAdapterAndamActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andam);
        setTitle(getString(R.string.andam));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listAndam = (ListView) findViewById(R.id.listAndam);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.cheshm));
        items.add(getResources().getString(R.string.dast));
        items.add(getResources().getString(R.string.pa));
        items.add(getResources().getString(R.string.goosh));
        items.add(getResources().getString(R.string.moo));
        items.add(getResources().getString(R.string.dahan));
        items.add(getResources().getString(R.string.bini));
        items.add(getResources().getString(R.string.zaban));
        items.add(getResources().getString(R.string.dandan));
        items.add(getResources().getString(R.string.abroo));

//        items.add("cheshm");
//        items.add("dast");
//        items.add("pa");
//        items.add("goosh");
//        items.add("moo");
//        items.add("dahan");
//        items.add("bini");
//        items.add("zaban");
//        items.add("dandan");
//        items.add("abroo");

        adapter = new ListAdapterAndamActivity(this, items);
        listAndam.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
        listAndam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Utils.database.andam[position])
                    return;
                Intent intent = new Intent(AndamActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category", "andam");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 1);
//                intent.putExtra(Utils.WHICH, position);
                if (Utils.database.andam[position + 1])
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
        Intent intent = new Intent(AndamActivity.this, LoghatActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterAndamActivity extends ArrayAdapter<String> {

    public ListAdapterAndamActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}