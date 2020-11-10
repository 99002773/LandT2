package com.example.landt2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
String[] langData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        langData=new String[]{"English","Hindi","Telugu","Tamil","Kannada"};
        RecyclerView recyclerView=findViewById(R.id.rcycleview);
       MyAdapter adapter=new MyAdapter(this,langData);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(adapter);
    }
}