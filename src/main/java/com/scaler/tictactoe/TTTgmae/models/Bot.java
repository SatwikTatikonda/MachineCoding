package com.scaler.tictactoe.TTTgmae.models;

import com.scaler.tictactoe.TTTgmae.Factory.BotPlayingStrategyFactory;
import com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies.BotplayingStrategies;

public class Bot  extends Player{



    private BotDifficultyLevel botDifficultyLevel;
    private BotplayingStrategies botPlayingStrategies;

    public Bot(String name, Symbol symbol, int id, PlayerState state,BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, id, state);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategies= BotPlayingStrategyFactory.getStratey(botDifficultyLevel);

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move getMove(Board board) {

            Move move = botPlayingStrategies.makeMove(board);
            move.setPlayer(this);
            return move;
    }



}
