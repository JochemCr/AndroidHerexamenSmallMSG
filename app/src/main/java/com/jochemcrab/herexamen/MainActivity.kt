package com.jochemcrab.herexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val sentMessage = findViewById<EditText>(R.id.editTextInput)
        findViewById<TextView>(R.id.display_message).text = sentMessage.text.toString()
    }
}