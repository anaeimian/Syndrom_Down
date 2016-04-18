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
 * Created by Szamani on 1/1/2016.
 */
public class ZamirActivity extends ActionBarActivity {
    private ListView listZamir;
    private Toolbar toolbar;
    private List<String> items;
    private ListAdapterZamir adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamir);
        setTitle(R.string.zamir);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.man));
        items.add(getResources().getString(R.string.to));

        listZamir = (ListView) findViewById(R.id.listZamir);
        adapter = new ListAdapterZamir(this, items);
        listZamir.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
        listZamir.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.zamir[position])
//                    return;

                Intent intent = new Intent(ZamirActivity.this, FelGeneralActivity1.class);
                intent.putExtra(Utils.TYPE, 4);
                intent.putExtra(Utils.WHICH, position);
                intent.putExtra("category", "zamir");
                intent.putExtra("position", position + "");
                if (Utils.database.zamir[position + 1])
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
        Intent intent = new Intent(ZamirActivity.this, JomleActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterZamir extends ArrayAdapter<String> {

    public ListAdapterZamir(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}
