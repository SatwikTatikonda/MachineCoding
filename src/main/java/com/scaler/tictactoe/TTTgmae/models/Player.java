package com.scaler.tictactoe.TTTgmae.models;

public class Player {

    private String name;
    private Symbol symbol;
    private int id;
    private PlayerState state;

    public Player(String name, Symbol symbol, int id, PlayerState state) {
        this.name = name;
        this.symbol = symbol;
        this.id = id;
        this.state = state;
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
