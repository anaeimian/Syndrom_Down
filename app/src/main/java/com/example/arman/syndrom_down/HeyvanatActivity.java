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
public class HeyvanatActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listHeyvanat;
    private List<String> items;
    private ListAdapterHeyvanatActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heyvanat);
        setTitle(getString(R.string.heyvanat));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listHeyvanat = (ListView) findViewById(R.id.listHeyvanat);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.gorbe));
        items.add(getResources().getString(R.string.sag));
        items.add(getResources().getString(R.string.gav));
        items.add(getResources().getString(R.string.mahi));
        items.add(getResources().getString(R.string.morgh));
        items.add(getResources().getString(R.string.asb));

//        items.add("gorbe");
//        items.add("sag");
//        items.add("gav");
//        items.add("mahi");
//        items.add("morgh");
//        items.add("asb");

        adapter = new ListAdapterHeyvanatActivity(this, items);
        listHeyvanat.setAdapter(adapter);

        setListener();

    }

    private void setListener() {
        listHeyvanat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (!Utils.database.heyvanat[position])
                    return;

                Intent intent = new Intent(HeyvanatActivity.this, LoghatGeneralActivity1.class);
                intent.putExtra("position", position + "");
                intent.putExtra("category", "heyvanat");
//                intent.putExtra(Utils.TYPE, 3);
//                intent.putExtra(Utils.WHICH, position);
                if (Utils.database.heyvanat[position + 1])
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

class ListAdapterHeyvanatActivity extends ArrayAdapter<String> {

    public ListAdapterHeyvanatActivity(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }
}