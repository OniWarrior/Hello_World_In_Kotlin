package com.example.hello_world_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hello_button)
        button.setOnClickListener {
            Log.v("Hello World", "button clicked")
            Toast.makeText(this, "Hello to you, Too!",Toast.LENGTH_SHORT).show()
        }
    }
}