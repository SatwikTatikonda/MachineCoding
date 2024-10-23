package com.scaler.tictactoe.TTTgmae.strategies;

import com.scaler.tictactoe.TTTgmae.models.Board;
import com.scaler.tictactoe.TTTgmae.models.Move;
import com.scaler.tictactoe.TTTgmae.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategies {
    private Map<Integer, Map<Symbol,Integer>> counts=new HashMap<>();
    public boolean checkWinner(Board board, Move move) {
        System.out.println("cloumn strategy");
        int col=move.getCell().getColumn();
        Symbol symbol=move.getPlayer().getSymbol();
        if(!counts.containsKey(col)){
            counts.put(col, new HashMap<>());
        }

            counts.get(col).put(symbol,counts.get(col).getOrDefault(symbol,0)+1);

        if(counts.get(col).get(symbol)==board.getDimension()){
            return true;
        }
        return false;
    }
}
