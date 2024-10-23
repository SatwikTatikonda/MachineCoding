package com.scaler.tictactoe.TTTgmae.strategies;

import com.scaler.tictactoe.TTTgmae.models.Board;
import com.scaler.tictactoe.TTTgmae.models.Move;
import com.scaler.tictactoe.TTTgmae.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagnolWinningStrategy implements WinningStrategies {

//    for both left and right diagnols-----------

    Map<Integer,Map<Symbol,Integer>>counts=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        System.out.println("diagnol strategy");

        int row=move.getCell().getRow();
        int col=move.getCell().getColumn();
        Symbol symbol=move.getPlayer().getSymbol();
        if(row+col== board.getDimension()-1){
//            right diagnol
            if(!counts.containsKey(2)) {
                counts.put(2, new HashMap<>());
            }
            counts.get(2).put(symbol,counts.get(2).getOrDefault(symbol,0)+1);

            if(counts.get(2).get(symbol)==board.getDimension()-1){
                return true;
            }
        }
        if(row==col){
//            left diagnol
            if(!counts.containsKey(1)) {
                counts.put(1, new HashMap<>());
            }
            counts.get(1).put(symbol,counts.get(1).getOrDefault(symbol,0)+1);

        if(counts.get(1).get(symbol)==board.getDimension()-1){
        return true;

        }
        }

        return false;
    }
}
