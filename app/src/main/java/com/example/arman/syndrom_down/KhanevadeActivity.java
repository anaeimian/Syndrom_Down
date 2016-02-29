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
public class KhanevadeActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ListView listKhanevade;
    private List<String> items;
    //    private ListAdapterKhanevadeActivity adapter;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khanevade);
        setTitle(getString(R.string.khanevade));

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        listKhanevade = (ListView) findViewById(R.id.listKhanevade);

        items = new ArrayList<>();
        items.add(getResources().getString(R.string.baba));
        items.add(getResources().getString(R.string.maman));
        items.add(getResources().getString(R.string.dadash));
        items.add(getResources().getString(R.string.khahar));

//        items.add("Baba");
//        items.add("maman");
//        items.add("dadash");
//        items.add("khahar");

//        adapter = new ListAdapterKhanevadeActivity(this, items);
        adapter = new ListAdapterKhanevadeActivity(getApplicationContext(), items);
        listKhanevade.setAdapter(adapter);
//        listKhanevade.getChildAt(1).setEnabled(false);
//        listKhanevade.getChildAt(3).setEnabled(false);
        setListener();
    }

    private void setListener() {
//        int c = listKhanevade.getChildCount();
//        for(int i = 0; i < c; i++){
//            View v = listKhanevade.getChildAt(i);
//            v.setBackgroundColor(R.color.black);
//        }
        listKhanevade.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (!Utils.database.khanevade[position])
//                    return;

                Intent intent = new Intent(KhanevadeActivity.this, LoghatGeneralActivity1.class);
//                intent.putExtra(Utils.TYPE, 0);
//                intent.putExtra(Utils.WHICH, position);
//                if (Utils.database.khanevade[position + 1])
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

class ListAdapterKhanevadeActivity extends ArrayAdapter<String> {

    public ListAdapterKhanevadeActivity(Context context, List<String> items) {
        super(context, R.layout.simple_list_item2, items);
    }

    @Override
    public boolean isEnabled(int position) {
        if (position == 1) {
            return false;
        }
        return true;
    }

//    @Override
//    public View getView(int i, View convertView, ViewGroup viewGroup) {
//        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = LayoutInflater.inflate(R.layout.simple_list_item2); // Pseudo-code!
//        if (i == 0) {
//            convertView.setBackgroundColor(R.color.red);
//        }
//    }
}
//    @Override
//    public void setEnabled(int position) {
//    }
