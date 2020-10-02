package com.codingb.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //val TAG is used to search in the logCat
    val TAG = "MYApp"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG , "onCreate");
    }
    //press control+o to override the function
    override fun onStart() {
        super.onStart()
        Log.d(TAG , "onStart");
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(TAG , "onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG , "onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG , "onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG , "onDestroy");
    }
}
