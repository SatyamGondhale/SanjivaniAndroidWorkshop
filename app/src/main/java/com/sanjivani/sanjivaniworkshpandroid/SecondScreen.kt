package com.sanjivani.sanjivaniworkshpandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SecondScreen : AppCompatActivity() {
    lateinit var clickToToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        val getDataFromIntent = intent.getStringExtra("data")
        clickToToast = findViewById(R.id.clickToShowToast)
        clickToToast.setOnClickListener {
            Toast.makeText(this,"Last few hours of workshop",Toast.LENGTH_SHORT).show()
        }
        Log.i("SECOND_SCREEN", getDataFromIntent!!)
    }
}