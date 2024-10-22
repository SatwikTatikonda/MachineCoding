package com.scaler.tictactoe.TTTgmae;

import com.scaler.tictactoe.TTTgmae.controller.gameController;
import com.scaler.tictactoe.TTTgmae.models.*;
import com.scaler.tictactoe.TTTgmae.strategies.ColumnWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.DiagnolWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.RowWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.winningStrategies;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Player("satwik",new Symbol('x'),1, PlayerState.HUMAN));
        players.add(new Player("sairam",new Symbol('o'),2, PlayerState.HUMAN));

        List<winningStrategies> strategies=new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagnolWinningStrategy());

        gameController gameController=new gameController();
        Game game=gameController.startGame(players,strategies);
        while(game.getState().equals(GameState.INPROGRESS)){

        }
    }
}
