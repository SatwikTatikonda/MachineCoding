package com.scaler.tictactoe.TTTgmae.controller;

import com.scaler.tictactoe.TTTgmae.models.Game;
import com.scaler.tictactoe.TTTgmae.models.Player;
import com.scaler.tictactoe.TTTgmae.strategies.winningStrategies;

import java.util.List;

public class gameController {


    public Game startGame(List<Player> players,List<winningStrategies> strategies){
        Game game=Game.getBuilder().setDimensions(3).setPlayers(players).setWinngStrategies(strategies).build();
        return game;
    }






}
