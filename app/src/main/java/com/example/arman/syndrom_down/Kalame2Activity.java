package com.example.arman.syndrom_down;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szamani on 12/26/2015.
 */
public class Kalame2Activity extends ActionBarActivity {
    private ListView listKalame2;
    private Toolbar toolbar;
    private List<String> items;
    private ListAdapterKalame2 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalame2);
        setTitle(R.string.kalame2);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.babayeman));
        items.add(getResources().getString(R.string.kafsheman));
        items.add(getResources().getString(R.string.toopeman));
        items.add(getResources().getString(R.string.babayeto));
        items.add(getResources().getString(R.string.kafsheto));
        items.add(getResources().getString(R.string.toopeto));
        items.add(getResources().getString(R.string.shanezard));
        items.add(getResources().getString(R.string.dokhtarekasif));
        items.add(getResources().getString(R.string.kafshekasif));
        items.add(getResources().getString(R.string.dokhtaretamiz));
        items.add(getResources().getString(R.string.kafshetamiz));
        items.add(getResources().getString(R.string.abmive));
        items.add(getResources().getString(R.string.babaraft));
        items.add(getResources().getString(R.string.mamankhabid));
        items.add(getResources().getString(R.string.bachebeshin));

        listKalame2 = (ListView) findViewById(R.id.listKalame2);
        adapter = new ListAdapterKalame2(this, items);
        listKalame2.setAdapter(adapter);

        setListener();
    }

    private void setListener() {
//        listKalame2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.kalame2[position])
//                    return;
//
//                Intent intent = new Intent(Kalame2Activity.this, FelGeneralActivity.class);
//                intent.putExtra(Utils.TYPE, 3);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.kalame2[position + 1])
//                    intent.putExtra(Utils.ACTIVE, true);
//                else intent.putExtra(Utils.ACTIVE, false);
//                intent.putExtra(Utils.NAME, adapter.getItem(position));
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(Kalame2Activity.this, JomleActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterKalame2 extends ArrayAdapter<String> {

    public ListAdapterKalame2(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}
