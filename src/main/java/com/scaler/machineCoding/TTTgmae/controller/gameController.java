package com.scaler.machineCoding.TTTgmae.controller;

import com.scaler.machineCoding.TTTgmae.models.Game;
import com.scaler.machineCoding.TTTgmae.models.Player;
import com.scaler.machineCoding.TTTgmae.strategies.WinningStrategies;

import java.util.List;

public class gameController {


    public Game startGame(List<Player> players,List<WinningStrategies> strategies){
        System.out.println("setting attributes");
        Game game=Game.getBuilder().setDimensions(3).setPlayers(players).setWinngStrategies(strategies).build();
        return game;
    }

    public void makeMove(Game game){

        game.makeMove();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }






}
