package com.codingb.a15viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {

        //val textView = findViewById<TextView>(R.id.textView) -> here it will crash the app, need to do all these after serContentView only

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //commenting this line will lead to blank screen as it is the main starting screen

     /*   //val textView = findViewById<TextView>(R.id.textView)  -> instead we can do import kotlinx.android.synthetic.main.activity_main.* , to use textView
        textView.text = "10"        //press alt+enter to use synthetic binding i.e, import above line
        textView.setTextColor(getColor(R.color.colorAccent))    //change color of the text
        //textView.isVisible = false
        textView.textSize = 50f     //changing the size of the text , f denotes float value ,and is changed to sp using some formula internally

        //we can use with or the .apply , scope function  to change property of textView all together
        with(textView) {
            text = "10"
            setTextColor(getColor(R.color.colorAccent))
            textSize = 50f
        }
     */
        textView.apply{
            text = "10"
            setTextColor(getColor(R.color.colorAccent))
            textSize = 50f
        }

        //modifying edit text properties below
        editTextTextPersonName.apply{
            isEnabled = true   //to  make it diabled
            hint = "Enter your name"
            setText("Dhanajit kapali")
            addTextChangedListener{     //need to update kotlinOptions{ jvmTarget = 1.8 } in the build.gradle(:app)
                Log.i("viewBinding" , it.toString())
                if(it.toString().length >6 && it.toString().length<20) {
                    //getting the length of the string entered dynamically and performing some task by this
                    button.isEnabled = true     //enable the button if length is b/w 6....20
                }
                else {
                    button.isEnabled = false
                }
            }
        }

        //modifying the button properties below

        //method 1 printing a toast
        button.setOnClickListener{
            Toast.makeText(it.context, "Button Pressed", Toast.LENGTH_SHORT).show()
        }
        //method 2 printing a toast
        button.setOnClickListener(object : View.OnClickListener{
            override fun  onClick(v:View){
                Toast.makeText(v.context, "Button Pressed from anonymous function", Toast.LENGTH_SHORT).show()
            }
        })
        //method 3 printing a toast
        button.setOnClickListener(this) //need to implement View.OnClickListener in the MainActivity
    }
    //method 3 continued
    override fun onClick(v : View){
        Toast.makeText(v.context, "Button Pressed from interface function", Toast.LENGTH_SHORT).show()
    }

    //edning of main
}