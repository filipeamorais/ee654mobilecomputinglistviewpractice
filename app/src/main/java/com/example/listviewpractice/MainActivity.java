package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<String> flagList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        flagList.add("Brazil");		flagList.add("USA");
        flagList.add("EU");		flagList.add("India");
        flagList.add("Germany");	flagList.add("Korea");
        flagList.add("France");
        ArrayAdapter<String> myAdapter =
                new ArrayAdapter<String>(
                        this, android.R.layout.simple_list_item_1, flagList);
        simpleList.setAdapter(myAdapter);
        //Click Listener
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent,
                                  View view, int position, long id) {
              String str = (String)
                      simpleList.getItemAtPosition(position);
              Toast.makeText(getBaseContext(), str,
                      Toast.LENGTH_SHORT).show();
          }
        });
    }
}

