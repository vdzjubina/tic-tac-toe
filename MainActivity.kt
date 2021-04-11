package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun playPvPButton(view:View){
        val intent = Intent(this,PlayerSetup::class.java)
        startActivity(intent)
    }
    fun rulesButton(view:View){
        val intent = Intent(this,Rules::class.java)
        startActivity(intent)
    }
}