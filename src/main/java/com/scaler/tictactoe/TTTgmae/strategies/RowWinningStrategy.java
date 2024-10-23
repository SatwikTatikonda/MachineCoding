package com.scaler.tictactoe.TTTgmae.strategies;

import com.scaler.tictactoe.TTTgmae.models.Board;
import com.scaler.tictactoe.TTTgmae.models.Move;
import com.scaler.tictactoe.TTTgmae.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategies {

        Map<Integer, Map<Symbol,Integer>> counts=new HashMap<>();

        public boolean checkWinner(Board board, Move move) {

            System.out.println("row strategy");

            int row=move.getCell().getRow();
            Symbol symbol=move.getPlayer().getSymbol();
            if(!counts.containsKey(row)){
                counts.put(row, new HashMap<>());
            }

                counts.get(row).put(symbol,counts.get(row).getOrDefault(symbol,0)+1);

            System.out.println(counts.get(row).get(symbol));

            if(counts.get(row).get(symbol)==board.getDimension()){
                return true;
            }
            return false;
        }    }

