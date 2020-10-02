package com.codingb.a20_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //intent has all the data recieved
        val name = intent.getStringExtra("Name")  //keys can directly be used like this
        val age = intent.getIntExtra(KEY_2 , 0)
        val isStudent = intent.getBooleanExtra(KEY_3 , false)

        textView.text = "$name \n $age \n $isStudent"   //using textView to print the data

    }
}