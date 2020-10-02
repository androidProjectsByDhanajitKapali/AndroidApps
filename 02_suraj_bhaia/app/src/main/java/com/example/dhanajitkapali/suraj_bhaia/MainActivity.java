package com.example.dhanajitkapali.suraj_bhaia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button  b1;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.button);
        txt=findViewById(R.id.textView);

        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("dhanjit");
            }
        }); */



    }


    public void click(View view){
        txt.setText("dhanjit");

    }
}
