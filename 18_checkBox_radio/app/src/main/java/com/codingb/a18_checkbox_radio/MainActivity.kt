package com.codingb.a18_checkbox_radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       checkBox.setOnCheckedChangeListener { button, isCheked ->
           Toast.makeText(this, "checked" , Toast.LENGTH_SHORT).show()
       }

        radioButton2.setOnCheckedChangeListener { button, isChecked ->
            Toast.makeText(this, "second radio button" , Toast.LENGTH_SHORT).show()
        }
        
        radiogroup.setOnCheckedChangeListener { group, i ->
            when(i){
                R.id.radioButton3 ->{
                    Toast.makeText(this, "third radio button" , Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton4 ->{
                    Toast.makeText(this, "fourth radio button" , Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}