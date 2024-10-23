package com.scaler.machineCoding.TTTgmae;

import com.scaler.machineCoding.TTTgmae.controller.gameController;
import com.scaler.machineCoding.TTTgmae.models.*;
import com.scaler.machineCoding.TTTgmae.strategies.ColumnWinningStrategy;
import com.scaler.machineCoding.TTTgmae.strategies.DiagnolWinningStrategy;
import com.scaler.machineCoding.TTTgmae.strategies.RowWinningStrategy;
import com.scaler.machineCoding.TTTgmae.strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Player("sairam",new Symbol('o'),1, PlayerState.HUMAN));
        players.add(new Bot("satwik",new Symbol('x'),2, PlayerState.BOT,BotDifficultyLevel.EASY));
        Scanner scn = new Scanner(System.in);

        List<WinningStrategies> strategies=new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagnolWinningStrategy());

        gameController gameController=new gameController();
        Game game=gameController.startGame(players,strategies);
        while(game.getState().equals(GameState.INPROGRESS)){

            gameController.printBoard(game);

            System.out.println(" if you want to undo? Enter y/n ");
            String option=scn.next();
            if(option.equals("y")){
                gameController.undo(game);
                continue;
            }
            gameController.makeMove(game);

        }
    }
}
