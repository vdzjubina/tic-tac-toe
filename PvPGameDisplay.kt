package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class PvPGameDisplay : AppCompatActivity() {
    lateinit var ticTacToeBoard: TicTacToeBoard

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pv_p_game_display)


    val playAgainBTN : Button = findViewById(R.id.playAgainButton)
    val homeBTN : Button = findViewById(R.id.homeButton)
    val playerTurn : TextView = findViewById(R.id.playerDisplay)


    val player1Name: String = intent.getStringExtra("PLAYER1_NAME") ?: "Player 1"
    val player2Name: String = intent.getStringExtra("PLAYER2_NAME") ?: "Player 2"

    if (player1Name != null && player2Name != null) {
        playerTurn.setText((player1Name +"'s turn"))
        playerTurn.setText((player2Name +"'s turn"))
    }

    this.ticTacToeBoard = findViewById(R.id.ticTacToeBoard)
    this.ticTacToeBoard.setUpGame(playAgainBTN, homeBTN, playerTurn, player1Name, player2Name)

}
    fun playAgainButton(view: View){
        ticTacToeBoard.resetGame()
        ticTacToeBoard.invalidate()
    }

    fun homeButton(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}