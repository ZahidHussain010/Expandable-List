package com.example.gulraiztariq.androidtutorials.examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.gulraiztariq.androidtutorials.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;
    private ExpandableListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list);

        listView = findViewById(R.id.expandableList);
        initData();
        adapter = new ExpandableListAdapter(this,listDataHeader,listHashMap);
        listView.setAdapter(adapter);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Android");
        listDataHeader.add("Web");
        listDataHeader.add("Window Form");

        List<String> android = new ArrayList<>();
        android.add("TextView");
        android.add("WebView");
        android.add("Chat App");
        android.add("expandable list");

        List<String> web = new ArrayList<>();
        web.add("Online shopping");
        web.add("personal website");

        List<String> window=new ArrayList<>();
        window.add("medical store automation");
        window.add("antivirus");

        listHashMap.put(listDataHeader.get(0),android);
        listHashMap.put(listDataHeader.get(1),web);
        listHashMap.put(listDataHeader.get(2),window);
    }
}
