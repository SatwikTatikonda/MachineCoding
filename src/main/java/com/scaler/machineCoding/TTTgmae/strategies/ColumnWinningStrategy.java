package com.scaler.machineCoding.TTTgmae.strategies;

import com.scaler.machineCoding.TTTgmae.models.Board;
import com.scaler.machineCoding.TTTgmae.models.Move;
import com.scaler.machineCoding.TTTgmae.models.Symbol;

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

    @Override
    public void handleUndo(Board board, Move move) {

        int row=move.getCell().getRow();
        int col=move.getCell().getColumn();
        Symbol symbol=move.getPlayer().getSymbol();
        counts.get(col).put(symbol,counts.get(col).get(symbol)-1);





    }
}
