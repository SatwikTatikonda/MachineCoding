package com.scaler.tictactoe.TTTgmae.models;
import java.util.*;
public class Board {
    private int dimension;
    private List<List<Cell>>board;

    public Board(int dimension) {
        this.dimension = dimension;
        board = new ArrayList<>();

        for(int i=0;i<dimension;i++){
            board.add(new ArrayList<>());

            for(int j=0;j<dimension;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
