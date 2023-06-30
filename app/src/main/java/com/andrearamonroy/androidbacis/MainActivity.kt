package com.andrearamonroy.androidbacis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bClickMe = findViewById<Button>(R.id.mybutton)
        val mainText = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        bClickMe.setOnClickListener {
            timesClicked += 1

            mainText.text = timesClicked.toString()
            Toast.makeText(this, "hey I'm a Toast!", Toast.LENGTH_LONG).show()
        }




    }
}