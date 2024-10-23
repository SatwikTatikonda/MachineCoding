package com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies;

import com.scaler.tictactoe.TTTgmae.models.Board;
import com.scaler.tictactoe.TTTgmae.models.Cell;
import com.scaler.tictactoe.TTTgmae.models.CellState;
import com.scaler.tictactoe.TTTgmae.models.Move;

import java.util.List;

public class NoobStrategy implements  BotplayingStrategies{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row:board.getBoard()){

            for(Cell cell:row){
                if(cell.getState().equals(CellState.EMPTY)){
                    return new Move(null,cell);
                }

            }

        }
        return null;
    }
}
