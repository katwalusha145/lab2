package com.usha.lab2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
   var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.increase)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            count++;
            Increase(count);

        }

    }
   fun Increase(c:Int){
       textView.setText(c.toString())
    }
}
