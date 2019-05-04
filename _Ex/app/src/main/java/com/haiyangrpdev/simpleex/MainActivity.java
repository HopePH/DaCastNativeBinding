package com.haiyangrpdev.simpleex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shoutHello(View view) {
        Toast.makeText(getApplicationContext(),"Put here the toast of Java Lib soon",Toast.LENGTH_SHORT).show();
    }
}
