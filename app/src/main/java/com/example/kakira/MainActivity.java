package com.example.kakira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStart() {
        String my_tag="s";
        super.onStart();
        Log.i(my_tag,"onStart");
        Toast.makeText(getApplicationContext(),"app has  started",Toast.LENGTH_LONG).show();

    }
    protected void onDestroy() {
        String my_tag="d";
        super.onDestroy();
        Log.i(my_tag,"onDestroy");
        Toast.makeText(getApplicationContext(),"app is closed",Toast.LENGTH_LONG).show();
    }
}
