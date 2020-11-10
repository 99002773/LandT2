package com.example.landt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    String[] languages;
    private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG, "onCreate");
        languages = new String[]{"english", "hindi", "urdu", "kannada"};

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String data = extras.getString("123");
            //put the string extraCTED into a textview
            TextView resultTextView = findViewById(R.id.textViewResult);
            resultTextView.setText(data);
        }
        ListView countriesListView = findViewById(R.id.countriesListview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
               // android.R.layout.simple_list_item_1,
                R.layout.row_listview,//layout file of each row in the listview
                languages);
        countriesListView.setAdapter(adapter);

    }
}