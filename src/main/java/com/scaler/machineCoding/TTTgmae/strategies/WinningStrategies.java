package com.scaler.machineCoding.TTTgmae.strategies;

import com.scaler.machineCoding.TTTgmae.models.Board;
import com.scaler.machineCoding.TTTgmae.models.Move;

public interface WinningStrategies {

        boolean checkWinner(Board board, Move move);

        void handleUndo(Board board, Move move);
}
