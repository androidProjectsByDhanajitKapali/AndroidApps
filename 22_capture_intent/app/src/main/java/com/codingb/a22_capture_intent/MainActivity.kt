package com.codingb.a22_capture_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //in this app we added intent filter in the androidManifest.xml
        // to capture the Uri , i.e, online.codingblocks.com of https /http type

        //this is the code added above the main intent filter of the app
//        <intent-filter>
//        <action android:name="android.intent.action.VIEW" />
//
//        <category android:name="android.intent.category.BROWSABLE" />
//        <category android:name="android.intent.category.DEFAULT" />
//        <data android:host="online.codingblocks.com" />
//        <data android:scheme="https" />
//        <data android:scheme="http" />
//        </intent-filter>
    }
}