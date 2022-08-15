package com.jochemcrab.herexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val  myAdapter = MyListAdapter{this, myList}
    }
    fun sendMessage(view: View){
        val sentMessage = findViewById<EditText>(R.id.editTextInput)
        val message = object {
            val name = "Jai"
            val message = sentMessage.text.toString()
            // object expressions extend Any, so `override` is required on `toString()`
            override fun toString() = "$name: $message"
        }
        myList.add(sentMessage.text.toString())

        // findViewById<TextView>(R.id.display_message).text = sentMessage.text.toString()

    }
}