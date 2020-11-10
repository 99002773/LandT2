package com.example.landt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    public void clickHandler(View view) {
        Log.e(TAG,"clickHandler");
        switch (view.getId()){
            case R.id.button:
                startHome();
                break;
            case R.id.button2:
                Intent dialIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"));
               // Intent dialIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
                startActivity(dialIntent);
                break;
        }

    }

    private void startHome() {
        Intent hIntent;
        hIntent=new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("123","Vinay Kumar");
        int c=add(10,20);
        startActivity(hIntent);
    }

    private int add(int i, int i1) {
        return i+i1;
    }


}