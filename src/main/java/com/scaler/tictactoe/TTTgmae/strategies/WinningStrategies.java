package com.scaler.tictactoe.TTTgmae.strategies;

import com.scaler.tictactoe.TTTgmae.models.Board;
import com.scaler.tictactoe.TTTgmae.models.Move;

public interface WinningStrategies {

        boolean checkWinner(Board board, Move move);
}
