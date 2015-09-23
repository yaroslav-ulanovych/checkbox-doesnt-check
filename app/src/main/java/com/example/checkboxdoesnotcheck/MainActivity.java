package com.example.checkboxdoesnotcheck;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 0) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);

                View view = inflater.inflate(R.layout.item, null);

                View checkBox = view.findViewById(R.id.checkbox);

                checkBox.setSelected(true);

                assert checkBox.isSelected();

                return view;
            }
        };

        ListView listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(adapter);

        adapter.add("foo");
    }

}
