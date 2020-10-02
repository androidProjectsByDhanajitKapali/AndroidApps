package com.codingb.a17_themes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) ectracted string resources -> added string in strings.xml
        // 2) android:theme="@style/AppTheme"> in AndroidManifest.xml defines the theme in the whole app
        // 3) designed my own themes in styles.xml
        // 4) applied the theme in the app in AndroidManifest.xml from <activity android:name=".MainActivity"
        //            android:theme = "@style/Theme.App.DefaultBar" > //this is my added theme
        //5) one can set prpperties like font,color etc. for the whole app by designing the theme only
    }
}