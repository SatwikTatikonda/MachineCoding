package com.scaler.tictactoe.TTTgmae.models;

import java.util.Scanner;

public class Player {

    private String name;
    private Symbol symbol;
    private int id;
    private PlayerState state;
    private static Scanner scanner=new Scanner(System.in);

    public Player(String name, Symbol symbol, int id, PlayerState state) {
        this.name = name;
        this.symbol = symbol;
        this.id = id;
        this.state = state;
    }

    public Move makeMove(Board board) {
        System.out.println("Pls tell us the row count btwn 0 to n-1");
        int row=scanner.nextInt();
        System.out.println("Pls tell us the row count btwn 0 to n-1");
        int col=scanner.nextInt();

        return new Move(this,new Cell(row,col));
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }
}
