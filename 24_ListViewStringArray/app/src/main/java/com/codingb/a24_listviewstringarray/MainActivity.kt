package com.codingb.a24_listviewstringarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //1)creating an string array to pass its elements in the list views
    var name = arrayOf<String>("Dhanajit","Pankaj","Abhijeet","Rohit","Himanshu","Mayank","Ajay","Arushi","Dheeraj",
                                "Dhanajit","Pankaj","Abhijeet","Rohit","Himanshu","Mayank","Ajay","Arushi","Dheeraj")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2)using adapter to display all the items of the name array
        lvNames.adapter =ArrayAdapter<String>(
                this,
                android.R.layout.simple_expandable_list_item_1,  //it is predefined layout of item in the android OS
                android.R.id.text1,        //when "android." is used it means resourse from the android OS is used
                name                    //passing name array of string type
        )
    }
}