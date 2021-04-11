package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class PlayerSetup : AppCompatActivity() {
//    var player1 = EditText(this)
//    var player2 = EditText(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_setup)

    }
    fun submitButton(view: View){
        var player1: EditText = findViewById(R.id.player1Name)
        var player2: EditText = findViewById(R.id.player2Name)

        var player1Name: String=player1.getText().toString()
        var player2Name: String=player2.getText().toString()

        val intent = Intent(this,PvPGameDisplay::class.java)
        intent.putExtra("PLAYER1_NAME",player1Name)
        intent.putExtra("PLAYER2_NAME",player2Name)
        startActivity(intent)
    }
}