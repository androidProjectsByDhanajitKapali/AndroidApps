package com.codingb.a20_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val KEY_1 = "Name"    //keys are always a string
const val KEY_2 = "Age"
const val KEY_3 = "isStudent"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //on pressing the button the data from this activity is sent to actovity2
        //this is an example of explicit intent
        btn.setOnClickListener {
            val i = Intent(this , MainActivity2::class.java)
            i.putExtra(KEY_1 , "Dhanajit kapali")   //these values are shared using hashmap type dataStructure
            i.putExtra(KEY_2 , 20)                  //these keys are defined above
            i.putExtra(KEY_3 , true)

            startActivity(i)
        }
    }
}