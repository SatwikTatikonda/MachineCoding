package com.scaler.machineCoding.TTTgmae.strategies.botPlayingStrategies;

import com.scaler.machineCoding.TTTgmae.models.Board;
import com.scaler.machineCoding.TTTgmae.models.Cell;
import com.scaler.machineCoding.TTTgmae.models.CellState;
import com.scaler.machineCoding.TTTgmae.models.Move;

import java.util.List;

public class GodStrategy implements BotplayingStrategies {


    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row:board.getBoard()) {

            for(Cell cell:row){
                if(cell.getState().equals(CellState.EMPTY)){
                    return new Move(null,cell);
                }
            }

        }

        return null;
    }
}
