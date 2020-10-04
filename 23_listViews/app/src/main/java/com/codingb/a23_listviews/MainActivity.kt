package com.codingb.a23_listviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)creating List view in the activity_main.xml
        //2)creating layout of single item of list item in list_item_fruit.xml
        
        //3)using array adapter to display list items
        lvFruits.adapter = ArrayAdapter<String>(    //adapter is used to diaplay the items of the view
            this,
            R.layout.list_item_fruit,   //this is the layout
            R.id.tvFruitName,           //each item in the list View
            arrayOf("Apple","Mango","Guava","Banana","Kiwi","Grapes"," Watermelon","Melon","Papaya","StrawBerry","Pineapple")
            //these items will be displayed using the layout passed
        )

        //4)setting onClickListner for each item of the list to show some toast
        lvFruits.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,
                "Johny ate ${position + 1} ${view.lvFruits.tvFruitName.text}",  //view contains the list view
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}