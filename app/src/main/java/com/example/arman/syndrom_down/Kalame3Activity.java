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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szamani on 12/26/2015.
 */
public class Kalame3Activity extends ActionBarActivity {
    private ListView listKalame3;
    private Toolbar toolbar;
    private List<String> items;
    private ListAdapterKalame3 listAdapterKalame3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalame3);
        setTitle(R.string.kalame3);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.gorbeheyvanast));
        items.add(getResources().getString(R.string.abirangast));
        items.add(getResources().getString(R.string.mozmiveast));
        items.add(getResources().getString(R.string.pesarmadreseraft));

        listKalame3 = (ListView) findViewById(R.id.listKalame3);
        listAdapterKalame3 = new ListAdapterKalame3(this, items);
        listKalame3.setAdapter(listAdapterKalame3);

        setListener();
    }

    private void setListener() {
        listKalame3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Utils.database.kalame3[position]) {
                    Toast.makeText(Kalame3Activity.this, "Nemishe", Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

//                Intent intent = new Intent(Kalame3Activity.this, Kalame3GeneralActivity.class);
//                intent.putExtra(Utils.NAME, listAdapterKalame3.getItem(position));
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.kalame3[position + 1])
//                    intent.putExtra(Utils.ACTIVE, true);
//                else intent.putExtra(Utils.ACTIVE, false);
//                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = new Intent(Kalame3Activity.this, JomleActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setListener();
    }
}

class ListAdapterKalame3 extends ArrayAdapter<String> {

    public ListAdapterKalame3(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}
