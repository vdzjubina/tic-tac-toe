package com.example.tictactoe;

import android.widget.Button;
import android.widget.TextView;

public class GameLogic {
    private int [][] gameBoard;
    private Button playAgainBTN;
    private Button homeBTN;
    private TextView playerTurn;
    private String [] playerNames = {"Player 1", "Player 2"};
    private int player = 1;

    GameLogic(){
        gameBoard = new int [3][23];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                gameBoard[r][c] = 0;
            }
        }
    }

    public boolean updateGameBoard(int row, int column) {
        if (gameBoard[row - 1][column - 1] == 0) {
            gameBoard[row - 1][column - 1] = player;

            if (player == 1) {
                playerTurn.setText((playerNames[1])+"s turn");
            } else {
                playerTurn.setText((playerNames[0])+"s turn");
            }

            return true;
        } else {
            return false;
        }
    }

    public void resetGame() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                gameBoard[r][c] = 0;
            }
        }
    }

    public boolean checkWinner () {
        boolean haveWinner = false;
        //checking horizontal
        for (int r = 0; r < 3; r++) {
            if (gameBoard[r][0] == gameBoard[r][1] && gameBoard[r][0] == gameBoard[r][2] &&
                    gameBoard[r][0] != 0) {
                haveWinner = true;

            }
        }
        //checking vertical
        for (int c = 0; c < 3; c++) {
            if (gameBoard[0][c] == gameBoard[1][c] && gameBoard[2][c] == gameBoard[0][c] &&
                    gameBoard[c][0] != 0) {
                haveWinner = true;
            }
        }
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] &&
                gameBoard[0][0] != 0) {
            haveWinner = true;
        }
        if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[0][2] &&
                gameBoard[2][0] != 0) {
            haveWinner = true;
        }
        int boardFilled = 0;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (gameBoard[r][c] != 0) {
                    boardFilled += 1;
                }
            }
        }

        if (haveWinner) {
            playerTurn.setText((playerNames[player - 1] + " WON!"));
            return true;
        } else if (boardFilled == 9) {
            playerTurn.setText("Tie Game!");
            return true;
        } else {
            return false;
        }
    }

    public void setPlayAgainBTN(Button playAgain) {
        this.playAgainBTN = playAgainBTN;
    }

    public void setHomeBTN(Button home) {
        this.homeBTN = homeBTN;
    }

    public void setPlayerTurn(TextView playerTurn) {
        this.playerTurn = playerTurn;
    }

    public void setPlayerNames(String[] playerNames) {
        this.playerNames = playerNames;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }
    public void setPlayer(int player) {
        this.player = player;
    }

    public int getPlayer() {
        return player;
    }
}
