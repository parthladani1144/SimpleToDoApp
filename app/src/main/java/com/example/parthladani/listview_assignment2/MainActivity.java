package com.example.parthladani.listview_assignment2;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText addItem;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItem = (EditText) findViewById(R.id.addItem);
        lv = (ListView) findViewById(R.id.list);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        lv.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        String result = addItem.getText().toString();
        if(result.isEmpty()) {
            Toast.makeText(getApplicationContext(),"No null values allowed", Toast.LENGTH_SHORT).show();
        }
        else {
            adapter.add(result);
            addItem.setText("");

        }
    }
}