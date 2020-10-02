package com.codewithharry.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void start(View view)
    {
        Toast.makeText(this, "starting process", Toast.LENGTH_SHORT).show();
    }
    public void pause(View view)
    {
        Toast.makeText(this, "paused", Toast.LENGTH_SHORT).show();
    }
    public void stop(View view)
    {
        Toast.makeText(this, "stoping process", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
