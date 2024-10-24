package com.scaler.machineCoding.TTTgmae.models;

public class Cell {

    private int row;
    private int column;
    private CellState state;
    private Player player;

    public Cell(int row,int col){
          this.row=row;
          this.column=col;
          this.state=CellState.EMPTY;
          this.player=null;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public void display(){
        if(this.player==null){
            System.out.print("|   |");
        }
        else{
            System.out.print("| "+player.getSymbol().getSym()+" |");

        }
    }
}
