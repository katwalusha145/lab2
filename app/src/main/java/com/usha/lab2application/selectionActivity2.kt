package com.usha.lab2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class selectionActivity2 : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var radioButton: RadioButton
    private lateinit var radioButton2: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection2)

        textView = findViewById(R.id.textView)
        radioButton = findViewById(R.id.radioButton)
        radioButton2 = findViewById(R.id.radioButton2)

        displayCheck()
    }

    fun displayCheck() {
        radioButton.setOnClickListener {
            if (radioButton.isChecked) {
                println("male")//shows in logcat
                textView.text = radioButton.text.toString()
            }
        }
        radioButton2.setOnClickListener {
            if (radioButton2.isChecked) {
                println("female")
                radioButton2.text.toString().also { textView.text = it }
            }
        }
    }
}