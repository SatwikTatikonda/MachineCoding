package com.scaler.tictactoe.TTTgmae;

import com.scaler.tictactoe.TTTgmae.controller.gameController;
import com.scaler.tictactoe.TTTgmae.models.*;
import com.scaler.tictactoe.TTTgmae.strategies.ColumnWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.DiagnolWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.RowWinningStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Bot("satwik",new Symbol('x'),1, PlayerState.BOT,BotDifficultyLevel.EASY));
        players.add(new Player("sairam",new Symbol('o'),2, PlayerState.HUMAN));

        List<WinningStrategies> strategies=new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagnolWinningStrategy());

        gameController gameController=new gameController();
        Game game=gameController.startGame(players,strategies);
        while(game.getState().equals(GameState.INPROGRESS)){

            gameController.printBoard(game);
            gameController.makeMove(game);

        }
    }
}
