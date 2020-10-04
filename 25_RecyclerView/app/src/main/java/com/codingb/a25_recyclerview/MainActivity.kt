package com.codingb.a25_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)created class Fruit.kt which returns the an array of size n(we pass it)storing
        // fuits names , origin , quantity

        val fruits = Fruit.getRandomFuits(100)  //calling the function to the Fruit type array

        //2)creating my own adapter class to disaply my custom view ie. in activity_main.xml
        val fruitAdapter = FruitAdapter(fruits)         //passing the data ie. to the adpater

        //3)using layoutManager to display the data
        rvFruits.layoutManager = LinearLayoutManager(this)
        rvFruits.adapter = fruitAdapter

    }
}