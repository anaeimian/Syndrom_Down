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
public class RangActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listRang;
    private List<String> items;
    private ListAdapterRangActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rang);
        setTitle(getString(R.string.rang));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listRang = (ListView) findViewById(R.id.listRang);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.abi));
        items.add(getResources().getString(R.string.zard));
        items.add(getResources().getString(R.string.ghermez));

//        items.add("abi");
//        items.add("zard");
//        items.add("ghermez");

        adapter = new ListAdapterRangActivity(this, items);
        listRang.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listRang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.rang[position])
//                    return;
                if (Utils.database.rang < position)
                    return;

                Intent intent = new Intent(RangActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category","rang");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 7);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.rang[position + 1])
//                    intent.putExtra(Utils.ACTIVE, true);
//                else intent.putExtra(Utils.ACTIVE, false);
                intent.putExtra(Utils.NAME, adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(RangActivity.this, LoghatActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterRangActivity extends ArrayAdapter<String> {

    public ListAdapterRangActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}