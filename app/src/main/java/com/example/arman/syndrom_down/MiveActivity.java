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
public class MiveActivity extends ActionBarActivity{
    private Toolbar toolbar;
    private ListView listMive;
    private List<String> items;
    private ListAdapterMiveActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mive);
        setTitle(getString(R.string.mive));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listMive = (ListView) findViewById(R.id.listMive);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.moz));
        items.add(getResources().getString(R.string.sib));
        items.add(getResources().getString(R.string.khiar));
        items.add(getResources().getString(R.string.porteghal));
        items.add(getResources().getString(R.string.limoo));

//        items.add("moz");
//        items.add("sib");
//        items.add("khiar");
//        items.add("porteghal");
//        items.add("limoo");

        adapter = new ListAdapterMiveActivity(this, items);
        listMive.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listMive.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.mive[position])
//                    return;

                Intent intent = new Intent(MiveActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("category","miveh");
                intent.putExtra("position", position + "");
//                intent.putExtra(Utils.TYPE, 2);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.mive[position + 1])
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

class ListAdapterMiveActivity extends ArrayAdapter<String> {

    public ListAdapterMiveActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}