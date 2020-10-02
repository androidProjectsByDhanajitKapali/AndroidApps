package com.codingb.a21_implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //on clicking the button the view is transferred correspondingly
        mailBtn.setOnClickListener {
            val email = editText.text.toString()
            val i = Intent()    //object of Intent class is created
            i.action = Intent.ACTION_SENDTO     //this action is dedicated for sending mails only
            i.data = Uri.parse("mailto:$email") //while sending data b/w activities we use Uri
                                                        //this "mailto:$string" is reserved for sending mail only
            //in the Uri we can sen very limited/specific data only
            i.putExtra(Intent.EXTRA_SUBJECT , "Implicit Intents")   //use to send subject of the mail , works with OutLook only
            startActivity(i)
        }

        browseBtn.setOnClickListener {
            val address = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW   //this action is for browser only
            i.data = Uri.parse("http://$address")
            startActivity(i)
        }

        dialBtn.setOnClickListener {
            val mobile = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL       //this action is for dialing only
            i.data = Uri.parse("tel:$mobile")
            startActivity(i)
        }


    }
}